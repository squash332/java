package nit_za_red;

public class Nit extends Thread{

    int [][] A;
    int i;
    Nit(int [][] A,int i) {
        this.A = A;
        this.i = i;
    }

    public void run() {

        int suma=0;

        for(int x : A[i]) {
            suma += x;
        }
        System.out.println("Nit_"+i+" suma="+suma);
    }
}
