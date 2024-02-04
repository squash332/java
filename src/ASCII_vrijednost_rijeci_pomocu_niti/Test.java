package ASCII_vrijednost_rijeci_pomocu_niti;
import java.util.Scanner;



public class Test{
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        String recenica = sc.nextLine();
        String[] rijeci = recenica.trim().split("\\s+");

        //kreiranje niti pomocu Runnable interfacea
        //prvo instanciramo objekt klase MojaNit i onda ga poasljemo u argument Threada
        for(int i=0; i< rijeci.length; i++){
            System.out.print("Nit "+ i+ " suma=");
            MojaNit nit = new MojaNit(i, rijeci[i]);
            nit.start();
            nit.join();
        }

    }
}