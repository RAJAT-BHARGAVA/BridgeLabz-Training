class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Rajat", 22);
        Person p2 = new Person(p1);   // copy constructor cloning p1

        p1.display();
        System.out.println("Coppied Version");
        p2.display();
    }
}
