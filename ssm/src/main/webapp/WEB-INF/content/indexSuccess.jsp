<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>美妆网-首页</title>
<link rel="stylesheet" href="css/common.css" />
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
</head>
<body>
	<!--顶部-->
	<div class="top">
		<div class="top_center">
			<ul class="top_lr">
				<li><a>欢迎 ${sessionScope.user.username}</a></li>
			</ul>
			<ul class="top_bars">
				<li><a href="index.jsp">退出</a>|</li>
				<li><a href="comfirmList?userId=${sessionScope.user.id}">我的订单<span class="jt_down"></span></a>|</li>
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

		</div>
		<div class="h3_right">
			<div class="myyy">
				<a href="userinfo">个人信息</a> <span class="sj_down"></span>
				<form>
					<select name="info">
						<a href="userinfo"><option value="person">个人信息</option></a>
						<a href="receiveAddress"><option value="receive">收货地址信息</option></a>
					</select>
				</form>
			</div>
			<div class="tsc">
				<a href="shopCart?userId=${sessionScope.user.id}">去购物车结算</a> <span class="sj_right"></span>
			</div>
		</div>
	</div>
	<!--头部导航-->
	<div class="nav_top">
		<div class="nav_top_center">
			<div>全部图书分类</div>
			<ul>
				<c:forEach items="${details}" var="c">
					<li><a href="list.html">${c.key.name}</a></li>
				</c:forEach>
			</ul>
		</div>
	</div>

	<div class="container3">
		<div class="c3_b1">
			<div class="c3_b1_left">
				<dl>

					<c:forEach items="${details}" var="c">
						<dd>
							<h1>
								<a href="toviewbook?cateId=${c.key.id}">${c.key.name}</a>
							</h1>
							<p>
								<c:forEach items="${c.value}" var="cd">
									<a href="list.html">${cd.name}</a>
								</c:forEach>
							</p>
						</dd>
					</c:forEach>
				</dl>
			</div>
			<div class="c3_b1_center">
				<div>
					<a href="viewbook.jsp"><img src="images/ad1.jpg"></a>
				</div>
				<div class="c3_b1_c_bottom">
					<ul>
						<c:forEach items="${sessionScope.products}" var="product">
							<li><a href="toproductInfo?productId=${product.id}"><img
									style="width: 150px; height: 150px;" src="${product.img}" /></a> <a
								href="toproductInfo?productId=${product.id}">${product.name}</a></li>
						</c:forEach>
					</ul>
				</div>
			</div>
			<div class="c3_b1_right">
				<h1>
					热卖商品<a href="#">更多</a>
				</h1>
				<ul>
					<li><a href="#">〈热〉新款持妆粉底  </a></li>
					<li><a href="#">〈热〉Chanel新款丝绒口红</a></li>
					<li><a href="#">〈热〉Chanel新款丝绒口红 </a></li>
					<li><a href="#">〈热〉Chanel新款丝绒口红 </a></li>
					<li><a href="#">〈热〉Chanel新款丝绒口红 </a></li>
					<li><a href="#">〈热〉Chanel新款丝绒口红 </a></li>
					<li><a href="#">〈热〉Chanel新款丝绒口红 </a></li>
					<li><a href="#">〈热〉Chanel新款丝绒口红 </a></li>
					<li><a href="#">〈热〉Chanel新款丝绒口红 </a></li>
					<li><a href="#">〈热〉Chanel新款丝绒口红 </a></li>
					<li><a href="#">〈热〉Chanel新款丝绒口红 </a></li>
					<li><a href="#">〈热〉Chanel新款丝绒口红 </a></li>
					<li><a href="#">〈热〉Chanel新款丝绒口红 </a></li>
					<li><a href="#">〈热〉Chanel新款丝绒口红 </a></li>
					<li><a href="#">〈热〉Chanel新款丝绒口红 </a></li>
				</ul>
			</div>
			<div style="clear: both"></div>
		</div>
	</div>
	<div class="c20"></div>
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