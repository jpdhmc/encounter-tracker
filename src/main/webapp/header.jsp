<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header>
  <div class="p-2 bg-light">
    <h1>Combat Companion</h1>
    <p>By John Den Hartog</p>
  </div>

  <nav class="navbar navbar-expand-sm navbar-light bg-light">
      <form class="mr-1 ml-1" action="/index.jsp">
        <input class="btn btn-primary" type="submit" value="Home">
      </form>
      <c:choose>
        <c:when test="${empty loggedInUser}">
          <form class="mr-1 ml-1" action="/logIn" method="post">
            <input class="btn btn-primary" type="submit" value="Log in">
          </form>
        </c:when>
        <c:otherwise>
          <form class="mr-1 ml-1" action="/displayEncounterList" method="post">
            <input class="btn btn-primary" type="submit" value="View your encounters">
          </form>
        </c:otherwise>
      </c:choose>
  </nav>
</header>