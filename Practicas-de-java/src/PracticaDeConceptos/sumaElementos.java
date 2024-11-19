public class sumaElementos {

    public static void main(String[] args) {
        //Declarar un array de números enteros con valores predefinidos
        int[] numeros= {1,2,3,4,5};

        int suma=0;
        for (int i : numeros) {
            suma=suma+i;
        }
        System.out.println("Suma de los elementos del array numeros: "+suma);
    }
}
    

