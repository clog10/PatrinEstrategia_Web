<%-- 
    Document   : index
    Created on : 10/05/2021, 04:29:18 PM
    Author     : Carlos Loaeza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido</title>
    </head>
    <body>
    <center>
        <h1>Bienvenido</h1>
        <form name="calculo" action="Control" method="post">
            <table>
                <thead>
                <th colspan="2" align="center"><h2>Ingresa tus datos</h2></th>
                </thead>
                <tbody>
                    <tr>
                        <td align="right">Nombre: </td>
                        <td>
                            <input type="text" name="nombre" required">
                        </td>
                    </tr>
                    <tr>
                        <td align="right">Sexo: </td>
                        <td> 
                            <input type="radio" name="sexo" value="M"> Mujer
                            <input type="radio" name="sexo" value="H"> Hombre
                        </td>
                    </tr>
                    <tr>
                        <td align="right">Edad: </td>
                        <td>
                            <input type="number" name="edad" required min="19" max="130">
                        </td>
                    </tr>
                    <tr>
                        <td align="right">Estatura (en cm): </td>
                        <td>
                            <input type="number" name="estatura" required min="140" max="200">
                        </td>
                    </tr>
                    <tr>
                        <td align="right">Peso (en kg): </td>
                        <td>
                            <input type="number" name="peso" required min="45" max="120">
                        </td>
                    </tr>
                    <tr>
                        <td align="right">Cintura (en cm): </td>
                        <td>
                            <input type="number" name="cintura" required min="20" max="200">
                        </td>
                    </tr>
                    <tr>
                        <td align="right">Cadera (en cm): </td>
                        <td>
                            <input type="number" name="cadera" required min="45" max="120">
                        </td>
                    </tr>
                    <tr>
                        <td align="right">¿Como desea sus resultados?: </td>
                        <td>
                            <select name="resultado">
                                <option value="0">No tan detallada</option>
                                <option value="1">Detallada</option>
                                <option value="2">Muy detallada</option>
                            </select>
                        </td> 
                    </tr>
                    <tr>
                        <td align="right">Actividad Física: </td>
                        <td>
                            <select name="actividad">
                                <option value="0">Sedentario (no realiza)</option>
                                <option value="1">Ligeramente Activo (realiza de 1-3 veces por semana)</option>
                                <option value="2">Moderadamente activo (realiza de 3-5 veces por semana)</option>
                                <option value="3">Muy Activo (realiza de 6-7 veces por semana)</option>
                            </select>
                        </td> 
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><input type="submit" value="Calcular" ></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </center>
</body>
</html>
