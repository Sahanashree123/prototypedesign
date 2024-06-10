public class Shape implements Cloneable{
    protected String shapeName;
    protected String description;
    protected double area;
    public Shape(String shapeName)
    {
        this.shapeName= shapeName;
        this.description ="This class is about "+  shapeName;
    }
    public String getShapeName(){
        return this.shapeName;
    }
    public String getDescription(){
        return this.description;
    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        Shape clonedShape =new Shape(this.shapeName);
        return clonedShape;
    }
    
}
