package drugiZimski2024;
/* potrebno je napisati program u javi koji ce ucitanu kvadratnu matricu A ispisati u tzv.
"zmija uzorku". N koji predstavljaju dimenzije matrice A
Slijedi N redaka s N stupaca cijelih brojeva koji predstavljaju elemente matrice
pr ulaza:
4
2 4 6 8
1 2 3 4
1 1 1 2
3 2 2 1
izlaz: 2 4 6 8 4 3 2 1 1 1 1 2 1 2 2 3 (lijevo nadesno, desno nalijevo i tak u krug)
 */

import java.util.Scanner;
public class Zmija {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //unos dimenzija matrice
        int n=input.nextInt();

        //unos elemenata matrice (prvo ju moras napravit)
        int[][] A = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                A[i][j] = input.nextInt();
            }
        }

        //ispis nase matrice
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        // ij       n=3
        // 00 01 02 lijevo nadesno -> j se povecava do n-1 i tad ispis stane, inkrementiraj i
        // 10 11 12 desno nalijevo -> j se smanjuje do 0 i tad ispis stane, inkrementiraj i
        // 20 21 22 desno nalijevo -> j se povecava do n-1 i tad ispis stane

        int[] elementi =new int [n*n];
        for(int i=0; i<n; i++) {
            if(i%2 == 0) {
                for(int j=0; j<n; j++) {
                    System.out.print(A[i][j] +" ");
                }
            }
            if(i%2 == 1) {
                for (int j=n-1; j>=0; j--) {
                    System.out.print(A[i][j] +" ");
                }
            }
        }



    }

}
