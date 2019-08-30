<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>

<head>
<title>Yahoo!!</title>

<style type="text/css">
body{background-color:#eee}
h1,h2{font-family: cursive;background-color: #2e87d4;color:#fff;padding:20px;text-align:center}
a{padding:20px;margin:20px;border-radius:5px;color:#fef}

</style>

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
				<li class="active"><a href="/home.do">Home</a></li>
				<li><a href="/category.do">Category</a></li>
				<li><a href="/product.do">Product</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/logout.do" class="btn btn-danger"><font color = "pink">Logout</font></a></li>
			</ul>
		</div>

	</nav>

	<div class="container">
		<H1>CATEGORY PAGE</H1>
		
		<h3>Here are the Categories</h3>
		<a href="#add" class="btn btn-warning"><font color="white">click me to add a category</font></a>
		
		<sql:setDataSource var = "catDB" driver="com.mysql.jdbc.Driver" 
							url="jdbc:mysql://localhost:3306/Catalog" user="root" password=""/>
		<sql:query var = "rs" dataSource = "${catDB}">select * from category</sql:query>
		
		<table class="table table-striped">
		<thead> <th>Category ID</th> <th>Category Name</th> </thead>
		
			<tbody><c:forEach items="${rs.rows}" var="category">
				<tr><td><c:out value="${category.catId}"></c:out></td><td> <c:out value="${category.catname}"></c:out></td><td>
				<a href="/delete-catalog.go?catId=${category.catId}" class="btn btn-danger">Delete</a></td></tr>
			</c:forEach>
			</tbody>
		</table>
		
		<br><br>
		
		<hr>
		
		<div class="container" id="add">
		<h2>ADD NEW CATALOGS HERE!</h2>
		<form method="POST" action="/add-catalog.go">
			New Product :<p> Category Name: <input name="catname" type="text" /> </p>						
					   <p> <input name="Add" type="submit" class="btn btn-success"/> </p>
		</form>
		</div>

	</div>

	<!-- <footer class="footer">
		<div class="container">
			<p>footer content</p>
		</div>
	</footer>-->

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>