package list_demo;

public class Product implements Comparable<Product> {
    private int id;
    private  String name;
    private double cost;
    private float rating;
    private long avalably;

    public Product(int id, String name, double cost, float rating, long avalably) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.rating = rating;
        this.avalably = avalably;
    }

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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public long getAvalably() {
        return avalably;
    }

    public void setAvalably(long avalably) {
        this.avalably = avalably;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", rating=" + rating +
                ", avalably=" + avalably +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        Integer i1=this.id;
        Integer i2=o.id;
        return i1.compareTo(i2);
    }
}
