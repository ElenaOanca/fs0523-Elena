package it.epicode.week1.day4;

public class UsaContrattoTelefonico {

    public static void main(String[] args) {

        ContrattoTelefonico ct = new ContrattoTelefonico(123456, "Mario Rossi", 0.1);
        ContrattoMobile cm = new ContrattoMobile(123456, "Rossi Mario", 0.1, 0.2);
System.out.println(ct);

        ct.ricarica(10);
        ct.aggiornaBoletta(100);
        System.out.println("Credito residuo: " + ct.getCredito());

        cm.ricarica(10);
        cm.aggiornaBoletta(100);
        System.out.println("Credito residuo: " + cm.getCredito());

        ContrattoTelefonico ct2 = new ContrattoMobile(123456, "Rossi Mario", 0.1, 0.2);
        ct2.ricarica(10);
        ct2.aggiornaBoletta(100);
        System.out.println("Credito residuo: " + ct2.getCredito());
        //faccio chiamate
        ct2.chiama(123456, 10);
        ct2.chiama(123456, 20);
        ct2.chiama(123456, 30);
        ct2.chiama(123456, 40);

     //aggiungo costi
        ct2.aggiungiCosti(0.2);
        ct2.aggiungiCosti(0.3);
        ct2.aggiungiCosti(0.4);
        ct2.aggiungiCosti(0.5);

        System.out.println("Costo chiamata: " + ct2.getCostoChiamata());

        //stampa
        ct2.stampa();
    //aggiungo costi
        ct2.aggiungiCosti(0.2);
        ct2.aggiungiCosti(0.3);
        ct2.aggiungiCosti(0.4);
        ct2.aggiungiCosti(0.5);

        System.out.println("Costo chiamata: " + ct2.getCostoChiamata());

        //stampa
        ct2.stampa();

        //aggiorno boletta
        ct2.aggiornaBoletta(100);
        System.out.println("Credito residuo: " + ct2.getCredito());


    }
}

