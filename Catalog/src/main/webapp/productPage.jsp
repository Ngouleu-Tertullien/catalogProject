<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
		<H1>PRODUCT PAGE</H1>
		
		<h3>Here are the products </h3>
		
		<ol>
			<c:forEach items="${products}" var="product">
				<li>${product.name}&nbsp;
				<a href="/delete-product.go?product=${product.name}">Delete</a></li>
			</c:forEach>
		</ol>
		<br><br><br>
		<hr>
		<form method="POST" action="/add-product.go">
			New Product : Name: <input name="name" type="text" /> <br>
						Product Category: <input name="prodCat" type="text" /> <br>
						Price: <input name="price" type="text" /> <br>
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