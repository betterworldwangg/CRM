<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/css/sys.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/ckeditor/ckeditor.js"></script>
<script>
	function init(){
			
			CKEDITOR.replace( 'desc', {
				uiColor: '#abcdef'
			});
	}
</script>
</head>

<body class="emp_body" onload="init()">
<table border="0" cellspacing="0" cellpadding="0" width="100%">
  <tr>
    <td class="topg"></td>
  </tr>
</table>

<table border="0" cellspacing="0" cellpadding="0"  class="wukuang"width="100%">
  <tr>
    <td width="1%"><img src="${pageContext.request.contextPath }/images/tleft.gif"/></td>
    <td width="44%" align="left">[编辑部门]</td>
   
    <td width="52%"align="right">
       <a href="#" onclick="document.forms[0].submit()"><img src="${pageContext.request.contextPath }/images/button/save.gif" /></a>
       <a href="#"><img src="${pageContext.request.contextPath }/images/button/tuihui.gif" /></a>
      
    </td>
    <td width="3%" align="right"><img src="${pageContext.request.contextPath }/images/tright.gif"/></td>
  </tr>
</table>
<s:debug></s:debug>
<form action="dept_realEdit" method="post">
	<table width="88%" border="0" class="emp_table" style="width:80%;">
		<s:hidden name="id"></s:hidden>
	 <tr>
	    <td>部门名称：</td>
	    <td><input name="name" type="text" value="${name }"></td>
	  </tr>
	 <tr>
	    <td width="10%">部门介绍：</td>
	    <td></td>
	  </tr>
	   <tr>
	    <td width="10%"></td>
	    <td >
	    	<textarea name="desc" cols="50" rows="5">${description }</textarea>
	    </td>
	  </tr>
	</table>
</form>
</body>
</html>
