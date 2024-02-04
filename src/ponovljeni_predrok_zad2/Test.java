package ponovljeni_predrok_zad2;
// program koji s tipkovnice ucitava N recenica u listu stringova (npr. ArrayList) dok se ne unese riječ "STOP".
// Nakon ucitavanja stvoriti N niti koje ce obradjivat recenice (niti se izvrsavaju jedna iza druge)
// Svaka nit treba imati dodijeljeno ime "Nit 1", "Nit 2" itd. te bi trebala izracunati
// koliko rijeci u recenici pocinje samoglasnikom
// (neovisno o malom ili velikom slovu)
//
import java.util.Scanner;
import java.util.ArrayList;
public class Test {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> recenice = new ArrayList<>();

        while (true) {
            String recenica = scanner.nextLine();
            if (recenica.equalsIgnoreCase("STOP")) {
                break;
            }
            recenice.add(recenica);
        }
        for (int i = 0; i < recenice.size(); i++) {
            String recenica = recenice.get(i);
            String nazivNiti = "Nit" + (i + 1);
            Thread nit = new NitBrojanjeSamoglasnika(nazivNiti, recenica);
            nit.start();
            nit.join();
        }
    }
}

class NitBrojanjeSamoglasnika extends Thread {
    private String nazivNiti;
    private String recenica;

    public NitBrojanjeSamoglasnika(String nazivNiti, String recenica){
        this.nazivNiti = nazivNiti;
        this.recenica = recenica;
    }

    @Override
    public void run() {
        int brojSamoglasnika = brojSamoglasnika(recenica);
        System.out.println(nazivNiti + ": Broj riječi koje počinju samoglasnikom u rečenici '" + recenica + "': " + brojSamoglasnika);
    }

    private int brojSamoglasnika(String rijec) {
        char[] samoglasnici = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int broj = 0;

        String[] rijeci = rijec.split("\\s+"); // Razdvajanje rečenice na riječi

        for (String r : rijeci) {
            if (r.length() > 0 && containsSamoglasnik(r.charAt(0), samoglasnici)) {
                broj++;
            }
        }

        return broj;
    }

    private boolean containsSamoglasnik(char c, char[] samoglasnici) {
        for (char samoglasnik : samoglasnici) {
            if (c == samoglasnik) {
                return true;
            }
        }
        return false;
    }
}

