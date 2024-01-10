package it.epicode.week1.day3.esercizi;

public class Ecommerce {

    //classe articolo con attributi codice articolo,descrizione articolo, prezzo, quantità disponibili a magazzino
    public static class Articolo {
        private String codiceArticolo;
        private String descrizioneArticolo;
        private double prezzo;
        private int quantitaDisponibili;

        //costruttore
        public Articolo(String codiceArticolo, String descrizioneArticolo, double prezzo, int quantitaDisponibili) {
            this.codiceArticolo = codiceArticolo;
            this.descrizioneArticolo = descrizioneArticolo;
            this.prezzo = prezzo;
            this.quantitaDisponibili = quantitaDisponibili;
        }

        //metodo che restituisce il codice articolo
        public String getCodiceArticolo() {
            return codiceArticolo;
        }

        //metodo che restituisce la descrizione articolo
        public String getDescrizioneArticolo() {
            return descrizioneArticolo;
        }

        //metodo che restituisce il prezzo
        public double getPrezzo() {
            return prezzo;
        }

        //metodo che restituisce la quantità disponibile
        public int getQuantitaDisponibili() {
            return quantitaDisponibili;
        }

        //metodo che modifica la quantità disponibile
        public void setQuantitaDisponibili(int quantitaDisponibili) {
            this.quantitaDisponibili = quantitaDisponibili;
        }

        //metodo che restituisce le caratteristiche dell'articolo
        public String getCaratteristiche() {
            return "L'articolo " + codiceArticolo + " " + descrizioneArticolo + " ha un prezzo di " + prezzo + " euro e " + quantitaDisponibili + " pezzi disponibili";
        }

        //metodo che restituisce il prezzo totale di tutti gli articoli disponibili
        public double getPrezzoTotale() {
            return prezzo * quantitaDisponibili;
        }

        //metodo che restituisce il prezzo totale dell'articolo con sconto
        public double getPrezzoTotaleScontato(double sconto) {
            return prezzo * quantitaDisponibili * (1 - sconto / 100);
        }
    }


    //classe cliente con attributi nome, cognome, codice cliente, email, data inscrizione
    public static class Cliente {
        private String nome;
        private String cognome;
        private String codiceCliente;
        private String email;
        private String dataIscrizione;

        //costruttore
        public Cliente(String nome, String cognome, String codiceCliente, String email, String dataIscrizione) {
            this.nome = nome;
            this.cognome = cognome;
            this.codiceCliente = codiceCliente;
            this.email = email;
            this.dataIscrizione = dataIscrizione;
        }

        //metodo che restituisce il nome del cliente
        public String getNome() {
            return nome;
        }

        //metodo che restituisce il cognome del cliente
        public String getCognome() {
            return cognome;
        }

        //metodo che restituisce il codice cliente
        public String getCodiceCliente() {
            return codiceCliente;
        }

        //metodo che restituisce l'email del cliente
        public String getEmail() {
            return email;
        }

        //metodo che restituisce la data di iscrizione del cliente
        public String getDataIscrizione() {
            return dataIscrizione;
        }

        //metodo che restituisce le caratteristiche del cliente
        public String getCaratteristiche() {
            return "Il cliente " + nome + " " + cognome + " ha il codice cliente " + codiceCliente + " e la sua email è " + email + ". Si è iscritto il " + dataIscrizione;
        }
    }



    //classe carello con attributi codice carrello, articoli nel carrello, cliente, totale costo articoli presenti nel carello
    public static class Carrello {
        private String codiceCarrello;
        private Articolo[] articoli;
        private Cliente cliente;
        private double totaleCostoArticoli;

        //costruttore
        public Carrello(String codiceCarrello, Articolo[] articoli, Cliente cliente) {
            this.codiceCarrello = codiceCarrello;
            this.articoli = articoli;
            this.cliente = cliente;
            this.totaleCostoArticoli = 0;
        }

        //metodo che restituisce il codice carrello
        public String getCodiceCarrello() {
            return codiceCarrello;
        }

        //metodo che restituisce gli articoli presenti nel carrello
        public Articolo[] getArticoli() {
            return articoli;
        }

        //metodo che restituisce il cliente
        public Cliente getCliente() {
            return cliente;
        }

        //metodo che restituisce il totale costo articoli presenti nel carello
        public double getTotaleCostoArticoli() {
            return totaleCostoArticoli;
        }

        //metodo che modifica il totale costo articoli presenti nel carello
        public void setTotaleCostoArticoli(double totaleCostoArticoli) {
            this.totaleCostoArticoli = totaleCostoArticoli;
        }

        //metodo che restituisce le caratteristiche del carrello
        public String getCaratteristiche() {
            return "Il carrello " + codiceCarrello + " ha " + articoli.length + " articoli e il cliente è " + cliente.getNome() + " " + cliente.getCognome();
        }

        //metodo che restituisce il totale costo articoli presenti nel carello
        public double getTotaleCostoArticoliCarrello() {
            double totale = 0;
            for (Articolo articolo : articoli) {
                totale += articolo.getPrezzoTotale();
            }
            return totale;
        }

        //metodo che restituisce il totale costo articoli presenti nel carello con sconto
        public double getTotaleCostoArticoliCarrelloScontato(double sconto) {
            double totale = 0;
            for (Articolo articolo : articoli) {
                totale += articolo.getPrezzoTotaleScontato(sconto);
            }
            return totale;
        }

        //metodo che aggiorna i 100 pezzi di articolo disponibili   dopo  n articoli acquisti da un eventuale cliente
        public void aggiornaQuantitaDisponibili(int n) {
            for (Articolo articolo : articoli) {
                articolo.setQuantitaDisponibili(articolo.getQuantitaDisponibili() - n);
            }
        }


    }

    public static void main(String[] args) {
        //creo un articolo
        Articolo articolo1 = new Articolo("A1", "Penne", 0.5, 100);
        //creo un cliente
        Cliente cliente1 = new Cliente("Mario", "Rossi", "C1", "Rossi2024@gmail.com", "01/01/2021");
        //creo un carrello
        Carrello carrello1 = new Carrello("CC1", new Articolo[]{articolo1}, cliente1);

        //stampo le caratteristiche dell'articolo
        System.out.println(articolo1.getCaratteristiche());
        //stampo le caratteristiche del cliente
        System.out.println(cliente1.getCaratteristiche());
        //stampo le caratteristiche del carrello
        System.out.println(carrello1.getCaratteristiche());

        //stampo il totale costo articoli presenti nel carello
        System.out.println("Il totale costo articoli presenti nel carello è: " + carrello1.getTotaleCostoArticoliCarrello());

        //stampo il totale costo articoli presenti nel carello con sconto
        System.out.println("Il totale costo articoli presenti nel carello con sconto è: " + carrello1.getTotaleCostoArticoliCarrelloScontato(10));



        //aggiorno i 100 pezzi di articolo disponibili   dopo  n articoli acquisti da un eventuale cliente
        carrello1.aggiornaQuantitaDisponibili(1);

        //stampo i pezzi disponibili dopo l'acquisto
        System.out.println("I pezzi disponibili dopo l'acquisto sono: " + articolo1.getQuantitaDisponibili());
        //modifico la quantità disponibile dell'articolo
        articolo1.setQuantitaDisponibili(99);
        //stampo le caratteristiche dell'articolo
        System.out.println(articolo1.getCaratteristiche());


    }
}
