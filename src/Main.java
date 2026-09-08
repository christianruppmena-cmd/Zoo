import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tier simba = new Loewe("Simba", 5);
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

        simba.geraeuschMachen();

        zoo.alleTiereAnzeigen();
        zoo.alleGeraeuscheMachen();

        int auswahl = 0;

        while (auswahl !=3) {
            System.out.println("========================");
            System.out.println("        MEIN ZOO");
            System.out.println("========================");
            System.out.println("1. Alle Tiere anzeigen");
            System.out.println("2. Alle Geräusche");
            System.out.println("3. Gehege anzeigen");
            System.out.println("4. Programm beenden");
            System.out.print("Bitte wählen: ");

            auswahl = scanner.nextInt();
            switch (auswahl) {
                case 1:
                    zoo.alleTiereAnzeigen();
                    break;

                case 2:
                    zoo.alleGeraeuscheMachen();
                    break;

                case 3:
                    zoo.alleGehegeAnzeigen();
                    break;


                case 4:
                    System.out.println("Zoo wird beendet.");
                    break;

                default:
                    System.out.println("Ungültige auswahl !");
            }
        }




    }
}