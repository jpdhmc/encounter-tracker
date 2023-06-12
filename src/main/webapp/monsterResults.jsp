<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="head.jsp"/>
<body>
    <c:import url="header.jsp"/>
    <h2>Monsters:</h2>
    <table class="table table-bordered table-striped table-hover" id="monsterTable">
        <thead>
        <th>Name</th>
        <th>AC</th>
        <th>HP</th>
        <th>Speed</th>
        <th>Stats</th>
        <th>Saving Throws</th>
        <th>Damage Immunities</th>
        <th>Senses</th>
        <th>Languages</th>
        <th>CR</th>
        <th>Special Abilities</th>
        <th>Actions</th>
        <th>Reactions</th>
        <th>Legendary Actions</th>
        </thead>
        <tbody>
            <c:forEach var="monster" items="${creatureList}">
            <tr>
                <td>${monster.getName()}</td>
                <td>${monster.getArmorClass()}</td>
                <td>${monster.getHitPoints()}</td>
                <td>
                    <c:if test="${monster.getSpeed().getWalk() > 0}">
                        Walk: ${monster.getSpeed().getWalk()}
                    </c:if>
                    <c:if test="${monster.getSpeed().getFly() > 0}">
                        Fly: ${monster.getSpeed().getFly()}
                    </c:if>
                    <c:if test="${monster.getSpeed().getSwim() > 0}">
                        Swim: ${monster.getSpeed().getSwim()}
                    </c:if>
                    <c:if test="${monster.getSpeed().getClimb() > 0}">
                        Climb: ${monster.getSpeed().getClimb()}
                    </c:if>
                    <c:if test="${monster.getSpeed().getBurrow() > 0}">
                        Burrow: ${monster.getSpeed().getBurrow()}
                    </c:if>
                    <c:if test="${monster.getSpeed().getHover() == true}">
                        Hover: ${monster.getSpeed().getHover()}
                    </c:if>
                </td>
                <td>STR: ${monster.getStrength()} - DEX: ${monster.getDexterity()} - CON: ${monster.getConstitution()} - WIS: ${monster.getWisdom()} - CHA: ${monster.getCharisma()}</td>
                <td>STR: ${monster.getStrengthSave()} - DEX: ${monster.getDexteritySave()} - CON: ${monster.getConstitutionSave()} - WIS: ${monster.getWisdomSave()} - CHA: ${monster.getCharismaSave()}</td>
                <td>${monster.getDamageImmunities()}</td>
                <td>${monster.getSenses()}</td>
                <td>${monster.getLanguages()}</td>
                <td>${monster.getCr()}</td>
                <td>
                    <c:forEach var="ability" items="${monster.getSpecialAbilities()}">
                        NAME: ${ability.getName()} - DESC: ${ability.getDesc()}<br/>
                    </c:forEach>
                </td>
                <td>
                    <c:forEach var="action" items="${monster.getActions()}">
                        NAME: ${action.getName()} - DESC: ${action.getDesc()}<br/>
                    </c:forEach>
                </td>
                <td>
                    <c:forEach var="reaction" items="${monster.getReactions()}">
                        NAME: ${reaction.getName()} - DESC: ${reaction.getDesc()}<br/>
                    </c:forEach>
                </td>
                <td>
                    <c:forEach var="legendaryAction" items="${monster.getLegendaryActions()}">
                        NAME: ${legendaryAction.getName()} - DESC: ${legendaryAction.getDesc()}<br/>
                    </c:forEach>
                </td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
<c:import url="footer.jsp"/>