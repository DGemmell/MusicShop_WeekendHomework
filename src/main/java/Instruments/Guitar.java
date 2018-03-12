package Instruments;

import Behaviours.IPlay;
import Shop.Instrument;

public class Guitar extends Instrument {

    private InstrumentType type;
    private int string;
    private String tuners;

    public Guitar(String material, InstrumentType type, int string, String tuners) {
        super(material);
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
