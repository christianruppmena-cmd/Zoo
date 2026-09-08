public class Tier {
    String name;
    String art;
    int alter;
    String geraeusch;

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
}
