<%-- 
    Author: Fabrício Galende Marques de Carvalho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Retorno da verificação</title>
        <style>
            p{
                width: 50%;
                margin: auto;
                text-align: center;     
            }
            #raizParagraph{
                color: red;
            }
        </style>
    </head>
    <body>
        <p id="description"> Resultado da raiz quadrada: </p>
        <p id="raizParagraph">
            <%=request.getAttribute("raiz")%>
        </p>
    </body>
</html>
