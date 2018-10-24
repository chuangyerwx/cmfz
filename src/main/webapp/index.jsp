<%@page contentType="text/html;UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
1213213213213
<c:forEach items="${requestScope.admin}" var="admin">
    ${admin.id}&nbsp;&nbsp;&nbsp;&nbsp;
    ${admin.name}&nbsp;&nbsp;&nbsp;&nbsp;
    ${admin.password}&nbsp;&nbsp;&nbsp;&nbsp;
</c:forEach>
</body>
</html>
