import java.util.*;

interface Operator {
    int apply(List<Integer> operands);
}

class AddOperator implements Operator {
    public int apply(List<Integer> operands) {
        return operands.stream().mapToInt(Integer::intValue).sum();
    }
}

class SubtractOperator implements Operator {
    public int apply(List<Integer> operands) {
        return operands.stream().mapToInt(Integer::intValue).reduce(0, (a, b) -> a - b);
    }
}

class MultiplyOperator implements Operator {
    public int apply(List<Integer> operands) {
        return operands.stream().mapToInt(Integer::intValue).reduce(1, (a, b) -> a * b);
    }
}

class DivideOperator implements Operator {
    public int apply(List<Integer> operands) {
        return operands.stream().mapToInt(Integer::intValue).reduce(1, (a, b) -> a / b);
    }
}
