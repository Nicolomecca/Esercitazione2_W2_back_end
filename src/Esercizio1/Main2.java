package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroElementi;

        System.out.println("Inserisci un numero intero:");
        numeroElementi = scanner.nextInt();
        scanner.nextLine(); // Consuma la nuova linea rimasta

        Set<String> paroleDistinte = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        System.out.println("Inserisci " + numeroElementi + " parole:");
        for (int i = 0; i < numeroElementi; i++) {
            String parola = scanner.nextLine();
            if (paroleDistinte.contains(parola)) { // Se la parola è già presente
                paroleDuplicate.add(parola);      // Aggiungila a paroleDuplicate
            } else {
                paroleDistinte.add(parola);       // Altrimenti, aggiungila a paroleDistinte
            }
        }

        // Rimuovi le parole duplicate da paroleDistinte
        paroleDistinte.removeAll(paroleDuplicate);

        System.out.println("Parole duplicate: " + paroleDuplicate);
        System.out.println("Numero di parole distinte: " + paroleDistinte.size());
        System.out.println("Elenco delle parole distinte: " + paroleDistinte);
    }
}

