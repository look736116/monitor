<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE>
<html>
<head>
<title>添加用户</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- 为了让 Bootstrap 开发的网站对移动设备友好，确保适当的绘制和触屏缩放，需要在网页的 head 之中添加 viewport meta 标签 -->
<!-- 通常情况下，maximum-scale=1.0 与 user-scalable=no 一起使用。这样禁用缩放功能后，用户只能滚动屏幕，就能让您的网站看上去更像原生应用的感觉。 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- 引入 Bootstrap 核心 CSS 文件 -->
<link 	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<!-- 引入自定义的 css文件 -->
<link href="<%=path%>/css/addUser.css" rel="stylesheet">

<!-- 添加网站图标 网站图标生产网站：http://bitbug.net/ -->
<link rel="shortcut icon" href="<%=path%>/img/favicon.ico" />
<link rel="bookmark" href="<%=path%>/img/favicon.ico" type="image/x-icon" />

<script>
var path='<%=path%>';
</script>
</head>
<body>
	<div class="container">
	<div class = "row" style ="height:50px;background-color:#46A3FF;"> 		
	</div>	
	<br>
	<form class="bs-example bs-example-form" role="form" method="post" action="<%=path%>/user/addUser">

		<!-- 账号-->
		<div class="row">	
			<div class="col-lg-3 col-md-3 col-sm-3 "></div>
			<div class="col-lg-3 col-md-3 col-sm-3 ">
			<div class="input-group input-group-lg">				
				<span class="input-group-addon">账号</span>
			 	<input type="text" class="form-control" placeholder="请输入用户名" name="userName" id="userName">
			 </div>
			 </div>
			 <div class="col-lg-3 col-md-3 col-sm-3 "></div>
			 <div class="col-lg-3 col-md-3 col-sm-3 "></div>
		  </div>
		   <br>
		  
		  <!-- 密码-->
		<div class="row">	
			<div class="col-lg-3 col-md-3 col-sm-3 "></div>
			<div class="col-lg-3 col-md-3 col-sm-3 ">
			<div class="input-group input-group-lg">				
				<span class="input-group-addon">密码</span>
			 	<input type="text" class="form-control" placeholder="请输入密码" name="userPassword" id="userPassword">
			 </div>			 
			 
			 </div>
			 <div class="col-lg-3 col-md-3 col-sm-3 "></div>
			 <div class="col-lg-3 col-md-3 col-sm-3 "></div>
		  </div>
		   <br>
		   
		     <!-- 密码-->
		<div class="row">	
			<div class="col-lg-3 col-md-3 col-sm-3 "></div>
			<div class="col-lg-3 col-md-3 col-sm-3 ">
			<div class="input-group input-group-lg">					
			 	<input type="submit" class="btn-lg btn-success" value= "安全登录" id="submitData">
			 </div>
			 </div>
			 <div class="col-lg-3 col-md-3 col-sm-3 "></div>
			 <div class="col-lg-3 col-md-3 col-sm-3 "></div>
		  </div>
		   <br>
	
		<div class = "row text-center"> <h5>${result}</h5></div>
		<input type = "text" value ="test" id="myVal">
		<p class="msg" id="msg">5555</p>
	
	
	
	
	</form>
	</div>
	
	<!-- 这两个文件放入HTML网页的最底部，这么做的原因是为了防止网页未加载完毕而这两个文件先加载可能产生的不必要的问题 -->
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>

	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
		src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	<!-- 引入外部自定义的js 文件 -->
	<script src="<%=path%>/js/addUser.js"></script>
</body>
</html>