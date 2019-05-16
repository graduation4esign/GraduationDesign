<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="wcodeth=device-wcodeth, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="css/jeui.css" media="all">
<link rel="stylesheet" href="css/admin.css" media="all">
</head>
<body class="loginbox">
	<div class="je-login"></div>
	<div class="je-logincon">
		<div class="logo"></div>
		<p class="logtext">欢迎登录后台管理系统</p>
		<form action="main" method="post">
			<p class="je-pb10">
				<input class="userinp" type="text" name="user" placeholder="请输入用户名">
			</p>
			<p class="je-pb10">
				<input class="userinp" type="password" name="password"
					placeholder="请输入密码">
			</p>
			<p class="je-pt10">
				<input class="userbtn" type="submit" value="确 认 登 录">
			</p>
		</form>
	</div>
</body>
</html>