public class  ColorFactory extends AbstractFactory{

    public Color getColor(String colorType)
    {
        if(colorType.equalsIgnoreCase("RED"))
        {
            return new Red();
        }
        else if(colorType.equalsIgnoreCase("BLUE"))
        {
            return new Blue();
        }
        else if(colorType.equalsIgnoreCase("Green"))
        {
            return new Green();
        }
        return null;
    }
