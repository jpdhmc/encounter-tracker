<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="head.jsp"/>
<body>
    <form id="createEncounterForm" action="createEncounter" method="POST">
        <label for="encounterName">Name</label>
        <input type="text" id="encounterName" name="encounterName" maxLength="30" required>
        <br>
        <button type="submit" value="Submit">Submit Encounter</button>
    </form>
</body>
<c:import url="footer.jsp"/>