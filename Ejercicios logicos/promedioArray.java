import java.util.Scanner;

public class promedioArray {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        //Escribe un programa que pida al usuario que ingrese 5 números y los almacene en un array. Luego, el programa debe calcular e imprimir el promedio de esos números.

        double[] numeros= new double[5];
        double suma=0;
        System.out.println("Ingrese 5 numeros, para hallar el promedio");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= scanner.nextDouble();
            suma = suma+numeros[i];
            System.out.println("sumador: "+suma);
        }
        
        double promedio= suma/numeros.length;
        System.out.println("El promedio del array es: "+promedio);






        scanner.close();
    }
    
}
