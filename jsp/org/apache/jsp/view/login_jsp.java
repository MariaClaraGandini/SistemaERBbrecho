package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouttopo.jsp", out, false);
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("<\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://unpkg.com/flowbite@1.5.3/dist/flowbite.min.css\"/>\r\n");
      out.write("    <script src=\"https://unpkg.com/flowbite@1.5.3/dist/flowbite.js\"></script>\r\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("    <script src=\"/path/to/cdn/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <title>HRB Kids | Entrar </title>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bg-gray-50 dark:bg-gray-800\" > \r\n");
      out.write("\r\n");
      out.write("    <script src=\"../path/to/flowbite/dist/flowbite.js\"></script>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    <script src=\"/src/notifier.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body class=\"bg-gray-50 dark:bg-gray-800 \">\r\n");
      out.write("      <div class=\"h-screen flex justify-center items-center  \">\r\n");
      out.write("          <div class=\"tamanhodiv -5 bg-white shadow-md rounded px-8 pb-8 mb-4\">\r\n");
      out.write("              <h1 class=\"text-3xl mb font-bold text-center text-gray-700\">Entrar</h1>\r\n");
      out.write("              <form method=\"POST\" action=\"/loginusuario\">\r\n");
      out.write("              <div class=\"mb-4\">\r\n");
      out.write("                <label class=\"mt-3 block text-gray-700 text-sm font-bold mb-2\" for=\"email\">\r\n");
      out.write("                  Nome de Usuário\r\n");
      out.write("                </label>\r\n");
      out.write("                <input type=\"text\" id=\"email\" name=\"login\" class=\"shadow border-1 border-gray-300 focus:border-gray-500 focus:ring-gray-500 rounded-lg w-full py-2 px-3 text-gray-700\"  placeholder=\"ciclano\" required>\r\n");
      out.write("                <div class=\"text\"></div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"mb-2\">\r\n");
      out.write("                <label class=\"block text-gray-700 text-sm font-bold mb-2\" for=\"password\">\r\n");
      out.write("                  Password\r\n");
      out.write("                </label>\r\n");
      out.write("                <input  type=\"password\" id=\"password\" name=\"senha\" class=\"shadow border-1 border-gray-300 focus:ring-gray-300 focus:border-gray-400 rounded-lg w-full py-2 px-3 text-gray-700\" id=\"password\" type=\"password\" placeholder=\"************\" required>\r\n");
      out.write("                <div class=\"senha\"></div>\r\n");
      out.write("              </div> \r\n");
      out.write("              <div>\r\n");
      out.write("              <a class=\" mb-6 inline-block align-baseline font-bold text-sm text-blue-500 hover:text-blue-800\" href=\"/cadastrarusuario\">\r\n");
      out.write("        Não possui uma conta? Cadastre-se!\r\n");
      out.write("      </a>\r\n");
      out.write("              <button type=\"submit\" class=\" w-full button  p-3 flex text-center rounded-lg\" onclick=\"validar()\"><p class=\"w-full  text-center \">Entrar</p></button>\r\n");
      out.write("              </div>\r\n");
      out.write("              </form>\r\n");
      out.write("      </div>\r\n");
      out.write("        <style>\r\n");
      out.write("          .tamanhodiv{\r\n");
      out.write("            width: 50%;\r\n");
      out.write("            padding-right: 5%;\r\n");
      out.write("            padding-left: 5%;\r\n");
      out.write("            padding-top: 5%;\r\n");
      out.write("            padding-bottom: 5%;\r\n");
      out.write("          }\r\n");
      out.write("          .button{\r\n");
      out.write("            \r\n");
      out.write("        margin-top: 2%;\r\n");
      out.write("        background-color: #0bde97;\r\n");
      out.write("        color: white;\r\n");
      out.write("        \r\n");
      out.write("       }\r\n");
      out.write("     input:focus{\r\n");
      out.write("      border-color: #0bde97\r\n");
      out.write("     }\r\n");
      out.write("\r\n");
      out.write("     .redirecionar{\r\n");
      out.write("      text-align: center;\r\n");
      out.write("     }\r\n");
      out.write("   \r\n");
      out.write("        </style>\r\n");
      out.write("        <script>\r\n");
      out.write("            \r\n");
      out.write("          function validar(){\r\n");
      out.write("            const email = document.getElementById(\"email\")\r\n");
      out.write("            const password = document.getElementById(\"password\")\r\n");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write("    if(email.value==''){\r\n");
      out.write("\r\n");
      out.write("    email.className=\" shadow border-1 border-red-500 focus:border-red-500 focus:ring-red-500 rounded-lg w-full py-2 px-3 text-gray-700\";\r\n");
      out.write("    let div= $(\"<p class='text-red-400 italic'>Preencha o campo de e-mail </p>\")\r\n");
      out.write("   $(\".text\").append(div);\r\n");
      out.write("  } \r\n");
      out.write("   if(password.value==''){\r\n");
      out.write("    password.className=\" shadow border-1 border-red-500 focus:border-red-500 focus:ring-red-500 rounded-lg w-full py-2 px-3 text-gray-700\";\r\n");
      out.write("    let div= $(\"<p class='text-red-400 italic'>Preencha o campo de senha </p>\")\r\n");
      out.write("   $(\".senha\").append(div)\r\n");
      out.write("    Inserir()\r\n");
      out.write("    div.remove()\r\n");
      out.write("\r\n");
      out.write("  }  \r\n");
      out.write("  \r\n");
      out.write("  else{\r\n");
      out.write("    email.className=\"shadow border-1 border-gray-300 focus:border-gray-500 focus:ring-gray-500 rounded-lg w-full py-2 px-3 text-gray-700\"\r\n");
      out.write("    div=\"\"\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("  }\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("        </script>  <!-- NAVBAR  -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layoutrodape.jsp", out, false);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
