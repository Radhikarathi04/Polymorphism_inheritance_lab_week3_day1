package cakes;

public class TrayBake extends Cake {
    private String type;


    public TrayBake(String name, String baseFlavour, boolean healthy, String type) {
        super(name, baseFlavour, healthy);
        this.type = type;
    }
}
