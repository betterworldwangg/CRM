<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>

<link href="${pageContext.request.contextPath }/css/sys.css" type="text/css" rel="stylesheet" />

</head>

<body >
 <table border="0" cellspacing="0" cellpadding="0" width="100%">
  <tr>
    <td class="topg"></td>
  </tr>
</table>

<table border="0" cellspacing="0" cellpadding="0"  class="wukuang"width="100%">
  <tr>
    <td width="1%"><img src="${pageContext.request.contextPath }/images/tleft.gif"/></td>
    <td width="39%" align="left">[课程类别]</td>
   
    <td width="57%"align="right">
       <a href="${pageContext.request.contextPath }/html/lesson/addCourse.jsp"><img src="${pageContext.request.contextPath }/images/button/tianjia.gif" /></a>
       <a href="${pageContext.request.contextPath }/html/lesson/queryCourse.jsp"><img src="${pageContext.request.contextPath }/images/button/gaojichaxun.gif" /></a>
      
    </td>
    <td width="3%" align="right"><img src="${pageContext.request.contextPath }/images/tright.gif"/></td>
  </tr>
</table>
<table border="0" cellspacing="0" cellpadding="0" style="margin-top:5px;">
  <tr>
    <td ><img src="${pageContext.request.contextPath }/images/result.gif"/></td>
  </tr>
</table>
<table width="97%" border="1" >
  
  <tr class="henglan" style="font-weight:bold;">
    <td width="14%" align="center">名称</td>
    <td width="33%" align="center">简介</td>
    <td width="13%" align="center">总学时</td>
    <td width="18%" align="center">收费标准</td>
	<td width="11%" align="center">编辑</td>
  </tr>
 <s:iterator value="list" status="s">

  <tr class="tabtd<s:property value="#s.count%2+1"/>">
   <td align="center">${name }</td>
    <td align="center">${description } </td>
    <td align="center">${totalTime }</td>
    <td align="center">${money }</td>
  	<td width="11%" align="center"><a href="${pageContext.request.contextPath }/course_edit?id=${id}"><img src="${pageContext.request.contextPath }/images/button/modify.gif" class="img"></a></td>
  </tr>
 </s:iterator>
</table>
<s:form id="pageForm" action="course_list" namespace="/">
	<input type="hidden" name="currPage" id="currentPage"/>
	<input type="hidden" name="pageSize" id="pageSize"/>
</s:form>
<%@include file="/html/staff/page.jsp" %>
</body>
</html>
