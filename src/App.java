
import Materia.controllers.Stack;
import Ejercicio_01_sign.SignValidarDatos;
import Ejercicio_02_sorting.OrdenarStack;
import Materia.controllers.Cola;
import Materia.controllers.ColaG;
import Materia.models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(null);
        stack.push(10);
        stack.push(-1);
        stack.push(0);
        stack.push(5);
        stack.push(8);
        System.out.println("");
        System.out.println("Tam = "+ stack.size());
        stack.printStack();
        stack.pop();
        System.out.println("");
        System.out.println("Tam = "+ stack.size());
        stack.printStack();
        System.out.println("\n");
        stack.peek();
        stack.printStack();
        
        Cola cola=new Cola();
        cola.add(5);
        cola.add(7);
        cola.add(10);

        System.out.println("tam = "+ cola.size);
        cola.printCola();
        cola.remove();
        System.out.println("tam = "+ cola.size);
        cola.printCola();

        Persona p1=new Persona("Juan");
        Persona p2=new Persona("Maria");
        Persona p3=new Persona("Pablo");
        
        ColaG<Persona> colaPersonas= new ColaG<Persona>();
        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);
        System.out.println(colaPersonas.size());
        colaPersonas.printCola();

        System.out.println("Contiene a la persona =>"+colaPersonas.remove());
        System.out.println(colaPersonas.size());
        colaPersonas.printCola();

        colaPersonas.findByName("Maria");
        Persona pEliminada=colaPersonas.removeByName("Pablo");


        SignValidarDatos validador = new SignValidarDatos();

        String ejemplo1 = "([]){}";
        String ejemplo2 = "({)}";

        System.out.println("Cadena: " + ejemplo1 + " => " + validador.isValid(ejemplo1)); 
        System.out.println("Cadena: " + ejemplo2 + " => " + validador.isValid(ejemplo2)); 

        Stack pilaDesor = new Stack(null);
        pilaDesor.push(5);
        pilaDesor.push(1);
        pilaDesor.push(4);
        pilaDesor.push(2);

        System.out.print("Antes de ordenar: ");
        pilaDesor.printStack();

        OrdenarStack.ordenar(pilaDesor);

        System.out.print("Después de ordenar: ");
        pilaDesor.printStack();
}
}