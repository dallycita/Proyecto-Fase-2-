import java.util.*;

/**
 * La clase Evaluator evalúa una expresión representada como una lista de cadenas.
 * La primera cadena representa el operador, y las siguientes son los operandos.
 */
class Evaluator {
    /**
     * Evalúa una expresión en forma de lista de cadenas.
     * 
     * @param expression Lista de cadenas donde el primer elemento es el operador y los siguientes son operandos.
     * @return El resultado de aplicar el operador a los operandos. Si la lista está vacía, devuelve 0.
     * @throws NumberFormatException Si algún operando no es un número válido.
     */
    public static int evaluate(List<String> expression) {
        if (expression.isEmpty()) {
            return 0;
        }

        String operator = expression.get(0);
        List<Integer> operands = new ArrayList<>();

        for (int i = 1; i < expression.size(); i++) {
            operands.add(Integer.parseInt(expression.get(i)));
        }

        Operator op = OperatorFactory.createOperator(operator);
        return op.apply(operands);
    }
}
