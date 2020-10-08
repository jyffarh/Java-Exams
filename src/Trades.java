
import java.util.List;
import java.util.ArrayList;
public class Trades <Products> implements MontrealTradedProducts<Products> {
    List<Products> trades= new Arraylist<>();


    @Override
    public void addNewProduct(Products product) throws ProductAlreadyRegisteredException {
        for (Products trades_item : trades){
            if (trades_item.equals(product) throw new ProductAlreadyRegisteredException("You have already registered this product");
            else trades.add(product);
        }

    }

    @Override
    public void trade(Products product, int quality) {

    }

    @Override
    public int totalTradeQualityDay() {
        return 0;
    }

    @Override
    public double totalValueOfDaysTradeProducts() {
        return 0;
    }
}
