package it.epicode.week1.day2;

import java.util.Scanner;

public class ControlloConsumoAcqua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il consumo di acqua");
        double consumo = scanner.nextDouble();
        //scallioni di controllo del consumo i primi 100 e tassata con 2.5 e tutto quello che esuperiore a 100 va tassata a 4.0 che vanno sommati al costo fisso di 20 fisso
        if (consumo <= 100) {
            System.out.println("Il costo totale e " + (consumo * 2.5 + 20));
        } else {
            System.out.println("Il costo totale e " + (100 * 2.5 + (consumo - 100) * 4.0 + 20));
        }




    }
}
