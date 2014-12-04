<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<table border="0" cellspacing="0" cellpadding="0" align="center">
	  <tr>
	    <td align="right">
	    	<span>每页<input id="pageSi" type="text" size="2">条跳到第<input type="text" size="3" onblur="gotoPage(this.value)"/>页 /第${currPage }/${totalPage }页</span>
	        <span>
	        	<s:if test="currPage ==1">
	        		[首页][上一页]
	        	</s:if>
	        	<s:else>
		        	<a href="#" onclick="gotoPage(1)">[首页]</a>&nbsp;&nbsp;
		            <a href="#" onclick="gotoPage(${currPage-1 })">[上一页]</a>&nbsp;&nbsp;
	            </s:else>
	            <s:if test="currPage ==totalPage">
	            	[下一页][尾页]
	            </s:if>
	            <s:else>
	            <a href="#" onclick="gotoPage(${currPage+1 })">[下一页]</a>&nbsp;&nbsp;
	            <a href="#" onclick="gotoPage(${totalPage})">[尾页]</a>
	            </s:else>
	        </span>
	    </td>
	  </tr>
	</table>
<script>
	function gotoPage(currentPage){
		//提交一个表单，向Action的list方法发送请求
		document.getElementById("currentPage").value = currentPage;
		document.getElementById("pageSize").value=document.getElementById("pageSi").value;
		document.getElementById("pageForm").submit();
	}
</script>