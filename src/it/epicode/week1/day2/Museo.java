package it.epicode.week1.day2;

import java.util.Scanner;

public class Museo {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

         System.out.println("Scegli un opzione tra 1 e 4");
            int scelta = scanner.nextInt();

            switch(scelta) {
            case 1:
                System.out.println("Hai scelto la prima opzione e il costo del biglietto e 0 euro");
                break;
            case 2:
                System.out.println("Hai scelto la seconda opzione e il costo del biglietto e 8 euro");

                break;
            case 3:
                System.out.println("Hai scelto la terza opzione e il costo del biglietto e 10 euro");
                break;
            case 4:
                System.out.println("Hai scelto la quarta opzione e il costo del biglietto e 15 euro");
                break;
            default:
                System.out.println("Hai inserito un valore non valido");
            }

          /*  //metodo alternativo con if
            if(scelta == 1) {
                System.out.println("Hai scelto la prima opzione e il costo del biglietto e 0 euro");
            } else if(scelta == 2) {
                System.out.println("Hai scelto la seconda opzione e il costo del biglietto e 8 euro");
            } else if(scelta == 3) {
                System.out.println("Hai scelto la terza opzione e il costo del biglietto e 10 euro");
            } else if(scelta == 4) {
                System.out.println("Hai scelto la quarta opzione e il costo del biglietto e 15 euro");
            } else {
                System.out.println("Hai inserito un valore non valido");
            }*/



    }
}
