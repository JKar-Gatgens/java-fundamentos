package excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ValidarNumero {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

       boolean valido = false;


        while (! valido){
            System.out.println("Escriba un numero ");

            try {
               int numero = teclado.nextInt();
               valido = true;
                System.out.println("El doble es: " + numero * 2);
            }catch (InputMismatchException e){
                System.out.println("Escribe numeros no letras ");
                teclado.nextLine();
            }



        }







    }


}
