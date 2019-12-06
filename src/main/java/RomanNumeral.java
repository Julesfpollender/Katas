import java.util.*;

public class RomanNumeral {
    private int _counter = 0;
    private String _roman = "";

    private static final List<String> ROMAN_REPRESENTATION = Arrays.asList("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");

    public RomanNumeral(int counter){
        _counter = counter;
        _roman = RomanNumeral.createRomanFromInteger(counter);
    }

    public String toString(){
        return _roman;
    }

    private static String createRomanFromInteger(Integer number){
        return ROMAN_REPRESENTATION.get(number);
    }
}
