import java.util.*;

/**
 * Clase de fábrica que proporciona instancias de operadores matemáticos
 * basados en un símbolo de operación.
 */
class OperatorFactory {
    /**
     * Mapa estático que asocia símbolos de operadores con sus respectivas implementaciones.
     */
    private static final Map<String, Operator> operators = new HashMap<>();

    // Inicialización estática del mapa de operadores
    static {
        operators.put("+", new AddOperator());
        operators.put("-", new SubtractOperator());
        operators.put("*", new MultiplyOperator());
        operators.put("/", new DivideOperator());
    }

    /**
     * Devuelve una instancia del operador correspondiente al símbolo dado.
     *
     * @param operator El símbolo del operador ("+", "-", "*", "/").
     * @return Una instancia de la implementación de Operator correspondiente, o null si no se encuentra.
     */
    public static Operator createOperator(String operator) {
        return operators.get(operator);
    }
}
