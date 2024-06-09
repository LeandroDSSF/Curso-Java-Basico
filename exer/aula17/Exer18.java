package exer.aula17;

import java.util.Scanner;

public class Exer18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num = scan.nextInt();

        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Não é primo - divisivel por " + i);
                primo = false;
            }
        }
        if (primo) {
            System.out.println("È numero primo ");    
        }
        
    }

}
