package glupostijava;

public class Brojac extends Thread{

    int broj;
    Brojac(int broj) {
        this.broj=broj;

    }

    @Override
    public void run() {

        if(broj==0) {
            for(int i=0; i<30; i+=2) {
                System.out.println(i);
                try {
                    sleep(1000);
                }catch(Exception e){
                    e.printStackTrace();
                }

            }
        }
        if(broj==1) {
            for(int i=1; i<20; i+=2) {
                System.out.println(i);
                try {
                    sleep(1000);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
