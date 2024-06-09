package prviLjetni;

public class Nit extends Thread {
    int [][] A;
    int i;

    Nit(int[][] A, int i) {
        this.A=A;
        this.i=i;

    }

    public void run() {
        int suma_redova=0;
        for(int element : A[i]) {
            suma_redova+=element;
        }
        System.out.println("Nit "+i+" suma="+suma_redova);
    }
}
