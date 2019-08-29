<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>

<head>
<title>Yahoo!!</title>
<!-- Bootstrap core CSS -->
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #f5f5f5;
}

.footer .container {
	width: auto;
	max-width: 680px;
	padding: 0 15px;
}
</style>
</head>

<body>

	<nav role="navigation" class="navbar navbar-default">

	<div class="">
			<a href="/login.do" class="navbar-brand">Login</a>
		</div>

		<div class="navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="/category.do">Category</a></li>
				<li><a href="/product.do">Product</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/logout.do">Logout</a></li>
			</ul>
		</div>

	</nav>

	<div class="container">
		<H1>CATEGORY PAGE</H1>
		
		<h3>Here are the Categories</h3>
		<sql:setDataSource var = "catDB" driver="com.mysql.jdbc.Driver" 
							url="jdbc:mysql://localhost:3306/Catalog" user="root" password=""/>
		<sql:query var = "rs" dataSource = "${catDB}">select * from category</sql:query>
		
			<c:forEach items="${rs.rows}" var="category">
				<br><c:out value="${category.catId}"></c:out> :: <c:out value="${category.catname}"></c:out>
				&nbsp;&nbsp; <a href="/delete-catalog.go?catname=${category.catname}">Delete</a>
			</c:forEach>
		<form method="POST" action="/add-catalog.go">
			New Product : Category Name: <input name="catname" type="text" /> <br><br>
			
						<!--  Category ID: <input name="catId" type="text" /> <br><br>-->
						
					    <input name="Add" type="submit" /> 
		</form>

	</div>

	<footer class="footer">
		<div class="container">
			<p>footer content</p>
		</div>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>