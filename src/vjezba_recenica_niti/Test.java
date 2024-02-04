package vjezba_recenica_niti;
import java.util.Scanner;

public class Test {
    public static void main(String[]args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        String recenica = input.nextLine();
        String[] rijec = recenica.trim().split("\\s+");

        for(int i=0; i<rijec.length; i++) {
            Nit nit= new Nit(i,rijec[i]);
            nit.start();
            nit.join();
        }



    }
}
