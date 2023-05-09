<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="head.jsp"/>
<body>
<c:import url="header.jsp"/>
<h2>Monsters:</h2>
<table id="monsterTable">
    <thead>
    <th>Name</th>
    <th>HP</th>
    <th>Stats</th>
    <th>CR</th>
    </thead>
    <tbody>
    <c:forEach var="monster" items="${monsterList}">
        <tr>
            <td>${monster.getName()}</td>
            <td>${monster.getHitPoints()}</td>
            <td>STR: ${monster.getStrength()} - DEX: ${monster.getDexterity()} - CON: ${monster.getConstitution()} - WIS: ${monster.getWisdom()} - CHA: ${monster.getCharisma()}</td>
            <td>${monster.getCr()}
                <form action="addConvertedCreatureToEncounter" method="post">
                    <input type="hidden" name="selectedEncounter" value="${selectedEncounter.getId()}">
                    <input type="hidden" name="slugToConvert" value="${monster.getSlug()}}">

                    <p>Add this creature to your Creature Collection?</p>
                    <label for="creatureAddToCollectionTrue">Yes</label>
                    <input type="radio" id="creatureAddToCollectionTrue" name="creatureAddToCollection" value="creatureAddToCollectionTrue">

                    <label for="creatureAddToCollectionFalse">No</label>
                    <input type="radio" id="creatureAddToCollectionFalse" name="creatureAddToCollection" value="creatureAddToCollectionFalse" checked>
                    <button type="submit" value="Submit">Save Creature</button>
                    <input type="submit" value="Add this creature">
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
<c:import url="footer.jsp"/>