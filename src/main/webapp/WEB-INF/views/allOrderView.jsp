<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<body>

<h2>All orders list</h2>

<table>
<tr>
    <th>id</th><br>
    <th>date</th><br>
    <th>cost</th><br>
</tr>

<c:forEach var="tempOrder" items="${orderList}">

<tr>
    <td>${tempOrder.id}</td>
    <td>${tempOrder.date}</td>
    <td>${tempOrder.cost}</td>
</tr>
</c:forEach>

</table>

<br>

<input type="button" value="Return"
onClick="window.location.href='welcome'"/>


</body>
</html>