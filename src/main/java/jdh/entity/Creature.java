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
    private String creatureName;

    @ManyToOne
    private Encounter encounters;

    @Column(name = "maxhitpoints")
    private int maxHitpoints;
    @Column(name = "currenthitpoints")
    private int currenthitpoints;
    @Column(name = "initiative")
    private int initiative;

    @Column(name = "isally")
    private Boolean isAlly;
    @Column(name = "istrackingconditions")
    private Boolean isTrackingConditions;

    // Condition Booleans
    @Column(name = "isblinded")
    private Boolean isBlinded;
    @Column(name = "ischarmed")
    private Boolean isCharmed;
    @Column(name = "isdeafened")
    private Boolean isDeafened;
    @Column(name = "isfrightened")
    private Boolean isFrightened;
    @Column(name = "isstunned")
    private Boolean isStunned;
    @Column(name = "isparalyzed")
    private Boolean isParalyzed;
    @Column(name = "ispoisoned")
    private Boolean isPoisoned;
    @Column(name = "isprone")
    private Boolean isProne;
    @Column(name = "isrestrained")
    private Boolean isRestrained;
    @Column(name = "isunconscious")
    private Boolean isUnconscious;

    /**
     * No-arg constructor
     */
    public Creature() {
    }

    public Creature(String creatureName, Encounter encounters, int maxhitpoints) {
        this.creatureName = creatureName;
        this.encounters = encounters;
        this.maxHitpoints = maxhitpoints;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreatureName() {
        return creatureName;
    }

    public void setCreatureName(String creatureName) {
        this.creatureName = creatureName;
    }

    public Encounter getEncounters() {
        return encounters;
    }

    public void setEncounters(Encounter encounters) {
        this.encounters = encounters;
    }

    public int getMaxHitpoints() {
        return maxHitpoints;
    }

    public void setMaxHitpoints(int maxHitpoints) {
        this.maxHitpoints = maxHitpoints;
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

    public Boolean getAlly() {
        return isAlly;
    }

    public void setAlly(Boolean ally) {
        isAlly = ally;
    }

    public Boolean getTrackingConditions() {
        return isTrackingConditions;
    }

    public void setTrackingConditions(Boolean trackingConditions) {
        isTrackingConditions = trackingConditions;
    }

    public Boolean getBlinded() {
        return isBlinded;
    }

    public void setBlinded(Boolean blinded) {
        isBlinded = blinded;
    }

    public Boolean getCharmed() {
        return isCharmed;
    }

    public void setCharmed(Boolean charmed) {
        isCharmed = charmed;
    }

    public Boolean getDeafened() {
        return isDeafened;
    }

    public void setDeafened(Boolean deafened) {
        isDeafened = deafened;
    }

    public Boolean getFrightened() {
        return isFrightened;
    }

    public void setFrightened(Boolean frightened) {
        isFrightened = frightened;
    }

    public Boolean getStunned() {
        return isStunned;
    }

    public void setStunned(Boolean stunned) {
        isStunned = stunned;
    }

    public Boolean getParalyzed() {
        return isParalyzed;
    }

    public void setParalyzed(Boolean paralyzed) {
        isParalyzed = paralyzed;
    }

    public Boolean getPoisoned() {
        return isPoisoned;
    }

    public void setPoisoned(Boolean poisoned) {
        isPoisoned = poisoned;
    }

    public Boolean getProne() {
        return isProne;
    }

    public void setProne(Boolean prone) {
        isProne = prone;
    }

    public Boolean getRestrained() {
        return isRestrained;
    }

    public void setRestrained(Boolean restrained) {
        isRestrained = restrained;
    }

    public Boolean getUnconscious() {
        return isUnconscious;
    }

    public void setUnconscious(Boolean unconscious) {
        isUnconscious = unconscious;
    }
}
