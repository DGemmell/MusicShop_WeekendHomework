import Instruments.Guitar;
import Instruments.InstrumentType;
import Shop.Instrument;
import org.junit.Before;
import org.junit.Test;

public class TestGuitar {

        Instrument material;
        Guitar guitar;
        Guitar string;
        Guitar tuners;

        @Before
        public void before(){
            guitar = new Guitar("wood", InstrumentType.GUITAR, 6, "fine tuners");

        }

    @Test
    public void name() {
    }
}