<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="head.jsp"/>
<body>
    <c:import url="header.jsp"/>
    <h2>${selectedEncounter.getEncounterName()}</h2>
    <c:forEach var="creature" items="${selectedEncounter.getCreatures()}">
        <table id="encounterTable">
            <thead>
            <th>Creature Name</th>
            <th>Initiative</th>
            <th>Current Hitpoints</th>
            <th>Maximum Hitpoints</th>
            <c:if test="${creature.getHitDice() != null}">
                <th>Hit Dice</th>
            </c:if>
            <c:if test="${creature.getSize() != null}">
                <th>Size</th>
            </c:if>
            <c:if test="${creature.getType() != null}">
                <th>Type</th>
            </c:if>
            <c:if test="${creature.getAlignment() != null}">
                <th>Alignment</th>
            </c:if>
            <c:if test="${creature.getArmorClass() != null}">
                <th>Armor Class</th>
            </c:if>
            <c:if test="${creature.getSpeed() != null}">
                <th>Speed</th>
            </c:if>
            <c:if test="${creature.getStrength() != null}">
                <th>Strength</th>
            </c:if>
            <c:if test="${creature.getDexterity() != null}">
                <th>Dexterity</th>
            </c:if>
            <c:if test="${creature.getConstitution() != null}">
                <th>Constitution</th>
            </c:if>
            <c:if test="${creature.getIntelligence() != null}">
                <th>Intelligence</th>
            </c:if>
            <c:if test="${creature.getWisdom() != null}">
                <th>Wisdom</th>
            </c:if>
            <c:if test="${creature.getCharisma() != null}">
                <th>Charisma</th>
            </c:if>
            <c:if test="${creature.getStrengthSave() != null}">
                <th>Strength Save</th>
            </c:if>
            <c:if test="${creature.getDexteritySave() != null}">
                <th>Dexterity Save</th>
            </c:if>
            <c:if test="${creature.getConstitutionSave() != null}">
                <th>Constitution Save</th>
            </c:if>
            <c:if test="${creature.getIntelligenceSave() != null}">
                <th>Intelligence Save</th>
            </c:if>
            <c:if test="${creature.getWisdomSave() != null}">
                <th>Wisdom Save</th>
            </c:if>
            <c:if test="${creature.getCharismaSave() != null}">
                <th>Charisma Save</th>
            </c:if>
            <c:if test="${creature.getSkillBonuses() != null}">
                <th>Skill Bonuses</th>
            </c:if>
            <c:if test="${creature.getVulnerabilities() != null}">
                <th>Vulnerabilities</th>
            </c:if>
            <c:if test="${creature.getResistances() != null}">
                <th>Resistances</th>
            </c:if>
            <c:if test="${creature.getImmunities() != null}">
                <th>Immunities</th>
            </c:if>
            <c:if test="${creature.getConditionImmunities() != null}">
                <th>Condition Immunities</th>
            </c:if>
            <c:if test="${creature.getSenses() != null}">
                <th>Senses</th>
            </c:if>
            <c:if test="${creature.getLanguages() != null}">
                <th>Languages</th>
            </c:if>
            <c:if test="${creature.getChallengeRating() != null}">
                <th>Challenge Rating</th>
            </c:if>
            <c:if test="${creature.getActions() != null}">
                <th>Actions</th>
            </c:if>
            <c:if test="${creature.getReactions() != null}">
                <th>Reactions</th>
            </c:if>
            <c:if test="${creature.getLegendaryActions() != null}">
                <th>Legendary Actions</th>
            </c:if>
            <c:if test="${creature.getSpecialAbilities() != null}">
                <th>Special Abilities</th>
            </c:if>
            </thead>
            <tbody>
                <tr>
                    <td>${creature.getCreatureName()}
                        <form action="deleteCreature" method="post">
                            <input type="hidden" name="selectedEncounter" value="${selectedEncounter.getId()}">
                            <input type="hidden" name="deletingCreature" value="${creature.getId()}">
                            <input type="submit" value="Delete">
                        </form>
                    </td>
                    <td>${creature.getInitiative()}</td>
                    <td><input type="text" value="${creature.getCurrentHitpoints()}"></td>
                    <td>${creature.getMaxHitpoints()}</td>
                    <c:if test="${creature.getHitDice() != null}">
                        <td>${creature.getHitDice()}</td>
                    </c:if>
                    <c:if test="${creature.getSize() != null}">
                        <td>${creature.getSize()}</td>
                    </c:if>
                    <c:if test="${creature.getType() != null}">
                        <td>${creature.getType()}</td>
                    </c:if>
                    <c:if test="${creature.getAlignment() != null}">
                        <td>${creature.getAlignment()}</td>
                    </c:if>
                    <c:if test="${creature.getArmorClass() != null}">
                        <td>${creature.getArmorClass()}</td>
                    </c:if>
                    <c:if test="${creature.getSpeed() != null}">
                        <td>${creature.getSpeed()}</td>
                    </c:if>
                    <c:if test="${creature.getStrength() != null}">
                        <td>${creature.getStrength()}</td>
                    </c:if>
                    <c:if test="${creature.getDexterity() != null}">
                        <td>${creature.getDexterity()}</td>
                    </c:if>
                    <c:if test="${creature.getConstitution() != null}">
                        <td>${creature.getConstitution()}</td>
                    </c:if>
                    <c:if test="${creature.getIntelligence() != null}">
                        <td>${creature.getIntelligence()}</td>
                    </c:if>
                    <c:if test="${creature.getWisdom() != null}">
                        <td>${creature.getWisdom()}</td>
                    </c:if>
                    <c:if test="${creature.getCharisma() != null}">
                        <td>${creature.getCharisma()}</td>
                    </c:if>
                    <c:if test="${creature.getStrengthSave() != null}">
                        <td>${creature.getStrengthSave()}</td>
                    </c:if>
                    <c:if test="${creature.getDexteritySave() != null}">
                        <td>${creature.getDexteritySave()}</td>
                    </c:if>
                    <c:if test="${creature.getConstitutionSave() != null}">
                        <td>${creature.getConstitutionSave()}</td>
                    </c:if>
                    <c:if test="${creature.getIntelligenceSave() != null}">
                        <td>${creature.getIntelligenceSave()}</td>
                    </c:if>
                    <c:if test="${creature.getWisdomSave() != null}">
                        <td>${creature.getWisdomSave()}</td>
                    </c:if>
                    <c:if test="${creature.getCharismaSave() != null}">
                        <td>${creature.getCharismaSave()}</td>
                    </c:if>
                    <c:if test="${creature.getSkillBonuses() != null}">
                        <td>${creature.getSkillBonuses()}</td>
                    </c:if>
                    <c:if test="${creature.getVulnerabilities() != null}">
                        <td>${creature.getVulnerabilities()}</td>
                    </c:if>
                    <c:if test="${creature.getResistances() != null}">
                        <td>${creature.getResistances()}</td>
                    </c:if>
                    <c:if test="${creature.getImmunities() != null}">
                        <td>${creature.getImmunities()}</td>
                    </c:if>
                    <c:if test="${creature.getConditionImmunities() != null}">
                        <td>${creature.getConditionImmunities()}</td>
                    </c:if>
                    <c:if test="${creature.getSenses() != null}">
                        <td>${creature.getSenses()}</td>
                    </c:if>
                    <c:if test="${creature.getLanguages() != null}">
                        <td>${creature.getLanguages()}</td>
                    </c:if>
                    <c:if test="${creature.getChallengeRating() != null}">
                        <td>${creature.getChallengeRating()}</td>
                    </c:if>
                    <c:if test="${creature.getActions() != null}">
                        <td>${creature.getActions()}</td>
                    </c:if>
                    <c:if test="${creature.getReactions() != null}">
                        <td>${creature.getReactions()}</td>
                    </c:if>
                    <c:if test="${creature.getLegendaryActions() != null}">
                        <td>${creature.getLegendaryActions()}</td>
                    </c:if>
                    <c:if test="${creature.getSpecialAbilities() != null}">
                        <td>${creature.getSpecialAbilities()}</td>
                    </c:if>
                </tr>

            </tbody>
        </table>
    </c:forEach>
    <details>
        <summary>Create a new creature to add!</summary>
        <form id="createCreatureForm" action="createCreature" method="POST">
            <input type="hidden" name="creatureEncounter" value="${selectedEncounter.getId()}">

            <label for="creatureName">Name</label>
            <input type="text" id="creatureName" name="creatureName" maxLength="60" required>
            <br>

            <label for="creatureSize">Size</label>
            <select name=creatureSize" id=creatureSize>
                <option value=""></option>
                <option value="tiny">Tiny</option>
                <option value="small">Small</option>
                <option value="medium">Medium</option>
                <option value="large">Large</option>
                <option value="huge">Huge</option>
                <option value="gargantuan">Gargantuan</option>
            </select>
            <br>

            <label for="creatureType">Type</label>
            <select name="creatureType" id="creatureType">
                <option value=""></option>
                <option value="aberration">Aberration</option>
                <option value="beast">Beast</option>
                <option value="celestial">Celestial</option>
                <option value="construct">Construct</option>
                <option value="dragon">Dragon</option>
                <option value="elemental">Elemental</option>
                <option value="fey">Fey</option>
                <option value="fiend">Fiend</option>
                <option value="giant">Giant</option>
                <option value="humanoid">Humanoid</option>
                <option value="monstrosity">Monstrosity</option>
                <option value="ooze">Ooze</option>
                <option value="plant">Plant</option>
                <option value="undead">Undead</option>
            </select>
            <br>

            <label for="creatureArmorClass">Armor Class</label>
            <input type="text" id="creatureArmorClass" name="creatureArmorClass" pattern="^(\d+)?$">
            <br>

            <label for="creatureMaxHitpoints">Max Hitpoints</label>
            <input type="text" id="creatureMaxHitpoints" name="creatureMaxHitpoints" pattern="^(\d+)?$" required>
            <br>

            <label for="creatureHitdice">Hitdice</label>
            <input type="text" id="creatureHitdice" name="creatureHitdice" maxLength="30">
            <br>

            <label for="creatureSpeed">Speed</label>
            <input type="text" id="creatureSpeed" name="creatureSpeed" placeholder="Walk 30ft. Fly 60ft." maxLength="120">
            <br>

            <details>
                <summary>Stats</summary>
                <input type="text" id="creatureStr" name="creatureStr" placeholder="Strength" pattern="^(\d+)?$">
                <input type="text" id="creatureDex" name="creatureDex" placeholder="Dexterity" pattern="^(\d+)?$">
                <input type="text" id="creatureCon" name="creatureCon" placeholder="Constitution" pattern="^(\d+)?$">
                <input type="text" id="creatureInt" name="creatureInt" placeholder="Intelligence" pattern="^(\d+)?$">
                <input type="text" id="creatureWis" name="creatureWis" placeholder="Wisdom" pattern="^(\d+)?$">
                <input type="text" id="creatureCha" name="creatureCha" placeholder="Charisma" pattern="^(\d+)?$">
            </details>

            <details>
                <summary>Saving Throws</summary>
                <input type="text" id="creatureStrSave" name="creatureStrSave" placeholder="Strength Save" pattern="^(\d+)?$">
                <input type="text" id="creatureDexSave" name="creatureDexSave" placeholder="Dexterity Save" pattern="^(\d+)?$">
                <input type="text" id="creatureConSave" name="creatureConSave" placeholder="Constitution Save" pattern="^(\d+)?$">
                <input type="text" id="creatureIntSave" name="creatureIntSave" placeholder="Intelligence Save" pattern="^(\d+)?$">
                <input type="text" id="creatureWisSave" name="creatureWisSave" placeholder="Wisdom Save" pattern="^(\d+)?$">
                <input type="text" id="creatureChaSave" name="creatureChaSave" placeholder="Charisma Save" pattern="^(\d+)?$">
            </details>

            <label for="creatureSkills">Skill Bonuses</label>
            <input type="text" id="creatureSkills" name="creatureSkills" placeholder="Stealth +4, Initiative +2" maxLength="120">
            <br>

            <details>
                <summary>Damage Modifiers</summary>
                <label for="creatureDamageImmunities">Damage Immunities</label>
                <input type="text" id="creatureDamageImmunities" name="creatureDamageImmunities" placeholder="Fire, Force" maxLength="120">
                <br>

                <label for="creatureConditionImmunities">Condition Immunities</label>
                <input type="text" id="creatureConditionImmunities" name="creatureConditionImmunities" placeholder="Stunned, Charmed" maxLength="120">
                <br>

                <label for="creatureDamageResistances">Damage Resistances</label>
                <input type="text" id="creatureDamageResistances" name="creatureDamageResistances" placeholder="Acid" maxLength="120">
                <br>

                <label for="creatureDamageVulnerabilities">Damage Vulnerabilities</label>
                <input type="text" id="creatureDamageVulnerabilities" name="creatureDamageVulnerabilities" placeholder="Radiant" maxLength="120">
                <br>
            </details>

            <label for="creatureSenses">Senses</label>
            <input type="text" id="creatureSenses" name="creatureSenses" placeholder="Darkvision 60ft." maxLength="120">
            <br>

            <label for="creatureLanguages">Languages</label>
            <input type="text" id="creatureLanguages" name="creatureLanguages" placeholder="Common, Draconic" maxLength="120">
            <br>

            <label for="creatureChallengeRating">Challenge Rating</label>
            <input type="text" id="creatureChallengeRating" name="creatureChallengeRating" pattern="^(\d+)?$" maxLength="5">
            <br>

            <label for="creatureSpecialAbilities">Special Abilities</label>
            <textarea id="creatureSpecialAbilities" name="creatureSpecialAbilities" maxLength="800" rows="5" cols="70" placeholder="Ambusher. When submerged in water, the dragon has advantage on Stealth checks. If the dragon hits a creature that can't see it with its bite, it can deal piercing damage and grapple the target simultaneously.

    Innate Spellcasting. The dragons spellcasting ability is Charisma (save DC 17). It can innately cast the following spells, requiring no material components. 3/day each: animate dead, fog cloud, legend lore, pass without trace, speak with dead"></textarea>
            <br>

            <label for="creatureActions">Actions</label>
            <textarea id="creatureActions" name="creatureActions" maxLength="800" rows="5" cols="70" placeholder="Multiattack. The dragon attacks once with its bite and twice with its claws. In place of its bite attack it can use Acid Spit.

    Bite. Melee Weapon Attack: +12 to hit reach 10 ft. one target. Hit: 22 (3d10 + 6) piercing damage plus 4 (1d8) acid damage. Instead of dealing piercing damage the dragon can grapple the target (escape DC 20) and a Large or smaller creature grappled in this way is restrained. While grappling a creature the dragon can't bite or use Acid Spit against another target.

    Acid Breath (Recharge 5-6). The dragon exhales sizzling acid or necrotic energy in a 60-foot-long 5-foot-wide line. Each creature in that area makes a DC 19 Dexterity saving throw taking 31 (7d8) acid damage and 31 (7d8) necrotic damage on a failed save or half damage on a success. A creature that fails the save is blinded until the end of its next turn."></textarea>
            <br>

            <label for="creatureReactions">Reactions</label>
            <textarea id="creatureReactions" name="creatureReactions" maxLength="800" rows="5" cols="70" placeholder="Tail Attack. When a creature the dragon can see within 10 feet hits the dragon with a melee attack, the dragon makes a tail attack against it."></textarea>
            <br>

            <label for="creatureLegendaryActions">Legendary Actions</label>
            <textarea id="creatureLegendaryActions" name="creatureLegendaryActions" maxLength="800" rows="5" cols="70" placeholder="The dragon can take 3 legendary actions. Only one legendary action can be used at a time and only at the end of another creatures turn. It regains spent legendary actions at the start of its turn.

    Darkness. The dragon creates a 20-foot-radius sphere of magical darkness originating from a point it can see within 120 feet. Darkvision can't penetrate this darkness. The darkness lasts for 1 minute or until the dragon uses this action again.

    Roar. Each creature of the dragons choice within 120 feet that can hear it makes a DC 17 Charisma saving throw. On a failure, it is frightened for 1 minute. A creature repeats the saving throw at the end of its turns, ending the effect on itself on a success. When it succeeds on a saving throw or the effect ends for it, it is immune to Roar for 24 hours."></textarea>
            <br>

            <p>Track conditions for this creature?</p>
            <label for="creatureIsTrackingConditionsTrue">Yes</label>
            <input type="radio" id="creatureIsTrackingConditionsTrue" name="creatureIsTrackingConditions" value="creatureIsTrackingConditionsTrue">
            <label for="creatureIsTrackingConditionsFalse">No</label>
            <input type="radio" id="creatureIsTrackingConditionsFalse" name="creatureIsTrackingConditions" value="creatureIsTrackingConditionsFalse" checked>
            <br>

            <p>Add this creature to your Creature Collection?</p>
            <label for="creatureAddToCollectionTrue">Yes</label>
            <input type="radio" id="creatureAddToCollectionTrue" name="creatureAddToCollection" value="creatureAddToCollectionTrue">

            <label for="creatureAddToCollectionFalse">No</label>
            <input type="radio" id="creatureAddToCollectionFalse" name="creatureAddToCollection" value="creatureAddToCollectionFalse" checked>
            <button type="submit" value="Submit">Save Creature</button>
        </form>
    </details>


    <form id="createCreatureFromCollectionForm" action="createCreatureFromCollection" method="POST">
        <input type="hidden" name="creatureEncounter" value="${selectedEncounter.getId()}">
        <label for="addFromCollection">Or... Add a creature from your collection!</label>
        <select name="addFromCollection" id="addFromCollection">
            <option value=""></option>
            <c:forEach var="creature" items="${loggedInUserCreatureCollection.getCreatures()}">
            <option value="${creature.getId()}">${creature.getCreatureName()}</option>
            </c:forEach>
        </select>
        <button type="submit" value="Submit">Add from collection</button>
    </form>

    <form id="createCreatureFromSearchForm" action="createCreatureFromSearch" method="POST">
        <input type="hidden" name="creatureEncounter" value="${selectedEncounter.getId()}">
        <label for="searchCreature">Or... Search the Open5e API for a creature!</label>
        <input type="text" id="searchCreature" name="searchCreature" placeholder="Goblin">
        <button type="submit" value="Submit">Search API</button>
    </form>
</body>
<c:import url="footer.jsp"/>