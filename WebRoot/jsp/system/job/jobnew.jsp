<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML >
<html>
<head>

<title>岗位添加页面</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/base.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/check.js"></script>
</head>
<body>
	<div class="containner">
		<div id="inner-hd">
			<div class="crumbs">
				<span class="crumbs-label">系统管理&gt;&gt;岗位管理&gt;&gt;添加岗位信息</span>
			</div>
		</div>

		<div id="inner-bd">
			<form action="" method="post" onsubmit="return checkData();">
				<table class="kv-table">
					<tr>
						<td>岗位性质</td>
						<td><input type="radio" name="gwxz" value="gl" checked="checked">管理 <input type="radio" name="gwxz" value="xjz">巡检组</td>
					</tr>

					<tr bgcolor="#F2F2F2">
						<td align="center">岗位名称：</td>
						<td><input name="job.name" id="jobName" onblur="checkJobName(this.value);"><span align="left" id="div1"></span></td>
					</tr>
					<tr bgcolor="#F2F2F2">
						<td align="center">岗位描述：</td>
						<td><textarea name="job.description" cols="30" rows="3"></textarea></td>
					</tr>
				</table>
				<br>
				<center>
					<input type="submit" value="新增">&nbsp;&nbsp; <input type="button" value="返回" onclick="history.back();">
				</center>
			</form>
		</div>
	</div>
</body>
</html>
