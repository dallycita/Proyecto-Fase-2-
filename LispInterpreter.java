// Clase principal que integra todo
import java.util.*;

public class LispInterpreter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE LISP: ");
        String input = scanner.nextLine();  // lee toda la línea
        
        
        // Tokenizar la entrada
        List<String> tokens = Lexer.tokenize(input);
        // Parsear los tokens en una expresión
        List<String> parsedExpression = Parser.parse(tokens);
        
        // Evaluar la expresión y mostrar el resultado
        int result = Evaluator.evaluate(parsedExpression);
        System.out.println("Resultado: " + result);  // Debería mostrar 6
    }
}