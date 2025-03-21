import java.util.*;

/**
 * La clase Lexer se encarga de tokenizar una entrada de texto en formato Lisp.
 * Separa los paréntesis y los identificadores en una lista de tokens.
 */
class Lexer {
    /**
     * Tokeniza una cadena de entrada en una lista de tokens para su posterior análisis.
     * 
     * @param input La cadena de entrada en formato Lisp.
     * @return Una lista de tokens extraídos de la entrada.
     */
    public static List<String> tokenize(String input) {
        List<String> tokens = new ArrayList<>();
        StringBuilder token = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isWhitespace(c)) {
                if (token.length() > 0) {
                    tokens.add(token.toString());
                    token.setLength(0);
                }
            } else if (c == '(' || c == ')') {
                if (token.length() > 0) {
                    tokens.add(token.toString());
                    token.setLength(0);
                }
                tokens.add(String.valueOf(c));  // Añadir paréntesis como tokens separados
            } else {
                token.append(c);
            }
        }
        
        // Añadir el último token si lo hay
        if (token.length() > 0) {
            tokens.add(token.toString());
        }
        return tokens;
    }
}



