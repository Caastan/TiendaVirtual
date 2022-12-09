<!DOCTYPE html>
<%@page import="com.proyectoBBDDbien.bbdd.Usuariosrepositorios"%>
<%@page import="com.proyectoBBDDbien.entidades.UsuarioMapper"%>
<%@page import="com.proyectoBBDDbien.entidades.Usuarios"%>
<%@page import="java.util.List"%>

<html lang="en">
	<head>
	    <meta charset="UTF-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <title>Ver</title>
	</head>
	<body>
		<%  String lista = request.getParameter("lista");
		out.println(lista);
        %>
	    
	</body>
</html>