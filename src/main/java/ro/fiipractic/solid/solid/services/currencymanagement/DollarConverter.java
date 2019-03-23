package ro.fiipractic.solid.solid.services.currencymanagement;

public class DollarConverter implements Converter {

    @Override
    public Double convert(Integer amount) {
        return 4.2 * amount;
    }
}
