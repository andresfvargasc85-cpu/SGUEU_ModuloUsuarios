<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registro de Usuario - SGUEU</title>
</head>
<body>
    <h2>Registro de Usuario - SGUEU</h2>
    <form action="RegistroUsuarioServlet" method="post">
        <label>Nombre completo:</label><br>
        <input type="text" name="nombreCompleto" required><br><br>

        <label>Correo electrónico:</label><br>
        <input type="email" name="correo" required><br><br>

        <label>Nombre de usuario:</label><br>
        <input type="text" name="username" required><br><br>

        <label>Rol:</label><br>
        <select name="rol" required>
            <option value="Administrador">Administrador</option>
            <option value="Analista">Analista</option>
            <option value="Usuario">Usuario</option>
        </select><br><br>

        <input type="submit" value="Registrar usuario">
    </form>
</body>
</html>
