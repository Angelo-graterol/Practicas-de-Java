public class Fibonacci {  

    public static void main(String[] args) {  
        int n = 50; // Número de elementos en la sucesión  
        long[] fibSequence = new long[n]; // Arreglo para almacenar la sucesión  

        // Inicialización de los primeros dos números de la sucesión  
        fibSequence[0] = 0;  
        fibSequence[1] = 1;  

        // Generar los números de Fibonacci  
        for (int i = 2; i < n; i++) {  
            fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];  
        }  

        // Imprimir la sucesión  
        for (long num : fibSequence) {  
            System.out.print(num + ", ");  
        }  
    }  
}