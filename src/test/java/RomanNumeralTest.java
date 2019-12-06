import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class RomanNumeralTest {

    @Test
    public void testRomanRepresentation_10_expectX(){
        // Prepare
        final int number = 10;

        // Test
        RomanNumeral roman = new RomanNumeral(number);

        // Verify
        assertThat(roman.toString(), is("X"));
    }

    @Test
    public void testRomanRepresentation_3_expectIII(){
        // Prepare
        final int number = 3;

        // Test
        RomanNumeral roman = new RomanNumeral(number);

        // Verify
        assertThat(roman.toString(), is("III"));
    }
}
