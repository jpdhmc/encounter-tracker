<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header>
  <h1>JDH's Encounter Tracker</h1>
  <a href="index.jsp">Home</a>

  <c:choose>
    <c:when test="${empty loggedInUser}">
      <a href = "logIn">Log in</a>
    </c:when>
    <c:otherwise>
      <h3>Welcome ${loggedInUser.getUsername()}</h3>
      <a href="/displayEncounterList">View your encounters</a>
    </c:otherwise>
  </c:choose>
</header>