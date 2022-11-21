package cakes;

public class Cupcake extends Cake {

    private String topping;

    public Cupcake(String name, String baseFlavour, boolean healthy, String topping) {
        super(name, baseFlavour, healthy);
        this.topping = topping;
    }

}
