public class arrays {
    
    
    public static void main(String[]args){

        int[] meses= {1,2,3,4,5,6,7,8,9,10,11,12};
        int[] diasEnero= new int[31];
        int dia=1;
        for (int i = 0; i < diasEnero.length; i++) {
            diasEnero[i]=dia;
            dia++;
        }
        for (int i = 0; i < meses.length; i++) {
            
            System.out.println(meses[i]);

        }



        System.out.println(diasEnero[15]);

        






    }

}
