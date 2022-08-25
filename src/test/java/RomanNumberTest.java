import org.example.RomanNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTest {
    @Test
    public void OneShouldReturnI() {
        RomanNumber roman = new RomanNumber();
        assertEquals("I", roman.convert(1));
    }

    @Test
    public void TwoShouldReturnII() {
        RomanNumber roman = new RomanNumber();
        assertEquals("II", roman.convert(2));
    }

    @Test
    public void ThreeShouldReturnIII() {
        RomanNumber roman = new RomanNumber();
        assertEquals("III", roman.convert(3));
    }

    @Test
    public void FourShouldReturnIV() {
        RomanNumber roman = new RomanNumber();
        assertEquals("IV", roman.convert(4));
    }

    @Test
    public void FiveShouldReturnV() {
        RomanNumber roman = new RomanNumber();
        assertEquals("V", roman.convert(5));
    }

    @Test
    public void SixShouldReturnVI() {
        RomanNumber roman = new RomanNumber();
        assertEquals("VI", roman.convert(6));
    }

    @Test
    public void SevenShouldReturnVII() {
        RomanNumber roman = new RomanNumber();
        assertEquals("VII", roman.convert(7));
    }

    @Test
    public void EightShouldReturnVIII() {
        RomanNumber roman = new RomanNumber();
        assertEquals("VIII", roman.convert(8));
    }

    @Test
    public void NineShouldReturnIX() {
        RomanNumber roman = new RomanNumber();
        assertEquals("IX", roman.convert(9));
    }

    @Test
    public void TenShouldReturnX() {
        RomanNumber roman = new RomanNumber();
        assertEquals("X", roman.convert(10));
    }

    @Test
    public void ElevenShouldReturnXI() {
        RomanNumber roman = new RomanNumber();
        assertEquals("XI", roman.convert(11));
    }

    @Test
    public void TwelveShouldReturnXII() {
        RomanNumber roman = new RomanNumber();
        assertEquals("XII", roman.convert(12));
    }

    @Test
    public void ThirteenShouldReturnXIII() {
        RomanNumber roman = new RomanNumber();
        assertEquals("XIII", roman.convert(13));
    }
}
