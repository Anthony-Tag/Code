package abstract_abstract_class_demo;

public class Main {
    public static void main(String[] args) {
        RevatureEMS rems=new RevatureEMS();
        rems.createEmployee();
        rems.updateEmployee();
        rems.searchEmployee();
        rems.commonEmpFeature();
        rems.removeEmployee();

        CtsEmployee cems=new CtsEmployee();
        cems.createEmployee();
        cems.updateEmployee();
        cems.searchEmployee();
        cems.commonEmpFeature();
        cems.removeEmployee();
    }
}
