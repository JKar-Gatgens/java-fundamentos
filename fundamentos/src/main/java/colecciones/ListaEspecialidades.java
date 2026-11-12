package colecciones;

import java.util.ArrayList;

/*especialidades.remove("Pediatria");        // saca por valor
especialidades.contains("Cardiologia");    // devuelve true o false
especialidades.indexOf("Dermatologia");    // devuelve la posición, o -1 si no está*/

public class ListaEspecialidades {
    public static void main (String[] args){

        ArrayList<String> especialidades = new ArrayList<>();

        especialidades.add("Cardiología" );
        especialidades.add("Pediatría");
        especialidades.add("Dermatología");
        especialidades.add("Ginecología");
        
        

        System.out.println("Cantidad de especialidades en la lista: " + especialidades.size());
        
        if (especialidades.contains("Pediatría")){
            System.out.println("Si contiene pediatría");
        }else{
            System.out.println("No contiene pediatria");
        }

        System.out.println("Dermatología esta en la posición: " + (especialidades.indexOf("Dermatología" ) +1) + " de la lista");

        especialidades.remove("Cardiología");

        System.out.println("Cantidad de especialidades en la lista luego de remover cardiología : " + especialidades.size());

        for (int i = 0; i < especialidades.size() ; i++){
            System.out.println( (i + 1)  + ". " +  especialidades.get(i));
        }
        


            
            

    }
}
