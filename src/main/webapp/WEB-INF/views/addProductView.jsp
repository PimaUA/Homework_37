<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Enter products details</h2>

<form:form action="saveProduct" modelAttribute="product">

Id <form:input path="id"/>
<br><br>
Name <form:input path="name"/>
<br><br>
Cost <form:input path="cost"/>
<br><br>

<input type="submit" value="Save Product"/>
<input type="submit" formaction="saveOrder" value="Complete order"/>

</form:form>

</body>

</html>