import Instruments.Guitar;
import Instruments.InstrumentType;
import MusicShop.Instrument;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

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
    public void getmaterial() {
            assertEquals("wood",guitar.getMaterial());
    }

    @Test
    public void getType() {
            assertEquals(InstrumentType.GUITAR, guitar.getType());
    }

    @Test
    public void getNumberOfStrings() {
            assertEquals(6, guitar.getString());
    }

    @Test
    public void getTuners() {
            assertEquals("fine tuners", guitar.getTuners());
    }
}
