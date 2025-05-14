class Person 
{
    String name;
    int age;
    void setPersonDetails(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    void displayPersonDetails() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person 
{
    int rollNumber;
    void setStudentDetails(int rollNumber) 
    {
        this.rollNumber = rollNumber;
    }
    void displayStudentDetails() 
    {
        displayPersonDetails();
        System.out.println("Roll Number: " + rollNumber);
    }
}
class CollegeStudent extends Student 
{
    String course;
    void setCourseDetails(String course) 
    {
        this.course = course;
    }
    void displayCourseDetails() 
    {
        displayStudentDetails();
        System.out.println("Course: " + course);
    }
}
public class MultilevelInheritance 
{
    public static void main(String[] args) 
    {
        CollegeStudent cs = new CollegeStudent();
        cs.setPersonDetails("Alice", 21);
        cs.setStudentDetails(101);
        cs.setCourseDetails("MCA");
        cs.displayCourseDetails();
    }
}