package Ex03_Milestone03;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Milestone03 {

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
                    throw new Excepciones.PlatoNoExisteException("El plato seleccionado no existe.");
                }
                pedido.add(menu[eleccion - 1]);

                System.out.println("¿Desea pedir algo más? (1:Si / 0:No)");
                seguir = sc.nextInt();
                if (seguir != 0 && seguir != 1) {
                    throw new Excepciones.RespuestaInvalidaException("Respuesta no válida.");
                }
            }
            
            int precioTotal = 0;
            for (String plato : pedido) {
                boolean existe = false;
                for (int i = 0; i < menu.length; i++) {
                    if (plato.equals(menu[i])) {
                        precioTotal += precios[i];
                        existe = true;
                    }
                }
                if (!existe) {
                    throw new Excepciones.PlatoNoExisteException("El producto " + plato + " no existe.");
                }
            }
            System.out.println("Total a pagar: $" + precioTotal);

        } catch (Excepciones.PlatoNoExisteException | Excepciones.RespuestaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
