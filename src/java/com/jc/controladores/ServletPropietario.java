
package com.jc.controladores;

import com.jc.model.DAOUsuario;
import com.jc.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletPropietario extends HttpServlet {

  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String mensaje="no insertado";
        //Pedimos los valores
        
    int id=   Integer.parseInt(request.getParameter("id"));
    String nombre=    request.getParameter("nombre");
    String direccion=    String.parseString(request.getParameter("direccion"));
    int edad= Integer.parseInt(request.getParameter("edad"));
    String email= String.parseString(request.getParameter("email"));
    
    
    }
}