package shapes;
public class Rectangle 
{
    int length, width;
    public void setDimensions(int l, int w) 
    {
        length = l;
        width = w;
    }
    public int calculateArea() 
    {
        return length * width;
    }
}