package it.epicode.week1.day5;

public class RegistrazioneVideo extends ElementoRiproducibie implements Volume, Luminosità{

    //costruttore
    private int luminosita;
    private int volume;
    public RegistrazioneVideo(String titolo, int durata , int luminosita, int volume) {
        super(titolo, durata);
        this.luminosita = luminosita;
        this.volume = volume;

    }



    public void aumentaLuminosita() {
        luminosita++;
    }


    public void diminuisciLuminosita() {
        if (luminosita > 0) luminosita--;
    }


    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.print(titolo);
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            for (int k = 0; k < luminosita; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public void abbassaVolume() {
        if (volume > 0) volume--;
    }

    @Override
    public void alzaVolume() {
        volume++;
    }
}
