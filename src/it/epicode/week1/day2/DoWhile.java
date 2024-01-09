package it.epicode.week1.day2;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double somma = 0;
        int i = 0;
        double n;


          do {
            System.out.println("Inserire un numero");
            n = scan.nextDouble();
            if (n != 0) {
                somma += n;
                i++;
            }
        } while (n != 0);
        if (i != 0) {
            System.out.println("La media dei numeri inseriti e': " + somma / i);
        } else {
            System.out.println("Non e' stato inserito nessun numero");
        }

    }
}
