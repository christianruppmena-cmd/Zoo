import java.util.ArrayList;


public class Zoo {
    ArrayList<Tier> tiere = new ArrayList<>();

    void tierHinzufuegen(Tier tier){
        tiere.add(tier);
    }

    void alleTiereAnzeigen(){
        for (Tier tier : tiere){
            tier.anzeigen();
        }
    }

    void alleGeraeuscheMachen(){
        for (Tier tier : tiere){
            tier.geraeuschMachen();
        }
    }
}
