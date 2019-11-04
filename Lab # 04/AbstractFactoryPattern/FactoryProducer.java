public class FactoryProducer {
    
   public static AbstractFactory getFactory(boolean choose)
    {
       if(choose)
       {
           return new ShapeFactory();
       }
       else{
    	   
           return new ColorFactory();
       }

    }
    
}
