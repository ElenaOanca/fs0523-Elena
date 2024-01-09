package it.epicode.week1.day2.esercizi;

import java.util.Scanner;

public class ProvaAnnoBisestileDaInput {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProvaAnnoBisestileDaInput p = new ProvaAnnoBisestileDaInput();
        p.annoBisestile();
    }

    public void annoBisestile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un anno");
        int anno = sc.nextInt();
        if (anno % 400 == 0 || (anno % 4 == 0 && anno % 100 != 0)) {
            System.out.println("L'anno " + anno + " e' bisestile");
        } else {
            System.out.println("L'anno " + anno + " non e' bisestile");
        }
    }
}
