package Ex03_Milestone02;

import java.util.*;

public class Milestone02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Pizza", "Pasta", "Hamburguesa"};
        int[] precios = {8, 7, 10};
        List<String> pedido = new ArrayList<>();

        try {
            int seguir = 1;
            while (seguir == 1) {
                System.out.println("Menú:");
                for (int i = 0; i < menu.length; i++) {
                    System.out.println(i + 1 + ". " + menu[i] + " - $" + precios[i]);
                }

                System.out.println("Seleccione qué quiere para comer:");
                int eleccion = sc.nextInt();
                if (eleccion < 1 || eleccion > menu.length) {
                    throw new Exception("El plato seleccionado no existe.");
                }
                pedido.add(menu[eleccion - 1]);

                System.out.println("¿Desea pedir algo más? (1:Si / 0:No)");
                seguir = sc.nextInt();
                if (seguir != 0 && seguir != 1) {
                    throw new Exception("Respuesta no válida.");
                }
            }
            
            int precioTotal = 0;
            for (String plato : pedido) {
                for (int i = 0; i < menu.length; i++) {
                    if (plato.equals(menu[i])) {
                        precioTotal += precios[i];
                    }
                }
            }
            System.out.println("Total a pagar: $" + precioTotal);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
