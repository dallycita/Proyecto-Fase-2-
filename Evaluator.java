import java.util.*;

/**
 * La clase Evaluator evalúa una expresión representada como una lista de cadenas.
 * La primera cadena representa el operador, y las siguientes son los operandos.
 */
class Evaluator {
    // Hacer el método 'evaluate' estático
    public static int evaluate(List<String> expression) {
        if (expression.isEmpty()) {
            return 0;
        }

        String operator = expression.get(0);
        List<Integer> operands = new ArrayList<>();

        // Convertir los operandos de String a Integer
        for (int i = 1; i < expression.size(); i++) {
            operands.add(Integer.parseInt(expression.get(i)));
        }

        if (operator.equals("+")) {
            return applyAddition(operands);
        } else if (operator.equals("-")) {
            return applySubtraction(operands);
        } else if (operator.equals("*")) {
            return applyMultiplication(operands);
        } else if (operator.equals("/")) {
            return applyDivision(operands);
        }

        return 0;
    }

    private static int applyAddition(List<Integer> operands) {
        int result = 0;
        for (int num : operands) {
            result += num;
        }
        return result;
    }

    private static int applySubtraction(List<Integer> operands) {
        int result = operands.get(0);
        for (int i = 1; i < operands.size(); i++) {
            result -= operands.get(i);
        }
        return result;
    }

    private static int applyMultiplication(List<Integer> operands) {
        int result = 1;
        for (int num : operands) {
            result *= num;
        }
        return result;
    }

    private static int applyDivision(List<Integer> operands) {
        int result = operands.get(0);
        for (int i = 1; i < operands.size(); i++) {
            result /= operands.get(i);
        }
        return result;
    }
}