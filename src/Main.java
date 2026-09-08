
public class Main {
    public static void main(String[] args) {

        Loewe simba = new Loewe("Simba", 5);
        Elefant dumbo = new Elefant("Dumbo",12);
        Affe charly = new Affe("Charly", 4);
        Baer balu = new Baer("Balu", 7);

        Zoo zoo = new Zoo();

        zoo.tierHinzufuegen(simba);
        zoo.tierHinzufuegen(dumbo);
        zoo.tierHinzufuegen(charly);
        zoo.tierHinzufuegen(balu);



        zoo.alleTiereAnzeigen();
        zoo.alleGeraeuscheMachen();


        Gehege loewenGehege = new Gehege("Löwengehege");
        System.out.println(loewenGehege.getName());


        loewenGehege.tierHinzufuegen(simba);
        loewenGehege.alleTiereAnzeigen();

    }
}