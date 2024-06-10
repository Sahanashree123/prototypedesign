import java.util.HashMap;
import java.util.Map;
public class PrototypeMain
{
    public static Map<String, Shape> shapeCache = new HashMap<>();
    private static Shape getBaseShape(String shapeType) throws CloneNotSupportedException{
        if(shapeType.equalsIgnoreCase("square")){
            if(shapeCache.containsKey("square"))
            {
                Shape square = (Shape) shapeCache.get("square").clone();
                return square;
            }
            else{
                Shape square =new Square();
                shapeCache.put(shapeType,square);
                return square;
            }
        }
        else if(shapeType.equalsIgnoreCase("rectangle"))
        {
            if(shapeCache.containsKey("rectanngle"))
            {
                Shape rectangle =(Shape) shapeCache.get("rectangle").clone();
                return rectangle;
            }
            else
            {
                Rectangle rectangle =new Rectangle();
                shapeCache.put(shapeType,rectangle);
                return rectangle;
            }
        }
        return null;
    }
    public static void main(String args[]) throws CloneNotSupportedException
    {
        Square square1 = (Square) getBaseShape("square");
        Square square2 = (Square) getBaseShape("square");

        square1.setDimension(5);
        System.out.println("Square 1 area is "+ square1.getArea());

        square2.setDimension(10);
        System.out.println("Square 2 area is "+ square2.getArea());
        
        Rectangle rectangle1 = (Rectangle) getBaseShape("rectangle");
        Rectangle rectangle2 = (Rectangle) getBaseShape("rectangle");

        rectangle1.setLength(2);
        rectangle1.setBreadth(2);
        System.out.println("Rectangle 1 area is "+ rectangle1.getArea());

        rectangle2.setLength(4);
        rectangle2.setBreadth(3);
        System.out.println("Rectangle 2 area is "+ rectangle2.getArea());


    }
}