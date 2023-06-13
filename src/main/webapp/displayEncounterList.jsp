<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="head.jsp"/>
<script type="text/javascript" class="init">
  $(document).ready( function () {
    $('#encounterTable').DataTable();
  } );
</script>
<body>
  <c:import url="header.jsp"/>
  <div class="container p-2 text-center">
  <h2>Your Encounters</h2>
  <table class="table table-bordered table-striped table-hover" id="encounterTable">
    <thead>
    <th>Encounter Number</th>
    <th>Name</th>
    </thead>
    <tbody>
    <c:set var="i" value="0"/>
    <c:forEach var="encounter" items="${encounterList}">
      <tr>
        <c:set var="i" value="${i + 1}"/>
        <td>${i}</td>
        <td>${encounter.getEncounterName()}
          <form action="displayEncounter" method="post">
            <input type="hidden" name="selectedEncounter" value="${encounter.getId()}">
            <input class="btn btn-primary" type="submit" value="View">
          </form>
          <c:if test="${encounter.getEncounterName() != 'Creature Collection'}">
          <form action="deleteEncounter" method="post">
            <input type="hidden" name="deletingEncounter" value="${encounter.getId()}">
            <input class="btn btn-primary" type="submit" value="Delete">
          </form>
          </c:if>
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  <form id="createEncounterForm" action="createEncounter" method="POST">
    <label for="encounterName">Or... Create a new encounter!</label>
    <input type="text" id="encounterName" name="encounterName" placeholder="Name" maxLength="30" required>
    <br>
    <button class="btn btn-primary" type="submit" value="Submit">Create a new encounter</button>
  </form>
  </div>
</body>
<c:import url="footer.jsp"/>