<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="head.jsp"/>
<body>
    <c:import url="header.jsp"/>
    <h2>${selectedCreature.getCreatureName()}</h2>
    <form action="updateCreature" method="post">
        <input type="hidden" name="selectedEncounter" value="${selectedEncounter.getId()}">
        <input type="hidden" name="editingCreature" value="${selectedCreature.getId()}">
        <table>
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
            <th></th>
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
            </tr>
            </tbody>
        </table>
        <button type="submit" value="Submit">Save Creature</button>
    </form>
</body>
<c:import url="footer.jsp"/>