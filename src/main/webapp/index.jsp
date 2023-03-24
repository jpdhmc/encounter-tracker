<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="head.jsp"/>
<body>
    <c:import url="header.jsp"/>
    <c:choose>
        <c:when test="${empty userName}">
            <a href = "logIn">Log in</a>
        </c:when>
        <c:otherwise>
            <h3>Welcome ${userName}</h3>
        </c:otherwise>
    </c:choose>

    <form action="displayUsers">
        <button type="submit" name="submit" value="getAll">Display Users</button>
    </form>
    <form action="searchMonster">
        <label for="monsterName">Monster name</label>
        <input type="text" id="monsterName" name="monsterName">
        <button type="submit" name="submit" value="monsterSearch">Search Monster</button>
    </form>
</body>
<c:import url="footer.jsp"/>