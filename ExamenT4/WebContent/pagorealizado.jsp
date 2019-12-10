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
		<h2><c:out value="Realizaste el pago correctamente ${sessionScope.nombrecompl}"/></h2><br><br>	
		<h1 style="color: red;">Felicidades!!!!  compraste el articulo</h1><br/><br/>
		<div align="center"><h3>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Descripcion &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	  					PVP &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br></h3></div>	 
						<div align="center">
	 							<c:out value="${articulo}"
	 								default="la cesta esta vacia"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	 							<c:out value="${precio}"
	 								default=""/><br><br>
	 					</div>			
	 			<a href="vaciarCesta.jsp"><input type="submit" name="boton" value="ACEPTAR"></a><br/>
				<a href="Servlecerrarsesion"><input type="submit" name="boton" value="Cerrar Sesion"></a><br/>
		</div>
	</div>
</body>
</html>