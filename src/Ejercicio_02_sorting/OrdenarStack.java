package Ejercicio_02_sorting;
import Materia.controllers.Stack;

public class OrdenarStack {
    public static void ordenar(Stack original) {
        Stack temporal = new Stack(null);
        while (!original.isEmpty()) {
            int tmp = original.pop();
            while (!temporal.isEmpty() && temporal.peek() > tmp) {
                original.push(temporal.pop());
            }

            temporal.push(tmp);
        }
        while (!temporal.isEmpty()) {
            original.push(temporal.pop());
        }
    }
}

