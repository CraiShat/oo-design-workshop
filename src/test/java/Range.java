import java.lang.reflect.Array;

public class Range {
    private String text;

    public Range(String text) {

        this.text = text;
    }

    public boolean isStartWithInclusiveWithBrackets() {
        String squareBrackets = "[";
        return text.startsWith(squareBrackets);
    }

    public boolean isStartWithInclusiveWithParentheses() {
        String roundBrackets = "(";
        return text.startsWith(roundBrackets);
    }

    public int getStartInput() {
        int beginOfStartInput = 1;
        int endOfEndInput = 2;
        return Integer.parseInt(text.substring(beginOfStartInput, endOfEndInput));
    }

    public boolean isEndWithInclusiveWithBrackets() {
        String squareBrackets = "]";
        return text.endsWith(squareBrackets);
    }

    public boolean isEndWithInclusiveWithParentheses() {
        String roundBrackets = ")";
        return text.endsWith(roundBrackets);
    }

    public int getEndInput() {
        int beginOfStartInput = 3;
        int endOfEndInput = 4;
        return Integer.parseInt(text.substring(beginOfStartInput, endOfEndInput));
    }
}
