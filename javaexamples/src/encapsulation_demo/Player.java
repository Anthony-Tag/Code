package encapsulation_demo;

public class Player {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
/*
1)Encapsulated Class
2)Model Class
3)POJO(Plain Old Java Object) class
4)Spring -> Bean class this class
5)DTO class -> Data Transfer Object
6)DVO or VO class -> Data Value Object class or Value Object class
 */
