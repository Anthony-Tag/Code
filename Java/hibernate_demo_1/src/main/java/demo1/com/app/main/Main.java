package demo1.com.app.main;

import demo1.com.app.model.Player;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration=new Configuration().configure();

        StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

        SessionFactory factory=configuration.buildSessionFactory(builder.build());

        Session session=factory.openSession();

        Transaction transaction=session.beginTransaction();

        Player p1=new Player("stan",90009999);
        System.out.println(session.save(p1));
        Player p2=new Player("Mahesh",90909090);
        System.out.println(session.save(p2));
        Player p3=new Player("Sam",978787899);



        System.out.println(session.save(p3));

//        Player p=(Player)session.get(Player.class,1);
//        System.out.println(p);

        transaction.commit();
        session.close();
        factory.close();
    }
}
