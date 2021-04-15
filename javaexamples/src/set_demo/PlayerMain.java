package set_demo;

import java.util.HashSet;
import java.util.Set;

public class PlayerMain {
    public static void main(String[] args) {
        Set<Player> players=new HashSet<>();
        players.add(new Player(100,"player1"));
        players.add(new Player(101,"player1"));
        players.add(new Player(102,"player1"));
        players.add(new Player(103,"player1"));
        players.add(new Player(104,"player1"));
        players.add(new Player(100,"player1"));
        players.add(new Player(100,"player1"));
        players.add(new Player(100,"player1"));

        System.out.println("Print Players");
        System.out.println(players);
    }
}
