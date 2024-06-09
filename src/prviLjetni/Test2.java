package prviLjetni;
import java.util.Scanner;
/* potrebno je napisati program u javi koji ce za zadanu matricu pokrenuti N niti
(jedan red u matrici = jedna nit). Svaka nit bi trebala imati dodjeljeno ime u obliku
"nit 0" "nit 1" itd. te bi trebala izracunati sumu vrijednosti u redu i ispisati je u
obliku npr "nit 0 suma=100".
napomena: niti se trebaju izvrsavati u redoslijedu kako su pokrenute
 */
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int n=0;
        n=input.nextInt();
        int[][] A = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                A[i][j]=input.nextInt();
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++) {
            Nit nit = new Nit(A, i);
            nit.start();
            nit.join();
        }
    }
}
