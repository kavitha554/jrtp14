<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3> Contact Info</h3>

 <form:form action ="saveContact?contactId= ${contact.contactId}" method = "POST" modelAttribute= "contact">
 ${succMsg}
  <table>
   <tr>
<td> Name:</td>
<td><form: input path = "contactName"/></td>
</tr>
<tr>
<td> Email:</td>
<td><form: input path = "contactEmail"/></td>
</tr>
<tr>
<td> Phno:</td>
<td><form: input path = "contactPhno"/></td>
</tr>
<tr>
<td></td>
<td><input type = "Submit" value = "Submit" /></td>
</tr>
</table>

</form:form>
<a href = "view-Contacts">View All Contacts</a> 

</body>
</html>