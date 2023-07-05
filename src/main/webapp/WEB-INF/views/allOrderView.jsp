<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<body>

<h2>All orders list</h2>
<br>

<table>
<tr>
    <th>id</th>
    <th>date</th>
    <th>cost</th>
</tr>

<c:forEach var="tempOrder" items="${allOrders}">
<tr>
    <td>${tempOrder.id}</td>
    <td>${tempOrder.date}</td>
    <td>${tempOrder.cost}</td>
</tr>
</c:forEach>

</table>

</body>
</html>