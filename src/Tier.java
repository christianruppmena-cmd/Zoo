public class Tier {
    private String name;
    private String art;
    private int alter;
    private String geraeusch;

    Tier(String name, String art, int alter, String geraeusch){
        this.name = name;
        this.art = art;
        this.alter = alter;
        this.geraeusch = geraeusch;
    }

    void anzeigen(){

        System.out.println("Name: " + name);
        System.out.println("Art: " + art);
        System.out.println("Alter: " + alter);
    }

    void geraeuschMachen(){
        System.out.println(name + " macht: " + geraeusch);
    }
    // Getter und Setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getGeraeusch() {
        return geraeusch;
    }

    public void setGeraeusch(String geraeusch) {
        this.geraeusch = geraeusch;
    }
}
