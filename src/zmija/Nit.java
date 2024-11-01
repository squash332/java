package vjezbaaa;

public class Nit extends Thread{

    int[][] A;
    int i;


    Nit(int[][] A, int i) {
        this.A=A;
        this.i=i;

    }

    // ij ij ij ij  n=4      red     sporedna dijagonala -> i+j = n-1
    // 00 01 02 03            0      paran red -> od elem. spord. dij. (bez njega) nalijevo
    // 10 11 12 13            1      neparan red -> od elem spord. dij. (bez njega) nadesno
    // 20 21 22 23            2
    // 30 31 32 33            3
    @Override
    public void run() {
        int suma=0;

        if(i%2 == 0) {
            for(int j=A.length; j>=0; j--) {
                if(i+j<A.length-1) {
                    suma+=A[i][j];
                }
            }
        }
        if(i%2 == 1) {
            for(int j=0; j<A.length; j++) {
                if(i+j>A.length-1) {
                    suma+=A[i][j];
                }
            }
        }
        System.out.println("Nit "+i+" suma="+suma);
        suma=0;




    }
}
