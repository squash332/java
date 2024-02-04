package ponovljeni_predrok_zadatak3;

public class Osoba {
    private String ime;
    private String prezime;
    Osoba(String ime, String prezime){
        this.ime = ime;
        this.prezime = prezime;
    }
    public String getIme(){
        return ime;
    }
    public String getPrezime(){
        return prezime;
    }
    public void setIme(String ime){
        this.ime = ime;
    }
    public void setPrezime(String prezime){
        this.prezime = prezime;
    }
}