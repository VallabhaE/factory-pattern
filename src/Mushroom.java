import Pizza.BasePizze;

public class Mushroom extends Topping {
    BasePizze obj;
    public Mushroom(BasePizze o){
        obj = o;
    }
    @Override
    public int cost() {
        return obj.cost()+55;
    }

}
