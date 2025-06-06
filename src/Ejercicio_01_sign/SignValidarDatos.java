package Ejercicio_01_sign;

import java.util.Stack;

public class SignValidarDatos {
    public boolean isValid(String cadena) {
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == '(' || caracter == '[' || caracter == '{') {
                pila.push(caracter);
            } else {
                if (pila.isEmpty()) {
                    return false;
                }

                char tope = pila.pop();
                if ((caracter == ')' && tope != '(') ||
                    (caracter == ']' && tope != '[') ||
                    (caracter == '}' && tope != '{')) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }
}
