import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Hangman hangman = new Hangman("hangman", 6);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Üdvözlünk a Hangman játékban!");

            while (true) {
                System.out.println("Jelenlegi állapot: " + hangman.getAllapot());
                System.out.print("Adj meg egy betűt: ");
                char betu = scanner.nextLine().charAt(0);

                String eredmeny = hangman.talalgat(betu);
                if (eredmeny.equals("nyert")) {
                    System.out.println("Gratulálok, nyertél! A szó: " + hangman.getAllapot());
                    break;
                } else if (eredmeny.equals("vesztett")) {
                    System.out.println("Vesztettél! Túl sok hibát ejtettél.");
                    break;
                }
            }
        } catch (HangmanKivetel e) {
            System.out.println("Hiba: " + e.getMessage());
        }
    }
}
