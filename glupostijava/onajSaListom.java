package glupostijava;

import java.util.ArrayList;
import java.util.Scanner;

public class onajSaListom {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> recenice = new ArrayList<>();

        while (true) {
            String recenica = sc.nextLine();

            if (recenica.equals("STOP")) {
                break;
            }
            recenice.add(recenica);
        }

        for (int i = 0; i < recenice.size(); i++) {

            String recenica = recenice.get(i);
            Nit2 nit = new Nit2("Nit " + i, recenica);
            nit.start();
            nit.join();
        }
    }
}



 class Nit2 extends Thread {

    String recenica;
    String ime;

    public Nit2(String ime, String recenica) {
        this.ime = ime;
        this.recenica = recenica;
    }

    @Override
    public void run() {

        String[] rijec = recenica.split("\\s+");

        int brojac = 0;
        for (String x : rijec) {
            if (x.charAt(0) == 'a' || x.charAt(0) == 'e' || x.charAt(0) == 'i' || x.charAt(0) == 'o' || x.charAt(0) == 'u') {
                brojac++;
            }
        }
        System.out.println(ime + " " + brojac);
    }
}
