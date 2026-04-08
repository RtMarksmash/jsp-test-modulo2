<%-- 
    Document   : index
    Created on : 5/04/2026, 9:51:32 a. m.
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/style.css"/>
        <title>JSP Page</title>
    </head>
    <body>
    <div class="cuerpo">
        <header>
            <img><img src="src" alt="alt"/>
            
        </header>
         <nav>
             <section>
                 <article>
                     <fieldset>
                         <legend>registrar usuario</legend>
                         <form  action="svEstudiante" method="POST"  >
                             <label for="TxtCodigo">Codigo</label><br>
                             <input type="number" id="TxtCodigo" name="Codigo"><br>
                             <label for="TxtNombre">Nombre</label><br>
                             <input type="number" id="TxtNombre" name="Nombre"><br>
                             <label for="TxtApellido">Apellido</label><br>
                             <input type="text" id="TxtApellido" name="Apellido"><br>
                             <label for="TxtEdad">Edad</label><br>
                             <input type="number" id="TxtEdad" name="Edad"><br>
                             
                             <input type="submit" value="Registrar">
                         </form>
                     </fieldset>
                 </article>
                 <article>
                     <fieldset>
                         <legend>Consultar Estudiante</legend>
                         <p>presiona el boton para consultar el estudiante</p>
                         <form>
                             <input type="submit" value="Consultar">
                         </form>
                     </fieldset>
                 </article>
             </section>
         </nav>
    </div>
        
    </body>
</html>
