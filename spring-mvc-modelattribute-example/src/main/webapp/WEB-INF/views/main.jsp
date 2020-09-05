<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BORAJI.COM</title>
</head>
<body>
   <h1>@ModelAtrribute example</h1>
   <hr />

   <table>
      <tr>
         <td>Countries: ${countries}</td>
      </tr>
      <tr>
         <td>Cities: ${cities}</td>
      </tr>
      <tr>
         <td>Languages: ${languages}</td>
      </tr>
   </table>
<br>

${msg}

</body>
</html>