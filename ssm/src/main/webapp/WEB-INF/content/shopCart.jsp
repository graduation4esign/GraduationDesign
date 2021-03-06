<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<title>购物车页面</title>
<link rel="stylesheet" href="css/fullCar.css" />
<link rel="stylesheet" href="css/common.css"/>
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>

<style type="text/css">
a{
	text-decoration:none;
}
input{
	width: 30px;
}


.divs .span{
	cursor: pointer;
	border:1px solid #ccc;

}

.empty{
	border:1px solid #ccc;
	width: 80%;
	margin:-30px auto;
	height: 305px;
	overflow: auto;
	margin-bottom: 10px
	
}
.c_header{
	overflow: hidden;
	height: 40px;
	line-height: 40px;
	background-color: #EEEEEE;
	border-bottom: 1px solid #ccc

}
.c_header .leftt{
	float: left;

}
.c_header .rightt{
	float: right
}

.c_header div,.c_header span{
	font-size: 14px;
	margin-right: 70px
}
.c_book .row{
	height: 85px;
	border-top: 2px solid red;
	line-height: 85px;
	background-color: #FFFDF0
}
.c_book .row>div{
	margin-right: 28px;
}
.c_book .row>div div{
	float: left;
	
	
}

.row_right div{
	width: 110px;
	text-align: center;
}

.jian,.sum{
	cursor: pointer;
	font-size: 16px;
}

.center_bottom{
	width: 530px;
	position: relative;
	left: 900px;

}
.center_bottom span{
	margin-left: 30px
}
.center_bottom font{
	color: red;
	font-size: 20px
}
.center_bottom button{
	background-color: red;
	width: 90px;
	height: 30px;
	font-size: 16px
}

</style>
<script type="text/javascript">
	
	$(function(){
		$(".jian").on("click",function(){//点击减号
			var input = $(this).next().children("input");
			var inputVal = input.val();
			inputVal--;
			if(Number(inputVal)<1){
				alert("数量不能小于0.")
			}else{
				input.val(inputVal);
				var parentDiv = $(this).parent();
				var allprice = parentDiv.next("div");//获取到小记价格的div
				
				var oneprice = parentDiv.siblings()[0];//获取到单价div
				var onePricevalue = oneprice.innerHTML;
				var onePricevalue = Number(onePricevalue.substring(1,onePricevalue.length));
				var allsum = Number(input.val())*onePricevalue;
				allprice.html("￥"+allsum+"元");
				
				var id = $(this).parent().parent().parent().children("input[name=id]");
				console.log(id);
			}		
		});
		$(".sum").on("click",function(){//点击加号
			var input = $($(this).siblings()[1]).children("input");
			var inputVal = input.val();
			inputVal++;
			if(Number(inputVal)<1){
				alert("数量不能小于0.")
			}else{
				input.val(inputVal);
				var parentDiv = $(this).parent();
				var allprice = parentDiv.next("div");//获取到小记价格的div
				var oneprice = parentDiv.siblings()[0];//获取到单价div
				var onePricevalue = oneprice.innerHTML;
				var onePricevalue = Number(onePricevalue.substring(1,onePricevalue.length));
				var allsum = Number(input.val())*onePricevalue;
				allprice.html("￥"+allsum+"元");
			}
			
		});
		$(".val").on("change",function(){//手动改变value值
			var input = $(this);
			var inputVal = input.val();
			if(Number(inputVal)<1){
				alert("数量不能小于0.")
			}else{
				input.val(inputVal);
				var parentDiv = $(this).parent().parent();
				var allprice = parentDiv.next("div");//获取到小记价格的div
				var oneprice = parentDiv.siblings()[0];//获取到单价div
				var onePricevalue = oneprice.innerHTML;
				var onePricevalue = Number(onePricevalue.substring(1,onePricevalue.length));
				var allsum = Number(input.val())*onePricevalue;
				allprice.html("￥"+allsum+"元");
			}
		});
		//全选
		$("#allCheckbox").on("click",function(){
			var checked = $(this).prop("checked");
				//获得总价 
				var allpri = $("#allpri").html();
				//获得总数量
				var allnum = $("#allnum").html();
				if(checked){//勾选 全选
					$(".line>div>input").prop("checked",checked);
					var price= $(".price");
					var sumCount=0;
					var cou = 0;
					$.each(price,function(index,obj){
						cou++;
						var divprice = $(obj).html();
						sumCount += Number(divprice.substring(1,divprice.length));
					});
					$("#allnum").html(cou);
					$("#allpri").html(sumCount)
				}else{//取消 全选
					$(".line>div>input").prop("checked",checked);
					$("#allnum").html(0);
					$("#allpri").html(0)
				}
		});
		
		//给每一个 选择 绑定事件
		$(".line>div>input").on("click",function(){
			var checked = $(this).prop("checked");
			var $allnum = $("#allnum");
			var $allpri = $("#allpri");
			if(checked){//勾选 
				var priceVal = $(this).parent().parent().next("div").find(".price");
				var priceValue  = Number(priceVal.html().substring(1,priceVal.html().length));
				var num = Number($allpri.html())+priceValue;
				$allpri.html(num);
				var co = Number($allnum.html());
				$allnum.html(++co);
			}else{//取消 
				var priceVal = $(this).parent().parent().next("div").find(".price");
				var priceValue  = Number(priceVal.html().substring(1,priceVal.html().length));
				var num = Number($allpri.html())-priceValue;
				$allpri.html(num);
				var co = Number($allnum.html());
				$allnum.html(--co);
			}
		});
		
	});

