package vdab.be.overerving;

public class Werknemer extends Persoon {
    private String functie;
    private double salaris;

    public static final double MIN_SALARIS = 1000;

    private static int count = 0;

    public Werknemer(String naam, String voornaam, Adres adres, String functie, double salaris) {
        super(naam, voornaam, adres);
        this.functie = functie;
        setSalaris(salaris);
        count++;
    }

    public Werknemer(String naam, String voornaam, Adres adres) {
        this(naam, voornaam, adres,"algemeen bediende",1800);
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public double getSalaris() {
        return salaris;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris >= MIN_SALARIS ? salaris : MIN_SALARIS;
    }

    public static double getMinSalaris() {
        return MIN_SALARIS;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + functie + "\n" +salaris;
    }




}
