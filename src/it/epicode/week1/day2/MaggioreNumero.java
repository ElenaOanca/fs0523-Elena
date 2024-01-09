package it.epicode.week1.day2;

import java.util.Scanner;

public class MaggioreNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il primo numero");
        int primoNumero = scanner.nextInt();
        System.out.println("Inserisci il secondo numero");
        int secondoNumero = scanner.nextInt();
        System.out.println("Inserisci il terzo numero");
        int terzoNumero = scanner.nextInt();

        //invocazione del metodo calcolaIlMaggiore
        int maggiore = calcolaIlMaggiore(primoNumero, secondoNumero, terzoNumero);
        System.out.println("Il numero maggiore e " + maggiore);


    }

    //metodo calcolaIlMaggiore  permette di trovare il numero maggiore tra tre numeri
    public static int calcolaIlMaggiore(int primoNumero, int secondoNumero, int terzoNumero) {
        if (primoNumero >= secondoNumero && primoNumero >= terzoNumero) {
            return primoNumero;
        } else if (secondoNumero >= primoNumero && secondoNumero >= terzoNumero) {
            return secondoNumero;
        } else {
            return terzoNumero;
        }
    }

    //metodo alternativo
    public static int calcolaIlMaggiore2(int primoNumero, int secondoNumero, int terzoNumero) {
        int maggiore = primoNumero;
        if (secondoNumero > maggiore) {
            maggiore = secondoNumero;
        }
        if (terzoNumero > maggiore) {
            maggiore = terzoNumero;
        }
        return maggiore;
    }


}
