package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class layouttopo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\r\n");
      out.write("    <title>\r\n");
      out.write("      ERP HRB Kids\r\n");
      out.write("    </title>\r\n");
      out.write("    <meta name=\"description\" content=\"Simple landind page\" />\r\n");
      out.write("    <meta name=\"keywords\" content=\"\" />\r\n");
      out.write("    <meta name=\"author\" content=\"\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://unpkg.com/tailwindcss@2.2.19/dist/tailwind.min.css\"/>\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://unpkg.com/flowbite@1.5.3/dist/flowbite.min.css\" />\r\n");
      out.write("    <script src=\"https://unpkg.com/flowbite@1.5.3/dist/flowbite.js\"></script>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,700\" rel=\"stylesheet\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/notifier.css\">\r\n");
      out.write("        <script type=\"text/javascript\" src=\"http://www.google.com/jsapi\"></script>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,700\" rel=\"stylesheet\" />\r\n");
      out.write("    \r\n");
      out.write("  </head>\r\n");
      out.write("  <body class=\"leading-normal tracking-normal text-white gradient bg-gray-50 dark:bg-gray-800  \" style=\"font-family: 'Source Sans Pro', sans-serif;\">\r\n");
      out.write("    <!--Nav-->\r\n");
      out.write("    <script src=\"./js/notifier.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("     \r\n");
      out.write("    <nav class=\"bg-white border-gray-300 dark:bg-gray-900 w-full\">\r\n");
      out.write("        <div class=\"flex flex-wrap w-full  h-15 justify-between tamanho\">\r\n");
      out.write("          <div class=\"flex ml-4 tirarmargin\">\r\n");
      out.write("          <a href=\"/index\" class=\"flex items-start\">\r\n");
      out.write("            <img src=\"./imagens/logohrb.png\" class=\"  mr-3 mt-1 h-12 w-12 logo\" alt=\"HRB Kids Logo\" />\r\n");
      out.write("        </a>\r\n");
      out.write("    \r\n");
      out.write("        <!-- escolha do idioma -->\r\n");
      out.write("  \r\n");
      out.write("        <!-- TELAS -->\r\n");
      out.write("        <div class=\"navcontainer\">\r\n");
      out.write("        <div class=\"hidden  navbarmobile w-full md:flex md:w-auto md:order-1\" id=\"navbar-sticky\">\r\n");
      out.write("          <ul class=\"flex flex-col p-4 mt-4 optionsnav rounded-lg md:flex-row md:space-x-8 md:mt-0  md:font-medium md:border-0\">\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"/listarprodutos\" id=\"Produtos\" class=\"block py-2 pr-4 pl-3 text-gray-700 rounded 0 md:hover:bg-transparent  md:p-0 dark:text-gray-400 md:dark:hover:text-white md:dark:hover:bg-transparent dark:border-gray-700\" aria-current=\"page\">Produtos</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"/listarclientes\" id=\"Clientes\" class=\"block py-2 pr-4 pl-3 text-gray-700 rounded  md:hover:bg-transparent  md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent dark:border-gray-700\">Clientes</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"/listaravaliacoes\" id=\"Avaliacao\" class=\"block py-2 pr-4 pl-3 text-gray-700 rounded  md:hover:bg-transparent md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent dark:border-gray-700\">Avaliação</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"/cadastrarpermuta\" id=\"Permuta\" class=\"block py-2 pr-4 pl-3 text-gray-700 rounded  md:hover:bg-transparent md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent dark:border-gray-700\">Permuta</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <button class=\"login rounded-lg pl-3 p-1 pr-3\">\r\n");
      out.write("                <a href=\"/loginusuario\" id=\"login\" class=\"block text-gray-700 md:text-white dark:text-gray-400 md:dark:text-white  rounded md:p-0 \">Entrar</a>\r\n");
      out.write("              </button>\r\n");
      out.write("            </li>\r\n");
      out.write("            \r\n");
      out.write("            <li>\r\n");
      out.write("                 <button class=\"login rounded-lg pl-3 p-1 pr-2\">\r\n");
      out.write("                <a href=\"/logoutusuario\" id=\"login\" class=\"block text-gray-700 md:text-white dark:text-gray-400 md:dark:text-white  rounded md:p-0 \">Sair</a>\r\n");
      out.write("              </button>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("      <div class=\"ml-5 relative margintop\">\r\n");
      out.write("      <div class=\"flex md:order-2 tirarmargin mt-2 mr-2  md:font-medium\">\r\n");
      out.write("        <button id=\"theme-toggle\" type=\"button\" class=\"mr-4 tirarmargin text-gray-500 dark:text-gray-400 hover:bg-gray-100 dark:hover:bg-gray-700 focus:outline-none focus:ring-4 focus:ring-gray-200 dark:focus:ring-gray-700 rounded-lg  p-2.5\">\r\n");
      out.write("          <svg id=\"theme-toggle-dark-icon\" class=\"hidden w-5 h-5\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M17.293 13.293A8 8 0 016.707 2.707a8.001 8.001 0 1010.586 10.586z\"></path></svg>\r\n");
      out.write("          <svg id=\"theme-toggle-light-icon\" class=\"hidden w-5 h-5\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M10 2a1 1 0 011 1v1a1 1 0 11-2 0V3a1 1 0 011-1zm4 8a4 4 0 11-8 0 4 4 0 018 0zm-.464 4.95l.707.707a1 1 0 001.414-1.414l-.707-.707a1 1 0 00-1.414 1.414zm2.12-10.607a1 1 0 010 1.414l-.706.707a1 1 0 11-1.414-1.414l.707-.707a1 1 0 011.414 0zM17 11a1 1 0 100-2h-1a1 1 0 100 2h1zm-7 4a1 1 0 011 1v1a1 1 0 11-2 0v-1a1 1 0 011-1zM5.05 6.464A1 1 0 106.465 5.05l-.708-.707a1 1 0 00-1.414 1.414l.707.707zm1.414 8.486l-.707.707a1 1 0 01-1.414-1.414l.707-.707a1 1 0 011.414 1.414zM4 11a1 1 0 100-2H3a1 1 0 000 2h1z\" fill-rule=\"evenodd\" clip-rule=\"evenodd\"></path></svg>\r\n");
      out.write("      </button>\r\n");
      out.write("       <button type=\"button\" data-dropdown-toggle=\"language-dropdown-menu\" class=\"font-semibold inline-flex justify-center idioma p-2  text-gray-500 rounded cursor-pointer hover:text-gray-900 hover:bg-gray-100 dark:hover:bg-gray-700 dark:hover:text-white\">\r\n");
      out.write("          <a href=\"javascript:trocarIdioma('en')\">  <img class=\"w-5 h-5 rounded-full \" aria-hidden=\"true\" src=\"/imagens/bandeira-eua.png\"/></a>\r\n");
      out.write("        </button>\r\n");
      out.write("        <button type=\"button\" data-dropdown-toggle=\"language-dropdown-menu\" class=\"font-semibold inline-flex justify-center idioma p-2  text-gray-500 rounded cursor-pointer hover:text-gray-900 hover:bg-gray-100 dark:hover:bg-gray-700 dark:hover:text-white\">\r\n");
      out.write("          <a href=\"javascript:trocarIdioma('pt')\"> <img class=\" w-5 h-5 rounded-full \" aria-hidden=\"true\" src=\"/imagens/bandeira-do-brasil.png\"/></a>\r\n");
      out.write("        </button>\r\n");
      out.write("            <div id=\"google_translate_element\" class=\"boxTradutor\"></div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"flex md:order-2\">\r\n");
      out.write("          <button data-collapse-toggle=\"navbar-sticky\" type=\"button\" class=\"inline-flex items-center p-2  text-gray-500 rounded-lg md:hidden hover:bg-gray-100 focus:outline-none focus:ring-2 focus:ring-gray-200 dark:text-gray-400 dark:hover:bg-gray-700 dark:focus:ring-gray-600\" aria-controls=\"navbar-sticky\" aria-expanded=\"false\">\r\n");
      out.write("            <span class=\"sr-only\">Menu</span>\r\n");
      out.write("            <svg class=\"w-6 h-6\" aria-hidden=\"true\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M3 5a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1zM3 10a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1zM3 15a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1z\" clip-rule=\"evenodd\"></path></svg>\r\n");
      out.write("        </button>\r\n");
      out.write("      </div>\r\n");
      out.write("     \r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("      </nav>\r\n");
      out.write("<style>\r\n");
      out.write("  .color{\r\n");
      out.write("    color:#0bde97;\r\n");
      out.write("  }\r\n");
      out.write("  a:hover{\r\n");
      out.write("    color:#0bc889;\r\n");
      out.write("  }\r\n");
      out.write("   \r\n");
      out.write("    @media (max-width:431px){\r\n");
      out.write("      .optionsnav{\r\n");
      out.write("        padding:0rem;\r\n");
      out.write("        margin:20%\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("@media (max-width:767px){\r\n");
      out.write("  .idiomatext{\r\n");
      out.write("    display: none;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write(" @media(min-width:768px){\r\n");
      out.write("  nav{\r\n");
      out.write("    width:85%\r\n");
      out.write("  }\r\n");
      out.write("  body{\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    display:block;\r\n");
      out.write("   }\r\n");
      out.write("    .login{\r\n");
      out.write("    background-color: #0bde97;\r\n");
      out.write("    margin-top: -7%;\r\n");
      out.write("    \r\n");
      out.write("  }\r\n");
      out.write("  .login:hover{\r\n");
      out.write("    background-color: #0bc889;\r\n");
      out.write("  }\r\n");
      out.write("  .login a{\r\n");
      out.write("    color:white;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("@media (max-width:399px){\r\n");
      out.write("  .tamanho{\r\n");
      out.write("    flex-wrap: nowrap;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  var comboGoogleTradutor = null; //Varialvel global\r\n");
      out.write("\r\n");
      out.write("  function googleTranslateElementInit() {\r\n");
      out.write("      new google.translate.TranslateElement({\r\n");
      out.write("          pageLanguage: 'pt',\r\n");
      out.write("          includedLanguages: 'pt,en',\r\n");
      out.write("          layout: google.translate.TranslateElement.InlineLayout.HORIZONTAL\r\n");
      out.write("      }, 'google_translate_element');\r\n");
      out.write("\r\n");
      out.write("      comboGoogleTradutor = document.getElementById(\"google_translate_element\").querySelector(\".goog-te-combo\");\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  function changeEvent(el) {\r\n");
      out.write("      if (el.fireEvent) {\r\n");
      out.write("          el.fireEvent('onchange');\r\n");
      out.write("      } else {\r\n");
      out.write("          var evObj = document.createEvent(\"HTMLEvents\");\r\n");
      out.write("\r\n");
      out.write("          evObj.initEvent(\"change\", false, true);\r\n");
      out.write("          el.dispatchEvent(evObj);\r\n");
      out.write("      }\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  function trocarIdioma(sigla) {\r\n");
      out.write("      if (comboGoogleTradutor) {\r\n");
      out.write("          comboGoogleTradutor.value = sigla;\r\n");
      out.write("          changeEvent(comboGoogleTradutor);//Dispara a troca\r\n");
      out.write("      }\r\n");
      out.write("  }\r\n");
      out.write("  </script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"https://translate.google.com/translate_a/element.js?cb=googleTranslateElementInit\"></script>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("  #google_translate_element {\r\n");
      out.write("      display: none;\r\n");
      out.write("  }\r\n");
      out.write("  .goog-te-banner-frame {\r\n");
      out.write("      display: none !important;\r\n");
      out.write("  }\r\n");
      out.write("  body {\r\n");
      out.write("      position: static !important;\r\n");
      out.write("      top: 0 !important;\r\n");
      out.write("  }\r\n");
      out.write("  </style> \r\n");
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
