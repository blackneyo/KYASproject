/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.54
 * Generated at: 2021-12-27 06:20:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class enroll_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/shop(최종)/shop/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/VamPa/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/shop(최종)/shop/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/VamPa/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1637205183897L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("<title>게시판 등록</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/main.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../resources/css/main1.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"../resources/css/bootstrap4.4.1/bootstrap.min.css\">\r\n");
      out.write("<script src=\"../resources/js/main.js\" defer></script>	\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.js\"\r\n");
      out.write("	integrity=\"sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- Navbar -->\r\n");
      out.write("	<nav id=\"navbar\">\r\n");
      out.write("		<div class=\"navbar__logo\">\r\n");
      out.write("			<img src=\"../resources/img/logo.png\" class=\"home__a\" />KYAS\r\n");
      out.write("		</div>\r\n");
      out.write("		<ul class=\"navbar__menu\">\r\n");
      out.write("			");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("			");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</ul>\r\n");
      out.write("\r\n");
      out.write("		<!-- header -->\r\n");
      out.write("		<button class=\"navbar__toggle-btn\">\r\n");
      out.write("			<i class=\"fas fa-bars\"></i>>\r\n");
      out.write("		</button>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<section id=\"home\">\r\n");
      out.write("		<div class=\"home__container\">\r\n");
      out.write("			<img src=\"../resources/img/main.jpg\" class=\"home__avatar\" />\r\n");
      out.write("			<h3 class=\"home__title\">\r\n");
      out.write("				Hello, <br />We provide you with any alcohol you want.\r\n");
      out.write("			</h3>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<div class=\"section__container2\">\r\n");
      out.write("		<nav aria-label=\"breadcrumb\">\r\n");
      out.write("			<ol class=\"breadcrumb\">\r\n");
      out.write("				<li class=\"breadcrumb-item active\" aria-current=\"page\" ><h2>게시판 등록</h2> </li>\r\n");
      out.write("			</ol>\r\n");
      out.write("		</nav>\r\n");
      out.write("\r\n");
      out.write("		<form action=\"/board/enroll\" method=\"post\">\r\n");
      out.write("			<div class=\"input_wrap\">\r\n");
      out.write("				<label>Title</label> <input placeholder=\"제목을 입력하세요\" type=\"text\"\r\n");
      out.write("					class=\"form-control\" aria-label=\"Sizing example input\"\r\n");
      out.write("					aria-describedby=\"inputGroup-sizing-sm\" name=\"title\">\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"input_wrap\">\r\n");
      out.write("				<label>Content</label>\r\n");
      out.write("				<textarea class=\"form-control\" aria-label=\"With textarea\"\r\n");
      out.write("					name=\"content\" placeholder=\"내용을 입력하세요\"></textarea>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"input_wrap\">\r\n");
      out.write("				<label>Writer</label> <input type=\"text\" class=\"form-control\"\r\n");
      out.write("					aria-label=\"Sizing example input\"\r\n");
      out.write("					aria-describedby=\"inputGroup-sizing-sm\" name=\"writer\"\r\n");
      out.write("					placeholder=\"id를 입력하세요\">\r\n");
      out.write("			</div>\r\n");
      out.write("			<button class=\"btn btn-secondary btn-lg\" id=\"enrollment\" >등록</button>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Footer 영역 -->\r\n");
      out.write("\r\n");
      out.write("	<!-- class=\"footer_nav\" -->\r\n");
      out.write("	<section id=\"contact\" class=\"section\">\r\n");
      out.write("\r\n");
      out.write("		<h2 class=\"contact__email\">bit.kipping@gmail.com</h2>\r\n");
      out.write("		<div class=\"contact__links\">\r\n");
      out.write("			<a href=\"https://github.com/dream-ellie\" target=\"_blank\"> <i\r\n");
      out.write("				class=\"fab fa-github\"></i>\r\n");
      out.write("			</a> <a href=\"#\" target=\"_blank\"> <i class=\"fa fa-linkedin-square\"></i>\r\n");
      out.write("			</a>\r\n");
      out.write("		</div>\r\n");
      out.write("		<p class=\"contact__rights\">\r\n");
      out.write("			(주) Vam alchoal 대표이사 : 다이노 <br> 사업자등록번호 : o11-123-56789 <br>\r\n");
      out.write("			대표전화 : 1440-2293(발신자 부담전화) <br> <br> COPYRIGHT(C) <strong>bit.camp.com</strong>\r\n");
      out.write("			ALL RIGHTS RESERVED.\r\n");
      out.write("		</p>\r\n");
      out.write("	</section>\r\n");
      out.write("	<!-- class=\"footer\" -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		/* gnb_area 로그아웃 버튼 작동 */\r\n");
      out.write("		$(\"#gnb_logout_button\").click(function() {\r\n");
      out.write("			//alert(\"버튼 작동\");\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				type : \"POST\",\r\n");
      out.write("				url : \"/member/logout.do\",\r\n");
      out.write("				success : function(data) {\r\n");
      out.write("					alert(\"로그아웃 성공\");\r\n");
      out.write("					document.location.reload();\r\n");
      out.write("				}\r\n");
      out.write("			}); // ajax     \r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/board/enroll.jsp(30,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member == null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("				<a href=\"/main\"><li class=\"navbar__menu__item \">Home</li></a>\r\n");
          out.write("				<a href=\"/member/login\"><li class=\"navbar__menu__item\">로그인</li></a>\r\n");
          out.write("				<a href=\"/member/join\"><li class=\"navbar__menu__item\">회원가입</li></a>\r\n");
          out.write("			");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/board/enroll.jsp(36,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member != null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("				");
          if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fif_005f1, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("				<a href=\"/main\"><li class=\"navbar__menu__item \">Home</li></a>\r\n");
          out.write("\r\n");
          out.write("				<a href=\"/board/list\"><li class=\"navbar__menu__item active\">게시판</li></a>\r\n");
          out.write("				<li class=\"navbar__menu__item\"><a id=\"gnb_logout_button\">로그아웃</a></li>\r\n");
          out.write("			");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
      // /WEB-INF/views/board/enroll.jsp(37,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.adminCk == 1 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("					<a href=\"/admin/main\"><li class=\"navbar__menu__item \">관리자\r\n");
          out.write("							페이지</li></a>\r\n");
          out.write("				");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }
}
