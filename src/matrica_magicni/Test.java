package matrica_magicni;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        do {
            n=input.nextInt();
        }while(n<=0 || n>=100);

        int[][] A = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                A[i][j] = input.nextInt();
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }

        int[] sumaRed = new int[n];
        int[] sumaStupac = new int[n];
        int sumaG = 0;
        int sumaS = 0;


        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                sumaRed[j] += A[j][i];
                sumaStupac[j] += A[i][j];
                if(i==j) {
                    sumaG+=A[i][j];
                }
                if(i + j == n -1) {
                    sumaS+=A[i][j];
                }
            }
        }
        int broj=0;
        for(int j=0; j<n; j++) {
            if(sumaRed[j] == sumaStupac[j] && sumaStupac[j] == sumaG && sumaG == sumaS) {
                broj = 1;
            }else {
                broj = -1;
            }
        }

        System.out.println(broj+" "+ sumaRed[0]);

    }
}
