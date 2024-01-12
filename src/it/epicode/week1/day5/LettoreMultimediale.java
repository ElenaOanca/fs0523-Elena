package it.epicode.week1.day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LettoreMultimediale {

    private ElementoMultimediale[] elementi;
    private Scanner scanner;

    public LettoreMultimediale(Scanner scanner) {
        this.elementi = new ElementoMultimediale[5];
        this.scanner = scanner;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LettoreMultimediale mediaPlayer = new LettoreMultimediale(scanner);




                for (int i = 0; i < 5; i++) {
                    System.out.println("Crea un elemento ,premi 1-Video, 2-Audio, 3-Image :   ");
                    int scelta = 0;

                    try {
                        scelta = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Input non valido. Inserisci un numero.");
                        scanner.nextLine();
                        i--;
                        continue;
                    }

                    scanner.nextLine();

                    ElementoMultimediale element = null;

                    switch (scelta) {
                        case 1:
                            System.out.println("Hai scelto di creare un video. Scrivi titolo del video");
                            String videoTitle = scanner.nextLine();
                            System.out.println("Scrivi durata del video:");
                            int videoDurata = scanner.nextInt();
                            System.out.println("Scrivi volume del video:");
                            int videoVolume = scanner.nextInt();
                            System.out.println("Scrivi luminosita del video:");
                            int videoLuminosita = scanner.nextInt();
                            element = new RegistrazioneVideo(videoTitle, videoDurata, videoVolume, videoLuminosita);
                            break;
                        case 2:
                            System.out.println("Hai scelto di creare un audio.  Scrivi titolo dell'audio:");
                            String audioTitolo = scanner.nextLine();
                            System.out.println("Scrivi durata dell'audio:");
                            int audioDurata = scanner.nextInt();
                            System.out.println("Scrivi volume dell'audio:");
                            int audioVolume= scanner.nextInt();
                            element = new RegistrazioneAudio(audioTitolo,audioDurata,audioVolume);
                            break;
                        case 3:
                            System.out.println("Hai scelto di creare un'immagine. Scrivi  il titolo dell'immagine:");
                            String titolo = scanner.nextLine();
                            System.out.println("Metti la luminosita :");
                            int luminosita = scanner.nextInt();

                            element = new Immagini(titolo, luminosita);
                            break;
                        default:

                            System.out.println("Scelta non valida. Riprova.");
                            i--;
                            continue;

                    }

                    mediaPlayer.add(element, i);
                }

        mediaPlayer.esegui();
                scanner.close();
            }

    public void add(ElementoMultimediale element, int index) {
        if (index >= 0 && index < elementi.length) {
            elementi[index] = element;
        }
    }

    public void esegui() {
        while (true) {
            System.out.println("Scegli quale elemento eseguire premendo un numero da 1 a 5 oppure 0 per terminare:");
            if (!scanner.hasNextInt()) {
                System.out.println("Per favore inserisci un numero.");
                scanner.next();
            }
            int scelta = scanner.nextInt();
            if (scelta == 0) {
                break;
            } else if (scelta > 0 && scelta <= 5 && elementi[scelta - 1] != null) {
                if (elementi[scelta - 1] instanceof ElementoRiproducibie) {
                    ((ElementoRiproducibie) elementi[scelta - 1]).play();
                } else if (elementi[scelta - 1] instanceof Immagini) {
                    ((Immagini) elementi[scelta - 1]).show();
                }
            } else {
                System.out.println("Scelta non valida. Riprova.");
            }


//    public void esegui() {
//        while (true) {
//            System.out.println("Scegli quale elemento eseguire premendo un numero da 1 a 5  oppure 0 per terminare:");
//            int scelta = scanner.nextInt();
//            if (scelta == 0) {
//                break;
//            } else if (scelta > 0 && scelta <= 5 && elementi[scelta - 1] != null) {
//                if (elementi[scelta - 1] instanceof ElementoRiproducibie) {
//                    ((ElementoRiproducibie) elementi[scelta - 1]).play();
//                } else if (elementi[scelta - 1] instanceof Immagini) {
//                    ((Immagini) elementi[scelta - 1]).show();
//                }
//            } else {
//                System.out.println("Scelta non valida. Riprova.");
//            }
      }

   }




}



