<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<style>
.wrapper a {
		display: inline-block;
		text-decoration: none !important;
}

.header {
		text-align: center;
}

.container {
		width: 80%;
}

.menu {
		width: 100%;
		text-align: center;
}

.menu ul {
		list-style: none;
		clear: left;
		width: fit-content;
		margin: 0 auto;
}

.menu ul li {
		float: left;
		padding: 0px 5px;
}

.menu ul li:hover {
		color: lightseablue;
}

.footer {
		text-align: center;
}
</style>
</head>
<body>
		<div class="wrapper">
				<div class="header">
						<tiles:insertAttribute name="header" />
				</div>
				<div class="container">
						<div class="menu">
								<tiles:insertAttribute name="menu" />
						</div>
						<div class="body">
								<tiles:insertAttribute name="body" />
						</div>
				</div>
				<div class="footer">
						<tiles:insertAttribute name="footer" />
				</div>
		</div>
</body>
</html>