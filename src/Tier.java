public abstract class Tier {
    private String name;
    private String art;
    private int alter;


    public Tier(String name, String art, int alter){
        this.name = name;
        this.art = art;
        this.alter = alter;

    }

    void anzeigen(){

        System.out.println("Name: " + name);
        System.out.println("Art: " + art);
        System.out.println("Alter: " + alter);
    }
    public abstract void geraeuschMachen();

    public abstract void fuettern();
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
        if (alter >= 0) {
        this.alter = alter;}
        else {
            System.out.println("Alter darf nicht negativ sein!");
        }
    }


}
