// Clase principal que integra todo
import java.util.*;

public class LispInterpretertest {
    public static void main(String[] args) {
        System.out.println("Lisp: (+ 1 2 3)");
        String input = "(+ 1 2 3)";

        
        
        
        // Tokenizar la entrada
        List<String> tokens = Lexer.tokenize(input);
        // Parsear los tokens en una expresión
        List<String> parsedExpression = Parser.parse(tokens);
        
        // Evaluar la expresión y mostrar el resultado
        int result = Evaluator.evaluate(parsedExpression);
        System.out.println("Resultado: " + result); 


        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lisp: (* 1 2 3)");
        String input = "(* 1 2 3)";

        
        
        
        // Tokenizar la entrada
        List<String> tokens = Lexer.tokenize(input);
        // Parsear los tokens en una expresión
        List<String> parsedExpression = Parser.parse(tokens);
        
        // Evaluar la expresión y mostrar el resultado
        int result = Evaluator.evaluate(parsedExpression);
        System.out.println("Resultado: " + result);

        
        


    }
}