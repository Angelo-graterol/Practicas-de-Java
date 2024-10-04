import java.util.Scanner;

public class Promedio_Materias_Semestre{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int opcion=1;
        do{
        
        //Proggrama que calcula promedio de las materias del semestre
        System.out.println("Bienvenid@ al progrma que calcula el promedio de cada materia");
        //Pide nombre de la materia
        System.out.println("Escriba el nombre de la Materia");
        String nombreMateria= scanner.nextLine();
        
        //Pide nota del Primer Parcial
        System.out.println("Ingrese la nota del Primer Parcial");
        double primerParcial= scanner.nextDouble();
        
        //Pide nota del Segundo Parcial
        System.out.println("Ingrese la nota del Segundo Parcial");
        double segundoParcial= scanner.nextDouble();
        
        //Pide Tercera nota
        System.out.println("Ingrese la Tercera nota");
        double terceraNota= scanner.nextDouble();
        
        //Calcula el 70% de la nota final o promedio
        double setentaPociento= primerParcial*(0.7/3)+segundoParcial*(0.7/3)+terceraNota*(0.7/3);
        System.out.println("El valor del 70% es de: "+setentaPociento);
        
        //Pide nota del Examen Final
        System.out.println("Ingrese la nota del Examen Final");
        double examenFinal= scanner.nextDouble();
        //Calcula el 30% dela nota final o promedio
        double treintaPorciento= examenFinal*0.3;
        System.out.println("El valor del 30% es de:"+ treintaPorciento);
        
        //Calcula nota final o promedio
        double notaFinal= setentaPociento+treintaPorciento;
        System.out.println("Su nota final o promdeio de la Materia "+nombreMateria+" es: "+notaFinal);
        
        System.out.println("¿Quieres calcular el promedio de otra materia? Ingrese 1.Si  2.No");
        opcion= scanner.nextInt();
        scanner.nextLine();
    } while(opcion==1);
        
        scanner.close();
    }
}