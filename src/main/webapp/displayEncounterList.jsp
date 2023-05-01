<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="head.jsp"/>
<body>
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
        <td>${encounter.getEncounterName()}</td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</body>
<c:import url="footer.jsp"/>