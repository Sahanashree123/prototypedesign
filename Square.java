public class Square extends Shape{
    private double dim;
    public Square()
    {
        super("Square");
    }
    public void setDimension(double dim)
    {
        this.dim = dim;
    }
    public double getArea()
    {
        return dim * dim;
    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        Square clonedSquare =new Square();
        return clonedSquare;
    }
}
