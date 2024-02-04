package ASCII_vrijednost_rijeci_pomocu_niti;

public class MojaNit extends Thread {

    int i;
    private String rijeci;

    public MojaNit(int i, String rijeci){
        this.i = i;
        this.rijeci = rijeci;
    }

    @Override
    public void run(){
        char slovo = 0;
        int suma = 0;
        for(int i=0; i<rijeci.length(); i++){
            slovo = rijeci.charAt(i);
            suma += slovo;
        }
        System.out.println(suma);
    }
}
