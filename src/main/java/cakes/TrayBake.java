package cakes;

public class TrayBake extends Cake {
    private String type;


    public TrayBake(String name, String baseFlavour, boolean healthy, String type) {
        super(name, baseFlavour, healthy);
        this.type = type;
    }

    @Override
    public String mixIngredients() {
        return "Ingredients are not mixed";
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
