<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<HTML><HEAD>
<link href="${pageContext.request.contextPath }/css/dtree.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/dtree.js"></script>
<META http-equiv=Content-Type content="text/html; charset=utf-8">
</HEAD>
<BODY bgColor=#DDF0FB leftMargin=0 topMargin=0 marginwidth="0" marginheight="0">
<table width="90%" border="0" cellspacing="1" cellpadding="2" align="center" >
<tr>
<div class="dtree">
	<script type="text/javascript">
		d = new dTree('d');
		d.add('01','-1','CRM管理系统');
		d.add('0101','01','咨询部');
		d.add('010101','0101','咨询学生管理','${pageContext.request.contextPath }/cousu_list','','right');
		d.add('0102','01','学工部');
		d.add('010201','0102','在校学生管理','${pageContext.request.contextPath }/stu_list','','right');
		d.add('0103','01','教学部');
		d.add('010301','0103','班级管理','${pageContext.request.contextPath }/clazz_list','','right');
		d.add('010302','0103','课程类别','${pageContext.request.contextPath }/course_list','','right');
		d.add('0105','01','人力资源部');
		d.add('010501','0105','部门管理','${pageContext.request.contextPath }/dept_list','','right');
		d.add('010503','0105','员工管理','${pageContext.request.contextPath }/emp_list','','right');
		document.write(d);
	</script>
</div>
</tr>
</table>
</BODY>
</HTML>
      			
			


      