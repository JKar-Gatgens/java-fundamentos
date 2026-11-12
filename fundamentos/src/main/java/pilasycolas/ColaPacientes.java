package pilasycolas;

import java.util.LinkedList;
import java.util.Queue;

public class ColaPacientes {
    public static void main(String[] args) {
        Queue<String> cola =new LinkedList<>();

        cola.offer("Maria");
        cola.offer("Carlos");
        cola.offer("Ana");
        cola.offer("Luis");

        System.out.println("Siguiente: " + cola.peek());

        System.out.println("Atendiendo a:" + cola.poll());

        System.out.println("Atendiendo a:" + cola.poll());

        System.out.println("Quedan:" + cola.size() + " pacientes por atender");

        while(!cola.isEmpty()){
            System.out.println("Atendiendo a:" + cola.poll());
        }

        System.out.println("Cola Vacia ");
    }
}
