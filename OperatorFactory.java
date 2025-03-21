import java.util.*;
class OperatorFactory {
    private static final Map<String, Operator> operators = new HashMap<>();

    static {
        operators.put("+", new AddOperator());
        operators.put("-", new SubtractOperator());
        operators.put("*", new MultiplyOperator());
        operators.put("/", new DivideOperator());
    }

    public static Operator createOperator(String operator) {
        return operators.get(operator);
    }
}
