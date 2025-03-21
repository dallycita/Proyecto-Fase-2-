import java.util.*;

/**
 * Interfaz que define un operador matemático que puede aplicarse a una lista de operandos.
 */
interface Operator {
    /**
     * Aplica la operación a una lista de operandos y devuelve el resultado.
     * 
     * @param operands Lista de operandos sobre los que se aplicará la operación.
     * @return El resultado de la operación.
     */
    int apply(List<Integer> operands);
}

/**
 * Implementación de la operación de suma.
 */
class AddOperator implements Operator {
    @Override
    public int apply(List<Integer> operands) {
        return operands.stream().mapToInt(Integer::intValue).sum();
    }
}

/**
 * Implementación de la operación de resta.
 */
class SubtractOperator implements Operator {
    @Override
    public int apply(List<Integer> operands) {
        return operands.stream().mapToInt(Integer::intValue).reduce(0, (a, b) -> a - b);
    }
}

/**
 * Implementación de la operación de multiplicación.
 */
class MultiplyOperator implements Operator {
    @Override
    public int apply(List<Integer> operands) {
        return operands.stream().mapToInt(Integer::intValue).reduce(1, (a, b) -> a * b);
    }
}

/**
 * Implementación de la operación de división.
 */
class DivideOperator implements Operator {
    @Override
    public int apply(List<Integer> operands) {
        return operands.stream().mapToInt(Integer::intValue).reduce(1, (a, b) -> a / b);
    }
}
