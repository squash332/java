package ponovljeni_predrok_zadatak3;

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


    public boolean equals(Object Radnik){
        if (this == Radnik) return true;
        if (Radnik == null || getClass() != Radnik.getClass()) return false;

        Radnik radnik = (Radnik) Radnik;
        return Double.compare(radnik.placa, placa) == 0;
    }
}
