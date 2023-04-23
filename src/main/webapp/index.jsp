<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="head.jsp"/>
<body>
    <c:import url="header.jsp"/>


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