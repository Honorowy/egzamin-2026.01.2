import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pytanie pytanie = new Pytanie("Kiedy bedzie egzamin", "egzaminZadanie1.jpeg");
        System.out.println("Podaj tresc pytania:");
        String trescPtania = scanner.nextLine();

        System.out.println("Podaj nazwe zdjecia:");
        String nazwaZdjecia = scanner.nextLine();

        System.out.println("Podaj odpowiedź A:");
        String odpowiedzA = scanner.nextLine();

        System.out.println("Podaj odpowiedź B:");
        String odpowiedzB = scanner.nextLine();

        System.out.println("Podaj odpowiedź C:");
        String odpowiedzC = scanner.nextLine();

        System.out.println("Podaj poprawną odpowiedz:");
        char poprawna = scanner.next().charAt(0);

        PytanieZamkniete pytanieZamkniete = new PytanieZamkniete(trescPtania, nazwaZdjecia, odpowiedzA, odpowiedzB, odpowiedzC, poprawna);

        System.out.println("Wprowadz odpowiedź użytkownika:");
        char odpowiedz = scanner.next().charAt(0);

        if (pytanieZamkniete.SprawdzOdpowiedz(odpowiedz)) {
            System.out.println("Odpowiedź prawidłowa");
        } else {
            System.out.println("Odpowiedź nieprawidłowa");
        }

    }
}