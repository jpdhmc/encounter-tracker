<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="head.jsp"/>
<body>
  <c:import url="header.jsp"/>
  <h2>Your Encounters</h2>
  <table id="encounterTable">
    <thead>
    <th>Encounter Number</th>
    <th>Name</th>
    </thead>
    <tbody>
    <c:forEach var="encounter" items="${encounterList}">
      <tr>
        <td>${encounter.getId()}</td>
        <td><a href="/displayEncounter?selectedEncounter=${encounter.getId()}">${encounter.getEncounterName()}</a></td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  <a href="createEncounter.jsp">Create an Encounter</a>
</body>
<c:import url="footer.jsp"/>