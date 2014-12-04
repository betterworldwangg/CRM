<%@ page language="java" contentType="text/html; charset=UTF-8"%>
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
    <td width="44%" align="left">[查询课程]</td>
   
    <td width="52%"align="right">
    	<!--<a href="listLog.html"><img src="${pageContext.request.contextPath }/images/button/find.gif" class="img"/></a>
        <a href="addLog.html"><img src="${pageContext.request.contextPath }/images/button/add.gif" class="img"/></a>~-->
        
       <!-- <a href="#"><img src="${pageContext.request.contextPath }/images/button/close.gif" class="img"/></a>-->
       <a href="#"><img onclick="document.forms[0].submit()" src="${pageContext.request.contextPath }/images/button/find.gif" /></a>
       <a href="#"><img src="${pageContext.request.contextPath }/images/button/tuihui.gif" /></a>
      
    </td>
    <td width="3%" align="right"><img src="${pageContext.request.contextPath }/images/tright.gif"/></td>
  </tr>
</table>
<form action="course_query" method="post">
<table width="88%" border="0" class="emp_table" style="width:80%;">
  <tr>
    <td width="10%">课程类别：</td>
    <td><input name="name" type="text" size="30" /></td>
  </tr>
  <tr>
    <td >课程简介：</td>
    <td ><input name="description" type="text"  size="30"/></td>
  </tr>
  <tr>  
    <td >总学时：</td>
    <td ><input name="hqb.timeDown" type="text" size="12"/> 至 <input name="hqb.timeUp" type="text" size="12"/></td>
  </tr>
  <tr>
    <td>课程费用：</td>
    <td ><input name="hqb.moneyDown" type="text" size="12"/> 至 <input name="hqb.moneyUp" type="text" size="12"/></td>
  </tr>
</table>
</form>
</body>
</html>