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

    @Column(name = "creaturename")
    private String size;

    private String type;

    private String alignment;

    private int armorClass;

    @Column(name = "maxhitpoints")
    private int maxHitpoints;
    @Column(name = "currenthitpoints")
    private int currenthitpoints;

    private String hitDice;

    @Column(name = "initiative")
    private int initiative;

    private String speed;

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    private int strengthSave;
    private int dexteritySave;
    private int constitutionSave;
    private int intelligenceSave;
    private int wisdomSave;
    private int charismaSave;

    private String skillBonuses;

    private String vulnerabilities;
    private String resistances;
    private String immunities;
    private String conditionImmunities;
    private String senses;
    private String languages;
    private String challengeRating;
    private String actions;
    private String reactions;
    private String legendaryActions;
    private String specialAbilities;
    private String spellList;


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

    // TODO: GETTERS AND SETTERS
}
