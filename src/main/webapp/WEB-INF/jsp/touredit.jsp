<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title Tour</title>
</head>


<body>
<div align="center">
    <h1>Изменить тур</h1>
</div>
<form:form method="POST" action="/update/${editTour.get().id}">
    <div class="form-style-6">
        <table>
            <tr>
                <td>Номер тура :</td>
                <td><input type="hidden" value="${editTour.get().id}" readonly="readonly"/>${editTour.get().id}</td>
            </tr>
            <br/>

            <td>Оператор :</td>
            <td><input type="text" name="nameTurOperator"
                       value="<c:out value="${editTour.get().nameTurOperator}" />"/><br></td>
            </tr>

            <tr>
                <td>Создание обявления :</td>
                <td><input type="date" name="dateMassage"
                           value="<c:out value="${editTour.get().dateMassage}" />"/><br></td>
            </tr>
            <tr>
                <td>Отель :</td>
                <td><input type="text" name="nameTur"
                           value="<c:out value="${editTour.get().nameTur}" />"/><br></td>
            </tr>
            <tr>
                <td>Страна :</td>
            <td><select name="country">
                <c:forEach var="country" items="${country}">
                    <option value="${country.id}"
                        ${country.id == editTour.get().country.id ? 'selected="selected"' : null}>${country.name}</option>
                </c:forEach>
            </td>
            <tr>
                <td>Дата вылета :</td>
                <td><input type="datetime-local" name="dateDeparture"
                           value="<c:out value="${editTour.get().dateDeparture}" />"/></td>
                <br>
            </tr>
            <tr>
                <td> Цена :</td>
                <td><input type="number" name="tourPrice"
                           value="<c:out value="${editTour.get().tourPrice}" />"/></td>
                <br>
            </tr>
            <tr>
                <td><input type="submit" value="Отправить"></td>
            </tr>

        </table>
    </div>
</form:form>

</body>
</html>
