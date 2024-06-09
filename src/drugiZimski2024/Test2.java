package drugiZimski2024;
// niti bi trebale izracunat sumu elemenata horizontalno
// (lijevo il desno ovisno o tom jel red paran il neparan) od elemenata sporedne dijagonale
// (ne uzimajuci u obzir element na sporednoj dijagonali). Suma se radi horizontalno prema lijevo ako je parni red,
// a horizontalno prema desno ako je neparni red
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner input  = new Scanner(System.in);
        System.out.println("unesi dimenziju kv matrice n: ");
        int n=input.nextInt();

        int[][] A = new int[n][n];


        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                A[i][j] = input.nextInt();
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
