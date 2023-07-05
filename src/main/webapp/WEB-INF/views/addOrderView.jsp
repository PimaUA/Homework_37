<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Enter order details</h2>

<form:form action="addedOrderView" modelAttribute="order">

Id <form:input path="id"/>
<br><br>
Date <form:input path="date"/>
<br><br>
Cost <form:input path="cost"/>
<br><br>

<input type="submit" value="OK"/>

</form:form>

</body>

</html>