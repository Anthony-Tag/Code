package encapsulation_demo;

public class PlayerMain {
    public static void main(String[] args) {

        Player p1=new Player();
        //p1.id=100;
        p1.setId(203);
        p1.setName("Hay");
        p1.setAge(22);

        printPlayer(p1);
    }
    public static void printPlayer(Player player){
        System.out.println("Printing player");
        System.out.println("ID : "+player.getId());
        System.out.println("Name : "+player.getName());
        System.out.println("Age : "+player.getAge());

    }
}
