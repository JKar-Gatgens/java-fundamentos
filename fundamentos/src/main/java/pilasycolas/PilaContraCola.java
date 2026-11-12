package pilasycolas;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class PilaContraCola {
    public static void main(String[] args) {
        Deque<Integer> pila = new ArrayDeque<>();

        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        while (!pila.isEmpty()){
            System.out.print( pila.pop() );
        }

        System.out.println();



        Queue<Integer> cola = new LinkedList<>();

        cola.offer(1);
        cola.offer(2);
        cola.offer(3);
        cola.offer(4);
        cola.offer(5);

        while(!cola.isEmpty()){
            System.out.print( cola.poll());
        }





    }
}
