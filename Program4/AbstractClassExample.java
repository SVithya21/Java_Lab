abstract class Shape 
{
    abstract void calculateArea();
}
    class Rectangle extends Shape 
    {
        int length, width;
        void setValues(int l, int w) 
        {
            length = l;
            width = w;
        }
        void calculateArea() 
        {
            int area = length * width;
            System.out.println("Area of Rectangle: " + area);
        }
    }
    public class AbstractClassExample 
    {
    public static void main(String[] args) 
    {
        Rectangle rect = new Rectangle();
        rect.setValues(10, 5);
        rect.calculateArea();
    }
}