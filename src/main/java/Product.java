import java.util.Arrays;
import java.util.Optional;

public enum Product {
    A("A", 50),
    B("B", 30),
    C("C", 20),
    D("D", 15);

    private final String _text;
    private final int _value;

    Product(String text, int value) {
        _text = text;
        _value = value;
    }

    public String getText(){
        return _text;
    }

    public int getValue(){
        return _value;
    }

    public static Product fromText(String text) {
        return Arrays.stream(Product.values())
                .filter(prod -> prod._text.equals(text))
                .findFirst().get();
    }
}
