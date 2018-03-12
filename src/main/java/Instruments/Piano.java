package Instruments;

import MusicShop.Instrument;

public class Piano extends Instrument {

    private InstrumentType type;
    private String key;
    private int pedal;

    public Piano(String material, String manufacturer, InstrumentType type, String key, int pedal) {
        super(material, manufacturer);
        this.type = type;
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
    public String play(String sound) {
        return "I am playing the " + sound;
    }
}
