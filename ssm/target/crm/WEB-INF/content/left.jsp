<%@ page contentType="text/html; charset=UTF-8"%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>操作菜单</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="wcodeth=device-wcodeth, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="css/jeui.css" media="all">
<link rel="stylesheet" href="css/admin.css" media="all">
<script type="text/javascript" src="js/modules/jeui.js"></script>
</head>
<body>

	<div jepane="left" class="je-admin-left">
		<ul class="je-admin-menu">
			<li class="level">
				<h3>
					<em class="ico"></em>营销管理<i></i>
				</h3>
				<ul class="levelnext">
					<li><a href="sale/list" target="mainFrame" data-tab="p2" data-text="销售机会管理"
						data-url="sale/list" addtab>销售机会管理</a></li>
					<li><a href="sale/dev" target="mainFrame" data-tab="p4" data-text="客户开发计划"
						data-url="sale/dev" addtab>客户开发计划</a></li>
				</ul>
			</li>
			<li class="level">
				<h3>
					<em class="ico"></em>客户管理<i></i>
				</h3>
				<ul class="levelnext">
					<li><a href="cust_info/list" target="mainFrame" data-tab="psy" data-text="客户开发计划"
						data-url="cust_info/list" addtab>客户信息管理</a></li>
				</ul>
			</li>
			<li class="level">
				<h3>
					<em class="ico"></em>服务管理<i></i>
				</h3>
				<ul class="levelnext">
					<li><a href="javascript:;" target="mainFrame" data-tab="user" data-text="服务创建"
						data-url="user-list.html" addtab>服务创建</a></li>
					<li><a href="javascript:;" target="mainFrame" data-tab="user" data-text="服务分配"
						data-url="user-list.html" addtab>服务分配</a></li>
					<li><a href="javascript:;" target="mainFrame" data-tab="user" data-text="服务处理"
						data-url="user-list.html" addtab>服务处理</a></li>
					<li><a href="javascript:;" target="mainFrame" data-tab="user" data-text="服务反馈"
						data-url="user-list.html" addtab>服务反馈</a></li>
				</ul>
			</li>
			<li class="level">
				<h3>
					<em class="ico"></em>统计报表<i></i>
				</h3>
				<ul class="levelnext">
					<li><a href="javascript:;" target="mainFrame" data-tab="user" data-text="客户贡献分析"
						data-url="user-list.html" addtab>客户贡献分析</a></li>
					<li><a href="javascript:;" target="mainFrame" data-tab="user" data-text="客户构成分析"
						data-url="user-list.html" addtab>客户构成分析</a></li>
				</ul>
			</li>
			<li class="level">
				<h3>
					<em class="ico"></em>基础数据<i></i>
				</h3>
				<ul class="levelnext">
					<li><a href="javascript:;" target="mainFrame" data-tab="user" data-text="查看产品信息"
						data-url="user-list.html" addtab>查看产品信息</a></li>
					<li><a href="javascript:;" target="mainFrame" data-tab="user" data-text="查看库存"
						data-url="user-list.html" target="mainFrame" addtab>查看库存</a></li>
				</ul>
			</li>
			<li class="level">
				<h3>
					<em class="ico"></em>系统设置<i></i>
				</h3>
				<ul class="levelnext">
					<li><a href="javascript:;" target="mainFrame" data-tab="user" data-text="角色管理"
						data-url="user-list.html" addtab>角色管理</a></li>
					<li><a href="javascript:;" target="mainFrame" data-tab="user" data-text="用户管理"
						data-url="user-list.html" addtab>用户管理</a></li>
					<li><a href="javascript:;" target="mainFrame" data-tab="user" data-text="日志查看"
						data-url="user-list.html" addtab>日志查看</a></li>
				</ul>
			</li>
		</ul>

	</div>

	<script type="text/javascript">
    jeui.use(["jquery","jeBox","jeLayout","jeTabPane","jeAccordion"],function () {
        //Layout面板布局
        $("body").jeLayout();
        $("#myTabNav").find("li").on("click",function () {
            $(this).addClass('curr').siblings().removeClass('curr');
        });
        //折叠菜单
        $(".je-admin-menu").jeAccordion({
            accIndex: 1,
            titCell:"h3",
            conCell:"ul", 
            multiple:true,
            success:function (titelem, conelem) {
                //给菜单绑定事件
                conelem.children().on("click",function(){
                    conelem.children().removeClass("current");
                    $(this).addClass("current");
                });
            }
        });
        //addtabs
        $("[tabpane]").jeTabPane({
            firstItem:{                              //默认首页
                tab: "main",
                text: "后台首页",
                url: "main.html",
                closable:false
            }
        });
    });
</script>

</body>
</html>