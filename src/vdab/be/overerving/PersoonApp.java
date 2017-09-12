package vdab.be.overerving;

public class PersoonApp {

    public static void main(String[] args) {

        Persoon kenneth = new Persoon("Van Gijsel", "Kenneth", "Veldkant", "39A", 2550, "Kontich");
        System.out.println("Persoon: " + kenneth);

        kenneth.voegVoornamenToe("Jos", "Mon", "Louis");
        System.out.println("Persoon: " + kenneth);

        Adres adres = new Adres("Veldkant", "39A", 2550, "Kontich");
        Werknemer wn = new Werknemer("Test", "Test", adres);
        System.out.println("Werknemer: " + wn);

        Werknemer wn1 = new Werknemer("Test", "Test", adres, "Trainer Java", 888);
        Werknemer wn2 = new Werknemer("Test", "Test", adres, "Trainer Java", 888);
        Werknemer wn3 = new Werknemer("Test", "Test", adres, "Trainer Java", 888);
        Werknemer wn4 = new Werknemer("Test", "Test", adres, "Trainer Java", 888);

        System.out.println("Werknemer: " + wn1);
        System.out.println("Aantal werknemers: " + Werknemer.getCount());

        Manager m1 = new Manager("John", "Doe", adres, "Manager", 4000, 199);
        Manager m2 = new Manager("John", "Doe", adres, "Manager", 4000, 199);
        System.out.println("Manager: " + m1);

        System.out.println("Aantal managers: " + Manager.getCount());
        System.out.println("Aantal werknemers: " + Werknemer.getCount());
        System.out.println(Manager.getProcAandeelManagers());

        Persoon p = new Manager("John", "Doe", adres, "Manager", 4000, 199);
        if(p instanceof Manager){
            Manager m = (Manager) p;
            System.out.println(m.getBonus());
            System.out.println(m.getSalaris());
        }





    }
}
