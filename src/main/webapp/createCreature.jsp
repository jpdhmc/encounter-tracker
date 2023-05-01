<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="head.jsp"/>
<body>
    <form id="createCreatureForm" action="createCreature" method="POST">
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
            <option value="Dragon">Dragon</option>
            <option value="aberration">Elemental</option>
            <option value="aberration">Fey</option>
            <option value="aberration">Fiend</option>
            <option value="aberration">Giant</option>
            <option value="aberration">Humanoid</option>
            <option value="aberration">Monstrosity</option>
            <option value="aberration">Ooze</option>
            <option value="aberration">Plant</option>
            <option value="aberration">Undead</option>
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
        <input type="text" id="creatureSkills" name="creatureSkills" placeholder="Stealth +4, Deception +2" maxLength="120">
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
        <textarea id="creatureSpecialAbilities" name="creatureSpecialAbilities" maxLength="800" rows="5" cols="70"
        placeholder="Ambusher. When submerged in water, the dragon has advantage on Stealth checks. If the dragon hits a creature that can't see it with its bite, it can deal piercing damage and grapple the target simultaneously.

Innate Spellcasting. The dragons spellcasting ability is Charisma (save DC 17). It can innately cast the following spells, requiring no material components. 3/day each: animate dead, fog cloud, legend lore, pass without trace, speak with dead"></textarea>
        <br>

        <button type="submit" value="Submit">Submit Creature</button>
    </form>
</body>
<c:import url="footer.jsp"/>