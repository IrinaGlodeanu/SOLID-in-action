package ro.fiipractic.solid.solid.services.productmanagement;

import ro.fiipractic.solid.Product;

public interface ProductManager {

    @SuppressWarnings("Duplicates")
    Product giveProduct(String nameOfProduct, Double amountOfMoney);

    @SuppressWarnings("Duplicates")
    Integer seeAmountOfSugarOfAProduct(String nameOfProduct);

    @SuppressWarnings("Duplicates")
    Integer seePriceOfAProduct(String nameOfProduct);

    @SuppressWarnings("Duplicates")
    boolean hasProduct(String nameOfProduct);
}
