package jdh.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Represents a creature
 *
 * TODO: finish creature class
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

    @Column(name = "name")
    private String creatureName;

    @ManyToOne
    private Encounter encounter;

    @Column(name = "maxhitpoints")
    private int maxHitpoints;
    @Column(name = "currenthitpoints")
    private int currentHitpoints;
    private int maxLegendaryActions;
    private int currentLegendaryActions;
    @Column(name = "initiative")
    private int initiative;

    // Spell slots
    private int maxLv1Slots;
    private int currentLv1Slots;
    private int maxLv2Slots;
    private int currentLv2Slots;
    private int maxLv3Slots;
    private int currentLv3Slots;
    private int maxLv4Slots;
    private int currentLv4Slots;
    private int maxLv5Slots;
    private int currentLv5Slots;
    private int maxLv6Slots;
    private int currentLv6Slots;
    private int maxLv7Slots;
    private int currentLv7Slots;
    private int maxLv8Slots;
    private int currentLv8Slots;
    private int maxLv9Slots;
    private int currentLv9Slots;


    private Boolean isAlly;
    private Boolean isTrackingConditions;

    // Condition Booleans
    private Boolean isBlinded;
    private Boolean isCharmed;
    private Boolean isDeafened;
    private Boolean isFrightened;
    private Boolean isStunned;
    private Boolean isParalyzed;
    private Boolean isPoisoned;
    private Boolean isProne;
    private Boolean isRestrained;
    private Boolean isUnconscious;

    /**
     * No-arg constructor
     */
    public Creature() {
    }

}
