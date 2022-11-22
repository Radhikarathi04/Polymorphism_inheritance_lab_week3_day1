package bakeries;

import interfaces.ISell;

public class BakingKit implements ISell {
    @Override
    public boolean checkHasBeenReserved() {
        return true;
    }

    @Override
    public String scanBarcode() {
        return "Yes";
    }
}
