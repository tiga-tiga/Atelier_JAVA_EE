<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 04/06/18
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<table>

    <tr>

        <th>From:</th>

        <th>To</th>

        <th>Content</th>

    </tr>

    <tr>

        <td>${mailbean.from}</td>
        <td>${mailbean.to}</td>
        <td>${mailbean.content}</td>
    </tr>

</table>


</body>
</html>