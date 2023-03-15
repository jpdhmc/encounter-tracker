package jdh.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Represents a creature
 *
 * @author John Den Hartog
 */
@Entity(name = "Creature")
@Table(name = "creatures")
public class Creature {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "creaturename")
    private String creaturename;

    @ManyToOne
    private Encounter encounters;

    @Column(name = "maxhitpoints")
    private int maxhitpoints;
    @Column(name = "currenthitpoints")
    private int currenthitpoints;
    @Column(name = "initiative")
    private int initiative;

    @Column(name = "isally")
    private Boolean isally;
    @Column(name = "istrackingconditions")
    private Boolean istrackingconditions;

    // Condition Booleans
    @Column(name = "isblinded")
    private Boolean isblinded;
    @Column(name = "ischarmed")
    private Boolean ischarmed;
    @Column(name = "isdeafened")
    private Boolean isdeafened;
    @Column(name = "isfrightened")
    private Boolean isfrightened;
    @Column(name = "isstunned")
    private Boolean isstunned;
    @Column(name = "isparalyzed")
    private Boolean isparalyzed;
    @Column(name = "ispoisoned")
    private Boolean ispoisoned;
    @Column(name = "isprone")
    private Boolean isprone;
    @Column(name = "isrestrained")
    private Boolean isrestrained;
    @Column(name = "isunconscious")
    private Boolean isunconscious;

    /**
     * No-arg constructor
     */
    public Creature() {
    }

    public Creature(String creatureName, Encounter encounters, int maxhitpoints) {
        this.creaturename = creatureName;
        this.encounters = encounters;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreaturename() {
        return creaturename;
    }

    public void setCreaturename(String creaturename) {
        this.creaturename = creaturename;
    }

    public Encounter getEncounters() {
        return encounters;
    }

    public void setEncounters(Encounter encounters) {
        this.encounters = encounters;
    }

    public int getMaxhitpoints() {
        return maxhitpoints;
    }

    public void setMaxhitpoints(int maxhitpoints) {
        this.maxhitpoints = maxhitpoints;
    }

    public int getCurrenthitpoints() {
        return currenthitpoints;
    }

    public void setCurrenthitpoints(int currenthitpoints) {
        this.currenthitpoints = currenthitpoints;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public Boolean getIsally() {
        return isally;
    }

    public void setIsally(Boolean isally) {
        this.isally = isally;
    }

    public Boolean getIstrackingconditions() {
        return istrackingconditions;
    }

    public void setIstrackingconditions(Boolean istrackingconditions) {
        this.istrackingconditions = istrackingconditions;
    }

    public Boolean getIsblinded() {
        return isblinded;
    }

    public void setIsblinded(Boolean isblinded) {
        this.isblinded = isblinded;
    }

    public Boolean getIscharmed() {
        return ischarmed;
    }

    public void setIscharmed(Boolean ischarmed) {
        this.ischarmed = ischarmed;
    }

    public Boolean getIsdeafened() {
        return isdeafened;
    }

    public void setIsdeafened(Boolean isdeafened) {
        this.isdeafened = isdeafened;
    }

    public Boolean getIsfrightened() {
        return isfrightened;
    }

    public void setIsfrightened(Boolean isfrightened) {
        this.isfrightened = isfrightened;
    }

    public Boolean getIsstunned() {
        return isstunned;
    }

    public void setIsstunned(Boolean isstunned) {
        this.isstunned = isstunned;
    }

    public Boolean getIsparalyzed() {
        return isparalyzed;
    }

    public void setIsparalyzed(Boolean isparalyzed) {
        this.isparalyzed = isparalyzed;
    }

    public Boolean getIspoisoned() {
        return ispoisoned;
    }

    public void setIspoisoned(Boolean ispoisoned) {
        this.ispoisoned = ispoisoned;
    }

    public Boolean getIsprone() {
        return isprone;
    }

    public void setIsprone(Boolean isprone) {
        this.isprone = isprone;
    }

    public Boolean getIsrestrained() {
        return isrestrained;
    }

    public void setIsrestrained(Boolean isrestrained) {
        this.isrestrained = isrestrained;
    }

    public Boolean getIsunconscious() {
        return isunconscious;
    }

    public void setIsunconscious(Boolean isunconscious) {
        this.isunconscious = isunconscious;
    }
}
