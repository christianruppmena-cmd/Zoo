import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tier simba = new Loewe("Simba", 5);
        Elefant dumbo = new Elefant("Dumbo", 12);
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
        simba.fuettern();


        zoo.alleTiereAnzeigen();
        zoo.alleGeraeuscheMachen();

        int auswahl = 0;

        while (auswahl != 6) {
            System.out.println("========================");
            System.out.println("        MEIN ZOO");
            System.out.println("========================");
            System.out.println("1. Alle Tiere anzeigen");
            System.out.println("2. Alle Geräusche");
            System.out.println("3. Gehege anzeigen");
            System.out.println("4. Alle Tiere füttern");
            System.out.println("5. Neues Tier hinzufügen");
            System.out.println("6. Programm beenden");
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
                    zoo.alleTiereFuettern();
                    break;

                case 5:
                    System.out.println("Welche Tierart möchten Sie hinzufügen?");
                    System.out.println("1. Löwe");
                    System.out.println("2. Elefant");
                    System.out.println("3. Affe");
                    System.out.println("4. Bär");
                    System.out.print("Bitte wählen: ");

                    int tierAuswahl = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Name des Tieres: ");
                    String name = scanner.nextLine();

                    System.out.print("Alter des Tieres: ");
                    int alter = scanner.nextInt();
                    if (alter < 0) {
                        System.out.println("Das Alter darf nicht negativ sein!");
                        break;
                    }

                    Tier neuesTier;
                    switch (tierAuswahl) {
                        case 1:
                            neuesTier = new Loewe(name, alter);
                            break;
                        case 2:
                            neuesTier = new Elefant(name, alter);
                            break;
                        case 3:
                            neuesTier = new Affe(name, alter);
                            break;
                        case 4:
                            neuesTier = new Baer(name, alter);
                            break;
                        default:
                            System.out.println("Ungültige Tierart");
                            neuesTier = null;
                    }

                    if (neuesTier != null) {
                        switch (tierAuswahl) {
                            case 1:
                                loewenGehege.tierHinzufuegen(neuesTier);
                                break;
                            case 2:
                                elefantenGehege.tierHinzufuegen(neuesTier);
                                break;
                            case 3:
                                affenGehege.tierHinzufuegen(neuesTier);
                                break;
                            case 4:
                                baerenGehege.tierHinzufuegen(neuesTier);
                                break;
                        }
                        System.out.println(name + " wurde zum Zoo hinzugefügt. ");
                    }


                    break;


                case 6:
                    System.out.println("Zoo wird beendet.");
                    break;

                default:
                    System.out.println("Ungültige auswahl !");
            }
        }


    }
}