/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-30 09:16:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<title>Yahoo!!</title>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body{background-color:#eee}\r\n");
      out.write("h1,h2{font-family: cursive;background-color: #60bc54;color:#fff;padding:20px;text-align:center}\r\n");
      out.write("a{padding:2px;margin:10px;border-radius:5px;color:#54b0bc; display:inline-block; }\r\n");
      out.write(".container{width:500px;box-shadow:0px 1px 10px #a8a8a8; position:absolute;top:55%;left:50%;\r\n");
      out.write("\t\t  transform:translate(-50%,-50%);padding-bottom:10px}\r\n");
      out.write("p{text-align:center; font-size:20px; color:#e0587c}\r\n");
      out.write("input{width:50%; border:3px solid #60bc54; border-radius:5px; height: 40px; padding:10px}\r\n");
      out.write("input[type=\"submit\"]:hover{background-color:#54b0bc; border:0}\r\n");
      out.write("input[type=\"submit\"]{width:30%; background-color:#60bc54; border:0;cursor;pointer}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap core CSS -->\r\n");
      out.write("<link href=\"webjars/bootstrap/3.3.6/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".footer {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 60px;\r\n");
      out.write("\tbackground-color: #f5f5f5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer .container {\r\n");
      out.write("\twidth: auto;\r\n");
      out.write("\tmax-width: 680px;\r\n");
      out.write("\tpadding: 0 15px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<nav role=\"navigation\" class=\"navbar navbar-default\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"\">\r\n");
      out.write("\t\t\t<a href=\"/login.do\" class=\"navbar-brand\">Login</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"navbar-collapse\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"/home.do\">Home</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"/category.do\">Category</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"/product.do\">Product</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t<li><a href=\"/logout.do\" class=\"btn btn-danger\"><font color = \"pink\">Logout</font></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<H1>LOGIN PAGE</H1><br><br>\r\n");
      out.write("\t\t<form action=\"/login.do\" method=\"post\">\r\n");
      out.write("\t<p><font color =\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errrorMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</font></p>\r\n");
      out.write("\t\t<p>Name</p><p> <input type=\"text\" name=\"name\"/> </p>\r\n");
      out.write("\t\t<p>Password</p><p> <input type =\"password\" name=\"password\" /> </p>\r\n");
      out.write("\t\t<p><input type=\"submit\" value=\"LOGIN\"/></p>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li><a href=\"/home.do\" class=\"btn btn-warning\">go to Home page</a></li>\r\n");
      out.write("\t\t<li><a href=\"/signup.do\"><button type=\"button\" class=\"btn btn-warning\">SIGNUP</button></a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- <footer class=\"footer\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<p>footer content</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>-->\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"webjars/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"webjars/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
