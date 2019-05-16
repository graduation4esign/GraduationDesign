<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>演示-普通内容列表</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="../css/test1.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="../css/jeui.css" media="all">
<link rel="stylesheet" href="../css/skin/jebox.css" media="all">
<link rel="stylesheet" href="../css/skin/jedate.css" media="all">
<script type="text/javascript" src="../js/modules/jeui.js"></script>

</head>
<body>

	<fieldset class="je-field je-p10">
		<legend class="je-f16">销售机会管理</legend>
		<form action="list" method="post">
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
						<a href="../help.html"> <!-- <input class="common_button" type="button"
						value="帮助"> -->
							<button class="je-btn" type="button">帮助</button>
					</a>&nbsp;&nbsp;&nbsp; <a href="add_salchance"> <!-- <input class="common_button"
							type="button" value="新建"> -->
							<button class="je-btn" type="button">新建</button>
					</a> &nbsp;&nbsp; <!-- <input class="common_button" type="submit" value="查询"> -->
						<button class="je-btn" type="submit">查询</button>
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
						<td class="list_data_op"><a href="dispatch.html"> <img
								title="指派" src="../images/bt_linkman.gif" class="op_button" />
						</a> <a href="edit.html"> <img title="编辑"
								src="../images/bt_edit.gif" class="op_button" />
						</a> <a href="list.html"> <img title="删除"
								src="../images/bt_del.gif" class="op_button" />
						</a> <img title="指派" src="../images/bt_linkman.png" class="op_button" />
							<img title="编辑" src="../images/bt_edit.png" class="op_button" />
							<img title="删除" src="../images/bt_del.png" class="op_button" /></td>
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