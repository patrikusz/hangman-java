import java.util.HashSet;
import java.util.Set;

/**
 * A Hangman (akasztófa) játék osztálya.
 */
public class Hangman {
    private String kitalalandoSzo;
    private int lehetosegekSzama;
    private int hibak;
    private Set<Character> kitalaltBetuk;
    private String allapot;

    /**
     * Konstruktor, amely inicializálja a játékot.
     * @param kitalalandoSzo A kitalálandó szó.
     * @param lehetosegekSzama A találgatási lehetőségek száma.
     * @throws HangmanKivetel Ha a szó hossza kevesebb mint 5.
     */
    public Hangman(String kitalalandoSzo, int lehetosegekSzama) throws HangmanKivetel {
        if (kitalalandoSzo.length() < 5) {
            throw new HangmanKivetel("A kitalálandó szó hossza legalább 5 kell legyen!");
        }
        this.kitalalandoSzo = kitalalandoSzo.toLowerCase();
        this.lehetosegekSzama = lehetosegekSzama;
        this.hibak = 0;
        this.kitalaltBetuk = new HashSet<>();
        this.allapot = "_".repeat(kitalalandoSzo.length());
    }

    /**
     * Találgatási metódus.
     * @param betu A felhasználó által megadott betű.
     * @return Az aktuális játék állapota: "nyert", "vesztett" vagy "folytatódik".
     */
    public String talalgat(char betu) {
        betu = Character.toLowerCase(betu);
        if (kitalaltBetuk.contains(betu)) {
            return "folytatódik"; // Már kitalált betű
        }

        boolean talalat = false;
        StringBuilder ujAllapot = new StringBuilder(allapot);

        for (int i = 0; i < kitalalandoSzo.length(); i++) {
            if (kitalalandoSzo.charAt(i) == betu) {
                ujAllapot.setCharAt(i, betu);
                talalat = true;
            }
        }

        if (talalat) {
            allapot = ujAllapot.toString();
            kitalaltBetuk.add(betu);
            if (allapot.equals(kitalalandoSzo)) {
                return "nyert"; // Minden betű kitalálva
            }
        } else {
            hibak++;
            if (hibak >= lehetosegekSzama) {
                return "vesztett"; // Elérte a hibalehetőségek számát
            }
        }

        return "folytatódik";
    }

    public String getAllapot() {
        return allapot;
    }
}
