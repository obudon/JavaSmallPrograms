from queue import Queue

class MemoryOrg:
    def __init__(self, memsize, pagesize):
        self._memsize = memsize
        self._pagesize = pagesize
        self._numpage = memsize // pagesize
        self._freeBit = [0] * self._numpage
        self._fragmentation = 0  

    def allocation(self, blockSize, m, procSize, n):
        # Allocate blockid to a process
        allocation = [-1] * n

        for i in range(n):
            bestId = -1
            for j in range(m):
                if blockSize[j] >= procSize[i]:
                    if bestId == -1:
                        bestId = j
                    elif blockSize[bestId] > blockSize[j]:
                        bestId = j
            if bestId != -1:
                allocation[i] = bestId
                blockSize[bestId] -= procSize[i]
                self.updateFreeBitmap(procSize[i])  # Update free bitmap
        print("Process No. Process Size     Block no.")
        for i in range(n):
            print(i + 1, "         ", procSize[i], end="         ")
            if allocation[i] != -1:
                print(allocation[i] + 1)
            else:
                print("Not Allocated")
        self.calculateFragmentation(blockSize)

    def pageFaults(self, pages, n, capacity):
        # To represent set of current pages. We use an unordered_set so that we quickly check if a page is present in set or not
        s = set()

        # To store the pages in FIFO manner
        indexes = Queue()

        # Start from initial page
        page_faults = 0
        for i in range(n):
            # Check if the set can hold more pages
            if len(s) < capacity:
                # Insert it into set if not present already which represents page fault
                if pages[i] not in s:
                    s.add(pages[i])

                    # Increment page fault
                    page_faults += 1

                    # Push the current page into the queue
                    indexes.put(pages[i])

            # If the set is full then need to perform FIFO i.e. remove the first page of the queue from set and queue both and insert the current page
            else:
                # Check if current page is not already present in the set
                if pages[i] not in s:
                    # Pop the first page from the queue
                    val = indexes.queue[0]

                    indexes.get()

                    # Remove the indexes page
                    s.remove(val)

                    # insert the current page
                    s.add(pages[i])

                    # push the current page into the queue
                    indexes.put(pages[i])

                    # Increment page faults
                    page_faults += 1

        return page_faults

    def updateFreeBitmap(self, procSize):
        # Update free bitmap 
        numPagesneed = (procSize + self._pagesize - 1) // self._pagesize
        for i in range(self._numpage):
            if self._freeBit[i] == 0:
                j = i
                while j < min(self._numpage, i + numPagesneed):
                    self._freeBit[j] = 1
                    j += 1
                if j < self._numpage:
                    self._fragmentation += (numPagesneed - (j - i))

    def calculateFragmentation(self, blockSize):
        total_free = sum(blockSize)
        total_mem = self._memsize
        total_occupied = total_mem - total_free
        self._fragmentation = (total_free - max(blockSize)) / total_occupied if total_occupied > 0 else 0

    def printFreeBitmap(self):
        print("Free Bitmap:")
        print(self._freeBit)

    def printFragmentation(self):
        print("Fragmentation:", self._fragmentation)


# Testing
if __name__ == '__main__':
    blockSize = [1024, 512, 2048, 1024]  
    procSize = [212, 417, 112, 426]
    m = len(blockSize)
    n = len(procSize)

    memory = MemoryOrg(4 * 1024 * 1024, 4 * 1024) #Size of memory and page
    memory.allocation(blockSize, m, procSize, n)
    memory.printFreeBitmap()
    memory.printFragmentation()

    pages = [7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2]
    n = len(pages)
    capacity = 4
    print("Pages: ", memory.pageFaults(pages, n, capacity))
