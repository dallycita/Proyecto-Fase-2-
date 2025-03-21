import java.util.*;

// Lexer: Tokeniza el input de Lisp
class Lexer {
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



