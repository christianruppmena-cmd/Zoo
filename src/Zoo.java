import java.util.ArrayList;


public class Zoo {
    ArrayList<Gehege> gehege = new ArrayList<>();

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


    void alleTiereFuettern(){
        for (Gehege gehege : this.gehege){
            gehege.alleTiereFuettern();
        }
    }
}
