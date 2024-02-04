package nule_okruzene_jedinicama;
// program koji ce sa kv matricu A s N redaka i N stupaca koja u sebi ima samo 0 i 1 izracunati koliko ima
// pojavljivanja broja 0, a da su oko njega sve jedinice
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int provjera;

        do {
            n = input.nextInt();
        } while(n<=0);

        int[][] A = new int[n][n];
        for(int i =0; i<n; i++) {
            for(int j=0; j<n; j++) {
                do {
                    A[i][j] = input.nextInt();
                    provjera = A[i][j];
                } while(provjera !=0 && provjera !=1);

            }
        }
        System.out.println("matrica je: ");
        for(int i =0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }

        int brojPon = ponavljanje(A);
        System.out.println(brojPon);

    }



    public static int ponavljanje(int[][] A) {
        int brojac=0;
        int redovi = A.length;

        // ij
        // 00 01 02 03 04
        // 10 11 12 13 14 7. i 19.
        // 20 21 22 23 24
        // 30 31 32 33 34
        // 40 41 42 43 44

        for(int i = 1; i<redovi; i++) {
            for(int j=1; j<redovi; j++) {
                if(A[i][j] == 0 &&


                        A[i-1][j-1] == 1 && A[i-1][j] == 1 && A[i-1][j+1] == 1 &&
                        A[i][j-1] == 1 && A[i][j+1] == 1 &&
                        A[i+1][j-1] == 1 && A[i+1][j] == 1 && A[i+1][j+1] == 1) {
                    brojac++;
                }
            }
        }

    return brojac;
    }
}
