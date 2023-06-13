<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="head.jsp"/>
<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#monsterTable').DataTable();
    } );
</script>
<body>
<c:import url="header.jsp"/>
<div class="container p-2 text-center">
<h2>Monsters:</h2>
<table class="table table-bordered table-striped table-hover" id="monsterTable">
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
                <form id="addConvertedCreatureToEncounterForm" action="addConvertedCreatureToEncounter" method="POST">
                    <input type="hidden" name="selectedEncounter" value="${selectedEncounter.getId()}">
                    <input type="hidden" name="slugToConvert" value="${monster.getSlug()}">
                    <button class="btn btn-primary" type="submit" value="Submit">Add this creature</button>
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>
</body>
<c:import url="footer.jsp"/>