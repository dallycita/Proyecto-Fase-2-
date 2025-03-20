// Clase principal que integra todo
public class LispInterpreter {
    private Lexer lexer = new Lexer();
    private Parser parser = new Parser();
    private Evaluator evaluator = new Evaluator();

    // Método que toma una expresión en formato de texto y devuelve el resultado
    public Object evaluate(String expression) {
        List<String> tokens = lexer.tokenize(expression); // Tokeniza la expresión
        Object parsedExpression = parser.parse(tokens); // Convierte los tokens en una estructura
        return evaluator.evaluate(parsedExpression); // Evalúa la expresión
    }

    public static void main(String[] args) {
        LispInterpreter interpreter = new LispInterpreter();
        
        // Pruebas con operaciones simples
        System.out.println(interpreter.evaluate("(+ 3 4)")); // Suma
        System.out.println(interpreter.evaluate("(- 10 5)")); // Resta
        System.out.println(interpreter.evaluate("(* 2 3)")); // Multiplicación
        System.out.println(interpreter.evaluate("(/ 8 2)")); // División

        // Asignación de variables
        System.out.println(interpreter.evaluate("(SETQ x 10)")); // Asigna 10 a 'x'
        System.out.println(interpreter.evaluate("x")); // Muestra el valor de 'x'
    }
}