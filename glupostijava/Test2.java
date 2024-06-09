package glupostijava;
/* potrebno je napisati program u javi koji ce za neku recenicu pokrenuti N niti
(jedna rijec jedna nit). Svaka nit bi trebala imat dodjeljeno ime u obliku "Nit 0"..
te bi trebala izracunat sumu ASCII vrijednosti dodjeljene rijeci i ispisati je u obliku npr.
"Nit 0 suma=22".
napomena: niti se trebaju izvrsavati u redoslijedu kako su pokrenute.
 */
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner input=new Scanner(System.in);

        String recenica=input.nextLine();
        String[] rijec=recenica.trim().split("\\s+");

        for(int i=0; i<rijec.length; i++) {
            Nit nit = new Nit(rijec[i], i);
            nit.start();
            nit.join();

        }

    }





}
