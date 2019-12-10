<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TIENDAMOVIL</title>
</head>
<body bgcolor="cyan">
	<div align="center">
		<h1 style="color: DodgerBlue;">TIENDA DE MOVILES ONLINE TIENDAMOVIL</h1><br/><br/>
		<div align="center">
			<h2><c:out value="Bienvenido a nuestra tienda ${sessionScope.nombrecompl}"/><br><br>
				Referencia&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Articulo
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Precio<br><br></h2>
					<c:forEach var="element" items="${sessionScope.artiBd}">
						<c:out value="${element.numarti}" />&nbsp;&nbsp;&nbsp;
						<c:out value="${element.resumen}" />
						<c:out value="${element.PVP}" /><br>
					</c:forEach>
			<div align="center">
				<form action="elec" method="POST">
				  	<h2 style="color: red;">seleccione un articulo para ver sus detalles
					 <input type="text"	name="eleccion" size="1"><br> <input type="submit" value="Ver detalles"/></h2>
				</form>
			</div>
				<form action="vercesta.jsp">
					<input type="submit" value="Ver tu cesta" />
				</form>
				<form action="Servlecerrarsesion">
					<input type="submit" value="Cerrar sesion" />
				</form>
		</div>
	</div>
</body>
</html>
