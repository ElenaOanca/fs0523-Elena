package it.epicode.week1.day4;

public class ContrattoMobile extends ContrattoTelefonico    {
private final double COSTO_ALLA_RISPOSTA;
    public ContrattoMobile(int numTelefono, String utente, double COSTO_AL_SECONDO, double COSTO_ALLA_RISPOSTA) {
        super(numTelefono, utente, COSTO_AL_SECONDO);
        this.COSTO_ALLA_RISPOSTA = COSTO_ALLA_RISPOSTA;
    }

@Override
public void aggiornaBoletta(int secondi) {
    super.aggiornaBoletta(secondi);
    super.aggiungiCosti(COSTO_ALLA_RISPOSTA);
}

}