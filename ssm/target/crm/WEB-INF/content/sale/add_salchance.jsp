<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<title>jb-aptech毕业设计项目</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="../css/test1.css" rel="stylesheet" type="text/css">
<script src="../script/common.js"></script>
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
					<td width=100% height=30 align=left
						background="../../images/m_table_top.jpg" colspan="6"><strong>&nbsp;新建销售机会</strong></td>
				</tr>
				<tr>
					<th>编号</th>
					<td><input type="text" name="chc_id" /></td>
					<th>机会来源</th>
					<td><input type="text" name="chc_source" size="20" /></td>
				</tr>
				<tr>
					<th>客户名称</th>
					<td><input type="text" name="chc_cust_name" id="txt" /><span
						class="red_star">*</span></td>
					<th>成功机率</th>
					<td><input type="text" name="chc_rate" /><span
						class="red_star">*</span></td>
				</tr>
				<tr>
					<th>概要</th>
					<td><input type="text" name="chc_title" /><span
						class="red_star">*</span></td>
					<th>联系地址</th>
					<td><select name="chc_addr">
							<option value="">请选择</option>
							<option value="北京">北京</option>
							<option value="华北">华北</option>
							<option value="中南">中南</option>
							<option value="东北">东北</option>
							<option value="西部">西部</option>
					</select><span class="red_star">*</span></td>
				</tr>
				<tr>
					<th>联系人</th>
					<td><input type="text" name="chc_linkman" size="20" /></td>
					<th>联系人电话</th>
					<td><input type="text" name="chc_tel" size="20" /></td>
				</tr>
				<tr>
					<th>机会描述</th>
					<td colspan="3"><textarea rows="6" cols="50" name="chc_desc"></textarea><span
						class="red_star">*</span></td>
				</tr>
				<tr>
					<th>创建人</th>
					<td><input name="chc_create_by" value="" readonly size="20" /><span
						class="red_star">*</span></td>
				</tr>
				<tr>
					<td width=100% height=32 align=center colspan=6 bgcolor=#ffffff>
						<a href="../help.html"> <!-- <input class="common_button" type="button"
						value="帮助"> -->
							<button class="je-btn" type="button">帮助</button>
					</a>&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; 
						<button class="je-btn" type="submit">保存/返回</button>
					</td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>