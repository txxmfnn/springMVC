<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path;
%>
<html>
<head>
<title>jqpagination用法- author: paincupid since: 2016.01.24</title>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8"/>

<link rel="stylesheet" href="<%=basePath%>/resources/css/jqPagination/jqpagination.css"/>

<script type="text/javascript" src="<%=basePath%>/resources/js/jquery/jquery-1.11.3.js"></script>
<script type="text/javascript" src="<%=basePath%>/resources/js/jqueryForm/jquery.form.js"></script>
<!-- selene theme -->
<script type="text/javascript" src="<%=basePath%>/resources/js/seleneJs/html5.js"></script>
<script type="text/javascript" src="<%=basePath%>/resources/js/seleneJs/jquery-ui.min-1.8.16.js"></script>
<link type="text/css" href="<%=basePath%>/resources/css/seleneTheme/css/ui-selene/jquery-ui-1.8.17.custom.css" rel="stylesheet" />	
<link rel="stylesheet" href="<%=basePath%>/resources/css/seleneTheme/site/css/master.css" type="text/css" media="screen" title="no title" charset="utf-8">
<!-- jqPaginator -->
<script type="text/javascript" src="<%=basePath%>/resources/js/jqPagination/jquery.jqpagination.js"></script>


<script type="text/javascript">


$(function(){
	$(".buttons").button();
	
	//search(1);
	
	$("#search_btn1").click(function () {
		search(1);
	});
	
	//initPageWidget(data);
});

function search(currentPage){
	$("#currentPage").val(currentPage);
	$("#searchForm1").ajaxSubmit({
		url :'${pageContext.request.contextPath}/formWidget/getForm',    //默认是form的action，如果申明，则会覆盖
		type : "POST",    // 默认值是form的method("GET" or "POST")，如果声明，则会覆盖
		dataType : "json",    // html（默认）、xml、script、json接受服务器端返回的类型
		beforeSubmit : function(){
		    // 提交前的回调函数，做表单校验用
			/* $("#name").val("lee李 - beforeSubmit");
		    $("#comment").val("呵呵ll123"); */
		    return true;
		},
	    beforeSerialize: function(){
	    	//提交到Action/Controller时，可以自己对某些值进行处理。
	    	$("#id").val("lele李");
	        $("#name").val("lee李 - beforeSerialize");
	        $("#comment").val("呵呵ll123444");
	    },
	    success: function(data){
	    	if (data.success == true) {
	    		buildTableData(data);
	    		initPageWidget(data);
	          }else{
	            alert("error:"+data.responseText);
	         } 
	    }
	    
 	});
}
function buildTableData(data){
	var retlist = data.result;
    $(".retListTr").remove();
    for (var i = 0; i < retlist.length; i++) {  
    	var vo = retlist[i];
    	var tbodyString = "<tr class = 'retListTr' data-id=" + vo.id +">";  
    	tbodyString = tbodyString + '<td>' + (i + 1) + '</td>'   
	                            + '<td>' + vo.id + '</td>'
	                            + '<td>' + vo.name + '</td>'   
	                            + '<td>' + vo.age + '</td>'   
	                            + '<td>' + vo.tel + '</td>'   
	                            + '<td>' + vo.prov + '</td>'   
	                            + '<td>' + vo.city + '</td>'   
	                            + '<td>' + vo.town + '</td>'   
	                            + '<td>' + vo.sex + '</td>'   
	                            + '<td>' + vo.location + '</td>'   
	                            + '<td>' + vo.company + '</td>'   
	                            + '<td>' + vo.comment + '</td>';
    	tbodyString = tbodyString + "</tr>";  
    
    	$("#retListBody").append($(tbodyString));
    }
}

function initPageWidget(data){
	var totalCounts = data.totalCounts;
	var max = Math.ceil(totalCounts / data.pageSize);
	$('.pagination').jqPagination({
		  link_string : '${pageContext.request.contextPath}/widget/getForm'+'/?page={page_number}',
		  current_page: 1, //设置当前页 默认为1
		  max_page : max, //设置最大页 默认为1
		  page_string : '当{current_page}页/共{max_page}页',
		  paged : function(page) {
		      search(page);
		  }
	});
}
</script>
</head>
<body>
	<div class="container">
		<div class="content" >
				<div  style="padding-left:2%">
				<h2>jqpagination用法</h2>
				</div>
				<form name="searchForm1" id="searchForm1" enctype="multipart/form-data">
					<input type="hidden" name="comment" id="comment" value="123"  style="width: 800px; height: 400px"/>
					<input type="hidden" name="currentPage" id="currentPage"/>
					<div class="component" >
							<label style="width:24%;">pid</label>
							<input  id = "id"   name="id"  class="text"  type = "text" value="18600001234"/>
							<label style="width:24%;">姓名</label>
							<input id = "name"  name="name"  class="text"  type = "text" value="用jqueryFormPlugin的提交"/>
							&nbsp&nbsp	
							<button id="search_btn1"  type="button" class="buttons ui-button-blue">查询提交表单1</button>
						</div>
				</form>
				<div class="space"></div>
				
				<div style="float:right; padding-right:2%">
					<div class="pagination">
					  <a href="#" class="first" data-action="first">&laquo;</a>
					  <a href="#" class="previous" data-action="previous">&lsaquo;</a>
					  <input type="text" readonly="readonly" data-max-page="40" />
					  <a href="#" class="next" data-action="next">&rsaquo;</a>
					  <a href="#" class="last" data-action="last">&raquo;</a>
					</div>
				</div>
				
				<table class="listTable" id = "retListTable" >
						<thead>  
							<tr>
					        	<th scope="col">序号</th>
					            <th scope="col">id</th>
					            <th scope="col">姓名</th>
					            <th scope="col">年龄</th>
					            <th scope="col">电话</th>
					            <th scope="col">省</th>
					            <th scope="col">市</th>
					            <th scope="col">区</th>
					            <th scope="col">性别</th>
					            <th scope="col">地点</th>
					            <th scope="col">公司</th>
					            <th scope="col">备注</th>
					            
					        </tr>
			            </thead>
			            <tbody id = "retListBody" >  
			            </tbody>
				</table>
				
				
		</div><!--  content   end -->
	</div><!--  container end -->
</body>
</html>