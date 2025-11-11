<%@ page import="model.UsuarioSGUEU" %>
<%
    UsuarioSGUEU usuario = (UsuarioSGUEU) request.getAttribute("usuarioRegistrado");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Usuario registrado - SGUEU</title>
</head>
<body>
<% if (usuario != null) { %>
    <h2>Usuario registrado correctamente en SGUEU</h2>
    <p><strong>Nombre completo:</strong> <%= usuario.getNombreCompleto() %></p>
    <p><strong>Correo:</strong> <%= usuario.getCorreo() %></p>
    <p><strong>Usuario:</strong> <%= usuario.getUsername() %></p>
    <p><strong>Rol asignado:</strong> <%= usuario.getRol() %></p>
<% } else { %>
    <h2>No se encontraron datos de registro.</h2>
<% } %>
<br>
<a href="RegistroUsuarioServlet">Registrar otro usuario</a>
</body>
</html>
