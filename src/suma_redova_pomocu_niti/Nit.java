package suma_redova_pomocu_niti;

public class Nit extends Thread {

    private int[][] A;
    private int redak;

    Nit(int[][] A, int redak) {
        this.A=A;
        this.redak=redak;

    }
    @Override
    public void run() {
        int suma=0;
        for(int stupac: A[redak]) {
            suma += stupac;
        }
        System.out.println("Nit_"+redak+" suma="+suma);

    }
}
