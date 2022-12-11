package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listagemavaliacao_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<div class=\"flex pl-5 pt-5\" aria-label=\"Breadcrumb\">\r\n");
      out.write("    <ol class=\"inline-flex items-center space-x-1 md:space-x-3\">\r\n");
      out.write("      <li class=\"inline-flex items-center\">\r\n");
      out.write("        <a href=\"#\" class=\"inline-flex items-center text-sm font-medium text-gray-700 hover:text-gray-900 dark:text-gray-400 dark:hover:text-white\">\r\n");
      out.write("          <svg class=\"w-4 h-4 mr-2\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M10.707 2.293a1 1 0 00-1.414 0l-7 7a1 1 0 001.414 1.414L4 10.414V17a1 1 0 001 1h2a1 1 0 001-1v-2a1 1 0 011-1h2a1 1 0 011 1v2a1 1 0 001 1h2a1 1 0 001-1v-6.586l.293.293a1 1 0 001.414-1.414l-7-7z\"></path></svg>\r\n");
      out.write("          Página Inicial\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li>\r\n");
      out.write("        <div class=\"flex items-center\">\r\n");
      out.write("          <svg class=\"w-6 h-6 text-gray-400\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z\" clip-rule=\"evenodd\"></path></svg>\r\n");
      out.write("          <a href=\"#\" class=\"ml-1 text-sm font-medium text-gray-700 hover:text-gray-900 md:ml-2 dark:text-gray-400 dark:hover:text-white\">Produtos</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ol>\r\n");
      out.write("</div>\r\n");
      out.write("<h1 class=\"flex pl-4 pt-5 text-4xl font-semibold text-gray-800 dark:text-white \">Avaliações</h1>\r\n");
      out.write("<div class=\"flex\">\r\n");
      out.write("<div class=\"pt-5 pl-4 flex w-full flexwrap\">\r\n");
      out.write("<form class=\"relative pesquisar mr-3\" method=\"GET\" action=\"/pesquisaravaliacao\">\r\n");
      out.write("    <input name=\"nomecliente\" id=\"search-dropdown\" class=\" block p-2.5 w-1/2 w-full z-20 text-sm text-gray-900  rounded-lg border-l-gray-100 border-l-2 border border-gray-300 focus:ring-blue-500 focus:border-blue-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:border-blue-500\" placeholder=\"Pesquisar o nome do produto\" required>\r\n");
      out.write("    <button type=\"submit\" class=\" absolute top-0 right-0 p-2.5 text-sm font-medium text-gray-900 rounded-r-lg  hover:bg-gray-100 dark:bg-gray-700 dark:focus:ring-blue-800 dark:text-gray-500\"><svg aria-hidden=\"true\" class=\"w-5 h-5\" fill=\"none\" stroke=\"currentColor\" viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\"><path stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0z\"></path></svg></button>\r\n");
      out.write("  </form>\r\n");
      out.write("  <button class=\" ml-5 cadastrarbotao block  mb-2 p-2.5 w-full z-20 text-sm text-gray-900  rounded-lg border-l-gray-100 border-l-2 border border-gray-300 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:hover:cadastrarbotao\"><a href=\"/cadastraravaliacao\" class=\"w-full h-full\">Adicionar Avaliação</a></button>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"overflow-x-auto relative pl-1 pt-5\">\r\n");
      out.write("    <table class=\"w-full text-sm text-left text-gray-500 dark:text-gray-400\">\r\n");
      out.write("        <thead class=\"text-base text-gray-700 bg-gray-50 dark:bg-gray-800 dark:text-gray-400\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th scope=\"col\" class=\"py-3 px-6 font-semibold dark:text-white\">\r\n");
      out.write("                    Nome\r\n");
      out.write("                </th>\r\n");
      out.write("                  <th scope=\"col\" class=\"py-3 px-6 font-semibold dark:text-white\">\r\n");
      out.write("                    Data\r\n");
      out.write("                </th>\r\n");
      out.write("                <th scope=\"col\" class=\"py-3 px-6 font-semibold dark:text-white\">\r\n");
      out.write("                    Aprovados\r\n");
      out.write("                </th>\r\n");
      out.write("                <th scope=\"col\" class=\"py-3 px-6 font-semibold dark:text-white\">\r\n");
      out.write("                    Crédito\r\n");
      out.write("                </th>\r\n");
      out.write("                <th scope=\"col\" class=\"py-3 px-6 font-semibold dark:text-white\">\r\n");
      out.write("                  Excluir\r\n");
      out.write("              </th>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("        \t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("        \r\n");
      out.write("    </table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("      .cadastrarbotao{\r\n");
      out.write("      width:20%;\r\n");
      out.write("      background-color: #0bde97;\r\n");
      out.write("      color: white;\r\n");
      out.write("      \r\n");
      out.write("    }\r\n");
      out.write("    .cadastrarbotao:hover{\r\n");
      out.write("      background-color: #0bc889;\r\n");
      out.write("    }\r\n");
      out.write("    .pesquisar{\r\n");
      out.write("      width:35%;\r\n");
      out.write("    }\r\n");
      out.write("    @media(max-width:767px){\r\n");
      out.write("      .flexwrap{\r\n");
      out.write("        display:block;\r\n");
      out.write("      }\r\n");
      out.write("      .cadastrarbotao{\r\n");
      out.write("        margin-top: 3%;\r\n");
      out.write("        width: 96%;\r\n");
      out.write("      }\r\n");
      out.write("      .pesquisar{\r\n");
      out.write("        width: 96%;\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listaAvaliacoes}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("avaliacao");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("        \r\n");
          out.write("            <tr class=\"bg-white border-b dark:bg-gray-700 dark:border-gray-700\">\r\n");
          out.write("              <th scope=\"row\" class=\"py-4 px-6 font-medium text-gray-900 whitespace-nowrap dark:text-white\">\r\n");
          out.write("                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${avaliacao.getNomecliente()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                </th>\r\n");
          out.write("                <td class=\"py-4 px-6 dark:text-white\">\r\n");
          out.write("                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${avaliacao.getData()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                </td>\r\n");
          out.write("                <td class=\"py-4 px-6 dark:text-white\">\r\n");
          out.write("                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${avaliacao.getItensaprovados()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                </td>\r\n");
          out.write("                <td class=\"py-4 px-6 dark:text-white\">\r\n");
          out.write("                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${avaliacao.getValorcredito()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                </td>\r\n");
          out.write("         \r\n");
          out.write("                <td class=\"py-4 px-6\">\r\n");
          out.write("                 \t<a href=\"/excluiravaliacao?codigo=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${avaliacao.getCodigo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"remove-item border-0 focus:ring-red-500 focus:border-red-500 block p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-green-500 dark:focus:border-red-500\">\r\n");
          out.write("                    <svg  class=\"w-6 h-5\"id=\"Camada_1\" data-name=\"Camada 1\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 16 18\"><defs><style>.cls-1{fill:#ed2121;}</style></defs><title>trash</title><path class=\"cls-1\" d=\"M9,3V4H4V6H5V19a2,2,0,0,0,2,2H17a2,2,0,0,0,2-2V6h1V4H15V3H9M7,6H17V19H7V6M9,8v9h2V8H9m4,0v9h2V8Z\" transform=\"translate(-4 -3)\"/></svg>\r\n");
          out.write("                  </a>\r\n");
          out.write("                  </td>\r\n");
          out.write("                </tr>\r\n");
          out.write("                  \r\n");
          out.write("                <div>\r\n");
          out.write("                  <div class=\" hidden z-50 pr-3 pl-5 my-4 text-base list-none bg-white rounded divide-y divide-gray-100 shadow dark:bg-gray-700\" id=\"language-dropdown-menu\">\r\n");
          out.write("                    <ul class=\"py-1\" role=\"none\">\r\n");
          out.write("                      <li>\r\n");
          out.write("                        <a href=\"#\" class=\" font-semibold block py-2 px-4 text-sm text-gray-700 hover:bg-gray-100 dark:text-gray-400 dark:hover:bg-gray-600 dark:hover:text-white\" role=\"menuitem\">\r\n");
          out.write("                        </a>\r\n");
          out.write("                        </li>\r\n");
          out.write("                        </ul>\r\n");
          out.write("                </div>\r\n");
          out.write("              </div>\r\n");
          out.write(" \r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
