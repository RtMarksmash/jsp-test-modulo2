<%-- 
    Document   : listar
    Created on : Apr 12, 2026, 9:43:31 PM
    Author     : PC
--%>

<%@page import="java.util.List"%>
<%@page import="logica.Estudiante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            List<Estudiante> estudiantes=(List) request.getSession().getAttribute("listaEstudiante");
            int cont=1;
            for(Estudiante e:estudiantes){   
        %>
        <h1>listar Estudiantes</h1>
        
        <p>usuario numero<%=cont%></p>
        <p>Codigo<%=e.getCodigo()  %></p>
        <p>Nombre<%=e.getNombre()%></p>
        <p>Apellido<%=e.getApellido()%></p>
        <p>Edad<%=e.getEdad()%></p>
        
        <% cont=cont + 1;}   %>
        
    </body>
</html>
