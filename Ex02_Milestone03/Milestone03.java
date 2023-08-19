package Ex02_Milestone03;

import java.util.Scanner;

public class Milestone03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número N:");
        int numero = sc.nextInt();
        
        int a = 0, b = 1;
        
        while (a <= numero) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
