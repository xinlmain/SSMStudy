<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="$(pageContext.request.contextPath)/jslib/jquery-1.11.1.js"></script>
<script type="text/javascript">
$(function(){
	
})
</script>
</head>
<body>
欢迎${name}登录！<br/>
<br/>
<br/>
请输入书名进行模糊查询：<input type="text" id="pattern">
<input type="button" id="get" value="获取图书"><br/>
<table id="books">
</table>
</body>
</html>