package jdh.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Represents a user
 *
 * @author John Den Hartog
 */
public class User {
    private int id;
    private String username;
    private String password;
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
     * @param password the password
     */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
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
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
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
}
