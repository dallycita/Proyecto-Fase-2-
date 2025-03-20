// Parser: Convierte los tokens en una lista de expresiones
class Parser {
    public Object parse(List<String> tokens) {
        if (tokens.isEmpty()) return null;
        String token = tokens.remove(0);

        // Si encontramos un paréntesis de apertura, es una lista (expresión)
        if (token.equals("(")) {
            List<Object> expr = new ArrayList<>();
            // Mientras no lleguemos al paréntesis de cierre, seguimos añadiendo elementos
            while (!tokens.get(0).equals(")")) {
                expr.add(parse(tokens));
            }
            tokens.remove(0); // Eliminamos el paréntesis de cierre
            return expr;
        } else if (isNumber(token)) {
            return Integer.parseInt(token); // Si es un número, lo convertimos
        } else {
            return token; // Si no es número, lo consideramos un nombre (símbolo)
        }
    }

    // Método para verificar si un token es un número
    private boolean isNumber(String token) {
        return token.matches("-?\\d+");
    }
}