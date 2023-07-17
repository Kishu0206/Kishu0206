package Firstassignmentjava;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

public class CallByreferenceExample {
    public static void main(String[] args) {
        Person person = new Person("Kishan kumara");
        System.out.println("Before calling the method: " + person.name);

        // Calling the method
        changeName(person);

        System.out.println("After calling the method: " + person.name);
    }

    public static void changeName(Person p) {
        p.name = "Kumara Kishan"; // Modifying the object's property
    }
}

