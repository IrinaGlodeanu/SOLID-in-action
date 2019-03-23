package ro.fiipractic.solid.notsolid;

public class CoinConverter extends CurrencyConverter {

    @Override
    public Double convert(String currency, Integer amount) {
        throw new RuntimeException("The vending machine does not support coins");
    }

}
