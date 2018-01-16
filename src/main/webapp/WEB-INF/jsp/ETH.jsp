<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="display:none" >
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

	<div style="display:none">
		<form action="${pageContext.request.contextPath}/eth/forward">
			<table class="imgtable">
				<!--     <thead>
			    <tr id="thdiv">
			    <th>用户编号</th>
			    <th>用户手机号</th>
			    <th>用户登录时间</th>
			    <th>用户最后一次登录成功时间</th>
			    <th>用户最后一次登录失败时间</th>
			    </tr>
			    </thead> -->
				<tr id="divtr" style="height: 35px;">
					<td><label>接口:</label><input type="text" name="method" /></td>
					<td><label>参数:</label><input type="text" name="param" /></td>
				</tr>
				<tr>
					<c:if test="${not empty result}">
						<td><label>return json:</label>${result}</td>
					</c:if>
				</tr>
				<tr id="divtr" style="height: 35px;">
					<td><input type="submit" value="执行" /></td>
				</tr>
			</table>
		</form>
	</div>
	
		<div>
		<form action="${pageContext.request.contextPath}/eth/APIRequest">
			<table class="imgtable">
				<!--     <thead>
			    <tr id="thdiv">
			    <th>用户编号</th>
			    <th>用户手机号</th>
			    <th>用户登录时间</th>
			    <th>用户最后一次登录成功时间</th>
			    <th>用户最后一次登录失败时间</th>
			    </tr>
			    </thead> -->
				<tr id="divtr" style="height: 35px;">
					<!-- <label>接口:</label><input type="text" name="method" /></td> -->
					<!-- <td><label>参数:</label><input type="text" name="param" /></td> -->
					<!-- <td><textarea name="param" rows="3" cols="20"></textarea></td> -->
				</tr>
				<tr>
					<td><label>参数:</label><textarea name="param" rows="3" cols="150"></textarea></td>
				</tr>
				<tr>
					<c:if test="${not empty result}">
						<td><label>return json:</label>${result}</td>
					</c:if>
				</tr>
				<tr id="divtr" style="height: 35px;">
					<td><input type="submit" value="执行" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>