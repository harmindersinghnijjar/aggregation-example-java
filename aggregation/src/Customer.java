import java.util.ArrayList;

public class Customer
{  private String SOCNum;
    private double Spending;
    private AmazonItem item;

    public Customer(String SOCNum, double Spending, AmazonItem item)
    {
        this.SOCNum = SOCNum;
        this.Spending = Spending;
        this.item = item;
    }

    public String getSOCNum()
    {
        return SOCNum;
    }

    public void setSOCNum(String SOCNum)
    {
        this.SOCNum = SOCNum;
    }

    public double getSpending()
    {
        return Spending;
    }

    public void setSpending(double Spending)
    {
        this.Spending = Spending;
    }

    public AmazonItem getItem()
    {
        return item;
    }

    public void setItem(AmazonItem item)
    {
        this.item = item;
    }

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        AmazonItem item1 = new AmazonItem("Book", 10.00);
        AmazonItem item2 = new AmazonItem("DVD", 15.00);
        AmazonItem item3 = new AmazonItem("CD", 20.00);
        Customer customer1 = new Customer("123456789", 100.00, item1);
        Customer customer2 = new Customer("987654321", 200.00, item2);
        Customer customer3 = new Customer("123456789", 300.00, item3);

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        for (Customer customer : customers) {
            System.out.println("SOC Number: " + customer.getSOCNum());
            System.out.println("Spending: " + customer.getSpending());
            System.out.println("Item: " + customer.getItem().getItem());
            System.out.println("Sales Price: " + customer.getItem().getSalesPrice());
        }
    }
}

