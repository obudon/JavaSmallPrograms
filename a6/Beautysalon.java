class Customer {
    private String name;
    private String memberType;
    private boolean member = false;

    public Customer(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setMemberType(String type){
        this.memberType = type;
        setMember(true);
    }
    public String getMemberType(){
        return memberType;
    }
    public boolean hasMembership(){
        return member;
    }
    public void setMember(boolean member){
        this.member = member;
    }
}

class Visit {
    private Customer customer;
    private double serviceExpense, productExpense;
    private String date;

    public Visit(Customer custName, String date){
        this.customer = custName;
        this.date = date;
    }
    public void setServiceExpense(double sExpense){
        this.serviceExpense = sExpense;
    }
    public void setProductExpense(double pExpense){
        this.productExpense = pExpense; 
    }
    public double getTotalExpense(){
        if (customer.hasMembership()){
            serviceExpense -= serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType());
            productExpense -= productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType());
        }
        double totalExpense = serviceExpense + productExpense;
        return totalExpense;
    }    
}

class DiscountRate{
    private static double  serviceDiscountPremium=0.2, serviceDiscountGold=0.15, 
                           serviceDiscountSilver=0.1, productDiscountPremium=0.1,
                           productDiscountGold=0.1, productDiscountSilver=0.1;
    public static double getServiceDiscountRate(String type){
        switch (type) {
            case "Premium":
                return serviceDiscountPremium;
            case "Gold":
                return serviceDiscountGold;
            case "Silver":
                return serviceDiscountSilver;
            default:
                return 0;
        }
    }
    public static double getProductDiscountRate(String type){
        switch (type) {
            case "Premium":
                return productDiscountPremium;
            case "Gold":
                return productDiscountGold;
            case "Silver":
                return productDiscountSilver;
            default:
                return 0;
        }
    }
}

public class Beautysalon {
    public static void main(String[] args) {
        // Test Program
        Customer custName = new Customer("Sasha");
        custName.setMemberType("Premium");
        custName.setMember(true);

        Visit visit = new Visit(custName, "05/03/2024");
        visit.setServiceExpense(120);
        visit.setProductExpense(50);
        System.out.println("Total expense after discount: " + visit.getTotalExpense());

        Customer custName1 = new Customer("Misha");
        custName1.setMemberType("Silver");
        custName1.setMember(true);

        Visit visit1 = new Visit(custName1, "10/03/2024");
        visit1.setServiceExpense(120);
        visit1.setProductExpense(50);

        System.out.println("Total expense after discount: " + visit1.getTotalExpense());
    }
    
}
