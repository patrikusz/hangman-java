import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class HangmanTest {
    @Test
    public void nyertesJatekTeszt() throws HangmanKivetel {
        Hangman hangman = new Hangman("teszt", 5);
        assertEquals("folytatódik", hangman.talalgat('t'));
        assertEquals("folytatódik", hangman.talalgat('e'));
        assertEquals("folytatódik", hangman.talalgat('z'));
        assertEquals("nyert", hangman.talalgat('s'));
    }

    @Test
    public void vesztesJatekTeszt() throws HangmanKivetel {
        Hangman hangman = new Hangman("teszt", 3);
        assertEquals("folytatódik", hangman.talalgat('a'));
        assertEquals("folytatódik", hangman.talalgat('b'));
        assertEquals("vesztett", hangman.talalgat('c'));
    }

    @Test
    public void kivetelTeszt() {
        assertThrows(HangmanKivetel.class, () -> new Hangman("szó", 5));
    }
}
