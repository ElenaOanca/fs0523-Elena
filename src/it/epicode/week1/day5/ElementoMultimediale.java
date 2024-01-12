package it.epicode.week1.day5;

abstract class ElementoMultimediale {

    protected String titolo;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public String setTitolo(String titolo) {
        this.titolo = titolo;
        return titolo;
    }


    @Override
    public String toString() {
        return "Elemento multimediale: " + titolo;
    }


}