package abstract_abstract_class_demo;

public class RevatureEMS extends EMS{
    @Override
    public void createEmployee() {
        System.out.println("Revature Employee was created in Oracle DB");
    }

    @Override
    public void updateEmployee() {
        System.out.println("Revature Employee was updated in Oracle DB");
    }

    @Override
    public void searchEmployee() {
        System.out.println("Revature Employee retrieved from Oracle DB");
    }

    @Override
    public void removeEmployee() {
        System.out.println("Revature Employee was removed from Oracle DB");
    }
}
