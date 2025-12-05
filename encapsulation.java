class Employee {
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Rahul");
        System.out.println(e.getName());
    }
}