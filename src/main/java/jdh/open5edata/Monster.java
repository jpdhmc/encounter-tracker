package jdh.open5edata;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Monster{

	@JsonProperty("hit_points")
	private int hitPoints;

	@JsonProperty("constitution")
	private int constitution;

	@JsonProperty("strength")
	private int strength;

	@JsonProperty("condition_immunities")
	private String conditionImmunities;

	@JsonProperty("senses")
	private String senses;

	@JsonProperty("challenge_rating")
	private String challengeRating;

	@JsonProperty("spell_list")
	private List<Object> spellList;

	@JsonProperty("type")
	private String type;

	@JsonProperty("legendary_actions")
	private List<LegendaryActions> legendaryActions;

	@JsonProperty("speed")
	private Speed speed;

	@JsonProperty("charisma")
	private int charisma;

	@JsonProperty("wisdom")
	private int wisdom;

	@JsonProperty("perception")
	private Object perception;

	@JsonProperty("damage_resistances")
	private String damageResistances;

	@JsonProperty("skills")
	private Skills skills;

	@JsonProperty("intelligence_save")
	private int intelligenceSave;

	@JsonProperty("armor_class")
	private int armorClass;

	@JsonProperty("strength_save")
	private int strengthSave;

	@JsonProperty("subtype")
	private String subtype;

	@JsonProperty("hit_dice")
	private String hitDice;

	@JsonProperty("special_abilities")
	private List<SpecialAbilities> specialAbilities;

	@JsonProperty("document__title")
	private String documentTitle;

	@JsonProperty("constitution_save")
	private int constitutionSave;

	@JsonProperty("wisdom_save")
	private int wisdomSave;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("group")
	private Object group;

	@JsonProperty("dexterity_save")
	private int dexteritySave;

	@JsonProperty("charisma_save")
	private int charismaSave;

	@JsonProperty("armor_desc")
	private String armorDesc;

	@JsonProperty("languages")
	private String languages;

	@JsonProperty("img_main")
	private Object imgMain;

	@JsonProperty("legendary_desc")
	private String legendaryDesc;

	@JsonProperty("document__license_url")
	private String documentLicenseUrl;

	@JsonProperty("damage_immunities")
	private String damageImmunities;

	@JsonProperty("damage_vulnerabilities")
	private String damageVulnerabilities;

	@JsonProperty("intelligence")
	private int intelligence;

	@JsonProperty("cr")
	private Object cr;

	@JsonProperty("dexterity")
	private int dexterity;

	@JsonProperty("size")
	private String size;

	@JsonProperty("document__slug")
	private String documentSlug;

	@JsonProperty("name")
	private String name;

	@JsonProperty("reactions")
	private List<Reactions> reactions;

	@JsonProperty("alignment")
	private String alignment;

	@JsonProperty("actions")
	private List<ActionsItem> actions;

	public void setHitPoints(int hitPoints){
		this.hitPoints = hitPoints;
	}

	public int getHitPoints(){
		return hitPoints;
	}

	public void setConstitution(int constitution){
		this.constitution = constitution;
	}

	public int getConstitution(){
		return constitution;
	}

	public void setStrength(int strength){
		this.strength = strength;
	}

	public int getStrength(){
		return strength;
	}

	public void setConditionImmunities(String conditionImmunities){
		this.conditionImmunities = conditionImmunities;
	}

	public String getConditionImmunities(){
		return conditionImmunities;
	}

	public void setSenses(String senses){
		this.senses = senses;
	}

	public String getSenses(){
		return senses;
	}

	public void setChallengeRating(String challengeRating){
		this.challengeRating = challengeRating;
	}

	public String getChallengeRating(){
		return challengeRating;
	}

	public void setSpellList(List<Object> spellList){
		this.spellList = spellList;
	}

	public List<Object> getSpellList(){
		return spellList;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setLegendaryActions(List<LegendaryActions> legendaryActions){
		this.legendaryActions = legendaryActions;
	}

	public List<LegendaryActions> getLegendaryActions(){
		return legendaryActions;
	}

	public void setSpeed(Speed speed){
		this.speed = speed;
	}

	public Speed getSpeed(){
		return speed;
	}

	public void setCharisma(int charisma){
		this.charisma = charisma;
	}

	public int getCharisma(){
		return charisma;
	}

	public void setWisdom(int wisdom){
		this.wisdom = wisdom;
	}

	public int getWisdom(){
		return wisdom;
	}

	public void setPerception(Object perception){
		this.perception = perception;
	}

	public Object getPerception(){
		return perception;
	}

	public void setDamageResistances(String damageResistances){
		this.damageResistances = damageResistances;
	}

	public String getDamageResistances(){
		return damageResistances;
	}

	public void setSkills(Skills skills){
		this.skills = skills;
	}

	public Skills getSkills(){
		return skills;
	}

	public void setIntelligenceSave(int intelligenceSave){
		this.intelligenceSave = intelligenceSave;
	}

	public int getIntelligenceSave(){
		return intelligenceSave;
	}

	public void setArmorClass(int armorClass){
		this.armorClass = armorClass;
	}

	public int getArmorClass(){
		return armorClass;
	}

	public void setStrengthSave(int strengthSave){
		this.strengthSave = strengthSave;
	}

	public int getStrengthSave(){
		return strengthSave;
	}

	public void setSubtype(String subtype){
		this.subtype = subtype;
	}

	public String getSubtype(){
		return subtype;
	}

	public void setHitDice(String hitDice){
		this.hitDice = hitDice;
	}

	public String getHitDice(){
		return hitDice;
	}

	public void setSpecialAbilities(List<SpecialAbilities> specialAbilities){
		this.specialAbilities = specialAbilities;
	}

	public List<SpecialAbilities> getSpecialAbilities(){
		return specialAbilities;
	}

	public void setDocumentTitle(String documentTitle){
		this.documentTitle = documentTitle;
	}

	public String getDocumentTitle(){
		return documentTitle;
	}

	public void setConstitutionSave(int constitutionSave){
		this.constitutionSave = constitutionSave;
	}

	public int getConstitutionSave(){
		return constitutionSave;
	}

	public void setWisdomSave(int wisdomSave){
		this.wisdomSave = wisdomSave;
	}

	public int getWisdomSave(){
		return wisdomSave;
	}

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}

	public void setGroup(Object group){
		this.group = group;
	}

	public Object getGroup(){
		return group;
	}

	public void setDexteritySave(int dexteritySave){
		this.dexteritySave = dexteritySave;
	}

	public int getDexteritySave(){
		return dexteritySave;
	}

	public void setCharismaSave(int charismaSave){
		this.charismaSave = charismaSave;
	}

	public int getCharismaSave(){
		return charismaSave;
	}

	public void setArmorDesc(String armorDesc){
		this.armorDesc = armorDesc;
	}

	public String getArmorDesc(){
		return armorDesc;
	}

	public void setLanguages(String languages){
		this.languages = languages;
	}

	public String getLanguages(){
		return languages;
	}

	public void setImgMain(Object imgMain){
		this.imgMain = imgMain;
	}

	public Object getImgMain(){
		return imgMain;
	}

	public void setLegendaryDesc(String legendaryDesc){
		this.legendaryDesc = legendaryDesc;
	}

	public String getLegendaryDesc(){
		return legendaryDesc;
	}

	public void setDocumentLicenseUrl(String documentLicenseUrl){
		this.documentLicenseUrl = documentLicenseUrl;
	}

	public String getDocumentLicenseUrl(){
		return documentLicenseUrl;
	}

	public void setDamageImmunities(String damageImmunities){
		this.damageImmunities = damageImmunities;
	}

	public String getDamageImmunities(){
		return damageImmunities;
	}

	public void setDamageVulnerabilities(String damageVulnerabilities){
		this.damageVulnerabilities = damageVulnerabilities;
	}

	public String getDamageVulnerabilities(){
		return damageVulnerabilities;
	}

	public void setIntelligence(int intelligence){
		this.intelligence = intelligence;
	}

	public int getIntelligence(){
		return intelligence;
	}

	public void setCr(Object cr){
		this.cr = cr;
	}

	public Object getCr(){
		return cr;
	}

	public void setDexterity(int dexterity){
		this.dexterity = dexterity;
	}

	public int getDexterity(){
		return dexterity;
	}

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}

	public void setDocumentSlug(String documentSlug){
		this.documentSlug = documentSlug;
	}

	public String getDocumentSlug(){
		return documentSlug;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setReactions(List<Reactions> reactions){
		this.reactions = reactions;
	}

	public List<Reactions> getReactions(){
		return reactions;
	}

	public void setAlignment(String alignment){
		this.alignment = alignment;
	}

	public String getAlignment(){
		return alignment;
	}

	public void setActions(List<ActionsItem> actions){
		this.actions = actions;
	}

	public List<ActionsItem> getActions(){
		return actions;
	}

	@Override
 	public String toString(){
		return 
			"Monster{" + 
			"hit_points = '" + hitPoints + '\'' + 
			",constitution = '" + constitution + '\'' + 
			",strength = '" + strength + '\'' + 
			",condition_immunities = '" + conditionImmunities + '\'' + 
			",senses = '" + senses + '\'' + 
			",challenge_rating = '" + challengeRating + '\'' + 
			",spell_list = '" + spellList + '\'' + 
			",type = '" + type + '\'' + 
			",legendary_actions = '" + legendaryActions + '\'' + 
			",speed = '" + speed + '\'' + 
			",charisma = '" + charisma + '\'' + 
			",wisdom = '" + wisdom + '\'' + 
			",perception = '" + perception + '\'' + 
			",damage_resistances = '" + damageResistances + '\'' + 
			",skills = '" + skills + '\'' + 
			",intelligence_save = '" + intelligenceSave + '\'' + 
			",armor_class = '" + armorClass + '\'' + 
			",strength_save = '" + strengthSave + '\'' + 
			",subtype = '" + subtype + '\'' + 
			",hit_dice = '" + hitDice + '\'' + 
			",special_abilities = '" + specialAbilities + '\'' + 
			",document__title = '" + documentTitle + '\'' + 
			",constitution_save = '" + constitutionSave + '\'' + 
			",wisdom_save = '" + wisdomSave + '\'' + 
			",slug = '" + slug + '\'' + 
			",group = '" + group + '\'' + 
			",dexterity_save = '" + dexteritySave + '\'' + 
			",charisma_save = '" + charismaSave + '\'' + 
			",armor_desc = '" + armorDesc + '\'' + 
			",languages = '" + languages + '\'' + 
			",img_main = '" + imgMain + '\'' + 
			",legendary_desc = '" + legendaryDesc + '\'' + 
			",document__license_url = '" + documentLicenseUrl + '\'' + 
			",damage_immunities = '" + damageImmunities + '\'' + 
			",damage_vulnerabilities = '" + damageVulnerabilities + '\'' + 
			",intelligence = '" + intelligence + '\'' + 
			",cr = '" + cr + '\'' + 
			",dexterity = '" + dexterity + '\'' + 
			",size = '" + size + '\'' + 
			",document__slug = '" + documentSlug + '\'' + 
			",name = '" + name + '\'' + 
			",reactions = '" + reactions + '\'' + 
			",alignment = '" + alignment + '\'' + 
			",actions = '" + actions + '\'' + 
			"}";
		}
}