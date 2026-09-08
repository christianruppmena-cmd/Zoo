
public class Main {
    public static void main(String[] args) {
        Tier tier1 = new Tier();
        Tier tier2 = new Tier();
        Tier tier3 = new Tier();

        tier1.name = "Simba";
        tier1.art = "Löwe";
        tier1.alter = 5;

        tier2.name = "Dumbo";
        tier2.art = "Elefant";
        tier2.alter = 12;

        tier3.name = "Charly";
        tier3.art = "Affe";
        tier3.alter = 4;

        tier1.anzeigen();
        tier2.anzeigen();
        tier3.anzeigen();







    }
}