public class Loewe extends Tier{
    public Loewe(String name, int alter){
        super(name, "Löwe", alter);
    }
    @Override
    public void geraeuschMachen(){
        System.out.println(getName() + " macht: ROAARRRR!");
    }
}
