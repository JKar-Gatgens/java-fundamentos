package colecciones;


import java.util.HashMap;

public class ContarPalabras {
    public static void main(String[] args) {
//

        String[] palabras = {"java", "spring", "sql", "java", "docker", "sql", "java"};

        // Imprimí cuántas veces aparece cada palabra


        HashMap<String,Integer> contador = new HashMap<>();
        for( String palabra : palabras){
            contador.put(palabra, contador.getOrDefault(palabra,0)+1);
        }
        System.out.println(contador);
    }
}
