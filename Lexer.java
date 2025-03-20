import java.util.*;

// Lexer: Divide la entrada en tokens
class Lexer {
    public List<String> tokenize(String input) {
        // Aquí solo separamos los paréntesis y las palabras por espacios
        return new ArrayList<>(Arrays.asList(input.replace("(", " ( ").replace(")", " ) ").split("\\s+")));
    }
}

