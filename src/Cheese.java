import Pizza.BasePizze;

public class Cheese extends Topping{
    BasePizze obj;
    public Cheese(BasePizze o){
        obj = o;
    }
    @Override
    public int cost() {
        return obj.cost()+25;
    }
}
