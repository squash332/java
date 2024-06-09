package glupostijava;

import java.text.DecimalFormat;

public class Radnik extends Osoba{
    public static DecimalFormat df = new DecimalFormat("0.00");
    String radnikId;
    double placa;


    Radnik(String ime, String prezime, String radnikId, double placa) {
        super(ime, prezime);
        this.radnikId=radnikId;
        this.placa=placa;
    }

    public String getRadnikId() {
        return radnikId;
    }
    public void setRadnikId(String radnikId) {
        this.radnikId = radnikId;
    }
    public double getPlaca() {
        return placa;
    }
    public void setPlaca(double placa) {
        this.placa=placa;
    }

    public String toString() {
        System.out.println(getIme()+"-"+getPrezime()+"-"+this.radnikId+"-"+df.format(this.placa));
        return null;
    }

    public double postaviPlacu(double postotak) {
        setPlaca(placa*(postotak/100 + 1));
        return placa;
    }
}
