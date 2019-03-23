package ro.fiipractic.solid;

public enum Product {

    COLA(3, 300),
    SYRUP(4, 200),
    CANDY(1, 30),
    CARAMEL(3, 400);

    private Integer priceInRon;

    private Integer amountOfSugarInGrams;

    Product(Integer priceInRon, Integer amountOfSugarInGrams) {
        this.priceInRon = priceInRon;
        this.amountOfSugarInGrams = amountOfSugarInGrams;
    }

    public Integer getPriceInRon() {
        return priceInRon;
    }

    public Integer getAmountOfSugarInGrams() {
        return amountOfSugarInGrams;
    }
}
