package osoba_radnik_blabla;

public class Osoba {

    private String ime;
    private String prezime;

    Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime=prezime;
    }

    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime=prezime;
    }
    @Override
    public String toString() {
        System.out.println(this.ime+"-"+this.prezime);
        return null;
    }
}
