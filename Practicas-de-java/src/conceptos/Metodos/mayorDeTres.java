package conceptos.Metodos;
public class mayorDeTres {
    public static void main(String[]args){

        System.out.println("Devuelve Numero mayor");

        int mayor = encontrarMayor(10, 20, 5);
        System.out.println("El número mayor es: " + mayor);

    }
        public static int encontrarMayor(int num1, int num2, int num3){

            return Math.max(num1, Math.max(num2, num3));


        }

}
