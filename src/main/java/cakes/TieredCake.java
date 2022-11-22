package cakes;

public class TieredCake extends Cake {

    private int tiers;

    public TieredCake(String name, String baseFlavour, boolean healthy, int tiers) {
        super(name, baseFlavour, healthy);
        this.tiers = tiers;
    }

    @Override
    public String mixIngredients() {
        return "Ingredients are not yet mixed";
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
