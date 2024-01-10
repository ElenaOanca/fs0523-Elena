package it.epicode.week1.day3.esercizi;

import java.util.Scanner;

public class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getArea() {
        return base * altezza;
    }

    public double getPerimetro() {
        return 2 * (base + altezza);//oppure return 2 * base + 2 * altezza;    oppure return base+base + altezza+altezza;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
      public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la base del rettangolo r1: ");
        double base = scanner.nextDouble();
        System.out.println("Inserisci l'altezza del rettangolo r1: ");
        double altezza = scanner.nextDouble();

        Rettangolo r1 = new Rettangolo(base, altezza);
        Rettangolo r2 = new Rettangolo(10, 20);

        stampaDueRettangoli(r1, r2);
      }


          //FUNZIONE stampaDueRettangoli CHE DATI DUE Rettangoli RESTITUISCE AREA E PERIMETRO DI ENTRAMBI E LA SOMMA DELLE AREE E DEI PERIMETRI
    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Area r1: " + r1.getArea());
        System.out.println("Perimetro r1: " + r1.getPerimetro());
        System.out.println("Area r2: " + r2.getArea());
        System.out.println("Perimetro r2: " + r2.getPerimetro());
        System.out.println("Somma aree: " + (r1.getArea() + r2.getArea()));
        System.out.println("Somma perimetri: " + (r1.getPerimetro() + r2.getPerimetro()));
    }
}
