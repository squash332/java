package ponovljeni_predrok_zad1;
//N i M ucitati matricu A[N][M], zatim za unose:
//R,K,NB i MB kreirati novu matricu B[NB][MB] koja predstavlja podmatricu matrice A s početkom u redu R
// i koloni K (dimenzije podmatrice ne smiju izac iz okvira matrice A). Ukoliko su dimenzije podmatrice veće od dimenzija
// matrice A tada program treba ispisati "Neispravan unos"
// ulaz:
// prvo se unosi podatak N i M
// zatim unesi podatak R,K, NB, MB
// zatim se unose vrijednosti matrice A
// izlaz:
// podmatrica A dimenzija [NB][MB]
import java.util.Scanner;

public class Test {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        //unos dimenzije matrice A

        int N  = input.nextInt();
        int M = input.nextInt();

        //unos podataka za stvaranje podmatrice B

        int R = input.nextInt();
        int K = input.nextInt();
        int NB = input.nextInt();
        int MB = input.nextInt();

        //unos matrice A
        int[][] A = new int[N][N];
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                A[i][j] = input.nextInt();
            }
        }

        //provjera ispravnosti ulaza

        if(R < 0 || K < 0 || R + NB > N || K + MB > M) {
            System.out.println("Neispravan unos");
        } else {

            // ij ij ij                       R K NB MB
            // 00 01 02  dimenzije podmatrice 0 1  2  2
            // 10 11 12  red R, kolona K te podmatrica B[NB][MB]
            // 20 21 22
            //
            // 4  9  2   92   01 02 mora postat 00 01
            // 3  5  7   57   11 12 mora postat 10 11
            // 8  1  6
            //kreiranje podmatrice B
            int[][] B = new int[NB][MB];
            for(int i=0; i<NB; i++) {
                for (int j = 0; j < MB; j++) {
                    B[i][j] = A[R+i][K+j];
                }
            }
            for(int i=0; i<NB; i++){
                for(int j=0; j<MB; j++) {
                    System.out.print(B[i][j]);
                }
                System.out.println();
            }



            //ispis podmatrice B

        }
    }
}
