<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="head.jsp"/>

    <body>
        <c:import url="header.jsp"/>
        <div class="container mt-5 text-center">
        <c:choose>
            <c:when test="${empty loggedInUser}">
                <h1>Please log in!</h1>
                <img src="sadgoblin.png" alt="A sad goblin">
            </c:when>
            <c:otherwise>
                <h1 class="newUserMessage">Thanks for logging in!</h1>
                <h3 class="newUserMessage">Click on the "view your encounters" button to get started!</h3>
                <img src="happygoblin.png" alt="A happy goblin">
            </c:otherwise>
        </c:choose>
        </div>
    </body>
<c:import url="footer.jsp"/>