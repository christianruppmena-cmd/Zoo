
public class Main {
    public static void main(String[] args) {
        Tier tier1 = new Tier("Simba", "Löwe", 5, "ROOAAARRR!!");
        Tier tier2 = new Tier("Dumbo", "Elefant", 12, "TÖRÖÖÖÖ!!");
        Tier tier3 = new Tier("Charly", "Affe", 4 , "UH UH AH AH !!");
        Tier tier4 = new Tier("Balu", "Bär", 7, "BRUMM!!");
        Loewe simba = new Loewe("Simba", 5);
        Elefant dumbo = new Elefant("Dumbo",12);
        Affe charly = new Affe("Charly", 4);
        Baer balu = new Baer("Balu", 7);

        tier1.anzeigen();
        tier2.anzeigen();
        tier3.anzeigen();
        tier4.anzeigen();
        simba.anzeigen();
        dumbo.anzeigen();
        charly.anzeigen();
        balu.anzeigen();

        tier1.geraeuschMachen();
        tier2.geraeuschMachen();
        tier3.geraeuschMachen();
        tier4.geraeuschMachen();
        simba.geraeuschMachen();
        dumbo.geraeuschMachen();
        charly.geraeuschMachen();
        balu.geraeuschMachen();





    }
}