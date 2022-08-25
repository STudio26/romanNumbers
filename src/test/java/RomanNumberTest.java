import org.example.RomanNumber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTest {

    private static RomanNumber roman;

    @BeforeAll
    static void setup() {
        roman = new RomanNumber();
    }

    @Test
    public void OneShouldReturnI() {
        assertEquals("I", roman.convert(1));
    }

    @Test
    public void TwoShouldReturnII() {
        assertEquals("II", roman.convert(2));
    }

    @Test
    public void ThreeShouldReturnIII() {
        assertEquals("III", roman.convert(3));
    }

    @Test
    public void FourShouldReturnIV() {
        assertEquals("IV", roman.convert(4));
    }

    @Test
    public void FiveShouldReturnV() {
        assertEquals("V", roman.convert(5));
    }

    @Test
    public void SixShouldReturnVI() {
        assertEquals("VI", roman.convert(6));
    }

    @Test
    public void SevenShouldReturnVII() {
        assertEquals("VII", roman.convert(7));
    }

    @Test
    public void EightShouldReturnVIII() {
        assertEquals("VIII", roman.convert(8));
    }

    @Test
    public void NineShouldReturnIX() {
        assertEquals("IX", roman.convert(9));
    }

    @Test
    public void TenShouldReturnX() {
        assertEquals("X", roman.convert(10));
    }

    @Test
    public void ElevenShouldReturnXI() {
        assertEquals("XI", roman.convert(11));
    }

    @Test
    public void TwelveShouldReturnXII() {
        assertEquals("XII", roman.convert(12));
    }

    @Test
    public void ThirteenShouldReturnXIII() {
        assertEquals("XIII", roman.convert(13));
    }

    @ParameterizedTest
    @CsvSource({"49, XLIX", "51, LI", "99, XCIX", "101, CI", "399, CCCXCIX", "401, CDI", "499, CDXCIX", "501, DI", "899, DCCCXCIX", "901, CMI", "1001, MI"})
    void convert_ShouldGenerateTheExpectedRomanNumber(int input, String expected) {
        assertEquals(expected, roman.convert(input));
    }
}
