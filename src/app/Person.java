package app;

public class Person {

    // Fields to store the name, age, and profession of the person
    private String name;
    private int age;
    private String profession;

    // Constructor to initialize the fields when a new Person object is created
    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    // Method to update the profession of the person
    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }

    // Method to display the person's information in a formatted way
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Profession: " + profession);
    }
}
