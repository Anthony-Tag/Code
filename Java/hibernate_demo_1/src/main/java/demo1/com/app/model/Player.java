package demo1.com.app.model;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "playerName", nullable = false, length = 1000)
    @NotNull(message = "Must not be Null")
    private String name;
    @Column(unique = true, nullable = false)
    @Min(value = 10, message = "Contact should be only 10 digits")
    private long contact;

    @Email(message = "Invalid Email")
    private String email;

    public Player() {
    }

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
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

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public Player(String name, long contact) {
        this.name = name;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact=" + contact +
                ", email='" + email + '\'' +
                '}';
    }
}
