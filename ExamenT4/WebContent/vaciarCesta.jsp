<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
</html>
<body>
	<c:remove var="articulo" scope="session" />
	<c:remove var="precio" scope="session" />
	<jsp:forward page="lisarti" />
</body>
</html>