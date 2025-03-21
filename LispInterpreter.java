import java.util.*;

/**
 * La clase principal LispInterpreter integra todas las funcionalidades del intérprete Lisp.
 * Se encarga de leer la entrada del usuario, tokenizarla, analizarla y evaluarla.
 */
public class LispInterpreter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE LISP: ");
        String input = scanner.nextLine();  // Lee toda la línea

        // Tokenizar la entrada
        List<String> tokens = Lexer.tokenize(input);
        
        // Parsear los tokens en una expresión
        List<String> parsedExpression = Parser.parse(tokens);

        // Evaluar la expresión y mostrar el resultado
        int result = Evaluator.evaluate(parsedExpression);
        System.out.println("Resultado: " + result);  // Mostrar el resultado de la operación
    }
}