
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head> 
        <title> Formulário Simples </title>
        <meta charset="utf-8">
        <style>
            form{
                width: 50%;
                margin: auto;
                text-align: center;     
            }

        </style>
    </head>
    <body>
        <form method="post" 
         action="raizQuadrada.action">
            Digite um número para verificar sua raiz quadrada: <input name="number"/>
            <input id="dataSender" type="submit">
        </form>
    </body>    
</html>