package it.epicode.week1.day4;

public class ContrattoTelefonico {

    private int numTelefono;
    private double credito;
    private double costoChiamata;
    private String utente;
    private int numeroTelefonate;
   private final double COSTO_AL_SECONDO;

public ContrattoTelefonico(int numTelefono,  String utente, double COSTO_AL_SECONDO) {
       this.numTelefono = numTelefono;
       this.utente = utente;
       this.COSTO_AL_SECONDO = COSTO_AL_SECONDO;
   }

        public ContrattoTelefonico(int numTelefono, double credito, double costoChiamata, String utente, double COSTO_AL_SECONDO) {
            this.numTelefono = numTelefono;
            this.credito = credito;
            this.costoChiamata = costoChiamata;
            this.utente = utente;
            this.COSTO_AL_SECONDO = COSTO_AL_SECONDO;
        }

        public int getNumTelefono() {
            return numTelefono;
        }

        public double getCredito() {
            return credito;
        }

        public double getCostoChiamata() {
            return costoChiamata;
        }

        public String getUtente() {
            return utente;
        }

        public double getCOSTO_AL_SECONDO() {
            return COSTO_AL_SECONDO;
        }

        public void ricarica(double credito) {
            this.credito += credito;
        }

        public void aggiornaBoletta(int secondi) {
            numeroTelefonate++;
            credito -= secondi * COSTO_AL_SECONDO;
        }

    @Override
    public String toString() {
        return "ContrattoTelefonico{" +
                "numTelefono=" + numTelefono +
                ", credito=" + credito +
                ", costoChiamata=" + costoChiamata +
                ", utente='" + utente + '\'' +
                ", numeroTelefonate=" + numeroTelefonate +
                ", COSTO_AL_SECONDO=" + COSTO_AL_SECONDO +
                '}';
    }

    public  void aggiungiCosti(double costoChiamata) {
            this.costoChiamata += costoChiamata;
        }





        public void chiama(int numChiamato, int durata) {
            if (credito >= durata * COSTO_AL_SECONDO) {
                credito -= durata * COSTO_AL_SECONDO;
                System.out.println("Chiamata effettuata");
            } else {
                System.out.println("Credito insufficiente");
            }
        }

        public void stampa() {
            System.out.println("Numero di telefono: " + numTelefono);
            System.out.println("Credito: " + credito);
            System.out.println("Costo chiamata: " + costoChiamata);
            System.out.println("Utente: " + utente);
            System.out.println("Costo al secondo: " + COSTO_AL_SECONDO);
        }

        public static void main(String[] args) {
            ContrattoTelefonico c1 = new ContrattoTelefonico(123456789, 10, 0.1, "Mario Rossi", 0.1);
            c1.stampa();
            c1.ricarica(5);
            c1.stampa();
            c1.chiama(987654321, 10);
            c1.stampa();
        }



}
