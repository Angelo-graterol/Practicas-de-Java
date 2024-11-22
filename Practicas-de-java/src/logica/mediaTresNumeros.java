package Ejercicios_logicos;
import java.util.Scanner;
public class mediaTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Proyecto Mini: Desarrollar un programa en Java que calcule la media de tres números introducidos por el usuario y muestre el resultado.
        
        System.out.println("Ingrese 3 Números para hallar la media entre los tres");
        
        System.out.println("Ingrese primer numero");
        int numero1= sc.nextInt();
        System.out.println("Ingrese segundo numero");
        int numero2= sc.nextInt();
        System.out.println("Ingrese tercer numero");
        int numero3= sc.nextInt();

        double media= (numero1+numero2+numero3)/3;

        System.out.println("La media de los tres números es: "+ media);




        sc.close();
    }
}
