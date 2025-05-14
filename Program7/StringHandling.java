public class StringHandling 
{
    public static void main(String[] args) 
    {
        String str1 = "Hello";
        String str2 = "World";
        String concatenatedStr = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenatedStr);
        System.out.println("Length of String: " + concatenatedStr.length());
        System.out.println("Character at index 4: " + concatenatedStr.charAt(4));
        System.out.println("Are str1 and str2 equal? " + str1.equals(str2));
        System.out.println("Uppercase String: " + concatenatedStr.toUpperCase());
    }
}