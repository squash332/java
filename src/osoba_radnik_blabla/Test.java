package osoba_radnik_blabla;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Radnik radnik = new Radnik("", "", "", 0.00);

        radnik.setIme(input.nextLine());
        radnik.setPrezime(input.nextLine());
        radnik.setRadnikId(input.nextLine());
        radnik.setPlaca(input.nextDouble());
        radnik.postaviPlacu(input.nextDouble());

        radnik.toString();

        // df.format(radnik.getPlaca())



    }
}
