import java.util.Scanner;

public class Factorial {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Ingresa un número para hallar su factorial");
        int numero= sc.nextInt();
        int contador= numero;
        int factorial=1;
        while (contador>0) {
            factorial*=contador;
            contador--;
            
        }

        System.out.println("El factorial del número " + numero + " es " + factorial);
        sc.close();
    }
}


