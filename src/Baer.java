public class Baer extends Tier{
    public Baer(String name, int alter){
        super(name,"Bär", alter, "BRUMM!!");
    }
    @Override
    public void geraeuschMachen(){
        System.out.println(getName() + " macht: BRUMMM!");
    }
}
