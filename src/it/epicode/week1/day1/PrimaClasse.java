package it.epicode.week1.day1;

import java.awt.desktop.SystemSleepListener;
import java.util.Scanner;

public class PrimaClasse {
    public static void main(String[] args) {
        // comment riga
        /* comment
        due  o piu riga
         */

        /**
         * doc notation .java
         * e identico al com su piu righe ma puo essere estrapollato con java.doc che possono servire che l'azienda capisca le varie classi , metodi ecc cosa fanno
         *
         *
         *
         * */


        //la variabile occupera una locazione di memoria, che potra eseere utilizzato nel corso del programma
        int a;//dichiaro solo variabile di tipo intero ma senza poterla utilizzare xke nn ha valore

        a = 10;// do un valore ad a

        int x = 5;//dichiaro x , gli do il tipo e il valore

        x = 15; // riassegno x

        String y = "Elena";//dichiaro y --"--

        int i = 5, b = 20; //dichiarazione a catena

        char c = 'e'; //solo un caratere

        byte n = 6; //puo contenere val -128 a 127

        short s = 9; //n int -65000 +65000
        long k = 1265656596; // miliardi

        float l = 0.7f;// n con la virgola

        final int p = 10;// int c diventeracostante e nnpotra essere riassegnata


        System.out.println(x);//stampo la variabile intera x


        String frase1 = " Elena";

        String frase2 = " sei Dio!";

        String fraseConcatenata = frase1 + frase2;


        System.out.println(fraseConcatenata);

        System.out.print("Ciao ");//solo con print nn va a capo la stampa ma stampa sulla stessa riga
        System.out.println("Dio");//con println va a capo la prossima stampa


        int z = s; // short piu piccolo di int , va al interno del int , e quindi converte implicitamente senza problemi

        float f2 = z; // anche il tipo int z sta in f2 che un tipo float f2 cioe a virgola mobile che e considerato sempre piu grande dei tipi primitivi

        System.out.println(z);

        System.out.println(f2);//i float gli stampa sempre con la virgola, nel caso in cui non c'e la virgola java aggiunge .0

        z = z%6;//java fa operazioni solo tra tipi uguali

        System.out.println(z);


        z++;
        System.out.println(z);





        // scanner e un metodo che fa inserire all'utente  (tipo input nel form)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Compila un numero intero:");
        int  j =scanner.nextInt();

        System.out.println(j);
        System.out.println("Compila una parola che vuoi che stampi:");
        scanner.nextLine();

        String parola = scanner.nextLine();

        System.out.println(parola.length());







    }
}
