package prueba;

import java.util.*;



public class Main {
    public static void main(String[] args) {



//        Queue<String> cola =new LinkedList<>();
//
//        cola.offer("Maria");
//        cola.offer("Carlos");
//        cola.offer("Ana");
//        cola.offer("Luis");
//
//        System.out.println("Siguente: " + cola.peek());
//
//        System.out.println("Atendiendo a:" + cola.poll());
//
//        System.out.println("Atendiendo a:" + cola.poll());
//
//        System.out.println("Quedan:" + cola.size() + " pacientes por atender");
//
//        while(!cola.isEmpty()){
//            System.out.println("Atendiendo a:" + cola.poll());
//        }
//
//        System.out.println("Cola Vacia ");


        String palabra = "programación";
        Deque <Character> pila = new ArrayDeque<>();

        for (int i =0 ; i < palabra.length(); i++){
            pila.push(palabra.charAt(i));
        }
        while (!pila.isEmpty()){
            System.out.print(pila.pop());

        }




    }
}
