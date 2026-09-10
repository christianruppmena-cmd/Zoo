import java.util.ArrayList;


public class Zoo {
    private ArrayList<Gehege> gehege = new ArrayList<>();

    void gehegeHinzufuegen(Gehege gehege){
        this.gehege.add(gehege);
    }

    void alleTiereAnzeigen(){
        for (Gehege gehege : this.gehege){
            gehege.alleTiereAnzeigen();
        }
    }

    void alleGeraeuscheMachen(){
        for (Gehege gehege : this.gehege){
            gehege.alleGeraeuschMachen();
        }
    }

    void alleGehegeAnzeigen(){
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


    void alleTiereFuettern(){
        for (Gehege gehege : this.gehege){
            gehege.alleTiereFuettern();
        }
    }
}
