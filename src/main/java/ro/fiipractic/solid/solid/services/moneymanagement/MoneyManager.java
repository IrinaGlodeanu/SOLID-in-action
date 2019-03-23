package ro.fiipractic.solid.solid.services.moneymanagement;

import ro.fiipractic.solid.Product;

public interface MoneyManager {

    @SuppressWarnings("Duplicates")
    Double returnChange(String nameOfProduct, Double amountOfMoney);

    @SuppressWarnings("Duplicates")
    boolean hasEnoughMoney(Product product, Double amountOfMoney);
}
