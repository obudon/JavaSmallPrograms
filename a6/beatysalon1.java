class DiscountRate{
    public static double serviceDiscountPremium=0.2, serviceDiscountGold=0.15, serviceDiscountSilver=0.1,
                  productDiscountPremium=0.1, productDiscountGold=0.1, productDiscountSilver=0.1;
 
    public static double getServiceDiscountRate(String type){
        switch(type){
            case "Premium": return serviceDiscountPremium; 
            case "Gold": return serviceDiscountGold; 
            case "Silver": return serviceDiscountSilver; 
            default: return 0; 
        }
    }
    
    public static double getProductDiscountRate(String type){
        switch(type){
            case "Premium": return productDiscountPremium;
            case "Gold": return productDiscountPremium;
            case "Silver": return productDiscountPremium; // As all members have same discount rate on products
            default: return 0; 
        }
    }
 }
 
class Customer {
    private String name;
    private boolean member = false;
    private String memberType;
 
    public Customer(String name) {
        this.name = name;
    }
 
    public String getName() {
         return name;
     }
 
     public boolean isMember() {
         return member;
     }
 
     public void setMember(boolean member) {
         this.member = member;
     }
 
     public String getMemberType() {
         return memberType;
     }
 
     public void setMemberType(String type) {
         this.memberType = type;
         setMember(true);
      }
 }
 
 class Visit{
    private Customer customer;
    private String date;
    private double serviceExpense,productExpense;
 
    Visit(Customer cust, String date){
        customer=cust;
        this.date=date;
      }
 
      void setServiceExpense(double ex){serviceExpense=ex;}
      void setProductExpense(double ex){productExpense=ex;}
 
      double getTotalExpense(){
          if(customer.isMember()){
              serviceExpense -= (serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType()));
              productExpense -= (productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType()));
          }
          return serviceExpense+productExpense;}
 }
 
 // Test program
 public class beatysalon1{
   public static void main(String[] args) {
 
       // Creating a new customer
       Customer cust=new Customer("Alice");
       cust.setMember(true);
       cust.setMemberType("Premium");
 
       // Creating a visit for the customer with expenses details
       Visit visit=new Visit(cust,"2024-03-10");
       visit.setServiceExpense(200);
       visit.setProductExpense(100);

       Customer cust1 = new Customer("Sasha");
       cust1.setMember(true);
       cust1.setMemberType("Gold");

       Visit visit1 = new Visit(cust1, "10/03/2024");
       visit1.setServiceExpense(200);
       visit1.setProductExpense(100);
 
       // Printing the total expense after applying discounts
       System.out.println("Total expense after discount: " + visit.getTotalExpense());
       System.out.println("Total expense after discount: " + visit1.getTotalExpense());
   }
 }
 