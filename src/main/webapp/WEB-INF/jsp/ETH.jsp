<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<div>
			<form name="" action="${pageContext.request.contextPath}/eth/getNewaddress">
				<label>添加账户,设置密码:</label><input type="text" name="password" /> 
				<label>${newAddress}</label>
				<input type="submit" value="提交" />
			</form>
		</div>
		<div>
			<form name="getBalance" action="${pageContext.request.contextPath}/eth/getBalance">
				<label>地址:</label><input type="text" name="address" /> 
				<label>${Balance}</label>
				<input type="submit" value="提交" />
			</form>
		</div>
		<div>
			<form name="getBalance"
				action="${pageContext.request.contextPath}/eth/accounts">
				<label>账户数量:</label> <label>${accounts}</label>
				<input type="submit" value="获取账户信息" />
			</form>
		</div>
	</div>
</body>
</html>