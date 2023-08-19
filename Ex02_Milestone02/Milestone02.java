package Ex02_Milestone02; 

import java.util.Scanner;

public class Milestone02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[][] notas = new double[5][3];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca las notas del alumno " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }
        
        for (int i = 0; i < 5; i++) {
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += notas[i][j];
            }
            double media = suma / 3;
            
            if (media >= 5) {
                System.out.println("El alumno " + (i + 1) + " ha aprobado con una media de " + media);
            } else {
                System.out.println("El alumno " + (i + 1) + " ha suspendido con una media de " + media);
            }
        }
    }
}

