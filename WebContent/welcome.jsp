<html>
	<head>
		<link rel = "styLesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
		<title>WelCome</title>
	</head>

<body>
	<nav class = "navbar navbar-expand navbar-dark dg-dark">
		<div class="container">
			<a class = "navber-brand" href="./welcome.jsp">HOME</a>
		</div>
	</nav>
	<%!
	String greeting = "Welcome To Web Shopping Mall";
	String tagline = "Welcome To Web Market";
	%>
	<div class="jumbotron">
		<div class = "container">
			<h1 class ="display-3">
			<%=greeting %>
			</h1>
		</div>
	</div>

	<div class="container">
		<div class= "text-center">
			<h3><%=tagline%>
			</h3>
		</div>
		<hr>
	</div>

	<footer class="container">
		<p>&copy; WebMarket</p>
	</footer>
</body>
</html>