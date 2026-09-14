import java.util.Scanner;


public class Main {
    public static Tier tierErstellen(int tierAuswahl, String name, int alter){
        Tier neuesTier;
        switch (tierAuswahl){
            case 1 :
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
            case 5:
                neuesTier = new Tiger(name, alter);
                break;
            default:
                System.out.println("Ungültige Tierart");
                neuesTier = null;
        }
        return neuesTier;
    }



    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Loewe simba = new Loewe("Simba", 5);
        Elefant dumbo = new Elefant("Dumbo", 12);
        Affe charly = new Affe("Charly", 4);
        Baer balu = new Baer("Balu", 7);
        Tiger khan = new Tiger("Shere Khan", 6);



        Gehege loewenGehege = new Gehege("Löwengehege","Löwe");
        Gehege elefantenGehege = new Gehege("Elefantengehege","Elefant");
        Gehege affenGehege = new Gehege("Affengehege", "Affe");
        Gehege baerenGehege = new Gehege("Bärengehege","Bär");
        Gehege tigerGehege = new Gehege("Tigergehege","Tiger");

        loewenGehege.tierHinzufuegen(simba);
        elefantenGehege.tierHinzufuegen(dumbo);
        affenGehege.tierHinzufuegen(charly);
        baerenGehege.tierHinzufuegen(balu);
        tigerGehege.tierHinzufuegen(khan);

        Zoo zoo = new Zoo();

        zoo.gehegeHinzufuegen(loewenGehege);
        zoo.gehegeHinzufuegen(elefantenGehege);
        zoo.gehegeHinzufuegen(affenGehege);
        zoo.gehegeHinzufuegen(baerenGehege);
        zoo.gehegeHinzufuegen(tigerGehege);




        int auswahl = 0;

