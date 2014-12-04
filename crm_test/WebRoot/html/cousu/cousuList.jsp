<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>



<link href="${pageContext.request.contextPath }/css/sys.css" type="text/css" rel="stylesheet" />
</head>

<body>
 <table border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td class="topg"></td>
  </tr>
</table>

<table border="0" cellspacing="0" cellpadding="0" class="wukuang">
  <tr>
    <td width="1%"><img src="${pageContext.request.contextPath }/images/tleft.gif"/></td>
    <td width="33%" align="left">[咨询学生管理]</td>
   
    <td width="63%"align="right">
        <a class="butbg"  href="cousu_addUI"><img src="${pageContext.request.contextPath }/images/button/tianjia.gif" /></a>
        <a class="butbg"  href="#"><img src="${pageContext.request.contextPath }/images/button/gaojichaxun.gif" /></a>
    </td>
    <td width="3%" align="right"><img src="${pageContext.request.contextPath }/images/tright.gif"/></td>
  </tr>
</table>
<table border="0" cellspacing="0" cellpadding="0" style="margin-top:5px;">
  <tr>
    <td ><img src="${pageContext.request.contextPath }/images/result.gif"/></td>
  </tr>
</table>
<table width="100%" border="1" >

  <tr class="henglan" style="font-weight:bold;">
	<td width="8%" align="center">姓名</td>
	<td width="6%" align="center">性别</td>
	<td width="9%" align="center">电话</td>
	<td width="11%" align="center">QQ </td>
	<td width="15%" align="center">班级意向</td>
	<td width="8%" align="center">编辑</td>
	<td width="8%" align="center">查看</td>
	<td width="8%" align="center">入学编班</td>
  </tr>
    <s:iterator value="list" status="s">
  <tr class="tabtd<s:property value='#s.count%2+1'/>">
    <td align="center">${name }</td>
    <td align="center">${sex==1?'男':'女' }</td>
    <td align="center">${phoneNum }</td>
    <td align="center">${qq }</td>
    <td align="center">${clazz.name }</td>
	<td width="8%" align="center"><a href="${pageContext.request.contextPath }/cousu_edit?id=${id}"><img src="${pageContext.request.contextPath }/images/button/modify.gif" class="img"></a></td>
	<td width="8%" align="center"><a href="${pageContext.request.contextPath }/cousu_view?id=${id}"><img src="${pageContext.request.contextPath }/images/button/view.gif" class="img"></a></td>
	<td width="8%" align="center"><a href="cousu_inClassUI?id=${id}"><img src="${pageContext.request.contextPath }/images/button/modify.gif" class="img"></a></td>
  </tr>
  </s:iterator>
</table>
<s:form id="pageForm" action="cousu_list" namespace="/">
	<input type="hidden" name="currPage" id="currentPage"/>
	<input type="hidden" name="pageSize" id="pageSize"/>
</s:form>
<%@include file="/html/staff/page.jsp" %>
</body>
</body>
</html>
