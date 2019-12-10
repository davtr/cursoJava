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
				<c:out value="Tu eleccion ${sessionScope.artielec.resumen}"/><br><br></h2>
					</div>
					<div align="center"><h3>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Descripcion &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	  					PVP &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  Stock <br></h3></div>
							<c:out value="${artielec.descripcion}"/>&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<c:out value="${artielec.PVP}"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<c:out value="${artielec.stock}"/><br><br>
							<c:set value="${artielec.descripcion}" var="articulo" scope="session" />
							<c:set value="${artielec.PVP}" var="precio" scope="session" />
					
					<div align="center">	
						<form action= "lisarti">
							<input type="submit" value="Agregar a la cesta" />
						</form>
						<form action="vaciarCesta.jsp">
							<input type="submit" value="Volver" />
						</form>
						<form action="Servlecerrarsesion">
							<input type="submit" value="Log out" />
						</form>
					</div>
	</div>
</body>
</html>