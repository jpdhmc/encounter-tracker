package jdh.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Represents a user
 *
 * @author John Den Hartog
 */
@Entity(name = "User")
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "username")
    private String username;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Encounter> encounters = new HashSet<>();

    /**
     * No-arg constructor
     */
    public User() {
    }

    /**
     * Instantiates a new user
     *
     * @param username the username
     */
    public User(String username) {
        this.username = username;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets encounters.
     *
     * @return the encounters
     */
    public Set<Encounter> getEncounters() {
        return encounters;
    }

    /**
     * Sets encounters.
     *
     * @param encounters the encounters
     */
    public void setEncounters(Set<Encounter> encounters) {
        this.encounters = encounters;
    }

    public void addEncounter(Encounter encounter) {
        encounters.add(encounter);
        encounter.setUser(this);
    }

    public void removeEncounter(Encounter encounter) {
        encounters.remove(encounter);
        encounter.setUser(null);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
