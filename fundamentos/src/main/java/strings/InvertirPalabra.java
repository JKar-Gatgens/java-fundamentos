package strings;

public class InvertirPalabra {
    public static void main(String[] args) {
        String palabra = "programacion";

        String invertida = "";

        for (int i = palabra.length() -1; i >= 0; i --){
             invertida += palabra.charAt(i) ;

        }
        System.out.println( invertida );
    }
}
