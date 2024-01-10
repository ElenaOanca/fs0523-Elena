package it.epicode.week1.day3;

public class Automobile {

  private int cilindrata;
    private  String marca;
    private  String modello;
    private  String targa;
    private  int porte;
    private TipoAutomobile categoria;


    public Automobile(int cilindrata, String marca, String modello, String targa, int porte) {
        this.cilindrata = cilindrata;
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.porte = porte;
    }

    //metodo che restituisce la targa dell'auto
    public String getTarga() {
        return targa;
    }
    //metodo che modifica la targa dell'auto
    public void setTarga(String targa) {
        this.targa = targa;
    }

    //metodo che restituisce la carateristiche dell'auto
    public String getCaratteristiche() {
        return "L'auto " + marca + " " + modello + " ha " + porte + " porte e " + cilindrata + " cc di cilindrata";
    }




    //metodo accelera
    public void accelera() {
        System.out.println("L'auto " + marca + " " + modello + " sta accelerando");
    }

    //metodo frena
    public void frena() {
        System.out.println("L'auto " + marca + " " + modello + " sta frenando");
    }







}
