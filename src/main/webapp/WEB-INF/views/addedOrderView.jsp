<!DOCTYPE html>
<html>

<body>

<h2>Order info</h2>

<form action="saveOrder" modelAttribute="order">

Id <form:input path="id"/>
<br><br>
Name <form:input path="name"/>
<br><br>
Cost <form:input path="cost"/>
<br><br>

<input type="submit" value="Confirm"/>

</form>

<input type="button" value="Cancel"
onClick="window.location.href='welcome'"/>


</body>

</html>