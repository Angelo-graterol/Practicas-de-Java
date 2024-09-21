/*
**Evaluación Práctica:**

- **Proyecto Mini:** Desarrollar un programa en Java que calcule la media de tres números introducidos por el usuario y muestre el resultado.
*/
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese tres números para calcular la media");
        int numero1= scanner.nextInt();
        int numero2= scanner.nextInt();
        int numero3= scanner.nextInt();
        
        double media= (numero1+numero2+numero3)/3;
        System.out.println("La media es: "+ media);
    }
}