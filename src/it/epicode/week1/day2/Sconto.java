package it.epicode.week1.day2;

import java.util.Scanner;

public class Sconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il prezzo del prodotto");
        double prezzo = scanner.nextDouble();
        //verifica se il prezzo e inferiore a 30 euro
        if (prezzo < 30) {
            System.out.println("Non hai diritto a nessuno sconto");
        } else if (prezzo >= 30 && prezzo < 50) {
            System.out.println("Hai diritto a uno sconto del 10%");
            System.out.println("Il prezzo scontato e " + (prezzo - (prezzo * 0.1)));
        } else if (prezzo >= 50 && prezzo < 100) {
            System.out.println("Hai diritto a uno sconto del 20%");
            System.out.println("Il prezzo scontato e " + (prezzo - (prezzo * 0.2)));
        } else {
            System.out.println("Hai diritto a uno sconto del 30%");
            System.out.println("Il prezzo scontato e " + (prezzo - (prezzo * 0.3)));
        }
    }
}
