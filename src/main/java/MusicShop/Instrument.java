package MusicShop;

import Behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String material;
    private String manufacturer;

    public Instrument(String material, String manufacturer) {
        this.material = material;
        this.manufacturer= manufacturer;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
