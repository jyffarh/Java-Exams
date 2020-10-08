//creating subclass future under products
public class Future{
  //declaring attributes for the class
    private String Id;
    private double value;
    private int quantity;

//constructor
    public Future(String id, double value, int quantity) {
        Id = id;
        this.value = value;
        this.quantity = quantity;
    }
//getting Ids
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
