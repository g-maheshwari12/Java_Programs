package xyz;
public abstract class Shaping
{
    public double area;
    public Shaping()
    {
        this.area=0.0;
    }
    public abstract void calculateArea();
}
class Circle extends Shaping
{
    double r;
    Circle(double r)
    {
        this.r=r;
    }
    public void calculateArea()
    {
        area=3.14*r*r;
        System.out.println("Area of circle: " +area);
    }
}
class Rectangle extends Shaping
{
    double l,b;
    Rectangle(double le,double br)
    {
        this.l=le;
        this.b=br;
    }
    public void calculateArea()
    {
        area=l*b;
        System.out.println("ARea of Rectangle: " +area);
    }
}