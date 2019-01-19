<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title Tour</title>
</head>


<body>
<div align="center">
    <h1>Создать тур</h1>
</div>
<form method="POST" action="${pageContext.request.contextPath}/save">
    <div class="form-style-6">
        <table>

            <tr>
                <td>Оператор :</td>
                <td><input type="text" name="nameTurOperator" ><br></td>
            </tr>
            <tr>
                <td>Создание обявления :</td>
                <td><input type="date" name="dateMassage"><br></td>
            </tr>
            <tr>
                <td>Отель :</td>
                <td><input type="text" name="nameTur"><br></td>
            </tr>
            <tr>
                <td>Страна :</td>
                <td>
               <%--     <c:forEach var="depart" items="${departments}">
                        <option value="${depart.id}"
                            ${depart.id == currentDepartId ? 'selected="selected"' : null}>${depart.name}</option>
                    </c:forEach>--%>
                    <label>
                    <select name="country">
                        <option selected value="Turkish">Turkish</option>
                        <option value="Spain">Spain</option>
                        <option value="Egypt">Egypt</option>
                        <option value="Usa">Usa</option>
                    </select>
                </label>
                </td>
            </tr>
            <tr>
                <td>Дата вылета :</td>
                <td><input type="datetime-local" name="dateDeparture" ></td>
                <br>
            </tr>
            <tr>
                <td> Цена :</td>
                <td><input type="number" name="tourPrice"></td>
                <br>
            </tr>
            <tr>
                <td><input type="submit" value="Отправить"></td>
            </tr>
        </table>
    </div>
</form>

</body>
</html>
