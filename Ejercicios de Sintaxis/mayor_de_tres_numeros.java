import java.util.Scanner;

public class mayor_de_tres_numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hallaremos el mayor número entre tres.");
        
        System.out.print("Ingrese un número entero: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese un número entero: ");
        int numero2 = scanner.nextInt();
        
        System.out.print("Ingrese un número entero: ");
        int numero3 = scanner.nextInt();

        int numeroMayor = numero1; // Suponemos que numero1 es el mayor

        if (numero2 > numeroMayor) {
            numeroMayor = numero2; // Si numero2 es mayor, actualizamos
        }
        
        if (numero3 > numeroMayor) {
            numeroMayor = numero3; // Si numero3 es mayor, actualizamos
        }

        // Comprobamos cuántas veces aparece el número mayor
        int count = 0;
        if (numero1 == numeroMayor) count++;
        if (numero2 == numeroMayor) count++;
        if (numero3 == numeroMayor) count++;

        if (count == 3) {
            System.out.println("Los tres números son iguales: " + numeroMayor);
        } else if (count == 2) {
            System.out.println("El número mayor se repite dos veces: " + numeroMayor);
        } else {
            System.out.println("El número mayor entre los tres es: " + numeroMayor);
        }

        scanner.close();
    }
}

