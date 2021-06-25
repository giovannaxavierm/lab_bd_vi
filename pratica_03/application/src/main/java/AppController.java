/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({"/raizQuadrada.action"})
public class AppController extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res){
        double number = Double.valueOf(req.getParameter("number"));
        Calculadora c = new Calculadora();
        double raiz = c.raizQuadrada(number);
        ServletContext sc = req.getServletContext();
        try{
            req.setCharacterEncoding("UTF-8");
            res.setContentType("text/html");
            res.setCharacterEncoding("UTF-8");
            req.setAttribute("raiz", raiz);
            sc.getRequestDispatcher("/jsp/response.jsp").forward(req, res);
        }catch (Exception e){}
    }
}
