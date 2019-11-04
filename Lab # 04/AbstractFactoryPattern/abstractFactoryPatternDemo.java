package abstractfactorypatterndemo;
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory =  FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("Circle");
        shape3.draw();
        
        AbstractFactory colorFactory = FactoryProducer.getFactory(true);
        Color color1  = colorFactory.getColor("Red");
        color1.fill();
        Color color2  = colorFactory.getColor("Green");
        color2.fill();
        Color color3  = colorFactory.getColor("Blue");
        color3.fill();
    }
}
