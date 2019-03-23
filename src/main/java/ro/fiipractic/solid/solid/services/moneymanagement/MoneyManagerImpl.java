package ro.fiipractic.solid.solid.services.moneymanagement;

import ro.fiipractic.solid.Product;

public class MoneyManagerImpl implements MoneyManager {

    @Override
    @SuppressWarnings("Duplicates")
    public Double returnChange(String nameOfProduct, Double amountOfMoney){
        Product sugaryProduct = Product.valueOf(nameOfProduct);

        if(amountOfMoney < sugaryProduct.getPriceInRon()){
            throw new RuntimeException("Not enough money ");
        }

        return Double.valueOf(amountOfMoney - sugaryProduct.getPriceInRon());
    }

    @Override
    @SuppressWarnings("Duplicates")
    public boolean hasEnoughMoney(Product product, Double amountOfMoney) {

        if(product.getPriceInRon() < amountOfMoney)
            return false;

        return true;
    }


}
