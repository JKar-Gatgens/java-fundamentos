package strings;

public class ContarVocales {
    public static void main(String[] args) {
        String nombre = "JOHAN GATGENS";
        String nombreMinuscula = nombre.toLowerCase();

        String vocales = "aeiou";
        int contador = 0;
        for (int i = 0; i< nombreMinuscula.length(); i++){

            if (vocales.indexOf(nombreMinuscula.charAt(i)) != -1){
                contador ++;
            }

        }
        System.out.println(contador);
    }
}
