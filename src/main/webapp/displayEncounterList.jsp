<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="head.jsp"/>
<body>
  <c:import url="header.jsp"/>
  <h2></h2>
  <table id="encounterTable">
    <thead>
    <th>Encounter Number</th>
    <th>Name</th>
    </thead>
    <tbody>
    <c:forEach var="encounter" items="${encounterList}">
      <tr>
        <a href="/displayEncounter?selectedEncounter=${encounter.getId()}">
        <td>${encounter.getId()}</td>
        </a>
        <td>${encounter.getEncounterName()}</td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</body>
<c:import url="footer.jsp"/>