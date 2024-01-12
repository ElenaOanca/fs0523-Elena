package it.epicode.week1.day5;

abstract class ElementoRiproducibie extends ElementoMultimediale{
    protected int durata;
    public ElementoRiproducibie(String titolo, int durata){
        super(titolo);
        this.durata = durata;

    }
    public int getDurata(){
        return durata;
    }
    public void setDurata(int durata){
        this.durata = durata;
    }

    public void play(){
        System.out.println("Titolo: " + titolo + "Durata: " + durata);
    }

    //metodo toString
    @Override
    public String toString() {
    	return "Elemento riproducibile: " + titolo + "Durata: " + durata;
    }

}
