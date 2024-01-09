package it.epicode.week1.day2;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  int numeri[] = new int[10];

  /*for(int i=0; i<10; i++) {
        System.out.println("Inserisci il numero");
        numeri[i] = scanner.nextInt();

  }*/
        int i = 0;
  //ciclo while per inserire i numeri
    while(i<10) {
        System.out.println("Inserisci il numero");
        numeri[i] = scanner.nextInt();
        i++;
    }

  //invocazione del metodo calcolaMedia
    double media = calcolaMedia(numeri);
    System.out.println("La media e " + media);



    }

    //metodo calcolaMedia permette di calcolare la media di 10 numeri
    public static double calcolaMedia(int numeri[]) {
        int somma = 0;
        for(int i=0; i<10; i++) {
            somma += numeri[i];
        }
        return somma / 10.0;
    }
}
