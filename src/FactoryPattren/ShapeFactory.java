package FactoryPattren;

public class ShapeFactory {

    public Shape getShape(String obj){
        switch (obj){
            case "circle":
                return new Circle();
            case "square":
                return  new Square();
            default:
                return null;
        }
    }
}
