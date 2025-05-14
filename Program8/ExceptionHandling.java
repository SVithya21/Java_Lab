public class ExceptionHandling 
{
    public static void main(String[] args) 
    {
        try 
        {
            int a = 10, b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Division by zero is not allowed.");
        }
        try 
        {
            String str = "Java";
            char ch = str.charAt(10);
            System.out.println("Character: " + ch);
        } 
        catch (StringIndexOutOfBoundsException e) 
        {
            System.out.println("Error: Index out of bounds for the string.");
        }
    }
}