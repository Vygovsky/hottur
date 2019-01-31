<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Roman_v
  Date: 25.12.2018
  Time: 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AllTour</title>

    <style>
        table {
            font-family: "Lucida Sans Unicode", "Lucida Grande", Sans-Serif;
            font-size: 14px;
            border-radius: 10px;
            border-spacing: 0;
            text-align: center;
        }

        th {
            background: #BCEBDD;
            color: white;
            text-shadow: 0 1px 1px #2D2020;
            padding: 10px 20px;
        }

        th, td {
            border-style: solid;
            border-width: 0 1px 1px 0;
            border-color: white;
        }

        th:first-child, td:first-child {
            text-align: left;
        }

        th:first-child {
            border-top-left-radius: 10px;
        }

        th:last-child {
            border-top-right-radius: 10px;
            border-right: none;
        }

        td {
            padding: 10px 20px;
            background: #F8E391;
        }

        tr:last-child td:first-child {
            border-radius: 0 0 0 10px;
        }

        tr:last-child td:last-child {
            border-radius: 0 0 10px 0;
        }

        tr td:last-child {
            border-right: none;
        }
    </style>
    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/materialize.min.css" media="screen,projection"/>

    <!--Let browser know website is optimized for mobile-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
</head>

<body>
<nav>
    <div class="nav-wrapper">
        <form>
            <div class="input-field">
                <input id="search" type="search" required>
                <label class="label-icon" for="search"><i class="material-icons">search</i></label>
                <i class="material-icons">close</i>
            </div>
        </form>
    </div>
</nav>
<p><a href="${pageContext.request.contextPath}/add">Add a new tour</a></p>

<h2 align="center">Все горячие туры </h2>
<table align="center">
    <thead>
    <tr>
        <th>#</th>
        <th>Date massage</th>
        <th>Name Operator</th>
        <th>Hotel</th>
        <th>Country</th>
        <th>Departure</th>
        <th>Price</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach var="tours" items="${all_ListTur}">
        <tr>
            <td>${tours.id}</td>
            <td>${tours.dateMassage}</td>
            <td>${tours.nameTurOperator}</td>
            <td>${tours.nameTur}</td>
            <td>${tours.country.name}</td>
            <td>${tours.dateDeparture}</td>
            <td>${tours.tourPrice}</td>


            <td><a href="/edit/${tours.id}">Edit</a></td>
            <td><a href="/tour/delete/${tours.id}">Delete</a></td>


                <%-- <form action="editEmployee" method="post">
                                 &lt;%&ndash;  <button type="submit" name="update" value="${user.id}">update</button>&ndash;%&gt;
                             <td><a href="/editEmployee?id=<c:out value='${empl.id}'/>">Edit</a></td>

                             <form action="deleteEmployee?id=" method="get">
                                 <td><a href="/deleteEmployee?id=<c:out value='${empl.id}'/>">Delete</a></td>

                             </form>--%>
        </tr>
    </c:forEach>

    </tbody>
</table>

<script type="text/javascript" src="/js/materialize.min.js"></script>
</body>
</html>
