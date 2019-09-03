package go;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
      //================singgel opject================================

       //illegal construct
      //Compile Time Error: The constructor SingleObject() is not visible
      //SingleObject object = new SingleObject();

      //Get the only object available
      SingleObject object = SingleObject.getInstance();

      //show the message
      object.showMessage();


      //================================================================
       //get rounded shape factory
       AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
       //get an object of Shape Rounded Rectangle
       Shape shape1 = shapeFactory.getShape("RECTANGLE");
       //call draw method of Shape Rectangle
       shape1.draw();
       //get an object of Shape Rounded Square 
       Shape shape2 = shapeFactory.getShape("SQUARE");
       //call draw method of Shape Square
       shape2.draw();
       //get rounded shape factory
       AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
       //get an object of Shape Rectangle
       Shape shape3 = shapeFactory1.getShape("RECTANGLE");
       //call draw method of Shape Rectangle
       shape3.draw();
       //get an object of Shape Square 
       Shape shape4 = shapeFactory1.getShape("SQUARE");
       //call draw method of Shape Square
       shape4.draw();
       
    }
 }