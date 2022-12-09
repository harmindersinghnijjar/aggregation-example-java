public class AmazonItem {
    private String Item;
    private double SalesPrice;

    public AmazonItem(String Item, double SalesPrice) {
        this.Item = Item;
        this.SalesPrice = SalesPrice;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String Item) {
        this.Item = Item;
    }

    public double getSalesPrice() {
        return SalesPrice;
    }

    public void setSalesPrice(double SalesPrice) {
        this.SalesPrice = SalesPrice;
    }
}
