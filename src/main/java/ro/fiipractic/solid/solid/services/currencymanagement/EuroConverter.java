package ro.fiipractic.solid.solid.services.currencymanagement;

public class EuroConverter implements Converter {

    @Override
    public Double convert(Integer amount) {
        return 4.7 * amount;
    }
}
