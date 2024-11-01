package zadatak_klase;

public class Radnik extends Osoba {
    private String ime;
    private String prezime;
    private double placa;

    Radnik(String ime, String prezime, double placa){
        super(ime, prezime);
        this.placa = placa;
    }
    public double getPlaca(){
        return placa;
    }
    public void setPlaca(double placa){
        this.placa = placa;
    }


    public boolean equals(Object o){
        if(o.equals(getPlaca())) {
            return true;
        } else {
            return false;
        }
    }
}
