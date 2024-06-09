package prviLjetni;
/* potrebno je napisat program u javi koji ce za cjelobrojnu kvadratnu matricu A (max 100 elemenata)
s N redaka i N stupaca izracunati sumu svih znamenaka iznad glavne dijagonale, ukljucujuci i glavnu.
 */
import java.util.Scanner;


public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N=0;

        do {
            N = input.nextInt();
        } while (N <= 0 || N > 10);

        int [][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                    A[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }

        // ij
        // 00 01 02    \ glavna i=j, iznad glavne j>i
        // 10 11 12
        // 20 21 22

        int suma=0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(i<=j) {
                    suma+=A[i][j];
                }

            }
        }
        System.out.println(suma);
    }
}



