package Instruments;

import Behaviours.IPlay;
import Shop.Instrument;

public class Piano extends Instrument {

    private InstrumentType type;
    private String manufacturer;
    private String key;
    private int pedal;

    public Piano(String material,InstrumentType type, String manufacturer, String key, int pedal) {
        super(material);
        this.manufacturer = manufacturer;
        this.key = key;
        this.pedal = pedal;
    }

    public InstrumentType getType() {
        return type;

    }


    public String getKey() {
        return key;
    }

    public int getPedal() {
        return pedal;
    }

    @Override
    public String play(String instrument) {
        return "I am playing the " + instrument;
    }
}
