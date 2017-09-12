package vdab.be.overerving;

public class Adres {
    private String straat;
    private String nummer;
    private int postcode;
    private String gemeente;

    public Adres(String straat, String nummer, int postcode, String gemeente) {
        this.straat = straat;
        this.nummer = nummer;
        this.postcode = postcode;
        this.gemeente = gemeente;
    }

    public Adres() {
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getGemeente() {
        return gemeente;
    }

    public void setGemeente(String gemeente) {
        this.gemeente = gemeente;
    }

    @Override
    public String toString() {
        return straat + " " +  nummer + "\n" + postcode + " " + gemeente ;
    }
}
