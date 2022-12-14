/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bo
 */
public class NoteServlet extends HttpServlet {

    // <e
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");

        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        String title=br.readLine();
        String content="";
        while(br.ready()){
            content+=br.readLine();
        }
        br.close();
        request.setAttribute("title", title);
        request.setAttribute("content", content);
        if(request.getParameter("edit")!=null){
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        return;
        }
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        return;
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String content = request.getParameter("content");
       String path = getServletContext().getRealPath("/WEB-INF/note.txt");
       PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
       content=content.replaceAll("\\n", "<br>");
       pw.println(title);
       pw.println(content);
       pw.close();
       response.sendRedirect("note");
       return;
    }

}
