package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class alteracaoproduto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Alterar | Produto </title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouttopo.jsp", out, false);
      out.write("\r\n");
      out.write("<div class=\"flex pl-5 mt-20\" aria-label=\"Breadcrumb\">\r\n");
      out.write("    <ol class=\"inline-flex items-center space-x-1 md:space-x-3\">\r\n");
      out.write("      <li class=\"inline-flex items-center\">\r\n");
      out.write("        <a href=\"/index\" class=\"inline-flex items-center text-sm font-medium text-gray-700 hover:text-gray-900 dark:text-gray-400 dark:hover:text-white\">\r\n");
      out.write("          <svg class=\"w-4 h-4 mr-2\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M10.707 2.293a1 1 0 00-1.414 0l-7 7a1 1 0 001.414 1.414L4 10.414V17a1 1 0 001 1h2a1 1 0 001-1v-2a1 1 0 011-1h2a1 1 0 011 1v2a1 1 0 001 1h2a1 1 0 001-1v-6.586l.293.293a1 1 0 001.414-1.414l-7-7z\"></path></svg>\r\n");
      out.write("          Página Inicial\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li>\r\n");
      out.write("        <div class=\"flex items-center\">\r\n");
      out.write("          <svg class=\"w-6 h-6 text-gray-400\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z\" clip-rule=\"evenodd\"></path></svg>\r\n");
      out.write("          <a href=\"/listagemprodutos\" class=\"ml-1 text-sm font-medium text-gray-700 hover:text-gray-900 md:ml-2 dark:text-gray-400 dark:hover:text-white\">Produtos</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li>\r\n");
      out.write("        <div class=\"flex items-center\">\r\n");
      out.write("          <svg class=\"w-6 h-6 text-gray-400\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z\" clip-rule=\"evenodd\"></path></svg>\r\n");
      out.write("          <a href=\"/alterarproduto\" class=\"ml-1 text-sm font-medium text-gray-700 hover:text-gray-900 md:ml-2 dark:text-gray-400 dark:hover:text-white\">Cadastrar Produto</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ol>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"bg-white m-5  dark:bg-gray-700\">\r\n");
      out.write("  <div class=\"flex justify-between items-end responsividade\">\r\n");
      out.write("  <h1 class=\"flex pl-4 pt-5 text-4xl font-semibold text-gray-700 dark:text-white \">Produto</h1>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write(" <!-- forms -->\r\n");
      out.write("<form method=\"POST\" action=\"/alterarproduto\">\r\n");
      out.write("    <h2 class=\"flex pl-4 pt-5 text-xl text-gray-400\">Dados Cadastrais</h2>\r\n");
      out.write("    <div class=\"pl-4 pt-5 pr-4 grid gap-6 mb-6 md:grid-cols-3\">\r\n");
      out.write("    \t<input class=\"form-control hidden\" type=\"text\" id=\"codigo\" name=\"codigo\" \r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.getCodigo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" disabled>\r\n");
      out.write("\t<input type=\"hidden\" name=\"codigo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.getCodigo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("        <div>\r\n");
      out.write("        \r\n");
      out.write("            <label class=\"block mb-2 text-sm font-medium text-black dark:text-gray-300\">Descrição</label>\r\n");
      out.write("            <input type=\"text\" id=\"descricao\" name=\"descricao\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.getDescricao()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400  dark:bg-gray-700 dark:focus:border-gray-200\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- <div>\r\n");
      out.write("            <label class=\"block mb-2 text-sm font-medium text-black dark:text-gray-300\">Código de barras (EAN)</label>\r\n");
      out.write("           <input type=\"text\" id=\"codigo\" class=\"bg-white border border-r-2 border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:bg-gray-700 dark:focus:border-gray-200\" placeholder=\"Ex: 0000000001\" required>\r\n");
      out.write("        </div> -->\r\n");
      out.write("        <div class=\"pr-2\">\r\n");
      out.write("            <label class=\"block mb-2 text-sm font-medium text-black dark:text-gray-300\">Preço de Venda (R$)</label>\r\n");
      out.write("            <input type=\"text\" step=\"0.1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.getValor()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"valorvenda\" name=\"valor\" class=\"bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:border-gray-200\" placeholder=\"Ex: 199,50\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <h2 class=\"flex pl-5  ml-5 text-xl text-gray-400\">Estoque</h2>\r\n");
      out.write("    <label class=\"block mb-2 pl-5 text-sm font-medium text-black dark:text-gray-300 mt-4\">Estoque</label>\r\n");
      out.write("      \r\n");
      out.write("    \r\n");
      out.write("    <input type=\"number\" step=\"1\" id=\"estoque\" name=\"quantidade\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.getQuantidade()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"block p-2.5 ml-4 input z-20 text-sm text-gray-900  rounded-lg border-l-gray-100 border-l-2 border border-gray-300 focus:ring-gray-400 focus:border-gray-200 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:border-gray-200\" placeholder=\"Ex:1\" required>\r\n");
      out.write("     <h2 class=\"flex pl-5 pt-5 text-xl text-gray-400\">Dados Fiscais</h2>\r\n");
      out.write("    <div class=\"pl-5 pt-5 pr-5 grid gap-6 mb-6 md:grid-cols-3 mr-4\">\r\n");
      out.write("                  <div >\r\n");
      out.write("                <label class=\"block mb-2 text-sm font-medium text-black dark:text-gray-300\">Origem</label>\r\n");
      out.write("                <select id=\"origem\" class=\"bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:border-gray-200\">\r\n");
      out.write("                  <option value=\"0\" selected>0 - Nacional, exceto as indicadas nos cÃ³digos 3, 4, 5 e 8</option>\r\n");
      out.write("                  <option value=\"1\">1 - Estrangeira - ImportaÃ§Ã£o direta, exceto a indicada no cÃ³digo 6</option>\r\n");
      out.write("                  <option value=\"2\">2 - Estrangeira - Adquirida no mercado interno, exceto a indicada no cÃ³digo 7</option>\r\n");
      out.write("                  <option value=\"3\">3 - Nacional, mercadoria ou bem com ConteÃºdo de ImportaÃ§Ã£o superior a 40% e inferior ou igual a 70%</option>\r\n");
      out.write("                  <option value=\"4\">4 - Nacional, cuja produÃ§Ã£o tenha sido feita em conformidade com os processos produtivos bÃ¡sicos de que tratam as legislaÃ§Ãµes citadas nos Ajustes</option>\r\n");
      out.write("                  <option value=\"5\">5 - Nacional, mercadoria ou bem com ConteÃºdo de ImportaÃ§Ã£o inferior ou igual a 40%</option>\r\n");
      out.write("                  <option value=\"6\">6 - Estrangeira - ImportaÃ§Ã£o direta, sem similar nacional, constante em lista da CAMEX</option>\r\n");
      out.write("                  <option value =\"7\">7 - Estrangeira - Adquirida no mercado interno, sem similar nacional, constante em lista da CAMEX</option>\r\n");
      out.write("                  <option value=\"8\">8 - Nacional, mercadoria ou bem com ConteÃºdo de ImportaÃ§Ã£o superior a 70%</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("              </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <label class=\"block mb-2 text-sm font-medium text-black dark:text-gray-300\">NCM</label>\r\n");
      out.write("                  <input id=\"ncm\" class=\"block p-2.5 w-full z-20 text-sm text-gray-900  rounded-lg border-l-gray-100 border-l-2 border border-gray-300 focus:ring-gray-400 focus:border-gray-200 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:border-gray-200\" placeholder=\"NCM\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("              <div>\r\n");
      out.write("                <label class=\"block mb-2 text-sm font-medium text-black dark:text-gray-300\">CEST</label>\r\n");
      out.write("                <input type=\"text\" id=\"cest\" name=\"cest\" class=\"bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:border-gray-200\" placeholder=\"City Name\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"flex pt-5\">\r\n");
      out.write("              <button class=\" ml-1 mt-5 cancelarbotao bg-transparent hover:bg-green-200  block  mb-2 p-2.5 w-full z-20 text-sm text-gray-900  rounded-lg  border border border-green-300 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:hover:bg-green-700 mr-1\">Cancelar</button>\r\n");
      out.write("    \r\n");
      out.write("              <button  id=\"btn-nt-show\" type=\"submit\" class=\" flex-wrap block cadastrarbotao 0 mt-1 mb-2 p-2.5 w-full z-20 text-sm text-gray-900  rounded-lg border-l-gray-100 border-l-2 border border-gray-300 focus:ring-gray-400 focus:border-gray-200 \">Cadastrar</button>\r\n");
      out.write("          </div>\r\n");
      out.write("         </div>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("const descricao= document.getElementById(\"descricao\")\r\n");
      out.write("const codigo = document.getElementById(\"codigo\")\r\n");
      out.write("const valorvenda= document.getElementById(\"valorvenda\")\r\n");
      out.write("const estoque= document.getElementById(\"estoque\")\r\n");
      out.write("const ncm= document.getElementById(\"ncm\")\r\n");
      out.write("\r\n");
      out.write("\tvar teste= 2;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function validar(){\r\n");
      out.write("\r\n");
      out.write("if(descricao.value=='') {\r\n");
      out.write("descricao.className=\"bg-white border  border-red-500 text-gray-900 text-sm rounded-lg focus:ring-red-500 focus:border-red-500 block w-full p-2.5 dark:bg-gray-700 dark:border-red-500 dark:placeholder-gray-400 dark:text-white dark:focus:ring-red-500 dark:focus:border-red-500\";\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("} \r\n");
      out.write(" if(codigo.value=='') {\r\n");
      out.write("codigo.className=\"bg-white border  border-red-500 text-gray-900 text-sm rounded-lg focus:ring-red-500 focus:border-red-500 block w-full p-2.5 dark:bg-gray-700 dark:border-red-500 dark:placeholder-gray-400 dark:text-white dark:focus:ring-red-500 dark:focus:border-red-500\";\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("} \r\n");
      out.write(" if(valorvenda.value=='') {\r\n");
      out.write("valorvenda.className=\"bg-white border border-red-500 text-gray-900 text-sm rounded-lg focus:ring-red-500 focus:border-red-500 block w-full p-2.5 dark:bg-gray-700 dark:border-red-500 dark:placeholder-gray-400 dark:text-white dark:focus:ring-red-500 dark:focus:border-red-500\"   ;\r\n");
      out.write("\r\n");
      out.write("} \r\n");
      out.write(" if(estoque.value=='') {\r\n");
      out.write("estoque.className=\" block p-2.5 ml-4 input z-20 text-sm text-gray-900  rounded-lg border-lg  border border-red-500 focus:ring-gray-400 focus:border-red-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:border-red-500\";\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write(" if(ncm.value=='') {\r\n");
      out.write("ncm.className=\"bg-white border border-red-500 text-gray-900 text-sm rounded-lg focus:ring-red-500 focus:border-red-500 block w-full p-2.5 dark:bg-gray-700 dark:border-red-500 dark:placeholder-gray-400 dark:text-white dark:focus:ring-red-500 dark:focus:border-red-500\";\r\n");
      out.write(" \r\n");
      out.write("}\r\n");
      out.write(" if(descricao.value=='' || codigo.value=='' || valorvenda.value<=0|| estoque.value<=0 || ncm.value=='' ){\r\n");
      out.write("\t  notifier.show('Preencha todos os campos!', 'campos em vermelho precisam ser preenchidos.', 'warning', '/imagens/danger.png', 5000);\r\n");
      out.write("}\r\n");
      out.write(" else {\r\n");
      out.write("\t\r\n");
      out.write("\t  notifier.show('Produto Cadastrado com sucesso!', '', 'success', '/imagens/check-mark-img.png', 5000);\r\n");
      out.write("\t  descricao.className=\"bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400  dark:bg-gray-700 dark:focus:border-gray-200\";\r\n");
      out.write("\t  codigo.className=\"bg-white border border-r-2 border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:bg-gray-700 dark:focus:border-gray-200\";\r\n");
      out.write("\t  valorvenda.className=\"bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:border-gray-200\";\r\n");
      out.write("\t  estoque.className=\"block p-2.5 ml-4 input z-20 text-sm text-gray-900  rounded-lg border-lg  border border-red-500 focus:ring-gray-400 focus:border-red-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:border-red-500\";\r\n");
      out.write("\t\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write("\t}\r\n");
      out.write("\t  function redirecionar(){\r\n");
      out.write("\t  window.location=\"/listagemprodutos\";\r\n");
      out.write("\t  }\r\n");
      out.write("  \r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("  .input{\r\n");
      out.write("    width:31%;\r\n");
      out.write("  }\r\n");
      out.write("  .cadastrarbotao{\r\n");
      out.write("      width:13em;\r\n");
      out.write("      margin-top: 2%;\r\n");
      out.write("      background-color: #0bde97;\r\n");
      out.write("      color: white;\r\n");
      out.write("      \r\n");
      out.write("    }\r\n");
      out.write("    .cadastrarbotao:hover{\r\n");
      out.write("      background-color: #0bc889;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write(".cancelarbotao{\r\n");
      out.write("  width:13em;\r\n");
      out.write("  margin-top: 2%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
