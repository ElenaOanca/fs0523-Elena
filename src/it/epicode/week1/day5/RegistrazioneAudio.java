package it.epicode.week1.day5;

public class RegistrazioneAudio extends ElementoRiproducibie implements Volume{
    private int volume; // Volume dell'audio

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }

    public void getVolume() {
        System.out.println("Volume: " + volume);
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //toString() è un metodo che viene invocato implicitamente quando si stampa un oggetto
    public String toString() {
        return "RegistrazioneAudio [volume=" + volume + ", titolo=" + titolo + ", durata=" + durata + "]";
    }

    @Override
    public void abbassaVolume() {
        if (volume > 0) volume--;
    }
    @Override
    public void alzaVolume() {
        volume++;
    }





    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.print(titolo);
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            System.out.println();
        }
    }

}
