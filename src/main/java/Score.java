import java.util.Arrays;
import java.util.Optional;

public enum Score {
    LOVE("Love", 0),
    FIFTEEN("Fifteen", 1),
    THIRTY("Thirty", 2),
    FORTY("Forty", 3),
    DEUCE("Deuce", 4),
    ADVANTAGE("Advantage", 5),
    WINNER("Winner", 6),
    LOSER("Loser", 7);

    private final String _text;
    private final int _value;

    Score(String text, int value) {
        _text = text;
        _value = value;
    }

    public String getText(){
        return _text;
    }

    public int getValue(){
        return _value;
    }

    public static Optional<Score> fromValue(int value) {
        return Arrays.stream(Score.values())
                .filter(score -> score._value == value)
                .findFirst();
    }
}
