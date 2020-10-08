//creating interface
public interface MontrealTradedProducts<Products> {
    void addNewProduct(Products product) throws ProductAlreadyRegisteredException;
    void trade (Products product, int quality);
    int totalTradeQualityDay();
    double totalValueOfDaysTradeProducts();



}
