package colecciones;


import java.util.ArrayList;
import java.util.Scanner;

public class MenuEspecialidades {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> especialidades = new ArrayList<>();

        especialidades.add("Cardiología");
        especialidades.add("Pediatría");
        especialidades.add("Dermatología");
        especialidades.add("Ginecología");



        System.out.println("Menu ");


        for (int i = 1 ; i <=especialidades.size(); i++){

            System.out.println(i + "." + especialidades.get(i-1));

        }

        boolean valido = false;

        while(!valido){
            System.out.println("Digite el numero de la especialidad a elegir: " );
            int numero = teclado.nextInt();

            if(numero >= 1 && numero <= especialidades.size()){
                System.out.println("usted eligio: " + especialidades.get(numero -1 ));
                valido = true;
            }else{
                System.out.println("Elija un numero del menu ");
            }


        }

    }
}
