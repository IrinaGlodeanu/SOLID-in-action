package ro.fiipractic.solid.notsolid;

public class CurrencyConverter {


    public Double convert(String currency, Integer amount) {
        switch (currency) {
            case "EUR":
                return 4.7 * amount;
            case "USD":
                return 4.2 * amount;
            case "GBP":
                return 5.5 * amount;
            case "RON":
                return Double.valueOf(amount);
            default:
                throw new RuntimeException("We dont accept this currency");

        }
    }

}
