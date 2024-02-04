// program koji ce za cjelobrojnu kv matricu A(max100 elem) s N redaka i N stupaca izracunati sumu
// svih znamenaka iznad gl dijagonale ukljucujuci i glavnu
package matrica_suma_iznad_glavne_plus_glavna;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        do {
            n = input.nextInt();    // broj elemenata matrice
        } while(n <= 0 || n>=100);

        int[][] A = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {    //unos znamenki u matricu
                A[i][j]= input.nextInt();
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(A[i][j]);  //ispis matrice

            }
            System.out.print("\n");
        }
        int suma=0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i == j) {    //glavna dijagonala
                    suma+= A[i][j];
                }
                if(i < j) {     //iznad glavne dijagonale
                    suma+= A[i][j];
                }

            }
        }
        System.out.println(suma);


    }
}
