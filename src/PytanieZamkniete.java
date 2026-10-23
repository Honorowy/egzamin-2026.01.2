public class PytanieZamkniete extends Pytanie{
    private String odpowiedzA;
    private String odpowiedzB;
    private String odpowiedzC;
    private char poprawna;

    public PytanieZamkniete(String trescPytania, String nazwaZdjecia, String odpowiedzA, String odpowiedzB, String odpowiedzC, char poprawna) {
        super(trescPytania, nazwaZdjecia);
        this.odpowiedzA = odpowiedzA;
        this.odpowiedzB = odpowiedzB;
        this.odpowiedzC = odpowiedzC;
        this.poprawna = poprawna;
    }

    @Override
    public boolean SprawdzOdpowiedz(char odpowiedz) {
        if (poprawna == odpowiedz){
            czyPoprawna = true;
        }
        else {
            czyPoprawna = false;
        }
        return czyPoprawna;
    }
}
