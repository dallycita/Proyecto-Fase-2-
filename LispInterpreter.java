import java.util.*;

/**
 * La clase principal LispInterpreter integra todas las funcionalidades del intérprete Lisp.
 * Se encarga de leer la entrada del usuario, tokenizarla, analizarla y evaluarla.
 */
public class LispInterpreter {
    /**
     * Método principal que ejecuta el intérprete de Lisp.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
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
