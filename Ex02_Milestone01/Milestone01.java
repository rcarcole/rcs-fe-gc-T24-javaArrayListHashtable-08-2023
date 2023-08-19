package Ex02_Milestone01;

import java.util.Scanner;
import java.util.Arrays;

public class Milestone01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // FASE 1
        String[] ciudades = new String[6];
        
        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce el nombre de la ciudad " + (i + 1) + ":");
            ciudades[i] = sc.nextLine();
        }
        
        for (String ciudad : ciudades) {
            System.out.println(ciudad);
        }
        
        // FASE 2
        Arrays.sort(ciudades);
        System.out.println("Ciudades ordenadas alfabéticamente: " + Arrays.toString(ciudades));
        
        // FASE 3
        String[] ciudadesModificadas = new String[6];
        for (int i = 0; i < 6; i++) {
            ciudadesModificadas[i] = ciudades[i].replace('a', '4');
        }
        
        Arrays.sort(ciudadesModificadas);
        System.out.println("Ciudades modificadas y ordenadas: " + Arrays.toString(ciudadesModificadas));
        
        // FASE 4
        for (String ciudad : ciudades) {
            char[] arrCiudad = new char[ciudad.length()];
            for (int j = 0; j < ciudad.length(); j++) {
                arrCiudad[j] = ciudad.charAt(ciudad.length() - 1 - j);
            }
            System.out.println(ciudad + " - " + new String(arrCiudad));
        }
    }
}
