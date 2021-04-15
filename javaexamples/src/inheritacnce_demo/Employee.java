package inheritacnce_demo;

public class Employee extends Person{
    private String designtion;
    private double salary;
    public Employee(int id, String name, int age, String designation, double salary){
        super(id, name, age);
        this.designtion = designation;
        this.salary = salary;
    }


    public String getDesigntion() {
        return designtion;
    }

    public void setDesigntion(String designtion) {
        this.designtion = designtion;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "designtion='" + designtion + '\'' +
                ", salary=" + salary +
                '}'+ super.toString();
    }

}
