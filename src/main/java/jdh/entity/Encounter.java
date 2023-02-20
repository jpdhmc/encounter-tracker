package jdh.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Represents an encounter
 *
 * @author John Den Hartog
 */
public class Encounter {
    private int id;
    private String encounterName;
    private User user;
    private Set<Creature> creatures = new HashSet<>();

    /**
     * No-arg constructor
     */
    public Encounter() {
    }

    /**
     * Instantiates a new encounter
     *
     * @param encounterName the encounter name
     * @param user          the user
     */
    public Encounter(String encounterName, User user) {
        this.encounterName = encounterName;
        this.user = user;
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
     * Gets encounter name.
     *
     * @return the encounter name
     */
    public String getEncounterName() {
        return encounterName;
    }

    /**
     * Sets encounter name.
     *
     * @param encounterName the encounter name
     */
    public void setEncounterName(String encounterName) {
        this.encounterName = encounterName;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Gets creatures.
     *
     * @return the creatures
     */
    public Set<Creature> getCreatures() {
        return creatures;
    }

    /**
     * Sets creatures.
     *
     * @param creatures the creatures
     */
    public void setCreatures(Set<Creature> creatures) {
        this.creatures = creatures;
    }
}
