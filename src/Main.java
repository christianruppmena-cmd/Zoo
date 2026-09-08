
public class Main {
    public static void main(String[] args) {

        Loewe simba = new Loewe("Simba", 5);
        Elefant dumbo = new Elefant("Dumbo",12);
        Affe charly = new Affe("Charly", 4);
        Baer balu = new Baer("Balu", 7);

        Gehege loewenGehege = new Gehege("Löwengehege");
        Gehege elefantenGehege = new Gehege("Elefantengehege");
        Gehege affenGehege = new Gehege("Affengehege");
        Gehege baerenGehege = new Gehege("Bärengehege");

        loewenGehege.tierHinzufuegen(simba);
        elefantenGehege.tierHinzufuegen(dumbo);
        affenGehege.tierHinzufuegen(charly);
        baerenGehege.tierHinzufuegen(balu);

        Zoo zoo = new Zoo();

        zoo.gehegeHinzufuegen(loewenGehege);
        zoo.gehegeHinzufuegen(elefantenGehege);
        zoo.gehegeHinzufuegen(affenGehege);
        zoo.gehegeHinzufuegen(baerenGehege);


        zoo.alleTiereAnzeigen();
        zoo.alleGeraeuscheMachen();

    }
}