class Student
{
    String name;
    int rollNumber;
    double marks;
    // Constructor
    Student(String name, int rollNumber, double marks) 
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    // Method to display details
    void displayDetails() 
    {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) 
    {
        // Creating an object and displaying details
        Student s1 = new Student("John", 101, 89.5);
        Student s2 = new Student("Keerthi", 102, 95);
        s1.displayDetails();
        s2.displayDetails();
    }
}