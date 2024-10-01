package Esercizio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main4 {
    private static final Map<String, String> rubrica = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Aggiungi contatto");
            System.out.println("2. Stampa contatti");
            System.out.println("0. Esci");
            System.out.print("Scegli un'opzione: ");
            int scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma la nuova linea

            switch (scelta) {
                case 1:
                    addContact(scanner);
                    break;
                case 2:
                    printList();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Opzione non valida. Riprova.");
            }
        }

        scanner.close();
    }

    private static void addContact(Scanner scanner) {
        System.out.print("Inserisci il nome: ");
        String name = scanner.nextLine();
        System.out.print("Inserisci il numero di telefono: ");
        String phone = scanner.nextLine();
        rubrica.put(name, phone);
        System.out.println("Contatto aggiunto.");
    }

    private static void printList() {
        if (rubrica.isEmpty()) {
            System.out.println("La rubrica è vuota.");
        } else {
            for (String name : rubrica.keySet()) {
                System.out.println("Nome: " + name + ", numero di telefono: " + rubrica.get(name));
            }
        }
    }
}