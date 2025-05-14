class Animal 
{
    void makeSound() 
    {
        System.out.println("Animals make sounds");
    }
}
class Dog extends Animal 
{
    void makeSound() 
    {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal 
{
    void makeSound() 
    {
        System.out.println("Cat meows");
    }
}
public class HierarchicalInheritance 
{
    public static void main(String[] args) 
    {
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        myDog.makeSound();
        myCat.makeSound();
    }
}