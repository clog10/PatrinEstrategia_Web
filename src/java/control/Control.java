/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carlos Loaeza
 */
@WebServlet(name = "Control", urlPatterns = {"/Control"})
public class Control extends HttpServlet {

    IndicadoresSalud is;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher calculo = request.getRequestDispatcher("resultados.jsp");
        String nombre = request.getParameter("nombre");
        String s = request.getParameter("sexo");
        char sexo = s.charAt(0);
        int edad = Integer.parseInt(request.getParameter("edad"));
        int estatura = Integer.parseInt(request.getParameter("estatura"));
        double peso = Double.parseDouble(request.getParameter("peso"));
        int acti = Integer.parseInt(request.getParameter("actividad"));
        int cintura = Integer.parseInt(request.getParameter("cintura"));
        int cadera = Integer.parseInt(request.getParameter("cadera"));
        int resultado = Integer.parseInt(request.getParameter("resultado"));
        Persona p = new Persona(nombre, sexo);
        if (resultado == 0) {
            is = new GeneralSana(peso, estatura, edad, new MetodoKC_CS(), cintura, cadera, p);
        } else if (resultado == 1) {
            MetodoBH cr = new MetodoBH();
            cr.setFactorActividad(acti);
            is = new CondicionDetallada(peso, estatura, edad, cr, cintura, cadera, p);
        } else if (resultado == 2) {
            MetodoHB cr = new MetodoHB();
            cr.setFactorActividad(acti);
            is = new CondicionDetallada(peso, estatura, edad, cr, cintura, cadera, p);
        }
        double calorias = is.req_kc();
        request.setAttribute("calorias", calorias);
        request.setAttribute("resultado", resultado);
        request.setAttribute("acti", acti);
        request.setAttribute("indicador", is);
        calculo.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
