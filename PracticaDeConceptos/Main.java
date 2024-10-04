import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        byte edad= 19;
        System.out.println("mi edad es "+edad);


        short temperatura= 25;
        System.out.println("La temperatura actual es de: "+temperatura);

        System.out.println("vamos a hacer una suma, ingresa dos numeros");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int suma = numero1+numero2;
        System.out.println("El resultado de la suma es: "+suma);
        
        
        long cuentaBancaria= 1000L;
        for (int i = 1; i < 10; i++) {
            cuentaBancaria *=i;   
        }
        System.out.println("Su dinero es: "+cuentaBancaria);

        System.out.println("Ingrese la nota de su primer parcial");
        double notaPrimerParcial= scanner.nextDouble();
        double promedioParcial= notaPrimerParcial*(0.7/3)+0*(0.7/3)+0*(0.7/3)+0*(0.3);
        System.out.println("Su nota hasta el momento queda en: "+ promedioParcial);


        scanner.close();
    }
}