        while (auswahl != 9) {
            System.out.println("========================");
            System.out.println("        MEIN ZOO");
            System.out.println("========================");
            System.out.println("1. Alle Tiere anzeigen");
            System.out.println("2. Alle Geräusche");
            System.out.println("3. Gehege anzeigen");
            System.out.println("4. Alle Tiere füttern");
            System.out.println("5. Neues Tier hinzufügen");
            System.out.println("6. Tier suchen");
            System.out.println("7. Tier entfernen");
            System.out.println("8. Tier umbenennen");
            System.out.println("9. Programm beenden");
            System.out.print("Bitte wählen: ");

            if(scanner.hasNextInt()){
                auswahl = scanner.nextInt();
                scanner.nextLine();
            }
            else {
                System.out.println("Ungültige Eingabe! Bitte eine Zahl eingeben.");
                scanner.nextLine();
                continue;
            }
            switch (auswahl) {
                case 1:
                    zoo.alleTiereAnzeigen();
                    break;

                case 2:
                    zoo.alleGeraeuscheMachen();
                    break;

                case 3:
                    System.out.println("1. Alle Gehege anzeigen");
                    System.out.println("2. Bestimmtes Gehege anzeigen");
                    int gehegeAuswahl;

                    if (scanner.hasNextInt()) {
                        gehegeAuswahl = scanner.nextInt();
                        scanner.nextLine();
                    } else {
                        System.out.println("Ungültige Eingabe! Bitte eine Zahl eingeben.");
                        scanner.nextLine();
                        break;
                    }

                    switch (gehegeAuswahl) {
                        case 1:
                            // alle Gehege
                            zoo.alleGehegeAnzeigen();
                            System.out.println("Anzahl Tiere im Zoo: " + zoo.anzahlTiere());
                            break;
                        case 2:
                            // bestimmtes Gehege
                            System.out.print("Welche Gehege-ID möchtest du anzeigen? ");

                            int gehegeID;

                            if (scanner.hasNextInt()) {
                                gehegeID = scanner.nextInt();
                                scanner.nextLine();
                            } else {
                                System.out.println("Ungültige Eingabe! Bitte eine Zahl eingeben.");
                                scanner.nextLine();
                                break;
                            }
                            Gehege gefundenesGehege = zoo.gehegeSuchenNachId(gehegeID);
                            if(gefundenesGehege != null){
                                System.out.println("Gehege gefunden: ");
                                System.out.println("Gehege-ID: " + gefundenesGehege.getID());
                                System.out.println("Name: " + gefundenesGehege.getName());
                                System.out.println("Tierart: " + gefundenesGehege.getTierArt());
                                System.out.println("Anzahl Tiere: " + gefundenesGehege.anzahlTiere());
                                System.out.println();
                                gefundenesGehege.alleTiereAnzeigen();
                            }else{
                                System.out.println("Gehege nicht gefunden.");
                            }
                            break;

                        default:
                            System.out.println("Ungültige Auswahl! ");
                    }



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
                    System.out.println("5. Tiger");
                    System.out.print("Bitte wählen: ");

                    int tierAuswahl;

                    if (scanner.hasNextInt()){
                        tierAuswahl = scanner.nextInt();
                    }else{
                        System.out.println("Ungültige Eingabe! Bitte eine Zahl eingeben.");
                        scanner.nextLine();
                        break;
                    }


                    if (tierAuswahl < 1 || tierAuswahl > 5) {
                        System.out.println("Ungültige Tierart!");
                        break;
                    }
                    scanner.nextLine();

                    System.out.print("Name des Tieres: ");

                    String name = scanner.nextLine();
                    if(name.isBlank()){
                        System.out.println("Der Name darf nicht leer sein!");
                        break;
                    }

                    System.out.print("Alter des Tieres: ");
                    int alter;
                    if (scanner.hasNextInt()){
                        alter = scanner.nextInt();
                    }else{
                        System.out.println("Ungültige Eingabe! Bitte eine Zahl eingeben.");
                        scanner.nextLine();
                        break;
                    }
                    if (alter < 0) {
                        System.out.println("Das Alter darf nicht negativ sein!");
                        break;
                    }

                    Tier neuesTier = tierErstellen(tierAuswahl, name, alter);
                    Gehege gehege = zoo.gehegeVonTier(neuesTier);


                    if (gehege != null) {
                        gehege.tierHinzufuegen(neuesTier);
                        System.out.println(name + " wurde zum Zoo hinzugefügt. ");
                    }


                    break;
                case 6:
                    System.out.print("Welches Tier möchtest du suchen? ");
                    String gesuchterName = scanner.nextLine();

                    Tier gefundenesTier = zoo.tierSuchen(gesuchterName);
                    Gehege gefundenesGehege = zoo.gehegeVonTier(gesuchterName);

                    if (gefundenesTier != null) {
                        System.out.println("Tier gefunden:");
                        gefundenesTier.anzeigen();
                        System.out.println("Gehege: " + gefundenesGehege.getName());
                        System.out.println("Gehege-ID: " + gefundenesGehege.getID());
                    } else {
                        System.out.println("Tier nicht gefunden.");
                    }

                    break;

                case 7:
                    System.out.print("Welches Tier möchtest du entfernen? ");
                    String zuEntfernenderName = scanner.nextLine();

                    boolean entfernt = zoo.tierEntfernen(zuEntfernenderName);

                    if (entfernt){
                        System.out.println(zuEntfernenderName + " wurde aus dem Zoo entfernt!");
                    }else{
                        System.out.println("Tier nicht gefunden.");
                    }
                    break;


                case 8:
                    System.out.print("Welches Tier möchten Sie umbenennen ? ");
                    String alterName = scanner.nextLine();

                    Tier tierZumUmbenennen = zoo.tierSuchen(alterName);

                    if(tierZumUmbenennen != null){
                        System.out.print("Neuer Name: ");
                        String neuerName = scanner.nextLine();
                        if(neuerName.isBlank()){
                            System.out.println("Der Name darf nicht leer sein!");
                            break;
                        }
                        tierZumUmbenennen.setName(neuerName);
                    }else{
                        System.out.println("Tier nicht gefunden.");
                    }
                    break;



                case 9:
                    System.out.println("Zoo wird beendet.");
                    break;

                default:
                    System.out.println("Ungültige auswahl !");
            }
        }


    }
}