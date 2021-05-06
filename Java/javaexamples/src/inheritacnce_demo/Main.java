package inheritacnce_demo;

public class Main {
    public static void main(String[] args) {
        Person p1=new Person(100, "Dinesh", 22);
        System.out.println(p1);
        System.out.println(p1.toString());//same

        Project pr1=new Project(101, "falcon", "clint", 101, "Benjimen", 27, "coder", 45000);
        Employee e1=new Employee(101,"Rajesh", 25, "Trainer", 12333.33);
        System.out.println(e1);
        System.out.println(pr1);
    }
}
