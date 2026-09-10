public class Tiger extends Tier{
    public Tiger(String name, int alter){
        super(name,"Tiger",alter);
    }
    @Override
    public void geraeuschMachen(){
        System.out.println(getName() + " macht: GRRRRR!");
    }
    @Override
    public void fuettern(){
        System.out.println(getName() + " bekommt Fleisch.");
    }
}
