import java.util.ArrayList;


public class Zoo {
    private ArrayList<Gehege> gehege = new ArrayList<>();

    public void gehegeHinzufuegen(Gehege gehege){
        this.gehege.add(gehege);
    }

    public void alleTiereAnzeigen(){
        for (Gehege gehege : this.gehege){
            gehege.alleTiereAnzeigen();
        }
    }

    public void alleGeraeuscheMachen(){
        for (Gehege gehege : this.gehege){
            gehege.alleGeraeuschMachen();
        }
    }

    public void alleGehegeAnzeigen(){
        for (Gehege gehege : this.gehege){
            gehege.kurzAnzeigen();
        }
    }

    public int anzahlTiere(){
        int anzahl = 0;

        for (Gehege gehege : this.gehege){
            anzahl += gehege.anzahlTiere();
        }
        return anzahl;
    }
    public Tier tierSuchen(String gesuchterName) {
        for (Gehege gehege : this.gehege) {
            Tier tier = gehege.tierSuchen(gesuchterName);

            if (tier != null) {
                return tier;
            }
        }

        return null;
    }

    public Gehege gehegeVonTier(String gesuchterName){
        for (Gehege gehege : this.gehege) {
            Tier tier = gehege.tierSuchen(gesuchterName);

            if (tier != null) {
                return gehege;
            }
        }
        return null;
    }

    public boolean tierEntfernen(String gesuchterName) {
        for (Gehege gehege : this.gehege) {
            if (gehege.tierEntfernen(gesuchterName)) {
                return true;
            }
        }
        return false;
    }


    public void alleTiereFuettern(){
        for (Gehege gehege : this.gehege){
            gehege.alleTiereFuettern();
        }
    }
    public Gehege gehegeSuchen(int id){
        for (Gehege gehege : this.gehege){
            if(gehege.getID() == id){
                return gehege;
            }
        }
        return null;
    }
}
