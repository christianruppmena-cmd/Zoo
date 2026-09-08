public class Affe extends Tier{
    public Affe(String name, int alter){
        super(name,"Affe",alter);
    }
    @Override
    public void geraeuschMachen(){
        System.out.println(getName() + " macht: UH UH AH AH!");
    }
    @Override
    public void fuettern(){
        System.out.println(getName() + " bekommt Obst.");
    }
}
