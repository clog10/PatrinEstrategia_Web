<%-- 
    Document   : resultados
    Created on : 11/05/2021, 01:42:12 PM
    Author     : Carlos Loaeza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int actividad = (Integer) request.getAttribute("acti");
    String acti = "";

    switch (actividad) {
        case 0:
            acti = "Sedentario (no realiza)";
            break;
        case 1:
            acti = "Ligeramente Activo (realiza de 1-3 veces por semana)";
            break;
        case 2:
            acti = "Moderadamente activo (realiza de 3-5 veces por semana)";
            break;
        case 3:
            acti = "Muy Activo (realiza de 6-7 veces por semana)";
            break;
    }
%>
<%
    int r = (Integer) request.getAttribute("resultado");
    String resultado = "";
    String formula= "";
    switch(r){
        case 0:
            resultado ="No tan detallada";
            formula="Fórmula de Chris Shugart";
            break;
        case 1:
            resultado ="Detallada";
            formula="Fórmula de Brian Haycock";
            break;
        case 2:
            resultado ="Muy detallada";
            formula="Fórmula de Harris Benedict";
            break;
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
    <center>
        <h1>Resultados</h1>
        <h2>Datos proporcionados por el usuario</h2>
        <h3>Nombre: ${indicador.getPerson().getNombre()}</h3>
        <h3>
            Sexo: ${indicador.getPerson().getSexo()}, Edad:${indicador.getEdad()} años, Peso: ${indicador.getPeso()} Kg, Estatura: ${indicador.getEstatura()} cm, Actividad Física: <%= acti%>
        </h3>
        <h3>Tipo de información solicitada: <%= resultado%></h3>
        <h2>Fórmula Utilizada: <%=formula%></h2>
        <h2>Calorias requeridas: ${calorias}</h2>
    </center>
</body>
</html>
