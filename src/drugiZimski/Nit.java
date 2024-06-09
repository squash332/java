package drugiZimski;

public class Nit extends Thread {

    String rijec;
    int ime;

    Nit(String rijec, int ime) {
        this.rijec = rijec;
        this.ime =ime;
    }

    public void run() {

        int suma=0;
        char slovo;
        for(int i=0; i<rijec.length(); i++) {
            slovo = rijec.charAt(i);
            suma +=slovo;
        }
        System.out.println("Nit "+ime+" suma="+suma);
    }
}
