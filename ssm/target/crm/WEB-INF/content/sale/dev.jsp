<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jb-aptech毕业设计项目</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="../css/test1.css" rel="stylesheet" type="text/css">
<script src="../script/common.js"></script>
<script src="../js/changetrcolor.js" type="text/javascript"></script>
<link rel="stylesheet" href="../css/jeui.css" media="all">
<link rel="stylesheet" href="../css/skin/jebox.css" media="all">
<link rel="stylesheet" href="../css/skin/jedate.css" media="all">
<script type="text/javascript" src="../js/modules/jeui.js"></script>
</head>
<body>
	<fieldset class="je-field je-p10">
		<legend class="je-f16">客户开发计划</legend>
	<form action="" method="post">
		<table class="je-table" skin="leftline" even>
			<tr>
				<th>客户名称</th>
				<td><input type="text" name="chc_cust_name" /></td>
				<th>概要</th>
				<td><input type="text" name="chc_title" /></td>
				<th>联系人</th>
				<td><input type="text" name="chc_linkman" size="20" /></td>
			</tr>
			<tr>
				<td width=100% height=32 align=center colspan=6 bgcolor=#ffffff>
					<a href="../help.html"><button class="je-btn" type="button">新建</button></a>&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;
					<button class="je-btn" type="sumbit">查询</button>
				</td>
			</tr>
		</table>
	</form>
	<br />
	</fieldset>
	<fieldset class="je-field je-p10">
		<legend class="je-f16">检索结果</legend>
		<div>
			<table class="je-table">
				<thead>
					<tr>
						<th id="firstth">编号</th>
						<th>客户名称</th>
						<th>概要</th>
						<th>联系人</th>
						<th>联系人电话</th>
						<th>状态</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>01</td>
						<td>小米</td>
						<td>小米5</td>
						<td>1599</td>
						<td>小米手机</td>
						<td>待发售</td>
						<td class="list_data_op"><a href="dev_plan.html"><img
								title="制定计划" src="../images/bt_plan.gif" class="op_button" /> <img
								onClick="to('dev_detail.html');" title="查看"
								src="../images/bt_detail.gif" class="op_button" /></td>
					</tr>

					<tr>
						<th colspan="7" class="pager">
							<div class="pager">
								每页 8 条 第页 <a href="">首页</a> <a href="">上一页</a> <font
									color="#ABA8AB">上一页</font> <a href="">下一页</a> <font
									color="#ABA8AB">下一页</font> <a href="">尾页</a>
							</div>
						</th>
					</tr>
				</tbody>
			</table>
		</div>
	</fieldset>
</body>
</html>