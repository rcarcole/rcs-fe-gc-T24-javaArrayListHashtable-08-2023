package Ex01_Milestone01;

import java.util.*;

public class Milestone01 {
    public static void main(String[] args) {
        // FASE 1
        char[] nombre = {'R', 'O', 'B', 'E', 'R', 'T'};
        for (char letra : nombre) {
            System.out.println(letra);
        }

        // FASE 2
        List<Character> nombreLista = Arrays.asList('R', 'O', 'B', 'E', 'R', 'T', '6');
        for (Character letra : nombreLista) {
            if (Character.isDigit(letra)) {
                System.out.println("¡Los nombres de personas no contienen números!");
            } else if ("AEIOUaeiou".contains(letra.toString())) {
                System.out.println("VOCAL");
            } else {
                System.out.println("CONSONANTE");
            }
        }

        // FASE 3
        Map<Character, Integer> letras = new HashMap<>();
        for (Character letra : nombreLista) {
            letras.put(letra, letras.getOrDefault(letra, 0) + 1);
        }
        System.out.println(letras);

        // FASE 4
        List<Character> apellido = Arrays.asList('C', 'A', 'R', 'C', 'O', 'L','E');
        List<Character> fullName = new ArrayList<>(nombreLista);
        fullName.add(' ');
        fullName.addAll(apellido);
        System.out.println(fullName);
    }
}
