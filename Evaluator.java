import java.util.*;
class Evaluator {
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