</script>
</head>
<body>
	<%
		String s=(String)request.getAttribute("message");
		if(s=="0"){
	%>
	<script type="text/javascript">
		alert("查看购物车失败");
	</script>
	<%
		}else if(s=="1"){	
	%>
	<script type="text/javascript">
		alert("请重新登录");
	</script>
	<%
		}
	%>
	<!--顶部-->
	<div class="top">
    	<div class="top_center">
            <ul class="top_bars">
            	<li><a href="http://localhost:10086/ssm">退出</a>|</li>
                <li><a href="confirmList?userId=${sessionScope.user.id}">我的订单<span class="jt_down"></span></a>|</li>
                <li><a href="#">关注本站<span class="jt_down"></span></a>|</li>
                <li><a href="#">网站导航<span class="jt_down"></span></a></li>
            </ul>
        </div>
    </div>
    <!--头部-->
    <div class="header3">
    	<a href="indexSuccess"><img src="images/logo.png"  class="oneImg"></a>
    	

        <div class="h3_right">
        	<img src="images/play_01.png" alt="">
        </div>
       
    </div>
    
    
<!--中间部分div-->
<form action="toconfirm" method="post">
<div class="empty">
	<div class="c_header">
		<div class="leftt">
			<input type="checkbox" id="allCheckbox">全选
			<span style="margin-left: 70px">商品</span>
		</div>
		<div class="rightt">
			<span>单价(元)</span>
			<span>数量</span>
			<span>小计(元)</span>
			<span style="margin-right: 0px">操作</span>
		</div>
	</div>
	<div class="c_book">
	<c:forEach items="${sessionScope.sShopcartItems}" var="item">
		<div class="row">
			<div style="float: left" class="line">
				<div style="margin-top: 30px" ><input type="checkbox" name="bookId" value="${item.product.id}"></div>
				<div style="margin-left: 80px;">
					<img src="${item.product.img}" style="float: left;width:85px;height:85px">
					<span>${item.product.name}</span>
				</div>
			</div>
			<div style="float: right" class="row_right">
				<div style="margin-right: 10px">￥${item.product.price}</div><!-- 单价 -->
				<div>
					<span class="jian">-</span>
					<span><input type="text" name="bookNum" class="val" value="${item.num}" style="text-align: center" ></span>
					<span class="sum">+</span>
				</div>
				<div class="price">￥${item.product.price*item.num}</div><!-- 小结 -->
				<div>
					<a href="todeleteshopcar?userId=${sessionScope.user.id}&productId=${product.id}">删除</a>
				</div>
			</div>
		</div>	
			</c:forEach>
		</div>
	</div>
</div>
<div class="center_bottom">
	<div>
		<span>已选择<font id="allnum">0</font>件商品</span>
		<span>总价(不含运费): ￥<font id="allpri">0</font>元</span>
		<span><a href="toconfirm"><button>去结算</button></a></span>
	</div>
</div>
</form>

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
                	<h1>客服中心</h1>
                    <img src="images/qrcode_jprj.jpg" width="80px" height="80px">
                    <p>抢红包、疑问咨询、优惠活动</p>
                </li>
            </ul>
        </div>
         <div class="f3_bottom">
        	<p class="f3_links">
                <a href="#">关于我们</a>|
                <a href="#">联系我们</a>|
                <a href="#">友情链接</a>|
                <a href="#">供货商入驻</a> 
           	</p>
            <p>江西理工大学南昌校区美妆网版权所有</p>
          	<img src="images/police.png">
        </div>
    </div>
</body>
</html>