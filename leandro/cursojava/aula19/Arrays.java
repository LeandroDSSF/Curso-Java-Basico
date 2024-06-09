package leandro.cursojava.aula19;

public class Arrays {
    public static void main(String[] args) {

        double[] temperatuas = new double[365];
        temperatuas[0] = 31.3;
        temperatuas[1] = 32;
        temperatuas[2] = 33.7;
        temperatuas[3] = 34;
        temperatuas[4] = 33.1;

        for (int i = 0; i < temperatuas.length; i++) {
            System.out.println("A temperatura " + temperatuas[i]);

        }
        
        for (double temp : temperatuas) {
            System.out.println(temp);
            
        }
    }

}
