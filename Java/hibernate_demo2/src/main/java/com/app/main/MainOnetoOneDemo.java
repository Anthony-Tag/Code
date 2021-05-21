package com.app.main;


import com.app.model.Player;
import com.app.model.Team;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class MainOnetoOneDemo {
    public static void main(String[] args) {
        Configuration configuration=new Configuration().configure();
        StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory factory=configuration.buildSessionFactory(builder.build());
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();

        Team t1=new Team("Delhi Capitals");
        Player p1=new Player("Dinesh","Delhi",22);
        p1.setTeam(t1);

        Player p2=new Player("rash","Delhi",23);
        p2.setTeam(t1);

        session.save(p1);
        session.save(p2);

        transaction.commit();
        session.close();
        factory.close();
    }
}
