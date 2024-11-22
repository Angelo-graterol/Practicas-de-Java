import java.util.Scanner;



public class App{

    private static final int REGULAR=1;
    private static final int VEGETARIANO=2;
    
    private static final int PLATO1=0;
    private static final int PLATO2=1;


    private static final String[] MENU_REGULAR= {"Hamburguesa","Pollo al horno"};
    private static final String[] MENU_VEGETARIANO= {"Ensalada","Tofu Salteado"};
    private static final double[] PRECIOS_REGULAR= {8.5,10.0};
    private static final double[] PRECIOS_VEGETARIANO= {7.0,9.0};


    private static int[] stockRegular= {5,5};
    private static int[] stockVegetariano= {5,5};

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        boolean continuar = true;
        double total = 0; // Acumulador para el total
        
        System.out.println("¡Bienvenido al restaurante!");
        
        while (continuar) {
            // Mostrar opciones de tipo de comida
            System.out.println("\n¿Qué tipo de comida desea?");
            System.out.println("1. Regular");
            System.out.println("2. Vegetariana");
            System.out.println("0. Salir");
        
            int tipoComida = sc.nextInt();
        
            if (tipoComida == 0) {
                System.out.println("Gracias por su visita. Su total es: $" + total);
                break; // Salimos del programa
            }
        
            if (tipoComida == REGULAR || tipoComida == VEGETARIANO) {
                mostrarMenu(tipoComida);
                System.out.println("\nSeleccione el plato (1 o 2):");
                int platoSeleccionado = sc.nextInt();
        
                if (platoSeleccionado == 1 || platoSeleccionado == 2) {
                    total += procesarPedido(tipoComida, platoSeleccionado - 1); // -1 porque el array empieza en 0
                } else {
                    System.out.println("Opción no válida. Intente nuevamente.");
                }
            } else {
                System.out.println("Tipo de comida no válido. Intente nuevamente.");
            }
        
            System.out.println("\n¿Desea pedir algo más? (1 para Sí, 0 para No):");
            continuar = sc.nextInt() == 1;
        }
        

        sc.close();
    }


    private static void mostrarMenu(int tipoComida){
        if(tipoComida == REGULAR){
            System.out.println("\nMenú Regular:");
            for (int i = 0; i < MENU_REGULAR.length; i++) {
                System.out.println((i+1)+". "+ MENU_REGULAR[i]+" - $"+ PRECIOS_REGULAR[i]+ "(Stock: "+ stockRegular[i]+")");
            }
        }else if(tipoComida == VEGETARIANO){

                System.out.println("\nMenún Vegetariano: ");
                for (int i = 0; i < MENU_VEGETARIANO.length; i++) {
                    System.out.println((i+1)+". "+ MENU_VEGETARIANO[i]+" - $"+ PRECIOS_VEGETARIANO[i]+ "(Stock: "+ stockVegetariano[i]+")");
                }
        }
    }

    private static double procesarPedido(int tipoComida, int platoSeleccionado){

        if (tipoComida == REGULAR) {
            if(stockRegular[platoSeleccionado]>0){
                stockRegular[platoSeleccionado]--;
                System.out.println("Has pedido: " + MENU_REGULAR[platoSeleccionado]);
                return PRECIOS_REGULAR[platoSeleccionado];
            } else {
                System.out.println("Lo sentimos, " + MENU_REGULAR[platoSeleccionado] + " está agotado.");
                return 0; // No hay costo si no se puede procesar el pedido
            }
        } else if (tipoComida == VEGETARIANO) {
            if (stockVegetariano[platoSeleccionado] > 0) {
                stockVegetariano[platoSeleccionado]--; // Reducir el stock
                System.out.println("Has pedido: " + MENU_VEGETARIANO[platoSeleccionado]);
                return PRECIOS_VEGETARIANO[platoSeleccionado]; // Retorna el precio
            } else {
                System.out.println("Lo sentimos, " + MENU_VEGETARIANO[platoSeleccionado] + " está agotado.");
                return 0; // No hay costo si no se puede procesar el pedido
            }
        } else {
            System.out.println("Tipo de comida no válido.");
            return 0; // Si no es válido, no genera costo
        }
            
        
    }
}