<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>个人信息修改</title>
<link rel="stylesheet" href="css/common.css" />
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
<link rel="stylesheet" href="css/newmain.css" />
</head>
<body>
	<%
		String s=(String)request.getAttribute("message");
		if(s!=null){
	%>
	<script type="text/javascript">
		alert("用户信息修改失败");
	</script>
	<%
		}
	%>

	<!--顶部-->
	<div class="top">
		<div class="top_center">
			<ul class="top_bars">
				<li><a href="index">退出</a>|</li>
				<li><a href="confirmList">我的订单<span class="jt_down"></span></a>|</li>
				<li><a href="#">关注本站<span class="jt_down"></span></a>|</li>
				<li><a href="#">网站导航<span class="jt_down"></span></a></li>
			</ul>
		</div>
	</div>
	<!--头部-->
	<div class="header3">
		<a href="#"><img src="images/logo.png"></a>
		<div class="h3_center">
			<div class="search_box">
				<input type="text" /> <span>搜索</span>
			</div>
			<p>
				<a href="list.html">文学类</a>| <a href="list.html">教育类</a>| <a
					href="list.html">计算机</a>| <a href="list.html">儿童类</a>| <a
					href="list.html">漫画类</a>|
			</p>
		</div>
		<div class="h3_right">
			<div class="myyy">
				个人信息 <span class="sj_down"></span>
			</div>
			<div class="tsc">
				<a href="toshopcart">去购物车结算</a> <span class="sj_right"></span>
			</div>
		</div>
	</div>
	<!--头部导航-->
	<div class="nav_top">
		<div class="nav_top_center">
			<div>全部化妆品分类</div>
			<ul>
				<li><a href="list.html">文学类</a></li>
				<li><a href="list.html">教育类</a></li>
				<li><a href="list.html">计算机</a></li>
				<li><a href="list.html">儿童类</a></li>
				<li><a href="list.html">漫画类</a></li>
			</ul>
		</div>
	</div>
	<div class="container4">
		<div class="register_box">
			<div class="head">
				<h3>个人信息</h3>
			</div>
			<div class="security">
				<form action="userinfo" method="post">
					<ul class="list">
						<input type="hidden" name="id" value="${sessionScope.user.id}"/>
						<li><input id="J_euserName" class="long" readonly="readonly"
							name="username" value="${sessionScope.user.username}" type="text" />
							<div class="name">用户名:</div> <span id="J_eUserNameTipImg"
							class="icon"></span>
							<div id="J_eUserNameTipInfo" class="ltip"></div> <span
							class="placeholder"
							style="position: absolute; z-index: 20; color: rgb(153, 153, 153); top: 14px; left: 345px; line-height: 37px;"></span>
						</li>
						<li><input id="J_euserName" class="long" name="password"
							value="${sessionScope.user.password}" type="text" />
							<div class="name">密码:</div> <span id="J_eUserNameTipImg"
							class="icon"></span>
							<div id="J_eUserNameTipInfo" class="ltip"></div> <span
							class="placeholder"
							style="position: absolute; z-index: 20; color: rgb(153, 153, 153); top: 14px; left: 345px; line-height: 37px;"></span>
						</li>
						<%-- <li>
    								<input id="J_euserName" class="long" name="zip" value="${sessionScope.user.username}" type="text" />
    								<div class="name">邮编:</div>
    								<span id="J_eUserNameTipImg" class="icon"></span>
    								<div id="J_eUserNameTipInfo" class="ltip"></div>
    								<span class="placeholder" style="position: absolute;z-index: 20;color: rgb(153,153,153);top: 14px;left: 345px;line-height: 37px;"></span>
    						</li> --%>
						<li><input id="J_euserName" class="long" name="address"
							value="${sessionScope.user.address}" type="text" />
							<div class="name">地址:</div> <span id="J_eUserNameTipImg"
							class="icon"></span>
							<div id="J_eUserNameTipInfo" class="ltip"></div> <span
							class="placeholder"
							style="position: absolute; z-index: 20; color: rgb(153, 153, 153); top: 14px; left: 345px; line-height: 37px;"></span>
						</li>
						<li><input id="J_euserName" class="long" name="phone"
							value="${sessionScope.user.phone}" type="text" />
							<div class="name">电话:</div> <span id="J_eUserNameTipImg"
							class="icon"></span>
							<div id="J_eUserNameTipInfo" class="ltip"></div> <span
							class="placeholder"
							style="position: absolute; z-index: 20; color: rgb(153, 153, 153); top: 14px; left: 345px; line-height: 37px;"></span>
						</li>
						<li><input id="J_euserName" class="long" name="email"
							value="${sessionScope.user.email}" type="text" />
							<div class="name">电子邮箱:</div> <span id="J_eUserNameTipImg"
							class="icon"></span>
							<div id="J_eUserNameTipInfo" class="ltip"></div> <span
							class="placeholder"
							style="position: absolute; z-index: 20; color: rgb(153, 153, 153); top: 14px; left: 345px; line-height: 37px;"></span>
						</li>
						<input type="hidden" name="dob" value="${sessionScope.user.dob}"/>
						<li><input id="J_euserName" class="long"
							style="width: 70px; font-size: large; cursor: pointer; text-align: center; line-height: 40px;"
							value="修改" type="submit" />
							<div class="name">&nbsp;</div> <span id="J_eUserNameTipImg"
							class="icon"></span>
							<div id="J_eUserNameTipInfo" class="ltip"></div> <span
							class="placeholder"
							style="position: absolute; z-index: 20; color: rgb(153, 153, 153); top: 14px; left: 345px; line-height: 37px;"></span>
						</li>

					</ul>
				</form>
			</div>
		</div>
	</div>

	<!--脚部-->
	<div class="footer3">
		<div class="f3_top">
			<div class="f3_center">
				<div class="ts1">品目繁多 愉悦购物</div>
				<div class="ts2">正品保障 天天低价</div>
				<div class="ts3">极速物流 特色定制</div>
				<div class="ts4">优质服务 以客为尊</div>
			</div>
		</div>
		<div class="f3_middle">
			<ul class="f3_center">
				<li class="f3_mi_li01">
					<h1>购物指南</h1>
					<p>常见问题</p>
					<p>找回密码</p>
					<p>会员介绍</p>
					<p>购物演示</p>
				</li>
				<li class="f3_mi_li01">
					<h1>配送方式</h1>
					<p>常见问题</p>
					<p>找回密码</p>
					<p>会员介绍</p>
					<p>购物演示</p>
				</li>
				<li class="f3_mi_li01">
					<h1>支付方式</h1>
					<p>常见问题</p>
					<p>找回密码</p>
					<p>会员介绍</p>
					<p>购物演示</p>
				</li>
				<li class="f3_mi_li01">
					<h1>售后服务</h1>
					<p>常见问题</p>
					<p>找回密码</p>
					<p>会员介绍</p>
					<p>购物演示</p>
				</li>
				<li class="f3_mi_li01">
					<h1>服务保障</h1>
					<p>常见问题</p>
					<p>找回密码</p>
					<p>会员介绍</p>
					<p>购物演示</p>
				</li>
				<li class="f3_mi_li06">
					<h1>客服中心</h1> <img src="images/qrcode_jprj.jpg" width="80px"
					height="80px">
					<p>抢红包、疑问咨询、优惠活动</p>
				</li>
			</ul>
		</div>
		<div class="f3_bottom">
			<p class="f3_links">
				<a href="#">关于我们</a>| <a href="#">联系我们</a>| <a href="#">友情链接</a>| <a
					href="#">供货商入驻</a>
			</p>
			<p>江西理工大学南昌校区美妆网版权所有</p>
			<img src="images/police.png">
		</div>
	</div>

</body>
</html>