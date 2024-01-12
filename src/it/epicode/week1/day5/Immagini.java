package it.epicode.week1.day5;

public class Immagini extends ElementoMultimediale implements Luminosità {

    private int luminosita;

    public Immagini(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }


  public String toString() {
        return "Immagini [luminosita=" + luminosita + ", titolo=" + titolo + "]";
    }


    public void aumentaLuminosita() {
        luminosita++;
    }


    public void diminuisciLuminosita() {
        if (luminosita > 0) luminosita--;
    }


    public void show() {

        for (int i = 0; i < luminosita; i++) {


            System.out.print(titolo + "*");
        }
        System.out.println();
    }


}

