package cakes;

public class Cupcake extends Cake {

    private String topping;

    public Cupcake(String name, String baseFlavour, boolean healthy, String topping) {
        super(name, baseFlavour, healthy);
        this.topping = topping;
    }

//    Method
    public String addTheme(String theme) {
        return theme;
    }


//    Method Overload
    public String addTheme(String theme, String personalisedMessage) {
        return personalisedMessage;
    }

    @Override
    public String mixIngredients() {
        return "Ingredients are mixed";
    }

    @Override
    public boolean checkHasBeenReserved() {
        return true;
    }

    @Override
    public String scanBarcode() {
        return "Yes";
    }
}
