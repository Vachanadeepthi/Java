
    class Student {
    String name;
    int age;


    Student() {
        name = "Unknown";
        age = 0;
    }

    
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " - " + age);
    }
}

public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();          // calls default constructor
        Student s2 = new Student("John", 21); // calls parameterized constructor

        s1.display();
        s2.display();
    }
}


