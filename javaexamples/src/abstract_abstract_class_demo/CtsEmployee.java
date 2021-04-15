package abstract_abstract_class_demo;

public class CtsEmployee extends EMS{
    @Override
    public void createEmployee() {
        System.out.println("CTS Emp was added in MYSQL DB");
    }

    @Override
    public void updateEmployee() {
        System.out.println("CTS Emp was updated in MYSQL DB");
    }

    @Override
    public void searchEmployee() {
        System.out.println("CTS Emp was retrived in MYSQL DB");
    }

    @Override
    public void removeEmployee() {
        System.out.println("CTS Emp was removed from in MYSQL DB");
    }
}
