package ro.fiipractic.solid.notsolid;

import ro.fiipractic.solid.Product;

public interface SugarVendingMachineManager {

    @SuppressWarnings("Duplicates")
    Double returnChange(String nameOfProduct, Double amountOfMoney);

    @SuppressWarnings("Duplicates")
    boolean hasEnoughMoney(Product product, Double amountOfMoney);

    @SuppressWarnings("Duplicates")
    Product giveProduct(String nameOfProduct, Double amountOfMoney);

    @SuppressWarnings("Duplicates")
    Integer seeAmountOfSugarOfAProduct(String nameOfProduct);

    @SuppressWarnings("Duplicates")
    Integer seePriceOfAProduct(String nameOfProduct);

    @SuppressWarnings("Duplicates")
    boolean hasProduct(String nameOfProduct);
}
