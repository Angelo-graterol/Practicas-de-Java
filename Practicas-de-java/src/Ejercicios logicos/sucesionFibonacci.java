public class sucesionFibonacci {
    public static void main(String[] args) {
        int numero1=0;
        int numero2=1;
        int numero3;
        System.out.println(numero1);
        System.out.println(numero2);
        for (int i = 2; i <= 50; i++) {
            numero3=numero1+numero2;
            System.out.println(numero3);
            numero1=numero2;
            numero2=numero3;
        }
    }
}
