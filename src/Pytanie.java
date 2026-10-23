public abstract class Pytanie {
    protected String trescPytania;
    protected String nazwaZdjecia;
    protected boolean czyPoprawna;

    public Pytanie(String trescPytania, String nazwaZdjecia) {
        this.trescPytania = trescPytania;
        this.nazwaZdjecia = nazwaZdjecia;
    }

    public abstract boolean SprawdzOdpowiedz(char odpowiedz);
}
