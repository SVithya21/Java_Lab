import shapes.Rectangle;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        System.out.print("Enter length: ");
        int length = scanner.nextInt();
        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        rect.setDimensions(length, width);
        System.out.println("Area of Rectangle: " + rect.calculateArea());
        scanner.close();
    }
}