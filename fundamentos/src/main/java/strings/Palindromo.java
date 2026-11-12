package strings;

public class Palindromo {
    public static void main(String[] args) {
        String palabra1 = "Ana";
        String palabra2 = "Programacion";

        String invertida1 = "";
        String invertida2 = "";

        for (int i = palabra1.length()-1; i >= 0; i --){
            invertida1 += palabra1.charAt(i);
        }

        if (invertida1.equalsIgnoreCase(palabra1)){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }

        for (int i= palabra2.length()-1; i >= 0 ; i--){
            invertida2 += palabra2.charAt(i);
        }
        if (invertida2.equals(palabra2)){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
    }
}
