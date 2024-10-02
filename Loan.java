public class Loan {
    public static void main(String[] args) {
        int aliceIncome = 1500; 
        int bobIncome = 700;    
        int cliveIncome = 100; 

        int aliceLoanAmount = finalLoan(aliceIncome);
        int aliceLoanCategory = LoanCategory(aliceIncome);

        int bobLoanAmount = finalLoan(bobIncome);
        int bobLoanCategory = LoanCategory(bobIncome);

        int cliveLoanAmount = finalLoan(cliveIncome);
        int cliveLoanCategory = LoanCategory(cliveIncome);

        System.out.println("Alice's loan category: " + aliceLoanCategory + ", loan amount: " + aliceLoanAmount + " euros");
        System.out.println("Bob's loan category: " + bobLoanCategory + ", loan amount: " + bobLoanAmount + " euros");
        System.out.println("Clive's loan category: " + cliveLoanCategory + ", loan amount: " + cliveLoanAmount + " euros");
    }
    public static int LoanCategory(int income) {
        if (income > 1000) {
            return 1;
        } else if (income >= 500 && income <= 1000) {
            return 2;
        } else if (income >= 200 && income < 500) {
            return 3;
        } else {
            return 4;
        }
    }
    public static int finalLoan(int income) {
        switch (LoanCategory(income)) {
            case 1:
                return (int) (income * 12 * 3.5);
            case 2:
                return (int) (income * 12 * 2.5);
            case 3:
                return (int) (income * 12 * 2);
            default:
                return 0;
        }
    }
}

