package app;

public class Main {
    public static void main(String[] args) {

        // Create three Person objects with different names, ages, and professions
        Person person1 = new Person("John", 30, "Engineer");
        Person person2 = new Person("Mary", 25, "Teacher");
        Person person3 = new Person("Bob", 35, "Doctor");

        // Display the information of the first three persons
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        // Create another Person object with the name Alice
        Person person4 = new Person("Alice", 28, "Architect");

        // Print an empty line for better readability in the output
        System.out.println();

        // Display the information of the fourth person (Alice)
        person4.displayInfo();

        // Update Alice's profession to "Designer"
        person4.setProfession("Designer");

        // Indicate in the output that the profession has been updated
        System.out.println("(After profession update)");

        // Display the updated information of Alice
        person4.displayInfo();
    }
}
