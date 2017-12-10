<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View CV page</title>
</head>
<body>
    </ul>
    <ul>
    <c:forEach var="cvValue" items="${cv}">
        <li>${cvValue}</li>
    </c:forEach>
    </ul>
    <br><br>
    <a href="/"> Home </a>
</body>
</html>