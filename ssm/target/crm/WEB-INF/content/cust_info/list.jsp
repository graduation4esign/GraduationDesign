<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My JSP 'list.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link href="../css/test1.css" rel="stylesheet" type="text/css">
<script src="../script/jquery-1.4.1.js"></script>
<script src="../script/common.js" charset="utf-8"></script>
<script src="../js/changetrcolor.js" type="text/javascript"></script>
</head>
<body>
	<table width="100%" cellSpacing=0 cellPadding=0 border="0px">
		<tr>
			<td class="page_title">客户信息管理</td>
			<td class="page_title_middle">&nbsp;</td>
			<td width=3><IMG height=32 src="../images/m_mpr.gif" width=3></td>
		</tr>
	</table>
	<form action="" method="post">
		<table class="query_form_table" cellSpacing=1 cellPadding=1>
			<tr>
				<th>客户编号</th>
				<td><input type="text" name="cust_no" /></td>
				<th>名称</th>
				<td><input type="text" name="cust_name" /></td>
				<th>地区</th>
				<td><select name="cust_addr">
						<option value="">全部</option>
						<option value="北京">北京</option>
						<option value="华北">华北</option>
						<option value="中南">中南</option>
						<option value="东北">东北</option>
						<option value="西部">西部</option>
				</select></td>
			</tr>
			<tr>
				<th>客户经理</th>
				<td><input type="text" name="cust_manager_name" /></td>
				<th>客户等级</th>
				<td><select name="cust_level_label">
						<option value="">全部</option>
						<option value="战略合作伙伴">战略合作伙伴</option>
						<option value="合作伙伴">合作伙伴</option>
						<option value="大客户">大客户</option>
						<option value="普通客户">普通客户</option>
				</select></td>
				<th></th>
				<td></td>
			</tr>
			<tr>
				<td width=100% height=32 align=center colspan=6 bgcolor=#ffffff>
					<a href="../help.html"><input class="common_button"
						type="button" value="帮助"></a>&nbsp;&nbsp;&nbsp; <a
					href="add_customer.html"><input class="common_button"
						type="button" value="新建"></a>&nbsp;&nbsp;&nbsp;
					<button class="common_button">查询</button>
				</td>
			</tr>
		</table>
	</form>

	<br />
	<table width="100%" cellSpacing=0 cellPadding=0 border="0px">
		<tr>
			<td class="page_title">检索结果</td>
			<td class="page_title_middle">&nbsp;</td>
			<td width=3><IMG height=32 src="../images/m_mpr.gif" width=3></td>
		</tr>
	</table>

	<table id="data_list_table" class="data_list_table" cellSpacing=1
		cellPadding=1>
		<tr>
			<th id="firstth">序号</th>
			<th>客户编号</th>
			<th>名称</th>
			<th>地区</th>
			<th>客户经理</th>
			<th>客户等级</th>
			<th>操作</th>
		</tr>
		<tr>
			<td class="list_data_number"></td>
			<td class="list_data_text"></td>
			<td class="list_data_ltext"></td>
			<td class="list_data_text"></td>
			<td class="list_data_text"></td>
			<td class="list_data_text"></td>
			<td class="list_data_op"><img
				onClick="to('customer_edit.html');" title="编辑"
				src="../images/bt_edit.gif" class="op_button" /> <img title="编辑"
				src="../images/bt_edit.png" class="op_button" /> <img
				onClick="to('linkman.html');" title="联系人"
				src="../images/bt_linkman.gif" class="op_button" /> <img
				onClick="to('activities.html');" title="交往记录"
				src="../images/bt_orders.gif"> <!-- 经理只能删除属于自己的客户 --> <a
				href="javascript:if(confirm('确认删除？')){window.location.href=''}">
					<img title="删除" src="../images/bt_del.gif" class="op_button" />
			</a> <img title="删除" src="../images/bt_del.png" class="op_button" />
			</td>
		</tr>

		<tr>
			<th colspan="100" class="pager">共条记录 每页 8 条 第页 <a href="">首页</a>
				<a href="">上一页</a> <font color="#ABA8AB">上一页</font> <a href="">下一页</a>



				<font color="#ABA8AB">下一页</font> <a href="">尾页</a>
			</th>
		</tr>
	</table>
</body>
</html>