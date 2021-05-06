package abstract_abstract_class_demo;

public abstract class EMS {
    public abstract void createEmployee();
    public abstract void updateEmployee();
    public abstract void searchEmployee();
    public abstract void removeEmployee();

    public void commonEmpFeature(){
        System.out.println("CommonFeature for any Employee");
    }
}
