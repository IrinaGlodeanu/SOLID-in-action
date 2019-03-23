package ro.fiipractic.solid.notsolid;

import ro.fiipractic.solid.Product;

public class VendingMachineFromLondon {

    @SuppressWarnings("Duplicates")
    public void serve(String nameOfWantedProduct, Integer moneyGiven){

        CurrencyConverter converter = new CurrencyConverter();
        Double ronsGiven = converter.convert( "GPB" , moneyGiven);


        SugarVendingMachineManager manager = new SugarVendingMachineManagerImpl();

        Product product = manager.giveProduct(nameOfWantedProduct, ronsGiven);
        Double change = manager.returnChange(nameOfWantedProduct, ronsGiven);

        System.out.println("You received your product : " + product + " and the change " + change + " in RON ");
    }

    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {

        VendingMachineFromLondon vendingMachineFromLondon = new VendingMachineFromLondon();

        vendingMachineFromLondon.serve("COLA", 5);

    }
}
