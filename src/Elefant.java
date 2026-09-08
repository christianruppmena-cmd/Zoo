public class Elefant extends Tier{
    public Elefant(String name, int alter){
        super(name, "Elefant", alter);
    }
    @Override
    public void geraeuschMachen(){
        System.out.println(getName() + " macht: TÖRÖÖÖÖÖ!");
    }
}
