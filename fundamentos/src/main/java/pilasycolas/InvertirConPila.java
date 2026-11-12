package pilasycolas;

import java.util.ArrayDeque;
import java.util.Deque;

public class InvertirConPila {
    public static void main(String[] args) {
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
