package ro.fiipractic.solid.solid.services.productmanagement;

import ro.fiipractic.solid.Product;

public class ProductManagerImpl implements ProductManager {

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
