import java.util.ArrayList;
import java.util.Iterator;

public class Gehege {

    private static int naechsteID = 1;

    private int id;
    private String name;
    private ArrayList<Tier> tiere = new ArrayList<>();
    private String tierArt;


    public Gehege(String name,  String tierArt) {
        this.id = naechsteID;
        naechsteID++;
        this.name = name;
        this.tierArt = tierArt;
    }
    public String getName(){
        return name;
    }
    public int getID(){return id;}
    public String getTierArt(){return tierArt;}

    public void tierHinzufuegen(Tier tier){
        if(passtZuTier(tier)){
            tiere.add(tier);
        }else{
            System.out.println("Diese Tier gehört nicht in dieses Gehege!");
        }

    }

    public int anzahlTiere(){
        return tiere.size();
    }

    public void alleTiereAnzeigen(){
        for(Tier tier : tiere){
            tier.anzeigen();
        }
    }

    public void kurzAnzeigen(){
        System.out.println("Gehege "+ id +" : " + name);
        System.out.println("Anzahl Tiere: " + anzahlTiere());

        for (Tier tier : tiere){
            System.out.println(" - " + tier.getName());
        }
    }
    public void alleGeraeuschMachen(){
        for(Tier tier : tiere){
            tier.geraeuschMachen();
        }
    }

    public void alleTiereFuettern(){
        for(Tier tier : tiere){
            tier.fuettern();
        }
    }
    public Tier tierSuchen(String gesuchterName) {
        for (Tier tier : tiere) {
            if (tier.getName().equalsIgnoreCase(gesuchterName)) {
                return tier;
            }
        }

        return null;
    }
    public boolean tierEntfernen(String gesuchterName) {
        Iterator<Tier> iterator = tiere.iterator();

        while (iterator.hasNext()){
            Tier tier = iterator.next();

            if (tier.getName().equalsIgnoreCase(gesuchterName)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    public boolean passtZuTier(Tier tier){
        if(tier.getArt().equals(getTierArt())){
            return true;
        }else{
            return false;
        }
    }

}
