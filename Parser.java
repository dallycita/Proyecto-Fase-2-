import java.util.*;
class Parser {
    private static int currentIndex = 0;

    public static List<String> parse(List<String> tokens) {
        if (currentIndex >= tokens.size()) return new ArrayList<>();

        String token = tokens.get(currentIndex);
        List<String> expression = new ArrayList<>();

        if (token.equals("(")) {
            currentIndex++;
            while (!tokens.get(currentIndex).equals(")")) {
                expression.addAll(parse(tokens));
            }
            currentIndex++;  // Consumir ')'
            return expression;
        }

        currentIndex++;
        expression.add(token);
        return expression;
    }
}