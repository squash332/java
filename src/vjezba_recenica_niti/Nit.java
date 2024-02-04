package vjezba_recenica_niti;

public class Nit extends Thread{

    String rijec;
    int i;
    Nit(int i, String rijec) {
        this.i = i;
        this.rijec=rijec;
    }

    public void run() {
        int suma=0;
        int slovo;
        for(int i=0;i<rijec.length(); i++) {
            slovo = rijec.charAt(i);
            suma += (int)slovo;
        }
        System.out.println("Nit "+this.i+" suma="+suma);
    }
}
