// Evaluador: Realiza las operaciones
class Evaluator {
    private Map<String, Object> variables = new HashMap<>(); // Variables guardadas

    public Object evaluate(Object expr) {
        // Si la expresión es una lista (es decir, una operación)
        if (expr instanceof List) {
            List<Object> exprList = (List<Object>) expr;
            if (exprList.isEmpty()) return null;

            String operator = exprList.get(0).toString(); // El primer elemento es el operador

            // Operaciones básicas
            if (operator.equals("+")) {
                return (Integer) exprList.get(1) + (Integer) exprList.get(2);
            } else if (operator.equals("-")) {
                return (Integer) exprList.get(1) - (Integer) exprList.get(2);
            } else if (operator.equals("*")) {
                return (Integer) exprList.get(1) * (Integer) exprList.get(2);
            } else if (operator.equals("/")) {
                return (Integer) exprList.get(1) / (Integer) exprList.get(2);
            }

            // Si es una asignación (SETQ)
            if (operator.equals("SETQ")) {
                variables.put(exprList.get(1).toString(), exprList.get(2)); // Guarda el valor de la variable
                return exprList.get(2); // Retorna el valor que se asignó
            }

            // Si es un nombre de variable, devolvemos su valor
            return variables.getOrDefault(operator, "Variable no definida");
        }

        // Si la expresión no es una lista, simplemente la devolvemos tal cual
        return expr;
    }
}