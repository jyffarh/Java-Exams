import java.util.zip.DeflaterOutputStream;
//creating superclass
public abstract class Products {

    class Product{
        private String id;
                private double price;
                private String kindOfProduct;

        Product(String id, int price, String kindOfProduct) {
            this.id = id;
            this.price = price;
            this.kindOfProduct = kindOfProduct;
        }
    }

    public static void main (String [] args){


    }
}
