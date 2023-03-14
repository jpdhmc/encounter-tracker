<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="head.jsp"/>
<body>
<h2>Monster:</h2>
<table id="monsterTable">
    <thead>
    <th>CR</th>
    <th>HP</th>
    <th>Name</th>
    <th>Senses</th>
    <th>Actions</th>
    <th>Reactions</th>
    </thead>
    <tbody>
        <tr>
            <td>${monster.getCr()}</td>
            <td>${monster.getHitPoints()}</td>
            <td>${monster.getName()}</td>
            <td>${monster.getSenses()}</td>
            <td>
            <c:forEach var="action" items="${monster.getActions()}">
                NAME: ${action.getName()} - DESC: ${action.getDesc()}<br/>
            </c:forEach>
            </td>
            <td>
                <c:forEach var="reaction" items="${monster.getReactions()}">
                    NAME: ${reaction.getName()} - DESC: ${reaction.getDesc()}<br/>
                </c:forEach>
            </td>
        </tr>
    </tbody>
</table>
</body>
<c:import url="footer.jsp"/>