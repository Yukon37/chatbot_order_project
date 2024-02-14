

import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class NewServlet extends HttpServlet {
  
  protected void processRequest(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    request.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=UTF-8");
    String msg = (String)request.getParameter("msg");
    PrintWriter out = response.getWriter();
    out.println("");
    out.println("※あなたは、「" + msg + "」と送信しました。");
    out.println("");
    out.close();
  }
  
  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    processRequest(request, response);
  }

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    processRequest(request, response);
  }
}