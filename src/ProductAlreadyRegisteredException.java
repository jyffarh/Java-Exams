//creating exception for productalready regsitered
public class ProductAlreadyRegisteredException extends Exception {
    //use extends because productalreadyregisteredexception is inheriting from the super class Exception
    public ProductAlreadyRegisteredException(String ex){
        super(ex);
    }

    @Override
    public String toString() {
        return ("You have already registered this product");
    }
}
