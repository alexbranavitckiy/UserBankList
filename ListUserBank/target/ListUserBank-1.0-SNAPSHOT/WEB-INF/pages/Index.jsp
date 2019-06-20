<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 19.06.2019
  Time: 7:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<table>
    <caption>User and Account</caption>
    <tr>
        <th>userid</th>
        <th>name</th>
        <th>sureName</th>

    </tr>
    <c:forEach var="user" items="${List}" varStatus="i">
        <tr>
            <td>${user.userid}</td>
            <td>${user.name}</td>
            <td>${user.sureName}</td>

            <td><a href="<c:url value="/delete/${user.userid}"/>">delete</a></td>
        </tr>
    </c:forEach>
    <tr>
        <th>accountid</th>
        <th>account</th>
        <th>userid</th>

    </tr>
    <c:forEach var="account" items="${AccountList}" varStatus="j">
        <tr>
            <td>${account.accountid}</td>
            <td>${account.account}</td>
            <td>${account.userid}</td>
            <td><a href="<c:url value="/deleter/${account.userid}"/>">delete</a></td>
        </tr>
        </tr>
    </c:forEach>
</table>
<a href="<c:url value=""/>">сумма всех аккаунтов</a><br>${summ} <br>
    <a href="<c:url value=""/>">самый богатый пользователь</a><br>${rich} <br>

</body>

    </body>
    </html>


