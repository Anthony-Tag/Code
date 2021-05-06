package inheritacnce_demo;

public class Project extends Employee{
    private int projectId;
    private String projectName;
    private String clientName;

    public Project(int projectId, String projectName, String clientName, int id, String name, int age, String designation, double salary){
        super(id, name, age ,designation, salary);
        this.projectId = projectId;
        this.projectName = projectName;
        this.clientName = clientName;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", clientName='" + clientName + '\'' +
                '}' + super.toString();
    }
}
