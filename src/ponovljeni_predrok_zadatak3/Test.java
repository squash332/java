package ponovljeni_predrok_zadatak3;
// klasa Osoa sadrzi privatne atribute ime, prezime - napisi konstruktor i get set metode
// napravi klasu Radnik koja nasljeduje klasu osoba, definira atribut placa(double)
// napisi konstruktore, get set metode i implementaciju "public boolean equals(Object o) koja usporedjuje dva objekta klase
// Radnik po placi
// radnik r1 ima placu 1000e radnik r2 2000, kad ih usporedimo bi trebali dobit ispis "Nisu isti" dok bi
// u suprotnom ispis bio "Isti su"
// u test klasi s tipkovnice unijeti podatke dva dva objekta klase radnik
import java.io.InterruptedIOException;
import java.util.Scanner;
import java.util.Objects;
import java.util.InputMismatchException;


public class Test {
    public static void main(String[] args) throws InterruptedIOException {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        Radnik radnik1 = new Radnik("","",0.00);
        Radnik radnik2 = new Radnik("","",0.00);

        radnik1.setIme(scanner.nextLine());
        radnik1.setPrezime(scanner.nextLine());
        radnik1.setPlaca(scanner.nextDouble());

        radnik2.setIme(scanner1.nextLine());
        radnik2.setPrezime(scanner1.nextLine());
        radnik2.setPlaca(scanner1.nextDouble());



        if (radnik1.equals(radnik2)){
            System.out.println("Isti su.");
        }if(radnik2.equals(radnik1)){
            System.out.println("Nisu isti.");
        }
    }

}

