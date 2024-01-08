package it.epicode.week1.day1;

import java.util.Scanner;

public class ProvaArray {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

    int[] numeri = new int[5];

        for(int i = 0; i<numeri.length ;  i++){
            System.out.println("Inserisci un numero:");
            numeri[i]=scanner.nextInt();
            System.out.println("I valori del nostro array sono:");
            System.out.println(numeri[i]);

        }

    for(int i = 0; i<numeri.length ;  i++){
        System.out.println(numeri[i]);
    }



    String[] giorniSettimana = {"Lunedi","Martedi","Mercoledi","giovedi","venerdi","sabato","domenica"};
        for(int i = 0; i<giorniSettimana.length ;  i++){
            System.out.println(giorniSettimana[i]);
        }



}
}
