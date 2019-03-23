package ro.fiipractic.solid.solid.services.currencymanagement;

public class RonMealTicketConverter extends RonConverter {


    //let's say that if we use meal tickets to buy from the vending machine, some tax will be applied (here, of 1 RON)
    @Override
    public Double convert(Integer amount) {
        return Double.valueOf(amount) - 1.0 ;
    }
}
