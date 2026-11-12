package colecciones;


import java.util.HashMap;
import java.util.Map;

public class PacientesHashMap {
    public static  void main(String[] args) {
        HashMap<String,String> pacientes = new HashMap<>();
        pacientes.put("20999-0123", "Johan Gatgens");
        pacientes.put("20724-0375", "Maria Fernandez");
        pacientes.put("20345-0879", "Carlos Gonzales");

        System.out.println(pacientes.get("20999-0123"));





        if (pacientes.containsKey("111-111")){
            String nombre = pacientes.get("111-111");
            System.out.println(nombre.length());
            System.out.println(nombre);
        }else{
            System.out.println("Paciente no registrado");
        }

        pacientes.put("20999-0123", "Johan Gatgens Mora");
        System.out.println(pacientes.size());

        for (Map.Entry<String,String> entrada : pacientes.entrySet()){
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }


    }
}
