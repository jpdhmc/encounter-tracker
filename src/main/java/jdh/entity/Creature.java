package jdh.entity;

import jdh.open5edata.Monster;
import jdh.persistence.GenericDao;
import jdh.util.DaoFactory;
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

    @Column(name = "size")
    private String size;
    @Column(name = "type")
    private String type;
    @Column(name = "alignment")
    private String alignment;
    @Column(name = "armorclass")
    private int armorClass;
    @Column(name = "maxhitpoints")
    private int maxHitpoints;
    @Column(name = "currenthitpoints")
    private int currenthitpoints;
    @Column(name = "hitdice")
    private String hitDice;
    @Column(name = "initiative")
    private int initiative;
    @Column(name = "speed")
    private String speed;
    @Column(name = "strength")
    private int strength;
    @Column(name = "dexterity")
    private int dexterity;
    @Column(name = "constitution")
    private int constitution;
    @Column(name = "intelligence")
    private int intelligence;
    @Column(name = "wisdom")
    private int wisdom;
    @Column(name = "charisma")
    private int charisma;

    @Column(name = "strengthsave")
    private int strengthSave;
    @Column(name = "dexteritysave")
    private int dexteritySave;
    @Column(name = "constitutionsave")
    private int constitutionSave;
    @Column(name = "intelligencesave")
    private int intelligenceSave;
    @Column(name = "wisdomsave")
    private int wisdomSave;
    @Column(name = "charismasave")
    private int charismaSave;

    @Column(name = "skillbonuses")
    private String skillBonuses;
    @Column(name = "vulnerabilities")
    private String vulnerabilities;
    @Column(name = "resistances")
    private String resistances;
    @Column(name = "immunities")
    private String immunities;
    @Column(name = "conditionimmunities")
    private String conditionImmunities;
    @Column(name = "senses")
    private String senses;
    @Column(name = "languages")
    private String languages;
    @Column(name = "challengerating")
    private int challengeRating;
    @Column(name = "actions")
    private String actions;
    @Column(name = "reactions")
    private String reactions;
    @Column(name = "legendaryactions")
    private String legendaryActions;
    @Column(name = "specialabilities")
    private String specialAbilities;


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

    /**
     * Constructor
     * @param creatureName
     * @param encounters
     * @param maxhitpoints
     */
    public Creature(String creatureName, Encounter encounters, int maxhitpoints) {
        this.creatureName = creatureName;
        this.encounters = encounters;
        this.maxHitpoints = maxhitpoints;
    }

    /**
     * Receives a monster from the api and converts it into a creature entity, then adds it to the database
     * @param monster
     * @return
     */
    public Creature convertFromMonster(Monster monster, Encounter encounter) {
        GenericDao<Creature> dao;
        dao = DaoFactory.createDao(Creature.class);
        Creature newCreature = new Creature();

        newCreature.setCreatureName(monster.getName());
        newCreature.setEncounters(encounter);
        newCreature.setSize(monster.getSize());
        newCreature.setType(monster.getType());
        newCreature.setAlignment(monster.getAlignment());
        newCreature.setArmorClass(monster.getArmorClass());
        newCreature.setMaxHitpoints(monster.getHitPoints());
        newCreature.setCurrenthitpoints(monster.getHitPoints());
        newCreature.setHitDice(monster.getHitDice());
        newCreature.setInitiative(0);
        newCreature.setSpeed(monster.getSpeed().toString());
        newCreature.setStrength(monster.getStrength());
        newCreature.setDexterity(monster.getDexterity());
        newCreature.setConstitution(monster.getConstitution());
        newCreature.setIntelligence(monster.getIntelligence());
        newCreature.setWisdom(monster.getWisdom());
        newCreature.setCharisma(monster.getCharisma());
        newCreature.setStrengthSave(monster.getStrengthSave());
        newCreature.setDexteritySave(monster.getDexteritySave());
        newCreature.setConstitutionSave(monster.getConstitutionSave());
        newCreature.setIntelligenceSave(monster.getIntelligenceSave());
        newCreature.setWisdomSave(monster.getWisdomSave());
        newCreature.setCharismaSave(monster.getCharismaSave());
        newCreature.setSkillBonuses(monster.getSkills().toString());
        newCreature.setVulnerabilities(monster.getDamageVulnerabilities());
        newCreature.setResistances(monster.getDamageResistances());
        newCreature.setImmunities(monster.getDamageImmunities());
        newCreature.setConditionImmunities(monster.getConditionImmunities());
        newCreature.setSenses(monster.getSenses());
        newCreature.setLanguages(monster.getLanguages());
        newCreature.setChallengeRating(Integer.parseInt(monster.getChallengeRating()));
        newCreature.setActions(monster.getActions().toString());
        newCreature.setReactions(monster.getReactions().toString());
        newCreature.setLegendaryActions(monster.getLegendaryActions().toString());
        newCreature.setSpecialAbilities(monster.getSpecialAbilities().toString());
        newCreature.isAlly = false;


        dao.insert(newCreature);
        return newCreature;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
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

    public String getHitDice() {
        return hitDice;
    }

    public void setHitDice(String hitDice) {
        this.hitDice = hitDice;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getStrengthSave() {
        return strengthSave;
    }

    public void setStrengthSave(int strengthSave) {
        this.strengthSave = strengthSave;
    }

    public int getDexteritySave() {
        return dexteritySave;
    }

    public void setDexteritySave(int dexteritySave) {
        this.dexteritySave = dexteritySave;
    }

    public int getConstitutionSave() {
        return constitutionSave;
    }

    public void setConstitutionSave(int constitutionSave) {
        this.constitutionSave = constitutionSave;
    }

    public int getIntelligenceSave() {
        return intelligenceSave;
    }

    public void setIntelligenceSave(int intelligenceSave) {
        this.intelligenceSave = intelligenceSave;
    }

    public int getWisdomSave() {
        return wisdomSave;
    }

    public void setWisdomSave(int wisdomSave) {
        this.wisdomSave = wisdomSave;
    }

    public int getCharismaSave() {
        return charismaSave;
    }

    public void setCharismaSave(int charismaSave) {
        this.charismaSave = charismaSave;
    }

    public String getSkillBonuses() {
        return skillBonuses;
    }

    public void setSkillBonuses(String skillBonuses) {
        this.skillBonuses = skillBonuses;
    }

    public String getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(String vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    public String getResistances() {
        return resistances;
    }

    public void setResistances(String resistances) {
        this.resistances = resistances;
    }

    public String getImmunities() {
        return immunities;
    }

    public void setImmunities(String immunities) {
        this.immunities = immunities;
    }

    public String getConditionImmunities() {
        return conditionImmunities;
    }

    public void setConditionImmunities(String conditionImmunities) {
        this.conditionImmunities = conditionImmunities;
    }

    public String getSenses() {
        return senses;
    }

    public void setSenses(String senses) {
        this.senses = senses;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public int getChallengeRating() {
        return challengeRating;
    }

    public void setChallengeRating(int challengeRating) {
        this.challengeRating = challengeRating;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }

    public String getReactions() {
        return reactions;
    }

    public void setReactions(String reactions) {
        this.reactions = reactions;
    }

    public String getLegendaryActions() {
        return legendaryActions;
    }

    public void setLegendaryActions(String legendaryActions) {
        this.legendaryActions = legendaryActions;
    }

    public String getSpecialAbilities() {
        return specialAbilities;
    }

    public void setSpecialAbilities(String specialAbilities) {
        this.specialAbilities = specialAbilities;
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
