<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header>
  <h1>JDH's Combat Companion</h1>
  <a href="index.jsp">Home</a>

  <c:choose>
    <c:when test="${empty loggedInUser}">
      <form action="/logIn" method="post">
        <input type="submit" value="Log in">
      </form>
    </c:when>
    <c:otherwise>
      <h3>Welcome, ${loggedInUser.getUsername()}!</h3>
      <form action="/displayEncounterList" method="post">
        <input type="submit" value="View your encounters">
      </form>
    </c:otherwise>
  </c:choose>
  <hr class="solid">
</header>