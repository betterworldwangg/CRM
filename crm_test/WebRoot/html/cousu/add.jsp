<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>

<link href="${pageContext.request.contextPath }/css/sys.css" type="text/css" rel="stylesheet" />

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
    <td width="44%" align="left">[编辑咨询学生]</td>
   
    <td width="52%"align="right">
    	<!--<a href="listLog.html"><img src="${pageContext.request.contextPath }/images/button/find.gif" class="img"/></a>
        <a href="addLog.html"><img src="${pageContext.request.contextPath }/images/button/add.gif" class="img"/></a>~-->
        
       <!-- <a href="#"><img src="${pageContext.request.contextPath }/images/button/close.gif" class="img"/></a>-->
       <a href="#"><img onclick="document.forms[0].submit()" src="${pageContext.request.contextPath }/images/button/save.gif" /></a>
       <a href="#"><img src="${pageContext.request.contextPath }/images/button/tuihui.gif" /></a>
    </td>
    <td width="3%" align="right"><img src="${pageContext.request.contextPath }/images/tright.gif"/></td>
  </tr>
</table>
<form action="cousu_add" method="post">
<table width="89%" class="emp_table"    style="margin-top:5px; margin-left:55px;" align="left" cellspacing="0">
  <tr>
    <td width="7%" height="35" align="left" >姓名：</td>
    <td width="18%" align="left"><input name="name" type="text" /></td>
    <td width="8%" align="left">联系地址：</td>
    <td width="19%" align="left"><input name="addres" type="text" /></td>
    <td width="7%" align="left">意向班级：</td>
    <td width="41%" align="left"><s:select list="clazzlist" name="clazz.id" listKey="id" listValue="name" theme="simple"></s:select>
    	
    </td>
  </tr>
  <tr>
    <td height="25" align="left">学校：</td>
    <td align="left"><input name="school" type="text" /></td>
    <td align="left">QQ：</td>
    <td align="left"><input name="qq" type="text" /></td>
    <td align="left">电话：</td>
    <td align="left"><input name="qq" type="text" /></td>
  </tr>
  <tr>
    <td height="28" align="left">年龄：</td>
    <td align="left"><input name="age" type="text" /></td>
    <td align="left">性别：</td>
    <td align="left"><s:radio name="sex" list="#{'1':'男','2':'女' }" theme="simple"></s:radio></td>
    <td align="left">学历：</td>
    <td align="left"><input name="education" type="text" /></td>
  </tr>
  <tr>
    <td height="27">备注：</td>
    <td></td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="77">&nbsp;</td>
    <td colspan="5"><textarea name="description" cols="60" rows="5"></textarea></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td colspan="5" style="padding-left:250px;"></td>
  </tr>
</table>

</form>

</body>
</html>
