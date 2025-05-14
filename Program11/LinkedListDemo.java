import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a LinkedList to store strings
        LinkedList<String> students = new LinkedList<>();
        
        // Add elements to the LinkedList
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        
        // Add element at specific position
        students.add(1, "David");
        
        // Display the LinkedList
        System.out.println("LinkedList contents: " + students);
        
        // Remove an element
        students.remove("Bob");
        
        // Get first and last elements
        System.out.println("First student: " + students.getFirst());
        System.out.println("Last student: " + students.getLast());
        
        // Iterate through the LinkedList
        System.out.println("\nAll students:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}