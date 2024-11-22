import java.util.Scanner;

public class TabalaMultiplicar {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese la tabla que quiere obtener");
        int tabla= sc.nextInt();
        System.out.println("---------------");

        for (int i = 1; i <= 10; i++) {
            System.out.println( tabla + " x "+ i +" = " + tabla * i );
        }
        sc.close();
    }
}
