<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="head.jsp"/>
  <body>
  <c:import url="header.jsp"/>
    <h2>Users</h2>
    <table id="encounterTable">
      <thead>
        <th>ID</th>
        <th>Name</th>
        <th>Encounters</th>
      </thead>
      <tbody>
      <c:forEach var="user" items="${users}">
        <tr>
          <td>${user.id}</td>
          <td>${user.username}</td>
          <td>
          <c:forEach var="encounter" items="${user.encounters}">
            ID: ${encounter.id} - Encounter Name: ${encounter.encounterName}<br/>
          </c:forEach>
          </td>
        </tr>
      </c:forEach>
      </tbody>
    </table>
  </body>
<c:import url="footer.jsp"/>