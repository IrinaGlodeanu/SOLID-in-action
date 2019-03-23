package ro.fiipractic.solid.solid;

import ro.fiipractic.solid.solid.services.currencymanagement.Converter;
import ro.fiipractic.solid.solid.services.currencymanagement.PoundConverter;
import ro.fiipractic.solid.solid.services.moneymanagement.MoneyManager;
import ro.fiipractic.solid.solid.services.moneymanagement.MoneyManagerImpl;
import ro.fiipractic.solid.solid.services.productmanagement.ProductManager;
import ro.fiipractic.solid.solid.services.productmanagement.ProductManagerImpl;

public class VendingMachineFromLondon {

    public static void main(String[] args) {

        Converter converter = new PoundConverter();


        MoneyManager moneyManager = new MoneyManagerImpl();
        ProductManager productManager = new ProductManagerImpl();

        VendingMachine vendingMachine = new VendingMachine(converter, moneyManager, productManager);


        vendingMachine.serve("COLA", 5);


    }
}
