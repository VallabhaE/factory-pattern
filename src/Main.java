import FactoryPattren.Shape;
import FactoryPattren.ShapeFactory;

public class  Main {
    public static void main(String[] args) {
        ShapeFactory sh = new ShapeFactory();
        Shape Obj = sh.getShape("circle");
        Obj.Draw();
    }
}

