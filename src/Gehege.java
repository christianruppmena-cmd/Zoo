import java.util.ArrayList;

public class Gehege {

    private String name;
    private ArrayList<Tier> tiere = new ArrayList<>();


    public Gehege(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void tierHinzufuegen(Tier tier){
        tiere.add(tier);
    }
    public void alleTiereAnzeigen(){
        for(Tier tier : tiere){
            tier.anzeigen();
        }
    }

    public void kurzAnzeigen(){
        System.out.println("Gehege: " + name);

        for (Tier tier : tiere){
            System.out.println(" - " + tier.getName());
        }
    }
    public void alleGeraeuschMachen(){
        for(Tier tier : tiere){
            tier.geraeuschMachen();
        }
    }
}
