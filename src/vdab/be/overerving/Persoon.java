package vdab.be.overerving;

public class Persoon {
    private String naam;

    private String voornaam;
    private Adres adres;

    public Persoon(String naam, String voornaam, Adres adres) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.adres = adres;
    }

    public Persoon(String naam, String voornaam, String straat, String nummer, int postcode, String gemeente){
        this(naam, voornaam, new Adres(straat, nummer, postcode, gemeente));
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public void voegVoornamenToe(String ...voornamen){
        for (String vn: voornamen){
            voornaam = voornaam + " " + vn;
        }
    }

//    of: public void voegVoornamenToe(String ...voornamen){
//          StringBuilder builder = new StringBuilder(voornaam);
//              for (String vn: voornamen){
//               builder.append(" ").append(vn);}
//              this.setVoornaam(builder.toString())}

    @Override
    public String toString() {
        return voornaam + " " + naam + "\n" +
                adres.getStraat() + " " + adres.getNummer() + "\n" +
                adres.getPostcode() + " " + adres.getGemeente() ;

    }

    //    "String...voornamen" wil zeggen dat de argumenten die worden megegeven een onbepaald aantal Strings zijn.
//    "voornamen" is een soort array. Als er vb 3 voornamen meegegeven zijn, kan je die oproepen met voornamen[i] waar i=0,1 of 2.
}
