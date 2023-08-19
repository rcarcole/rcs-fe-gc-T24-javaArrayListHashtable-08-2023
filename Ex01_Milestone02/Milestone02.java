package Ex01_Milestone02;

import java.util.Scanner;

public class Milestone02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Escala de numeros
        System.out.println("Introduce la altura para la escala: ");
        int altura = sc.nextInt();
        
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        // Pirámide invertida
        System.out.println("Introduce la altura para la pirámide invertida: ");
        altura = sc.nextInt();
        
        for (int i = altura; i > 0; i--) {
            // Imprimir espacios
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
            
            // Imprimir asteriscos
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        sc.close();
    }
}
