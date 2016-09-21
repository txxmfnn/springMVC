<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path;
%>
<html lang="us">
<head>
	<meta charset="utf-8">
	<title>jQuery UI Example Page</title>
	<link type="text/css" href="<%=basePath%>/resources/css/jquery-ui/jquery-ui.css" rel="stylesheet" />
	<style>
	body{
		font: 62.5% "Trebuchet MS", sans-serif;
		margin: 50px;
	}
	select {
		width: 200px;
	}
	</style>
</head>
<body>

<h1>Welcome to jQuery UI!</h1>

<h2 class="demoHeaders">Autocomplete</h2>
<div>
	<input id="autocomplete" title="type &quot;a&quot;">
</div>

<h2 class="demoHeaders">Autocomplete Ajax</h2>
<div>
	<input id="autoByAjax" title="type &quot;a&quot;">
	<input id="autoByAjaxVal"  type="hidden">
	<button id="btn" type="button">submit</button>
</div>


</body>
</html>


<script type="text/javascript" src="<%=basePath%>/resources/js/jquery/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/resources/js/jquery-ui/jquery-ui.js"></script>
<script>
$(function(){
	var dataArray=[];
	var option = {
			max: 12,    //列表里的条目数
			minChars: 0,    //自动完成激活之前填入的最小字符
			width: 400,     //提示的宽度，溢出隐藏
			scrollHeight: 300,   //提示的高度，溢出显示滚动条
			matchContains: false,    //包含匹配，就是data参数里的数据，是否只要包含文本框里的数据就显示
			autoFill: true,    //自动填充
			minLength: 0,
			select: function (event, ui) {
		        $("#autoByAjax").val(ui.item.label); // display the selected text
		        $("#autoByAjaxVal").val(ui.item.id); // save selected id to hidden input
		    }
	};
	$.ajax({
		url: "<%=basePath%>/formWidget/getPersonDropDownTips.json",
		type: "GET",
		dataType: "json",
		success: function(data){
			if(data.success){
				var reslist = data.result;
				for(var i=0; i<reslist.length; i++){
					var vo = reslist[i];
					dataArray.push({id :vo.id, label: vo.name+"a"});
				}
				
			}
		}
		
	});
	
	//$("#autoByAjax").autocomplete({source: dataArray}, option);
	$("#autoByAjax").autocomplete({source: dataArray}, option).on('focus', function() { $(this).keydown(); });

	$("#btn").click(function(){
		var v = $("#autoByAjaxVal").val();
		alert(v);
	});
});

var availableTags = [
	"ActionScript",
	"AppleScript",
	"Asp",
	"BASIC",
	"C",
	"C++",
	"Clojure",
	"COBOL",
	"ColdFusion",
	"Erlang"
];
$( "#autocomplete" ).autocomplete({
	source: availableTags
});

</script>