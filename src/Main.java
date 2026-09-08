
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




        System.out.println("Name: " + tier1.name);
        System.out.println("Art: " + tier1.art);
        System.out.println("Alter: " + tier1.alter);

        System.out.println("Name: " + tier2.name);
        System.out.println("Art: " + tier2.art);
        System.out.println("Alter: " + tier2.alter);

        System.out.println("Name: " + tier3.name);
        System.out.println("Art: " + tier3.art);
        System.out.println("Alter: " + tier3.alter);


    }
}