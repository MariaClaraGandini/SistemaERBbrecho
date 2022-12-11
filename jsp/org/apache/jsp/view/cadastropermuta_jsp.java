package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastropermuta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouttopo.jsp", out, false);
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://unpkg.com/flowbite@1.5.3/dist/flowbite.min.css\" />\r\n");
      out.write("    <script src=\"https://unpkg.com/flowbite@1.5.3/dist/flowbite.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/src/notifier.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/src/modaledit.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/permuta.css\">\r\n");
      out.write("    <script src=\"/src/modaledit.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <title>HRB Kids | Permuta </title>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bg-gray-50\">\r\n");
      out.write("  <script src=\"/src/notifier.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"grid grid-cols-1 sm:grid-cols-2 m-5 shadow containertodo\">\r\n");
      out.write("\r\n");
      out.write("      <div>\r\n");
      out.write("        <div  class=\"bg-white p-8\">\r\n");
      out.write("          <div class=\"flex abas-navegacao mt-5  \">\r\n");
      out.write("            <ul class=\"flex w-full mt-4\">\r\n");
      out.write("            <li class=\"w-1/2\">\r\n");
      out.write("                  <button id=\"produtobotao\" onclick=\"Produto()\" class=\"produtobotao p-2 text-center text-sm font-semibold w-full botao \" style=\"clip-path: polygon(0% 0%, calc(100% - 8px) 0%, 100% 50%, calc(100% - 8px) 100%, 0% 100%);\">Produto</button>\r\n");
      out.write("            </li>\r\n");
      out.write("              <li class=\"w-1/2\">\r\n");
      out.write("                <button id=\"pagamentobotao\" onclick=\"Pagamento()\" class=\"p-2 w-full text-center text-sm font-semibold botao\"style=\"clip-path: polygon(calc(100% - 8px) 0%, 100% 50%, calc(100% - 8px) 100%, 0% 100%, 8px 50%, 0% 0%);\"data-shortcut=\"alt+c\">Pagamento</button> \r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("      <div id=\"produtovenda\" class=\"col\">\r\n");
      out.write("      <h1 class=\"mt-4 text text-2xl font-semibold\">Pedido de Venda</h1>\r\n");
      out.write("      <div class=\"pt-5 flex flex-wrap\">\r\n");
      out.write("   <form method=\"POST\" action=\"/cadastrarpermuta\" accept-charset=\"UTF-8\">\r\n");
      out.write("        <div class=\"w-full  mr-3\">\r\n");
      out.write("            <label class=\"mb-2  block font-medium text-black dark:text-gray-300\">Nome do Cliente</label>\r\n");
      out.write("            <input type=\"text\" id=\"nome\" name=\"nomecliente\" class=\" w-full bg-white border border-gray-300 text-gray-900  rounded-lg focus:ring-gray-300 focus:border-gray-200 p-2 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 focus:border-gray-200n-500\" placeholder=\"Ciclano da Silva\">\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"mt-3\">\r\n");
      out.write("      <label class=\"mb-2 block font-medium text-black dark:text-gray-300\">Produto</label>\r\n");
      out.write("      <div class=\" relative pesquisar mr-3\">\r\n");
      out.write("        <input type=\"search\" id=\"produto\" class=\" block p-2.5 w-1/2 w-full z-20 text-sm text-gray-900  rounded-lg border-l-gray-100 border-l-2 border border-gray-300 focus:ring-blue-500 focus:border-blue-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:border-blue-500\" placeholder=\"Pesquisar o nome do produto\" required>\r\n");
      out.write("        <button type=\"submit\" class=\" absolute top-0 right-0 p-2.5 text-sm font-medium text-gray-900 rounded-r-lg  hover:bg-gray-100 focus:ring-0 focus:outline-none dark:bg-gray-700 dark:focus:ring-blue-800 dark:text-gray-500\"><svg aria-hidden=\"true\" class=\"w-5 h-5\" fill=\"none\" stroke=\"currentColor\" viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\"><path stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0z\"></path></svg></button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"flex\">\r\n");
      out.write("    <div class=\"w-1/2 mr-1\">\r\n");
      out.write("    <label class=\"block mb-2 text-sm font-medium text-black dark:text-gray-300 mt-4\">Quantidade</label>\r\n");
      out.write("    <input type=\"number\"  value=\"1\" min=\"1\" id=\"quantidade\" class=\" w-full block p-2.5  input z-20 text-sm text-gray-900  rounded-lg border-l-gray-100 border-l-2 border border-gray-300 focus:ring-gray-400 focus:border-gray-200 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:border-gray-200\" placeholder=\"Ex:1\" required>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"ml-1 mr-3 w-1/2\">\r\n");
      out.write("    <label class=\"block mb-2 text-sm font-medium text-black dark:text-gray-300 mt-4 \">Preço de Venda (R$)</label>\r\n");
      out.write("      <input type=\"text\" step=\"0.1\" id=\"valorvenda\" class=\" bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:border-gray-200\" placeholder=\"Ex: 199,50\" required>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"flex pt-5 mt-4\">\r\n");
      out.write("      <a id=\"inserirbotao\" onclick=\"validar()\" type=\"submit\" class=\" ml-1 mt-5 cancelarbotao bg-transparent hover:bg-green-200 mr-4  block  mb-2 p-2 w-full z-20  text-gray-900  rounded-lg  border  border-green-300 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:hover:bg-green-700\">Inserir</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write(" \r\n");
      out.write("   <div  id=\"pagamentovenda\" class=\"pagamentovenda\">\r\n");
      out.write("    <h1 class=\"mt-4 text text-2xl font-semibold\"> Pagamento</h1>\r\n");
      out.write("  <div class=\"flex\">\r\n");
      out.write("  <div class=\"w-1/2 mr-1\">\r\n");
      out.write("  <label class=\"block mb-2 text-sm font-medium text-black dark:text-gray-300 mt-4\">Sub total </label>\r\n");
      out.write("  <input  id=\"subtotal\" disabled=\"disabled\" class=\" bg-gray-100 w-full block p-2  input z-20 text-sm text-gray-900  rounded-lg border-l-gray-100 border-l-2 border border-gray-300 focus:ring-gray-400 focus:border-gray-200 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:border-gray-200\" placeholder=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"ml-1 mr-3 w-1/2\">\r\n");
      out.write("  <label class=\"block mb-2 text-sm font-medium text-black dark:text-gray-300 mt-4 \">Valor do Crédito</label>\r\n");
      out.write("    <input    id=\"valorcredito\" name=\"valorcredito\" class=\" bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:border-gray-200\" placeholder=\"Ex: 199,50\" required>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"flex\">\r\n");
      out.write("    <div class=\"w-1/2 mr-1\">\r\n");
      out.write("    <label class=\"block mb-2 text-sm font-medium text-black dark:text-gray-300 mt-4\">Saldo em Crédito</label>\r\n");
      out.write("    <input id=\"saldo\" name=\"saldocredito\" class=\" bg-gray-100 w-full block p-2  input z-20 text-sm text-gray-900  rounded-lg border-l-gray-100 border-l-2 border border-gray-300 focus:ring-gray-400 focus:border-gray-200 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:border-gray-200\" placeholder=\"\">\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("     <div class=\"bg-white lado2 w-full col\">\r\n");
      out.write("\r\n");
      out.write("      <table class=\"w-full\">\r\n");
      out.write("        <thead class=\"bg-gray-50 p-5  font-semibold p-4 sombra\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"p-4 \">Produtos</td>\r\n");
      out.write("            <td class=\"p-4 \">Quantidade</td>\r\n");
      out.write("            <td class=\"p-4 \">Preço</td>\r\n");
      out.write("            <td class=\"p-4 \">Ações</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody id=\"tabelaProdutosEmTable\">\r\n");
      out.write("          \r\n");
      out.write("          <tr class=\"shadow-sm\">\r\n");
      out.write("            <td class=\"p-4 \">Body</td>\r\n");
      out.write("            <td class=\"p-4 texto\">1,00</td>\r\n");
      out.write("            <td class=\"p-4\">14,90</td>\r\n");
      out.write("            <td>\r\n");
      out.write("              <button type=\"button\" data-modal-toggle=\"authentication-modal\">\r\n");
      out.write("                <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 24 24\" stroke-width=\"1.5\" stroke=\"currentColor\" class=\" w-5 h-5\">\r\n");
      out.write("                  <path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M16.862 4.487l1.687-1.688a1.875 1.875 0 112.652 2.652L6.832 19.82a4.5 4.5 0 01-1.897 1.13l-2.685.8.8-2.685a4.5 4.5 0 011.13-1.897L16.863 4.487zm0 0L19.5 7.125\" />\r\n");
      out.write("                </svg>\r\n");
      out.write("              </button>\r\n");
      out.write("\r\n");
      out.write("            <button onclick=\"Delete()\">\r\n");
      out.write("              <svg  class=\"w-full h-4 px-3 \" id=\"Camada_1\" data-name=\"Camada 1\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 16 18\"><defs><style>.cls-1{fill:#ed2121;}</style></defs><title>trash</title><path class=\"cls-1\" d=\"M9,3V4H4V6H5V19a2,2,0,0,0,2,2H17a2,2,0,0,0,2-2V6h1V4H15V3H9M7,6H17V19H7V6M9,8v9h2V8H9m4,0v9h2V8Z\" transform=\"translate(-4 -3)\"/></svg>\r\n");
      out.write("            </button>\r\n");
      out.write("          </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          \r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("      <div class=\"sombra bg-white border w-full valortotal\">\r\n");
      out.write("        <div class=\"flex  flex-wrap justify-between items-center\t\">\r\n");
      out.write("        <div class=\"flex  ml-3 \">\r\n");
      out.write("          <button class=\"ml-1 mt-5 cancelarbotao bg-transparent hover:bg-green-200 mr-4  block  mb-2 p-2.5 w-full z-20  text-gray-900  rounded-lg  border  border-green-300 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:hover:bg-green-700\">Cancelar</button>\r\n");
      out.write("          <button type=\"submit\" class=\"flex-wrap block w-full cadastrarbotao colorbutton 0 mt-1 mb-2 p-2.5 w-full z-20 text-sm text-gray-900  rounded-lg border-l-gray-100 border-l-2 border border-gray-300 focus:ring-gray-400 focus:border-gray-200 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:border-green-500 dark:text-white dark:hover:cadastrarbotaodark\">Finalizar Troca</button>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"flex\">\r\n");
      out.write("            <p class=\"text-2xl mr-3 mt-2 text-gray-800 dark:text-white\" >Pagar</p>\r\n");
      out.write("            <input id=\"totalp\" name=\"valorpago\" class=\"text-4xl mb-4 mr-4 items-center font-semibold text-gray-800 dark:text-white\" value=\"0,00\"  />\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"authentication-modal\" tabindex=\"-1\" aria-hidden=\"true\" class=\"hidden overflow-y-auto overflow-x-hidden fixed top-0 right-0 left-0 z-50 w-full md:inset-0 h-modal md:h-full\">\r\n");
      out.write("  <div class=\"relative p-4 w-full max-w-md h-full md:h-auto\">\r\n");
      out.write("<div class=\"relative bg-white rounded-lg shadow dark:bg-gray-700\">\r\n");
      out.write("            <a class=\"absolute top-3 right-2.5 text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm p-1.5 ml-auto inline-flex items-center dark:hover:bg-gray-800 dark:hover:text-white\" data-modal-toggle=\"authentication-modal\">\r\n");
      out.write("                <svg aria-hidden=\"true\" class=\"w-5 h-5\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M4.293 4.293a1 1 0 011.414 0L10 8.586l4.293-4.293a1 1 0 111.414 1.414L11.414 10l4.293 4.293a1 1 0 01-1.414 1.414L10 11.414l-4.293 4.293a1 1 0 01-1.414-1.414L8.586 10 4.293 5.707a1 1 0 010-1.414z\" clip-rule=\"evenodd\"></path></svg>\r\n");
      out.write("                <span class=\"sr-only\">Close modal</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <div class=\"py-6 px-6 lg:px-8\">\r\n");
      out.write("                <h3 class=\"mb-4 text-xl font-medium text-gray-900 dark:text-white\">VESTIDO HENECY</h3>\r\n");
      out.write("                <form class=\"space-y-6\" >\r\n");
      out.write("                  <div class=\"flex\">\r\n");
      out.write("                    <div class=\"mr-2\">\r\n");
      out.write("                        <label class=\"block mb-2 text-sm  font-medium text-gray-900 dark:text-gray-300\">Quantidade</label>\r\n");
      out.write("                        <input type=\"text\" name=\"quantidadeformatacao\" step=\"1\" min=\"1\" id=\"editarquntidade\" class=\"bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-300 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white\" placeholder=\"name@company.com\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"ml-2\">\r\n");
      out.write("                        <label class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300\">Valor unitário</label>\r\n");
      out.write("                        <input type=\"text\" id=\"valorunitario\" placeholder=\"\" class=\"bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-300 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                    <button type=\"submit\" class=\"w-full colorbutton p-2 rounded-lg \">Salvar</button>\r\n");
      out.write("               <!--  </form> -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <script>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("    var pagamentovenda= document.getElementById(\"pagamentovenda\");\r\n");
      out.write("    var produtovenda= document.getElementById(\"produtovenda\");\r\n");
      out.write("    var pagamentobotao =document.getElementById(\"pagamentobotao\");\r\n");
      out.write("    var produtobotao= document.getElementById(\"produtobotao\");\r\n");
      out.write("     \r\n");
      out.write("    function Produto(){\r\n");
      out.write("\r\n");
      out.write("     if (window.matchMedia(\"(min-width: 768px)\").matches){\r\n");
      out.write("    pagamentovenda.style.display=\"none\";\r\n");
      out.write("    produtovenda.style.display=\"block\";\r\n");
      out.write("    produtobotao.style.backgroundColor=\"#0bde97\";\r\n");
      out.write("    produtobotao.style.color=\"white\";\r\n");
      out.write("    pagamentobotao.style.backgroundColor=\"#f4f4f4\";\r\n");
      out.write("    pagamentobotao.style.color=\"black\";\r\n");
      out.write("     } else{\r\n");
      out.write("      alert(\"teste\")\r\n");
      out.write("     }\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("    function Pagamento(){\r\n");
      out.write("\r\n");
      out.write("      var produtovenda= document.getElementById(\"produtovenda\");\r\n");
      out.write("      produtovenda.style.display=\"none\";\r\n");
      out.write("      pagamentovenda.style.display=\"block\";\r\n");
      out.write("      pagamentobotao.style.backgroundColor=\"#0bde97\";\r\n");
      out.write("      pagamentobotao.style.color=\"#FFFF\";\r\n");
      out.write("      produtobotao.style.backgroundColor=\"#f4f4f4\";\r\n");
      out.write("      produtobotao.style.color=\"black\";\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    function GerarBotoes( svg, classes){\r\n");
      out.write("      let novoBotao = document.createElement(\"button\")\r\n");
      out.write("      novoBotao.innerHTML = svg\r\n");
      out.write("      // novoBotao.classList.add(\"px-3\")\r\n");
      out.write("      novoBotao.setAttribute('data-modal-toggle', 'authentication-modal');\r\n");
      out.write("      for(let i = 0; i< classes.length; i++){\r\n");
      out.write("        novoBotao.classList.add(classes[i])\r\n");
      out.write("      }\r\n");
      out.write("     \r\n");
      out.write("      return novoBotao\r\n");
      out.write("    }\r\n");
      out.write("       function GerarModal(texto){\r\n");
      out.write("        let modal = document.createElement(\"div\")\r\n");
      out.write("        modal.innerHTML = texto\r\n");
      out.write("       }\r\n");
      out.write("\r\n");
      out.write("       var subtotal= 0;\r\n");
      out.write("       function Inserirproduto(codigoProduto,produto, quantidade,valorvenda,valortotal){\r\n");
      out.write("\r\n");
      out.write("let novaLinhaTR = document.createElement(\"tr\")\r\n");
      out.write("novaLinhaTR.classList.add(\"shadow-sm\")\r\n");
      out.write("novaLinhaTR.classList.add(\"p-4\", \"text-gray-800\", \"dark:text-white\")\r\n");
      out.write("novaLinhaTR.id= codigoProduto;\r\n");
      out.write("\r\n");
      out.write("let produtotabela = document.createElement(\"td\")\r\n");
      out.write("produtotabela.innerHTML = produto.value;\r\n");
      out.write("produtotabela.classList.add(\"p-4\",\"text-gray-800\", \"dark:text-white\")\r\n");
      out.write("\r\n");
      out.write("let quantidadetabela = document.createElement(\"td\")\r\n");
      out.write("quantidadetabela.innerHTML = quantidade.value ;\r\n");
      out.write("quantidadetabela.classList.add(\"p-4\",\"qtdmargin\",\"text-gray-800\", \"dark:text-white\")\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("let valorvendatabela= document.createElement(\"td\")\r\n");
      out.write("var valorvendaformatado = parseFloat(valorvenda.value.replace(\",\",\".\"))\r\n");
      out.write("var calculo = valorvendaformatado * quantidade.value\r\n");
      out.write("\r\n");
      out.write("valorvendatabela.innerHTML= calculo.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });\r\n");
      out.write("valorvendatabela.classList.add(\"p-4\", \"text-gray-800\", \"dark:text-white\")\r\n");
      out.write("valorvendatabela.id=\"valortotalp\"\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("let acoes = document.createElement(\"td\")\r\n");
      out.write("valorvendatabela.TextContent = valortotal;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("acoes.append(GerarBotoes(\"<button type='button' data-modal-toggle='authentication-modal' onclick='Mostrarmodal()'><svg xmlns='http://www.w3.org/2000/svg' fill='none' viewBox='0 0 24 24' stroke-width='1.5' stroke='currentColor' class=' w-5 h-5'><path stroke-linecap='round' stroke-linejoin='round' d='M16.862 4.487l1.687-1.688a1.875 1.875 0 112.652 2.652L6.832 19.82a4.5 4.5 0 01-1.897 1.13l-2.685.8.8-2.685a4.5 4.5 0 011.13-1.897L16.863 4.487zm0 0L19.5 7.125' /></svg><button\",[\"bg-white\"]))\r\n");
      out.write("acoes.append(GerarBotoes('<svg  class=\"w-4 h-4\"id=\"Camada_1\" data-name=\"Camada 1\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 16 18\"><defs><style>.cls-1{fill:#ed2121;}</style></defs><title>trash</title><path class=\"cls-1\" d=\"M9,3V4H4V6H5V19a2,2,0,0,0,2,2H17a2,2,0,0,0,2-2V6h1V4H15V3H9M7,6H17V19H7V6M9,8v9h2V8H9m4,0v9h2V8Z\" transform=\"translate(-4 -3)\"/></svg>',[\"px-3\", \"mb-2s\"]))\r\n");
      out.write("novaLinhaTR.append(produtotabela, quantidadetabela,valorvendatabela, acoes )\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("let tabela = document.getElementById(\"tabelaProdutosEmTable\")\r\n");
      out.write("tabela.append(novaLinhaTR)\r\n");
      out.write("//let div= $('<div class=\"ml-1 p-3 pedidoproduto flex justify-between items-center\"><div><p id=\"nomeproduto\"></p></div>')\r\n");
      out.write("//'<div class=\"tamanhodiv ml-3\" id=\"quantidadeproduto\"></div><div class=\"tamanhodiv text-center mr-5\" id=\"valorvendaproduto\" ></div><div class=\"flex tamanhodiv pl-3\"><div><button type=\"button\" data-modal-toggle=\"authentication-modal\"><svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 24 24\" stroke-width=\"1.5\" stroke=\"currentColor\" class=\" w-5 h-5\"><path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M16.862 4.487l1.687-1.688a1.875 1.875 0 112.652 2.652L6.832 19.82a4.5 4.5 0 01-1.897 1.13l-2.685.8.8-2.685a4.5 4.5 0 011.13-1.897L16.863 4.487zm0 0L19.5 7.125\"/></svg></button><!-- Main modal --><div id=\"authentication-modal\" tabindex=\"-1\" aria-hidden=\"true\" class=\"hidden overflow-y-auto overflow-x-hidden fixed top-0 right-0 left-0 z-50 w-full md:inset-0 h-modal md:h-full\"><div class=\"relative p-4 w-full max-w-md h-full md:h-auto\"><!-- Modal content --><div class=\"relative bg-white rounded-lg shadow dark:bg-gray-700\"><button type=\"button\" class=\"absolute top-3 right-2.5 text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm p-1.5 ml-auto inline-flex items-center dark:hover:bg-gray-800 dark:hover:text-white\" data-modal-toggle=\"uthentication-modal\"><svg aria-hidden=\"true\" class=\"w-5 h-5\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M4.293 4.293a1 1 0 011.414 0L10 8.586l4.293-4.293a1 1 0 111.414 1.414L11.414 10l4.293 4.293a1 1 0 01-1.414 1.414L10 11.414l-4.293 4.293a1 1 0 01-1.414-1.414L8.586 10 4.293 5.707a1 1 0 010-1.414z\" clip-rule=\"evenodd\"></path></svg><span class=\"sr-only\">Close modal</span></button><div class=\"py-6 px-6 lg:px-8\"><h3 class=\"mb-4 text-xl font-medium text-gray-900 dark:text-white uppercase\" id=\"nomeproduto\"></h3><form class=\"space-y-6\" action=\"#\"><div class=\"flex\"><div class=\"mr-2\"<label class=\"block mb-2 text-sfont-medium text-gray-900 dark:text-gray-300\">Quantidade</label><input type=\"number\"step=\"1\" id=\"editarquantidade\" class=\"bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-300 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white\"></div><div class=\"ml-2\"><label class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300\">Valor unitário</label><input type=\"number\" id=\"valorunitario\" class=\"bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-300 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white\"></div></div><button type=\"submit\" class=\"w-full colorbutton p-2 rounded-lg\">Salvar</button></form></div></div></div></div> </button></div><div><button onclick=\"Delete()\" class=\"px-3\"><svg class=\"w-4 h-4\" id=\"Camada_1\" data-name=\"Camada 1\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 16 18\"><defs><style>.cls-1{fill:#ed2121;}</style></defs><title>trash</title><path class=\"cls-1\" d=\"M9,3V4H4V6H5V19a2,2,0,0,0,2,2H17a2,2,0,0,0,2-2V6h1V4H15V3H9M7,6H17V19H7V6M9,8v9h2V8H9m4,0v9h2V8Z\" transform=\"translate(-4 -3)\"/></svg></button></div></div></div>\");\r\n");
      out.write("\r\n");
      out.write("let novaDiv = document.createElement(\"div\");\r\n");
      out.write("novaDiv.classList.add(\"ml-1\", \"p-3\", \"pedidoproduto\",\"border-red-500\", \"flex\", \"justify-between\", \"items-center\", \"text-gray-800\")\r\n");
      out.write("let novoP = document.createElement(\"p\")\r\n");
      out.write("novoP.id = codigoProduto;\r\n");
      out.write("novoP.innerHTML = \"<h1>teste</h1>\"\r\n");
      out.write("novaDiv.append(novoP)\r\n");
      out.write("\r\n");
      out.write("novoP.append(document.createElement(\"i\"))\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("subtotalinput= document.getElementById(\"subtotal\")\r\n");
      out.write("valorvenda=document.getElementById(\"valorvenda\");\r\n");
      out.write("quantidade = document.getElementById(\"quantidade\");\r\n");
      out.write("subtotal += calculo;\r\n");
      out.write("subtotalformatado = subtotal.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });\r\n");
      out.write("subtotalinput.value= subtotalformatado;\r\n");
      out.write("\r\n");
      out.write("var valorcredito = document.getElementById(\"valorcredito\").value;\r\n");
      out.write("var saldo = document.getElementById(\"saldo\");\r\n");
      out.write("var total =  subtotal - valorcredito\r\n");
      out.write("\r\n");
      out.write("if (valorcredito> subtotal){\r\n");
      out.write("\r\n");
      out.write("var totalpositivo = valorcredito - subtotal;//total * -1\r\n");
      out.write("//totalformatado = 'R$ '+ totalpositivo.toFixed(2).replace('.',',');// totalpositivo.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });\r\n");
      out.write("totalformatado = totalpositivo.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });\r\n");
      out.write("saldo.value= totalformatado;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("else if(valorcredito< subtotal){\r\n");
      out.write("var totalp = document.getElementById(\"totalp\");\r\n");
      out.write("\r\n");
      out.write("totalformatado = total.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });\r\n");
      out.write("totalp.value= totalformatado\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("else{\r\n");
      out.write("  var zero = 0 \r\n");
      out.write("\r\n");
      out.write("  saldo.value= zero.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' })\r\n");
      out.write("  totalp.innerHTML= zero.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' })\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("      \r\n");
      out.write("    function validar(){\r\n");
      out.write("      var nome = document.getElementById(\"nome\");\r\n");
      out.write("      var produto = document.getElementById(\"produto\");\r\n");
      out.write("      var quantidade = document.getElementById(\"quantidade\");\r\n");
      out.write("      var valorvenda = document.querySelector(\"#valorvenda\");\r\n");
      out.write("      var subtotal = document.getElementById(\"subtotal\");\r\n");
      out.write("      var valorcredito = document.getElementById(\"valorcredito\");\r\n");
      out.write("      var totalp = document.getElementById(\"totalp\");\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("        if(nome.value==''){\r\n");
      out.write("          nome.className=\"w-full p-2 bg-white border border-red-500 text-gray-900  rounded-lg focus:ring-red-500 focus:border-red-500 dark:bg-gray-700 dark:border-red-500 dark:placeholder-gray-400 dark:text-white dark:focus:ring-red-500 focus:border-red-500\";\r\n");
      out.write("          notifier.show('Preencha o nome do cliente!', 'por favor, preencha o campo em vermelho!', 'warning', '/src/img/danger.png', 5000);\r\n");
      out.write("          \r\n");
      out.write("        }\r\n");
      out.write("        if (produto.value==''){\r\n");
      out.write("          produto.className=\"block p-2.5 w-1/2 w-full z-20 text-sm text-gray-900  rounded-lg border border-red-500 focus:ring-red-500 focus:border-red-500 dark:bg-gray-700 dark:border-red-500 dark:placeholder-gray-400 dark:text-white dark:focus:border-red-500\";\r\n");
      out.write("          notifier.show('Preencha o campo produto!', 'por favor, preencha o campo em vermelho', 'warning', '/src/img/danger.png', 5000);\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if (valorcredito.value==''){\r\n");
      out.write("          valorcredito.className=\" bg-white border border-red-500 text-gray-900 text-sm rounded-lg focus:ring-red-500 focus:border-red-500 block w-full p-2 dark:bg-gray-700 dark:border-red-500 dark:placeholder-gray-400 dark:text-white dark:focus:ring-red-500 dark:focus:border-red-500\"\r\n");
      out.write("          notifier.show('Preencha o valor do crédito!', 'por favor, preencha o campo em vermelho na aba Pagamentos', 'warning', '/src/img/danger.png', 5000);\r\n");
      out.write("\r\n");
      out.write("        }else{\r\n");
      out.write("        Inserirproduto(Math.random()*2,produto, quantidade,valorvenda)\r\n");
      out.write("      }\r\n");
      out.write("        \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("</body>");
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