package cakes;

import interfaces.ISell;

public abstract class Cake implements ISell {

    protected String name;
    private String baseFlavour;
    private boolean healthy;

    public Cake (String name, String baseFlavour, boolean healthy) {
        this.name = name;
        this.baseFlavour = baseFlavour;
        this.healthy = healthy;
    }

    // GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getBaseFlavour() {
        return baseFlavour;
    }

    public void setBaseFlavour() {
        this.baseFlavour = baseFlavour;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }


    //ABSTRACT METHOD
    public abstract String mixIngredients();
}