package Instruments;

import MusicShop.Instrument;

public class Guitar extends Instrument {

    private InstrumentType type;
    private int string;
    private String tuners;

    public Guitar(String material, String manufacturer, InstrumentType type, int string, String tuners) {
        super(material, manufacturer);
        this.type = type;
        this.string = string;
        this.tuners = tuners;
    }



    public InstrumentType getType() {
        return type;
    }

    public int getString() {
        return string;
    }

    public String getTuners() {
        return tuners;
    }

    @Override
    public String play(String instrument) {
        return "I am playing the " + instrument;
    }
}
