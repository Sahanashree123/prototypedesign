public class Rectangle extends Shape{
    private double length;
    private double breadth;
    public Rectangle()
    {
        super("Rectangle");
    }
    public void setLength(int length)
    {
        this.length =length;
    }
    public void setBreadth(int breadth)
    {
        this.breadth = breadth;
    }
    public double getArea()
    {
        return length * breadth;
    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        Rectangle clonedRectangle =new Rectangle();
        return clonedRectangle;
    }
    
}
