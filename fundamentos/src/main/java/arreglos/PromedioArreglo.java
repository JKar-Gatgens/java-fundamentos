package arreglos;

public class PromedioArreglo {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 15, 16, 23, 42};

       double suma = 0;
       double promedio = 0;
        for (int i = 0; i < numeros.length; i++){
            suma = numeros [i] + suma;
        }
        promedio = suma / numeros.length;
        System.out.println("El promedio es: " + promedio);
    }
}
