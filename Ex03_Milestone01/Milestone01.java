package Ex03_Milestone01;

import java.util.*;

public class Milestone01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // FASE 1
        int precioTotal = 0;
        String[] menu = {"Pizza", "Pasta", "Hamburguesa"};
        int[] precios = {8, 7, 10};
        
        // FASE 2
        List<String> pedido = new ArrayList<>();
        int seguir = 1;

        while (seguir == 1) {
            System.out.println("Menú:");
            for (int i = 0; i < menu.length; i++) {
                System.out.println(i + 1 + ". " + menu[i] + " - $" + precios[i]);
            }
            
            System.out.println("Seleccione qué quiere para comer:");
            int eleccion = sc.nextInt();
            pedido.add(menu[eleccion - 1]);
            
            System.out.println("¿Desea pedir algo más? (1:Si / 0:No)");
            seguir = sc.nextInt();
        }

        // FASE 3
        for (String plato : pedido) {
            boolean existe = false;
            for (int i = 0; i < menu.length; i++) {
                if (plato.equals(menu[i])) {
                    precioTotal += precios[i];
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                System.out.println("El producto " + plato + " no existe.");
            }
        }

        System.out.println("Total a pagar: $" + precioTotal);
    }
}
