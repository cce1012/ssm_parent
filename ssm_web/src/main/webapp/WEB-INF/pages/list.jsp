<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<c:forEach items="${list}" var="acc">
    ${acc.name}
</c:forEach>
<br/>
${list}
<br/>
<a>hfdslflsa</a>
</body>
</html>