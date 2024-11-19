
import java.util.Scanner;


public class buscarNumeros {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        int[] numeros= new int[5];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un número");
            numeros[i] = sc.nextInt(); 
        }

        for (int i : numeros) {
            System.out.println(i);
        }


        sc.close();
    }
}
