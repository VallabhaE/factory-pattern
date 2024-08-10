import Pizza.BasePizze;
import Pizza.VegPizza;

public class  Main {
    public static void main(String[] args) {

        BasePizze vegPizza = new Mushroom(new Cheese(new VegPizza()));
        System.out.println(vegPizza.cost());
    }
}

