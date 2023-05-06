<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="head.jsp"/>
<body>
<h2>${encounter.getEncounterName()}</h2>
<table id="encounterTable">
    <thead>
    <th>Creature ID</th>
    <th>Creature Name</th>
    </thead>
    <tbody>
    <c:forEach var="creature" items="${selectedEncounter.getCreatures()}">
        <tr>
            <td>${creature.getId()}</td>
            <td>${creature.getCreatureName()}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
<c:import url="footer.jsp"/>