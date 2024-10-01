package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main3 {

    public static void main(String[] args) {
        int N = 10; // Numero di elementi nella lista
        List<Integer> randomList = generateRandomList(N);
        System.out.println("Lista casuale ordinata: " + randomList);

        printListInReverse(randomList);

        boolean printEvenIndices = true; // Cambia a false per stampare gli indici dispari
        printBasedOnBoolean(randomList, printEvenIndices);
    }

    // Genera una lista ordinata di N numeri casuali
    private static List<Integer> generateRandomList(int N) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            list.add(random.nextInt(101)); // Numeri tra 0 e 100
        }
        Collections.sort(list);
        return list;
    }

    // Stampa gli elementi della lista in ordine inverso
    private static void printListInReverse(List<Integer> list) {
        System.out.print("Lista in ordine inverso: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    // Stampa i valori in posizioni pari o dispari a seconda del booleano
    private static void printBasedOnBoolean(List<Integer> list, boolean printEvenIndices) {
        for (int i = 0; i < list.size(); i++) {
            if (printEvenIndices && i % 2 == 0) {
                System.out.println("Valore in posizione pari: " + list.get(i));
            } else if (!printEvenIndices && i % 2 != 0) {
                System.out.println("Valore in posizione dispari: " + list.get(i));
            }
        }
    }
}

