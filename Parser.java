import java.util.*;

/**
 * Clase que se encarga de analizar sintácticamente una lista de tokens de una expresión Lisp.
 */
class Parser {
    /**
     * Índice actual en la lista de tokens durante el proceso de análisis.
     */
    private static int currentIndex = 0;

    /**
     * Parsea una lista de tokens y los estructura en una lista de expresiones.
     * 
     * @param tokens Lista de tokens generada por el Lexer.
     * @return Una lista de cadenas representando la estructura de la expresión.
     */
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