package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\r\n");
      out.write("    <title>\r\n");
      out.write("\tHRB KIDS| Página Inicial\r\n");
      out.write("    </title>\r\n");
      out.write("    <meta name=\"description\" content=\"Simple landind page\" />\r\n");
      out.write("    <meta name=\"keywords\" content=\"\" />\r\n");
      out.write("    <meta name=\"author\" content=\"\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://unpkg.com/tailwindcss@2.2.19/dist/tailwind.min.css\"/>\r\n");
      out.write("    <!--Replace with your tailwind.css once created-->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,700\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- Define your gradient here - use online tools to find a gradient matching your branding-->\r\n");
      out.write("  </head>\r\n");
      out.write("  <body class=\"leading-normal tracking-normal text-white gradient\" style=\"font-family: 'Source Sans Pro', sans-serif;\">\r\n");
      out.write("    <!--Nav-->\r\n");
      out.write("    \r\n");
      out.write("     \r\n");
      out.write("    <nav class=\"bg-white border-gray-300 dark:bg-gray-900 w-full\">\r\n");
      out.write("        <div class=\"flex flex-wrap w-full  h-15 justify-between tamanho\">\r\n");
      out.write("          <div class=\"flex ml-4 tirarmargin\">\r\n");
      out.write("          <a href=\"/src/home.html\" class=\"flex items-start\">\r\n");
      out.write("            <img src=\"/imagens/logohrb.png\" class=\"  mr-3 mt-1 h-12 w-12 logo\" alt=\"HRB Kids Logo\" />\r\n");
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
      out.write("           \r\n");
      out.write("             <li>\r\n");
      out.write("              <a href=\"/listaravaliacoes\" id=\"Avaliacao\" class=\"block py-2 pr-4 pl-3 text-gray-700 rounded  md:hover:bg-transparent md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent dark:border-gray-700\">Avaliação</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"/cadastrarpermuta\" id=\"Permuta\" class=\"block py-2 pr-2s pl-3 text-gray-700 rounded  md:hover:bg-transparent md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent dark:border-gray-700\">Permuta</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <button class=\"login rounded-lg pl-3 p-1 pr-3\">\r\n");
      out.write("                <a href=\"/loginusuario\" id=\"login\" class=\"block text-gray-700 md:text-white dark:text-gray-400 md:dark:text-white  rounded md:p-0 \">Entrar</a>\r\n");
      out.write("              </button>\r\n");
      out.write("            </li>          \r\n");
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
      out.write(" \r\n");
      out.write("         <button type=\"button\" data-dropdown-toggle=\"language-dropdown-menu\" class=\"font-semibold inline-flex justify-center idioma p-2  text-gray-500 rounded cursor-pointer hover:text-gray-900 hover:bg-gray-100 dark:hover:bg-gray-700 dark:hover:text-white\">\r\n");
      out.write("          <a href=\"javascript:trocarIdioma('en')\">  <img class=\"w-5 h-5 rounded-full \" aria-hidden=\"true\" src=\"/imagens/bandeira-eua.png\"/></a>\r\n");
      out.write("        </button>\r\n");
      out.write("        <button type=\"button\" data-dropdown-toggle=\"language-dropdown-menu\" class=\"font-semibold inline-flex justify-center idioma p-2  text-gray-500 rounded cursor-pointer hover:text-gray-900 hover:bg-gray-100 dark:hover:bg-gray-700 dark:hover:text-white\">\r\n");
      out.write("          <a href=\"javascript:trocarIdioma('pt')\"> <img class=\" w-5 h-5 rounded-full \" aria-hidden=\"true\" src=\"/imagens/bandeira-do-brasil.png\"/></a>\r\n");
      out.write("        </button>\r\n");
      out.write("         <div id=\"google_translate_element\" class=\"boxTradutor\"></div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"flex md:order-2\">\r\n");
      out.write("          <button data-collapse-toggle=\"navbar-sticky\" type=\"button\" class=\"inline-flex items-center p-2  text-gray-500 rounded-lg md:hidden hover:bg-gray-100 focus:outline-none focus:ring-2 focus:ring-gray-200 dark:text-gray-400 dark:hover:bg-gray-700 dark:focus:ring-gray-600\" aria-controls=\"navbar-sticky\" aria-expanded=\"false\">\r\n");
      out.write("            <span class=\"sr-only\">Open main menu</span>\r\n");
      out.write("            <svg class=\"w-6 h-6\" aria-hidden=\"true\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M3 5a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1zM3 10a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1zM3 15a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1z\" clip-rule=\"evenodd\"></path></svg>\r\n");
      out.write("        </button>\r\n");
      out.write("      </div>\r\n");
      out.write("     \r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("      </nav>\r\n");
      out.write("      <style>\r\n");
      out.write("    .gradient {\r\n");
      out.write("      background: linear-gradient(90deg, #0bc889 0%, #8af8d4 100%);\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("  \r\n");
      out.write("    <!--Hero-->\r\n");
      out.write("    <div class=\"pt-8 div\">\r\n");
      out.write("      <div class=\" pl-3 mx-auto flex flex-wrap flex-col md:flex-row items-center\">\r\n");
      out.write("        <!--Left Col-->\r\n");
      out.write("        <div class=\"flex flex-col width md:w-2/5 justify-center items-start text-center md:text-left\">\r\n");
      out.write("          <p class=\"uppercase tracking-loose w-full\">HRB Kids apresenta:</p>\r\n");
      out.write("          <h1 class=\"my-4 text-5xl font-bold leading-tight \">\r\n");
      out.write("            Sistema ERP Brechozinho\r\n");
      out.write("          </h1>\r\n");
      out.write("          <p class=\"leading-normal text-2xl mb-8\">\r\n");
      out.write("            Cadastre clientes, produtos e automatize o processo de avaliação! \r\n");
      out.write("          </p>\r\n");
      out.write("          <button class=\"mx-auto lg:mx-0 hover:underline bg-white text-gray-800 font-bold rounded-full my-6 py-4 px-8 shadow-lg focus:outline-none focus:shadow-outline transform transition hover:scale-105 duration-300 ease-in-out\">\r\n");
      out.write("            Entrar\r\n");
      out.write("          </button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--Right Col-->\r\n");
      out.write("        <div class=\"img1 md:w-3/5 text-center\">\r\n");
      out.write("          <img class=\"img\" src=\"/imagens/girl.png\" />\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <section class=\"bg-white border-b py-8\">\r\n");
      out.write("      <div class=\"container max-w-5xl mx-auto m-8\">\r\n");
      out.write("        <h2 class=\"w-full my-2 text-5xl font-bold leading-tight text-center text-gray-800\">\r\n");
      out.write("          Sistema de Gestão\r\n");
      out.write("        </h2>\r\n");
      out.write("        <div class=\"w-full mb-4 mt-5\">\r\n");
      out.write("          <div class=\"h-1 mx-auto gradient w-64 opacity-25 my-0 py-0 rounded-t\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"flex flex-wrap\">\r\n");
      out.write("          <div class=\"w-5/6 sm:w-1/2 md:py-24\tp-6\">\r\n");
      out.write("            <h3 class=\"text-3xl text-gray-800 md:px-8 font-bold leading-none mt-4 mb-3\">\r\n");
      out.write("              Solução Personalizada\r\n");
      out.write("            </h3>\r\n");
      out.write("            <p class=\"text-gray-600 md:px-8 \">\r\n");
      out.write("             Software desenvolvido pensando em todas as necessidades do brechozinho! Cadastre clientes, produtos, avaliações e gerencie o valor do Crédito gerado!\r\n");
      out.write("              <br />\r\n");
      out.write("              <br/>\r\n");
      out.write("            </p>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"w-full sm:w-1/2 p-6 items-center\t\">\r\n");
      out.write("            <img src=\"/imagens/avaliacoes.svg\">\r\n");
      out.write("           \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"flex flex-wrap flex-col-reverse sm:flex-row mt-10\">\r\n");
      out.write("          <div class=\"w-full sm:w-1/2  mt-6\">\r\n");
      out.write("            <img src=\"/imagens/avaliar.svg\">\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"w-full sm:w-1/2 p-6 mt-7\">\r\n");
      out.write("            <div class=\"align-middle\">\r\n");
      out.write("              <h3 class=\"text-3xl text-gray-800 font-bold leading-none mb-3\">\r\n");
      out.write("                Praticidade\r\n");
      out.write("              </h3>\r\n");
      out.write("              <p class=\"text-gray-600 mb-8\">\r\n");
      out.write("                Chega de planilhas confusas! Agora com nosso sistema todas as informações necessárias do brechozinho ficam em um\r\n");
      out.write("                único lugar, com muita praticidade, organização e eficiência!\r\n");
      out.write("                <br />\r\n");
      out.write("                <br />\r\n");
      out.write("                \r\n");
      out.write("              </p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <section class=\"bg-white border-b py-8\">\r\n");
      out.write("      <div class=\"container containerwidth mx-auto flex flex-wrap pt-4 pb-12\">\r\n");
      out.write("        <h2 class=\"w-full my-2 text-5xl font-bold leading-tight text-center text-gray-800\">\r\n");
      out.write("          Acesso rápido\r\n");
      out.write("        </h2>\r\n");
      out.write("        <div class=\"w-full mb-4\">\r\n");
      out.write("          <div class=\"h-1 mx-auto gradient w-64 opacity-25 my-0 py-0 rounded-t\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"w-full md:w-1/3 p-6 flex flex-col flex-grow flex-shrink\">\r\n");
      out.write("          <div class=\"flex-1 bg-white rounded-t rounded-b-none overflow-hidden shadow\">\r\n");
      out.write("              <div class=\" text-center w-full mt-5 font-bold text-xl text-gray-800 px-6\">\r\n");
      out.write("                Clientes\r\n");
      out.write("              </div>\r\n");
      out.write("              <p class=\" text-center text-gray-800 text-base px-6 mb-5 mt-3\">\r\n");
      out.write("                Consulte/cadastre clientes em nosso sistema! Através desse cadastro fica muito fácil o acesso aos dados do cliente!</p>\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"flex-none mt-auto bg-white rounded-b rounded-t-none overflow-hidden shadow \">\r\n");
      out.write("            <div class=\"flex items-center justify-center\">\r\n");
      out.write("              <button class=\"mx-auto lg:mx-0 hover:underline gradient text-white font-bold rounded-full my-6 py-4 px-8 shadow-lg focus:outline-none focus:shadow-outline transform transition hover:scale-105 duration-300 ease-in-out\">\r\n");
      out.write("                Clique aqui\r\n");
      out.write("              </button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("       \r\n");
      out.write("        <div class=\"w-full md:w-1/3 p-6 flex flex-col flex-grow flex-shrink\">\r\n");
      out.write("          <div class=\"flex-1 bg-white rounded-t rounded-b-none overflow-hidden shadow\">\r\n");
      out.write("              <div class=\" text-center w-full mt-5 font-bold text-xl text-gray-800 px-6\">\r\n");
      out.write("                Avaliações\r\n");
      out.write("              </div>\r\n");
      out.write("              <p class=\" text-center text-gray-800 text-base px-6 mb-5 mt-3\">\r\n");
      out.write("                Consulte/cadastre avaliações! Tenha total controle sobre a sacola, tenha acesso a informações como lucro líquido e valor do crédito gerado!\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"flex-none mt-auto bg-white rounded-b rounded-t-none overflow-hidden shadow \">\r\n");
      out.write("            <div class=\"flex items-center justify-center\">\r\n");
      out.write("              <button class=\"mx-auto lg:mx-0 hover:underline gradient text-white font-bold rounded-full my-6 py-4 px-8 shadow-lg focus:outline-none focus:shadow-outline transform transition hover:scale-105 duration-300 ease-in-out\">\r\n");
      out.write("                Clique aqui\r\n");
      out.write("              </button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("      <div class=\"w-full md:w-1/3 p-6 flex flex-col flex-grow flex-shrink\">\r\n");
      out.write("          <div class=\"flex-1 bg-white rounded-t rounded-b-none overflow-hidden shadow\">\r\n");
      out.write("              <div class=\" text-center w-full mt-5 font-bold text-xl text-gray-800 px-6\">\r\n");
      out.write("                Permuta\r\n");
      out.write("              </div>\r\n");
      out.write("              <p class=\" text-center text-gray-800 text-base px-6 mb-5 mt-3\">\r\n");
      out.write("                Cadastre/consulte as permutas do brechozinho! \r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"flex-none mt-auto bg-white rounded-b rounded-t-none overflow-hidden shadow \">\r\n");
      out.write("            <div class=\"flex items-center justify-center\">\r\n");
      out.write("              <button class=\"mx-auto lg:mx-0 hover:underline gradient text-white font-bold rounded-full my-6 py-4 px-8 shadow-lg focus:outline-none focus:shadow-outline transform transition hover:scale-105 duration-300 ease-in-out\">\r\n");
      out.write("                Clique aqui\r\n");
      out.write("              </button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("    <!-- jQuery if you need it\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("  -->\r\n");
      out.write("    <style>\r\n");
      out.write("      .gradient {\r\n");
      out.write("        background: linear-gradient(90deg, #0bc889 0%, #8af8d4 100%);\r\n");
      out.write("      }\r\n");
      out.write(" .img1{\r\n");
      out.write("    margin-top: 0;\r\n");
      out.write("  margin-top: 5%;}\r\n");
      out.write("\r\n");
      out.write(".div{\r\n");
      out.write("      width: 80%;\r\n");
      out.write("      margin-left: 6%;\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    /* .containerwidth{\r\n");
      out.write("      width: 80%;\r\n");
      out.write("      height: 60%;\r\n");
      out.write("    } */\r\n");
      out.write("   @media (max-width:767px){\r\n");
      out.write("    .div{\r\n");
      out.write("      text-align: center;\r\n");
      out.write("    }\r\n");
      out.write("    .img1{\r\n");
      out.write("    margin-top: 0;\r\n");
      out.write("  text-align: center;}\r\n");
      out.write("\r\n");
      out.write(" .img{\r\n");
      out.write("  width: 90%;\r\n");
      out.write("  margin-left:6%;\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write("   }\r\n");
      out.write("   @media (max-width:1190px){\r\n");
      out.write("    .div{\r\n");
      out.write("      height: 75%;\r\n");
      out.write("      width: 90%;\r\n");
      out.write("    }\r\n");
      out.write("    .img1{\r\n");
      out.write("      margin-top:5%\r\n");
      out.write("    }\r\n");
      out.write("   }\r\n");
      out.write("    @media (min-width:1200px){\r\n");
      out.write("      .div{\r\n");
      out.write("        width: 60%;\r\n");
      out.write("        margin-left: 15%;\r\n");
      out.write("      }\r\n");
      out.write("      .img{\r\n");
      out.write("        margin-left: 20%;\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write(" style>\r\n");
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
      out.write("     \r\n");
      out.write("      \r\n");
      out.write("    </style>\r\n");
      out.write("     <style type=\"text/css\">\r\n");
      out.write("    #google_translate_element {\r\n");
      out.write("        display: none;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    .goog-te-banner-frame {\r\n");
      out.write("        display: none !important;\r\n");
      out.write("    }\r\n");
      out.write("    body {\r\n");
      out.write("        position: static !important;\r\n");
      out.write("        top: 0 !important;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    </style>\r\n");
      out.write("    <!-- \r\n");
      out.write("    <script>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("////////////////\r\n");
      out.write("//TEMA DARK\r\n");
      out.write("// On page load or when changing themes, best to add inline in `head` to avoid FOUC\r\n");
      out.write("if (localStorage.getItem('color-theme') === 'dark' || (!('color-theme' in localStorage) && window.matchMedia('(prefers-color-scheme: dark)').matches)) {\r\n");
      out.write("   document.documentElement.classList.add('dark');\r\n");
      out.write("} else {\r\n");
      out.write("   document.documentElement.classList.remove('dark')\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var themeToggleDarkIcon = document.getElementById('theme-toggle-dark-icon');\r\n");
      out.write("var themeToggleLightIcon = document.getElementById('theme-toggle-light-icon');\r\n");
      out.write("\r\n");
      out.write("//Change the icons inside the button based on previous settings\r\n");
      out.write("if (localStorage.getItem('color-theme') === 'dark' || (!('color-theme' in localStorage) && window.matchMedia('(prefers-color-scheme: dark)').matches)) {\r\n");
      out.write(" themeToggleLightIcon.classList.remove('hidden');\r\n");
      out.write("} else {\r\n");
      out.write(" themeToggleDarkIcon.classList.remove('hidden');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var themeToggleBtn = document.getElementById('theme-toggle');\r\n");
      out.write("\r\n");
      out.write("themeToggleBtn.addEventListener('click', function() {\r\n");
      out.write("\r\n");
      out.write(" // toggle icons inside button\r\n");
      out.write(" themeToggleDarkIcon.classList.toggle('hidden');\r\n");
      out.write(" themeToggleLightIcon.classList.toggle('hidden');\r\n");
      out.write("\r\n");
      out.write(" // if set via local storage previously\r\n");
      out.write(" if (localStorage.getItem('color-theme')) {\r\n");
      out.write("     if (localStorage.getItem('color-theme') === 'light') {\r\n");
      out.write("         document.documentElement.classList.add('dark');\r\n");
      out.write("         localStorage.setItem('color-theme', 'dark');\r\n");
      out.write("     } else {\r\n");
      out.write("         document.documentElement.classList.remove('dark');\r\n");
      out.write("         localStorage.setItem('color-theme', 'light');\r\n");
      out.write("     }\r\n");
      out.write("\r\n");
      out.write(" // if NOT set via local storage previously\r\n");
      out.write(" } else {\r\n");
      out.write("     if (document.documentElement.classList.contains('dark')) {\r\n");
      out.write("         document.documentElement.classList.remove('dark');\r\n");
      out.write("         localStorage.setItem('color-theme', 'light');\r\n");
      out.write("     } else {\r\n");
      out.write("         document.documentElement.classList.add('dark');\r\n");
      out.write("         localStorage.setItem('color-theme', 'dark');\r\n");
      out.write("     }\r\n");
      out.write(" }\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("</script> -->\r\n");
      out.write("\r\n");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layoutrodape.jsp", out, false);
      out.write("\r\n");
      out.write("   \r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("\t\r\n");
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
