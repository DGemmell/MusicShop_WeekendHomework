package Shop;

import Behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String material;

    public Instrument(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }



}
