<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<title>Yahoo!!</title>

<style type="text/css">
body{background-color:#eee}
h1,h2{font-family: cursive;background-color: #60bc54;color:#fff;padding:20px;text-align:center}
a{padding:2px;margin:10px;border-radius:5px;color:#54b0bc; display:inline-block; }
.container{width:500px;box-shadow:0px 1px 10px #a8a8a8; position:absolute;top:55%;left:50%;
		  transform:translate(-50%,-50%);padding-bottom:10px}
p{text-align:center; font-size:20px; color:#e0587c}
input{width:50%; border:3px solid #60bc54; border-radius:5px; height: 40px; padding:10px}
input[type="submit"]:hover{background-color:#54b0bc; border:0}
input[type="submit"]{width:30%; background-color:#60bc54; border:0;cursor;pointer}

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
				<li><a href="/category.do">Catalog</a></li>
				<li><a href="/product.do">Product</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/logout.do" class="btn btn-danger"><font color = "white">Logout</font></a></li>
			</ul>
		</div>

	</nav>

	<div class="container">
		<H1>SIGNUP PAGE</H1>
		<form action="/signup.do" method="post">
	<p><font color ="red">${errrorMessage}</font></p>
		<p>Name</p><p> <input type="text" name="name"/>  </p>
		<p>Telephone </p><p> <input type="text" name="tel"/>  </p>
		<p>email </p><p> <input type="email" name="email"/> </p>
		<p>Password </p><p> <input type ="password" name="password" /> </p>
		<p><input type="submit" value="SIGNUP"/></p>
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