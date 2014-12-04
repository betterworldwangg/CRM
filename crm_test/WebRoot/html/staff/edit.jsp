<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/css/sys.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/Calendar.js"></script>
</head>

<body class="emp_body">
<table border="0" cellspacing="0" cellpadding="0" width="100%">
  <tr>
    <td class="topg"></td>
  </tr>
</table>

<table border="0" cellspacing="0" cellpadding="0"  class="wukuang"width="100%">
  <tr>
    <td width="1%"><img src="${pageContext.request.contextPath }/images/tleft.gif"/></td>
    <td width="44%" align="left">[员工管理]</td>
   
    <td width="52%"align="right">
       <a href="#" ><img onclick="document.forms[0].submit()" src="${pageContext.request.contextPath }/images/button/save.gif" /></a>
       <a href="#"><img src="${pageContext.request.contextPath }/images/button/tuihui.gif" /></a>
      
    </td>
    <td width="3%" align="right"><img src="${pageContext.request.contextPath }/images/tright.gif"/></td>
  </tr>
</table>

<form action="emp_realEdit" method="post">
<table width="88%" border="0" class="emp_table" style="width:80%;">
	<s:hidden name="id"/>
 <tr>
    <td>姓名：</td>
    <td><input name="registName" type="text" value="${registName }"/></td>
    <td>性别：</td>
    <td><s:radio name="sex" list="#{'1':'男','2':'女' }" theme="simple"></s:radio></td>
  </tr>
  <tr>
    <td width="10%">出生日期：</td>
    <td width="20%"><input value="<s:date name='birthDay' format='yyyy-MM-dd'/>" onfocus="c.showMoreDay=false;c.show(this);" name="birthDay"/></td>
    <td width="8%">入职时间：</td>
    <td width="62%"><input value="<s:date name='joinDate' format='yyyy-MM-dd'/>" onfocus="c.showMoreDay=false;c.show(this);" name="joinDate"/></td>
  </tr>
 <tr>
    <td width="10%">所属部门：</td>
    <td width="20%"><s:select name="deptId" list="list" listKey="id" listValue="name" theme="simple"></s:select></td>
    <td width="8%">编号：</td>
    <td width="62%"><input name="empnum" value="${empnum }" type="text" /></td>
  </tr>
</table>
</form>
</body>
</html>
