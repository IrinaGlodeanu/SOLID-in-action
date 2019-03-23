package ro.fiipractic.solid.solid;

import ro.fiipractic.solid.solid.services.currencymanagement.Converter;
import ro.fiipractic.solid.solid.services.currencymanagement.RonConverter;
import ro.fiipractic.solid.solid.services.currencymanagement.RonMealTicketConverter;
import ro.fiipractic.solid.solid.services.moneymanagement.MoneyManager;
import ro.fiipractic.solid.solid.services.moneymanagement.MoneyManagerImpl;
import ro.fiipractic.solid.solid.services.productmanagement.ProductManager;
import ro.fiipractic.solid.solid.services.productmanagement.ProductManagerImpl;

public class VendingMachineFromBucharest {

    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {

        Converter converter = new RonConverter();
        Converter converter1 = new RonMealTicketConverter();


        MoneyManager moneyManager = new MoneyManagerImpl();
        ProductManager productManager = new ProductManagerImpl();

        VendingMachine vendingMachine = new VendingMachine(converter, moneyManager, productManager);
        VendingMachine vendingMachine1 = new VendingMachine(converter1, moneyManager, productManager);


        vendingMachine.serve("COLA", 5);

        vendingMachine1.serve("COLA", 5);



    }
}
