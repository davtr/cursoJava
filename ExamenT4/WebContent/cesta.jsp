<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
</html>
<body>

	<jsp:forward page="lisarti">

		<c:remove var="articulo" scope="session" />
		<c:remove var="precio" scope="session" />
		<c:set value="${artielec.descripcion}" var="articulo" scope="session" />
		<c:set value="${artielec.PVP}" var="precio" scope="session" />
</body>
</html>