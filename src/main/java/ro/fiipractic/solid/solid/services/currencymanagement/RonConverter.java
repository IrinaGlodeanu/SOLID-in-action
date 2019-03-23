package ro.fiipractic.solid.solid.services.currencymanagement;

public class RonConverter implements Converter {

    @Override
    public Double convert(Integer amount) {
        return Double.valueOf(amount);
    }
}
