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
<form:form method="POST" action="/update?id=${editTour.get().id}&countries=${editTour.get().id}">
    <div class="form-style-6">
        <table>
            <tr>
                <td>Номер тура :</td>
                <td><input type="hidden" value="${editTour.get().id}" readonly="readonly"/></td>
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
                <td><label>
                    <%--<select name="country">
                        <option selected value="Turkish">Turkish</option>
                        <option value="Spain">Spain</option>
                        <option value="Egypt">Egypt</option>
                        <option value="Usa">Usa</option>
                    </select>--%>
                <%--    <select name="countries">
                        <c:forEach var="countries" items="${countries}">
                            <option value="${countries.get().country}">${countries.get().country}</option>
                        </c:forEach>

                    </select>--%>
            <tr>
                <td>Country :</td>
            <td><form:select path="country">
                    <form:option value="NONE" label="--- Select ---" />
                <c:forEach var="country" items="${countries}">
                    <form:option value="${country.country.toString()}"><c:out value="${country.country}"/></form:option>
                </c:forEach>
                </form:select>
                <%--<td><form:errors path="country" cssClass="error" /></td>--%>
            </tr>

                </label>
                </td>
            </tr>
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
