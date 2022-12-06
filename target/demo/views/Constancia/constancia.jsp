<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body style="font-family: arial; font-size: 20px;">
    <img src="./assets/img/logo.jpg" alt="Logo" style="height: 100px" align="right">
    <center><br><br><br><br><br><br>
        <div style="position: absolute; left:179px; margin-right: 20px;"><b>
            LA RECTORA DEL JARDÍN INFANTÍL<br>
            CANGURITOS KINDERGARTEN<br><br><br>
        </div><br><br><br><br>
            HACE CONSTAR QUE: </center><br><br><br></b>
        
    <div style="position: block; margin-left: 40px; margin-right: 40px;">
        <div style="display: center">
            <c:forEach var="estudiante" items="${estudianteList}">
                <b>${estudianteList.get(0).getNombreEstudiante()} ${estudianteList.get(0).getApellidoEstudiante()}</b> 
                identificado(a) con documento de identidad <b>N° ${estudianteList.get(0).getDocumentoEstudiante()}</b>
                se encuentra matriculado(a) en el programa de Preescolar 
                en el grado kínder en el horario de 7:00 A.M. a 3:00 P.M.<br><br>
                La presente constancia se expide a solicitud del interesado el día 22 de 
                Noviembre del 2022, para ser presentada a quien interese.
            </c:forEach>
        </div><br><br><br><br>
        <img src="./assets/img/firma.jpg" alt="Firma"><br>
        María Angélica Palacios Suta<br>
        RECTORA<br>
        NIT. 9004681335<br><br><br><br><br><br><br><hr>
        <center><p>Bogotá, Cra. 97 #146d-04, Teléfono: 316 537058</p></center>
    </div>
</body>
</html>