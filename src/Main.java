
public class Main {
    public static void main(String[] args) {
        Tier tier1 = new Tier();
        Tier tier2 = new Tier();
        Tier tier3 = new Tier();

        tier1.name = "Simba";
        tier1.art = "Löwe";
        tier1.alter = 5;
        tier1.geraeusch = "ROAARRR!";

        tier2.name = "Dumbo";
        tier2.art = "Elefant";
        tier2.alter = 12;
        tier2.geraeusch = "TÖRRRÖÖÖÖ!";

        tier3.name = "Charly";
        tier3.art = "Affe";
        tier3.alter = 4;
        tier3.geraeusch = "UH UH AH AH!";

        tier1.anzeigen();
        tier2.anzeigen();
        tier3.anzeigen();

        tier1.geraeuschMachen();
        tier2.geraeuschMachen();
        tier3.geraeuschMachen();







    }
}