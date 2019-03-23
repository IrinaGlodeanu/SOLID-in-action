package ro.fiipractic.solid.notsolid;

import ro.fiipractic.solid.Product;

public class SugarVendingMachineManagerImpl implements SugarVendingMachineManager {

    @Override
    @SuppressWarnings("Duplicates")
    public Double returnChange(String nameOfProduct, Double amountOfMoney){
        Product sugaryProduct = Product.valueOf(nameOfProduct);

        if(amountOfMoney < sugaryProduct.getPriceInRon()){
            throw new RuntimeException("Not enough money ");
        }

        return amountOfMoney - sugaryProduct.getPriceInRon();
    }

    @Override
    @SuppressWarnings("Duplicates")
    public boolean hasEnoughMoney(Product product, Double amountOfMoney) {

        if(product.getPriceInRon() < amountOfMoney)
            return false;

        return true;
    }

    @Override
    @SuppressWarnings("Duplicates")
    public Product giveProduct(String nameOfProduct, Double amountOfMoney) {

        try {
            Product sugaryProduct = Product.valueOf(nameOfProduct);

            if (amountOfMoney < sugaryProduct.getPriceInRon()) {
                throw new RuntimeException("Not enough money ");
            }
            return sugaryProduct;

        } catch (IllegalArgumentException e) {
            throw new RuntimeException("We dont have that product");
        }
    }

    @Override
    @SuppressWarnings("Duplicates")
    public Integer seeAmountOfSugarOfAProduct(String nameOfProduct) {

        try {
            Product product = Product.valueOf(nameOfProduct);
            return product.getAmountOfSugarInGrams();
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("We dont have that product");
        }
    }

    @Override
    @SuppressWarnings("Duplicates")
    public Integer seePriceOfAProduct(String nameOfProduct) {

        try {
            Product product = Product.valueOf(nameOfProduct);
            return product.getPriceInRon();
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("We dont have that product");
        }
    }

    @Override
    public boolean hasProduct(String nameOfProduct){
        try {
            Product.valueOf(nameOfProduct);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
