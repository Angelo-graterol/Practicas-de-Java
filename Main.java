/*
Ejercicio Práctico:

Instrucción: Declara y asigna valores a variables que representen la edad, altura, inicial del nombre, y si una persona es mayor de edad o no.
Propósito: Familiarizarse con la sintaxis de declaración y asignación de variables en Java.
*/


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edadUsuario;
        double altura;
        char inicialNombre;
        boolean mayorEdad;

        System.out.print("Ingrese su edad: ");
        edadUsuario = scanner.nextInt();
        System.out.print("Ingrese su altura (en metros): ");
        altura = scanner.nextDouble();
        System.out.print("La inicial de su nombre: ");
        inicialNombre = scanner.next().charAt(0);
        System.out.print("¿Es mayor de edad? (true/false): ");
        mayorEdad = scanner.nextBoolean();


    }
}