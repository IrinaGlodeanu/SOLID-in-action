package ro.fiipractic.solid.solid;

import ro.fiipractic.solid.Product;
import ro.fiipractic.solid.solid.services.currencymanagement.Converter;
import ro.fiipractic.solid.solid.services.moneymanagement.MoneyManager;
import ro.fiipractic.solid.solid.services.productmanagement.ProductManager;

public class VendingMachine {

    private Converter converter;
    private MoneyManager moneyManager;
    private ProductManager productManager;

    public VendingMachine(Converter converter, MoneyManager moneyManager, ProductManager productManager){
        this.converter = converter;
        this.moneyManager = moneyManager;
        this.productManager = productManager;
    }


    public void serve(String nameOfWantedProduct, Integer moneyGiven){

        Double ronsGiven = converter.convert(moneyGiven);

        Product product = productManager.giveProduct(nameOfWantedProduct, ronsGiven);
        Double change = moneyManager.returnChange(nameOfWantedProduct, ronsGiven);

        System.out.println("You received your product : " + product + " and the change " + change + " in RON ");
    }

}
