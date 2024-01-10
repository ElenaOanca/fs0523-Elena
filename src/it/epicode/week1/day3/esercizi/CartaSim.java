package it.epicode.week1.day3.esercizi;

public class CartaSim {

    private String numeroTelefono;

    private double creditoTelefono = 0;

    //lista chiamate inizialmente vuota

    private Chiamata[] listaChiamate = new Chiamata[0];

    public CartaSim(String numeroTelefono, double creditoTelefono, Chiamata[] listaChiamate) {
        this.numeroTelefono = numeroTelefono;
        this.creditoTelefono = creditoTelefono;
        this.listaChiamate = listaChiamate;
    }

    private class Chiamata {

        private String numeroChiamato;

        private int durata;

        public Chiamata(String numeroChiamato, int durata) {
            this.numeroChiamato = numeroChiamato;
            this.durata = durata;
        }


    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public double getCreditoTelefono() {
        return creditoTelefono;
    }

    public void ricarica(double credito) {
        creditoTelefono += credito;
    }

    public void chiama(String numeroChiamato, int durata) {
        if (creditoTelefono >= durata * 0.1) {
            Chiamata chiamata = new Chiamata(numeroChiamato, durata);
            creditoTelefono -= durata * 0.1;
            aggiungiChiamata(chiamata);
        } else {
            System.out.println("Credito insufficiente");
        }
    }

    public void aggiungiChiamata(Chiamata chiamata) {
        Chiamata[] nuovaListaChiamate = new Chiamata[listaChiamate.length + 1];
        for (int i = 0; i < listaChiamate.length; i++) {
            nuovaListaChiamate[i] = listaChiamate[i];
        }
        nuovaListaChiamate[listaChiamate.length] = chiamata;
        listaChiamate = nuovaListaChiamate;
    }

    public void stampaChiamate() {
        for (Chiamata chiamata : listaChiamate) {
            System.out.println( "La chiamata effettuate è: " + chiamata);
        }
    }

    public static void main(String[] args) {
        CartaSim cartaSim = new CartaSim("3331234567", 0, new Chiamata[0]);
        cartaSim.ricarica(100);
        cartaSim.chiama("3337654321", 5);
        cartaSim.chiama("3337654321", 10);
        cartaSim.chiama("3337654321", 15);
        cartaSim.chiama("3337654321", 20);
        cartaSim.chiama("3337654321", 25);
        cartaSim.stampaChiamate();
    }






}
