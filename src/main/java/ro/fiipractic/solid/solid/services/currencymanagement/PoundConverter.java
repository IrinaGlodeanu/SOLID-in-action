package ro.fiipractic.solid.solid.services.currencymanagement;

public class PoundConverter implements Converter {

    @Override
    public Double convert(Integer amount) {
        return 5.5 * amount;
    }
}
