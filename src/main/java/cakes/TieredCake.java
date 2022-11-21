package cakes;

public class TieredCake extends Cake {

    private int tiers;

    public TieredCake(String name, String baseFlavour, boolean healthy, int tiers) {
        super(name, baseFlavour, healthy);
        this.tiers = tiers;
    }
}
