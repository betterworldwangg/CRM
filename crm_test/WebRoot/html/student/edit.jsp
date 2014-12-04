<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/css/sys.css" type="text/css" rel="stylesheet" />
<script src="${pageContext.request.contextPath }/js/jquery-1.3.1.js" type="text/javascript"></script>
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
    <td width="44%" align="left">[编辑正式学员]</td>
   
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
<div id="jiben">
<form action="stu_realEdit" method="post">
	<s:hidden name="id"></s:hidden>
  <table width="88%" class="emp_table">
  <tr>
    <td width="8%" align="left">姓名：</td>
    <td width="19%" align="left"><s:textfield name="name" theme="simple"/></td>
    <td width="7%" align="left">QQ：</td>
    <td width="19%" align="left"><s:textfield name="qq" theme="simple"/></td>
    <td width="7%" align="left">学校：</td>
    <td width="40%" align="left"><s:textfield name="school" theme="simple"/></td>
  </tr>
  <tr>
    <td align="left">年龄：</td>
    <td align="left"><s:textfield name="age" theme="simple"/></td>
    <td align="left">性别：</td>
    <td align="left"><s:radio name="sex" list="#{'1':'男','2':'女' }" theme="simple"></s:radio></td>
    <td align="left">电话：</td>
    <td align="left"><s:textfield name="phoneNum" theme="simple"/></td>
  </tr>
  <tr>
    <td align="left">联系地址：</td>
    <td align="left"><s:textfield name="addres" theme="simple"/></td>
    <td align="left">专业：</td>
    <td align="left"><s:textfield name="special" theme="simple"/></td>
    <td align="left">学历：</td>
    <td align="left"><s:textfield name="education" theme="simple"/></td>
  </tr>
  <tr>
    <td colspan="6"><br />班级：</td>
    </tr>
  <tr>
    <td colspan="6" align="left"><table width="73%" class="emp_table" style="width:50%; border:1px solid #CCC; margin-left:0" align="left">
      <tr>
        <td width="7%" align="center">&nbsp;</td>
        <td width="20%" align="center">班级名称</td>
        <td width="21%" align="center">开班时间</td>
        <td width="18%" align="center">课程</td>
        <td width="34%" align="center">已报人数</td>
      </tr>
      <s:iterator value="clazzs">
      <tr>
        <td align="center">
        	<input 
		      	<s:if test="clazzId == id">
		      		checked
		      	</s:if>
	         value="${id }" type="radio" name="clazzId"/>
        </td>
        <td align="center">${name }</td>
        <td align="center"><s:date name="beginTime" format="yyyy-MM-dd" /></td>
        <td align="center">${course.name}</td>
        <td align="center">${stuCounts }</td>
      </tr>
   	</s:iterator>
    </table></td>
    </tr>
  <tr>
    <td height="38">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  
</table>
</form>
</div>
</body>
</html>
