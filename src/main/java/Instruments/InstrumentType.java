package Instruments;

public enum InstrumentType {
    PIANO("PERCUSSION"),
    GUITAR("STRING");


public String instrumenttype;

InstrumentType(String instrumenttype){
    this.instrumenttype = instrumenttype;
}

    public String getInstrumenttype(){
        return instrumenttype;
    }

}
