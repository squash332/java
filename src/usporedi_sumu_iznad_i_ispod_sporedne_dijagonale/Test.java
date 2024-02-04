package usporedi_sumu_iznad_i_ispod_sporedne_dijagonale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        do {
            n = input.nextInt();
        } while(n<=0 || n>=100);


        int [][] A = new int[n][n];
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
        // ij
        // 00 01 02
        // 10 11 12
        // 20 21 22
        //
        int sumaIznad = 0;
        int sumaIspod = 0;
        int broj = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if( i +j > n-1) {
                    sumaIspod+=A[i][j];
                }
                if(i+j < n-1) {
                    sumaIznad+=A[i][j];
                }
            }
        }
        if(sumaIznad > sumaIspod) {
            broj = 1;
            System.out.println(broj);
        }
        if(sumaIspod > sumaIznad) {
            broj = -1;
            System.out.println(broj);
        }
        if(sumaIspod == sumaIznad) {
            broj = broj;
            System.out.println(broj);
        }

    }
}
