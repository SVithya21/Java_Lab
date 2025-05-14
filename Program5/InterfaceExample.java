interface Animal 
{
    void makeSound();
}
class Dog implements Animal 
{
    public void makeSound() 
    {
        System.out.println("Dog barks");
    }
}
public class InterfaceExample 
{
    public static void main(String[] args) 
    {
        Dog myDog = new Dog();
        myDog.makeSound();
    }
}