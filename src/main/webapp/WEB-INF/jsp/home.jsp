<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="pl">
<head>
    <meta charset="utf-8">

    <link href="/css/main.css" rel="stylesheet">
    <title>MVC Lombok
        Podstawy </title>

</head>
<body>
<h1>Spring SDA academy </h1>
<h2 class="hello-title">Sample Hello! ${name}</h2>
<script src="/js/main.js"></script>
<div>
    ${projects}<br>
</div>
-------
<hr>
<div>
    ${project.name}
</div>
<div>
    <table border="1" class="table">
        <c:forEach items="${projects}" var="item">
            <tr>
                <td>${item.name}</td>
                <td>${item.startDate}</td>
                <td>${item.team}</td>

            </tr>
        </c:forEach>
    </table>


</div>
</body>

</html>
