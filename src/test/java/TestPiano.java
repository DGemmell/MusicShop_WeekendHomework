import Instruments.InstrumentType;
import Instruments.Piano;
import MusicShop.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPiano {

    Instrument material;
    Piano piano;
    Piano key;
    Piano pedal;


    @Before
    public void before() {
        piano = new Piano("wood", InstrumentType.PIANO, "Scottish Pianos", "ivory", 3);

    }


    @Test
    public void getMaterial() {
        assertEquals("wood", piano.getMaterial());
    }

//    @Test
//    public void getType() {
//        assertEquals(InstrumentType.PIANO, piano.getType());
//    }

    @Test
    public void getKey() {
        assertEquals("ivory", piano.getKey());
    }

    @Test
    public void getPedal() {
        assertEquals(3, piano.getPedal());
    }

    @Test
    public void canPlayPiano() {
        assertEquals("I am playing the piano", piano.play("piano"));
    }
}

