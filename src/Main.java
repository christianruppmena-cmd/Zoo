
public class Main {
    public static void main(String[] args) {
        Tier tier1 = new Tier("Simba", "Löwe", 5, "ROOAAARRR!!");
        Tier tier2 = new Tier("Dumbo", "Elefant", 12, "TÖRÖÖÖÖ!!");
        Tier tier3 = new Tier("Charly", "Affe", 4 , "UH UH AH AH !!");
        Tier tier4 = new Tier("Balu", "Bär", 7, "BRUMM!!");

        tier1.anzeigen();
        tier2.anzeigen();
        tier3.anzeigen();
        tier4.anzeigen();

        tier1.geraeuschMachen();
        tier2.geraeuschMachen();
        tier3.geraeuschMachen();
        tier4.geraeuschMachen();

        System.out.println(tier1.getName());
        tier1.setName("Leo");
        System.out.println(tier1.getName());






    }
}