<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="head.jsp"/>
<body>
    <c:import url="header.jsp"/>
    <h2>${selectedCreature.getCreatureName()}</h2>
    <form action="updateCreature" method="post">
        <input type="hidden" name="selectedEncounter" value="${selectedEncounter.getId()}">
        <input type="hidden" name="editingCreature" value="${selectedCreature.getId()}">
        <table class="table table-bordered table-striped table-hover">
            <thead>
                <th>Creature Name</th>
                <th>Max Hitpoints</th>
                <th>Hit Dice</th>
                <th>Size</th>
                <th>Type</th>
                <th>Alignment</th>
                <th>Armor Class</th>
                <th>Speed</th>
                <th>Stats</th>
                <th>Saves</th>
                <th>Skill Bonuses</th>
                <th>Vulnerabilities</th>
                <th>Resistances</th>
                <th>Damage Immunities</th>
                <th>Condition Immunities</th>
                <th>Senses</th>
                <th>Languages</th>
                <th>Challenge Rating</th>
                <th>Actions</th>
                <th>Reactions</th>
                <th>Legendary Actions</th>
                <th>Special Abilities</th>
            </thead>
            <tbody>
                <tr>
                    <!--TODO: Finish this-->
                    <td>
                        <input type="text" id="creatureName" name="creatureName" maxLength="60" value="${selectedCreature.getCreatureName()}" required>
                    </td>
                    <td>
                        <input type="text" id="creatureMaxHitpoints" name="creatureMaxHitpoints" value="${selectedCreature.getMaxHitpoints()}" required>
                    </td>
                    <td>
                        <input type="text" id="creatureHitDice" name="creatureHitDice" value="${selectedCreature.getHitDice()}">
                    </td>
                    <td>
                        <input type="text" id="creatureSize" name="creatureSize" value="${selectedCreature.getSize()}">
                    </td>
                    <td>
                        <input type="text" id="creatureType" name="creatureType" value="${selectedCreature.getType()}">
                    </td>
                    <td>
                        <input type="text" id="creatureAlignment" name="creatureAlignment" value="${selectedCreature.getAlignment()}">
                    </td>
                    <td>
                        <input type="text" id="creatureArmorClass" name="creatureArmorClass" value="${selectedCreature.getArmorClass()}">
                    </td>
                    <td>
                        <input type="text" id="creatureSpeed" name="creatureSpeed" value="${selectedCreature.getSpeed()}">
                    </td>
                    <td>
                        STR: <input type="text" id="creatureStrength" name="creatureStrength" value="${selectedCreature.getStrength()}">
                        DEX: <input type="text" id="creatureDexterity" name="creatureDexterity" value="${selectedCreature.getDexterity()}">
                        CON: <input type="text" id="creatureConstitution" name="creatureConstitution" value="${selectedCreature.getConstitution()}">
                        INT: <input type="text" id="creatureIntelligence" name="creatureIntelligence" value="${selectedCreature.getIntelligence()}">
                        WIS: <input type="text" id="creatureWisdom" name="creatureWisdom" value="${selectedCreature.getWisdom()}">
                        CHA: <input type="text" id="creatureCharisma" name="creatureCharisma" value="${selectedCreature.getCharisma()}">
                    </td>
                    <td>
                        STR Save: <input type="text" id="creatureStrengthSave" name="creatureStrengthSave" value="${selectedCreature.getStrengthSave()}">
                        DEX Save: <input type="text" id="creatureDexteritySave" name="creatureDexteritySave" value="${selectedCreature.getDexteritySave()}">
                        CON Save: <input type="text" id="creatureConstitutionSave" name="creatureConstitutionSave" value="${selectedCreature.getConstitutionSave()}">
                        INT Save: <input type="text" id="creatureIntelligenceSave" name="creatureIntelligenceSave" value="${selectedCreature.getIntelligenceSave()}">
                        WIS Save: <input type="text" id="creatureWisdomSave" name="creatureWisdomSave" value="${selectedCreature.getWisdomSave()}">
                        CHA Save: <input type="text" id="creatureCharismaSave" name="creatureCharismaSave" value="${selectedCreature.getCharismaSave()}">
                    </td>
                    <td>
                        <input type="text" id="creatureSkills" name="creatureSkills" value="${selectedCreature.getSkillBonuses()}">
                    </td>
                    <td>
                        <input type="text" id="creatureVulnerabilities" name="creatureVulnerabilities" value="${selectedCreature.getVulnerabilities()}">
                    </td>
                    <td>
                        <input type="text" id="creatureResistances" name="creatureResistances" value="${selectedCreature.getResistances()}">
                    </td>
                    <td>
                        <input type="text" id="creatureDamageImmunities" name="creatureDamageImmunities" value="${selectedCreature.getDamageImmunities()}">
                    </td>
                    <td>
                        <input type="text" id="creatureConditionImmunities" name="creatureConditionImmunities" value="${selectedCreature.getConditionImmunities()}">
                    </td>
                    <td>
                        <input type="text" id="creatureSenses" name="creatureSenses" value="${selectedCreature.getSenses()}">
                    </td>
                    <td>
                        <input type="text" id="creatureLanguages" name="creatureLanguages" value="${selectedCreature.getLanguages()}">
                    </td>
                    <td>
                        <input type="text" id="creatureChallengeRating" name="creatureChallengeRating" value="${selectedCreature.getChallengeRating()}">
                    </td>
                    <td>
                        <input type="text" id="creatureActions" name="creatureActions" value="${selectedCreature.getActions()}">
                    </td>
                    <td>
                        <input type="text" id="creatureReactions" name="creatureReactions" value="${selectedCreature.getReactions()}">
                    </td>
                    <td>
                        <input type="text" id="creatureLegendaryActions" name="creatureLegendaryActions" value="${selectedCreature.getLegendaryActions()}">
                    </td>
                    <td>
                        <input type="text" id="creatureSpecialAbilities" name="creatureSpecialAbilities" value="${selectedCreature.getSpecialAbilities()}">
                    </td>
                </tr>
            </tbody>
        </table>
        <button type="submit" value="Submit">Save Creature</button>
    </form>
</body>
<c:import url="footer.jsp"/>