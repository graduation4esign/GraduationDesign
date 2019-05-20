<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>提交订单页面</title>
<link rel="stylesheet" href="css/common.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
<link rel="stylesheet" href="css/orderSure.css" />
<link rel="stylesheet" href="css/addr.css" />
<script type="text/javascript" src="js/area.js"></script>
<script type="text/javascript">
	//确认新增收货地址
	function addAddr(){
		document.getElementById('divDialog').style.display='none'
		var addr_name= document.getElementById('addr_name').value;
		var addr_phone= document.getElementById('addr_phone').value;
		var addr_detail= document.getElementById('addr_detail').value;


		document.getElementById('addName').value = addr_name;
		document.getElementById('addAdd').value = addr_detail;
		document.getElementById('addPhone').value = addr_phone;
	
		
	}//end  确认新增收货地址

	

	//把下拉框中的数据 添加到详细地址中
	function addaddr_detail(){
		var s_province= document.getElementById('s_province').value;
		var s_city= document.getElementById('s_city').value;
		var s_county= document.getElementById('s_county').value;
		document.getElementById('addr_detail').value=s_province+s_city+s_county;
	}// end 把下拉框中的数据 添加到详细地址中
</script>

</head>
<body>
	<!--顶部-->
	<div class="top">
		<div class="top_center">
			<ul class="top_bars">
				<li><a href="index">退出</a>|</li>
				<li><a href="#">我的订单<span class="jt_down"></span></a>|</li>
				<li><a href="#">关注本站<span class="jt_down"></span></a>|</li>
				<li><a href="#">网站导航<span class="jt_down"></span></a></li>
			</ul>
		</div>
	</div>
	<!--头部-->
	<div class="header3">
		<a href="#"><img src="images/logo.png" class="oneImg"></a>


		<div class="h3_right">
			<img src="images/play_02.png" alt="">
		</div>

	</div>
	<p class="orderButtom">选择并核对订单信息</p>
	<!--中间复杂部分-->
	<div class="content">
		<form action="confirmSuccess" action="toconfirm" method="post">
			<div class="contentCenter">
				<input type="hidden" value="${sessionScope.user.id}" name="userId">
				<div class="centerTop">
					<b style="font-size: 20px;">选择收货地址信息</b>
					<p style="font-size: 15px;">
						收件人姓名：<input type="text" id='addName' name="rName"
							value="${sessionScope.address.rName}"><br /> <br />
						收件人地址：<input type="text" id='addAdd' name="rAddress"
							value="${sessionScope.address.rAddress}"><br /> <br />
						收件人电话：<input type="text" id='addPhone' name="rPhone"
							value="${sessionScope.address.rPhone}">
					</p>
					<p style="font-size: 15px;">
						<!-- <button
							onclick="document.getElementById('divDialog').style.display=''">添加收件人</button> -->
					</p>
				</div>
				<!-- </form> -->
				<p class="singleP">
					<b>送货清单</b>&nbsp;&nbsp;&nbsp;&nbsp;<b>订单号:${sessionScope.orderid}</b>

					<span> <a href="todelorder?orderid=${sessionScope.orderid}">删除该订单</a>
						&nbsp;&nbsp; <a href="toshopcart">返回购物车修改</a>

					</span>
				</p>
				<div class="bigDiv">

					<table border="1px solid red">
						<c:forEach items="${sessionScope.sShopcartItems}" var="item">
							<tr>
								<td width="100px"><img src="${item.product.img}"
									width="100px" height="100px"></td>
								<td width="300px" align="center">${item.product.name}</td>
								<td width="600px" align="center">￥${item.product.price}</td>
								<td width="100px" align="center">${item.num}</td>
								<input type="hidden" value="${item.product.id}" name="productId">
								<input type="hidden" value="${item.product.price*item.num}"
									name="sum">
								<td width="300px" align="center">七天无理由退换货</td>
							</tr>
						</c:forEach>
					</table>
				</div>

				<div class="submit">
					<span>应付金额：<font>${sum}</font>
					<button type="submit" onclick="document.forms.conSuccess.submit()">
							<img alt="" src="images/21_03.png">
						</button>
					</span>
				</div>
			</div>
		</form>
	</div>

	<!-- 这里是弹框div，默认不显示 -->
	<div id="divDialog"
		style="left: 378.5px; top: 94.5px; opacity: 1; display: none;">
		<div class="pop">
			<a href="javascript:void(0)" class="close" id="closeEdit"
				style="display: none;"></a>
			<div class="pop_title">新增收货地址</div>
			<div class="pop_con">
				<form class="info_list">
					<ul>
						<li><span class="name">收货人</span> <input name="" type="text"
							id="addr_name" value="" maxlength="20"></li>
						<li><span class="name">手机号码</span> <input name="" type="text"
							id="addr_phone" value=""
							onfocus="if(value == defaultValue){value='';}" maxlength="20"></li>
						<li><span class="name">所在地区</span> <select id="s_province"
							name="s_province"></select>   <select id="s_city" name="s_city"></select>  
							<select id="s_county" name="s_county"
							onchange="addaddr_detail();"></select> <script
								type="text/javascript">_init_area();</script>

							<div class="alart_tip" style="display: none;"
								id="div_addr_sel_edit"></div></li>
						<li><span class="name">详细地址</span> <input name="" type="text"
							style="width: 413px;" id="addr_detail" value="" maxlength="150"></li>

					</ul>
				</form>
				<div class="btn_bar">
					<a href="javascript:void(0)" id="submitAdd" class="btn_red"
						onclick="addAddr()">确认新增收货地址</a> <a href="shopCart.html"
						id="cancelAdd" class="btn">返回购物车查看商品</a>
				</div>
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