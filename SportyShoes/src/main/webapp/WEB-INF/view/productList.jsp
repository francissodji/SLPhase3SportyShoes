<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Management</title>
<link rel="icon" type="image/x-icon"
	href="<c:url value="/resource/images/favicon1.png"/>" />
<link rel="stylesheet"
	href="<c:url value="../resource/bootstrap/css/bootstrap.min.css"/>">
<script src="<c:url value="../resource/js/jquery.js"/>"></script>
<script src="<c:url value="../resource/bootstrap/js/bootstrap.min.js"/>"></script>
<link rel="stylesheet" type="text/css"
	href="<c:url value="../resource/css/ProductList.css"/>">
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src="<c:url value="../resource/js/productController.js"/>"></script>
</head>
<body ng-app="myapp">
	<div class="container" id="productTable"
		style="width: 1145px; margin-bottom: 180px;">
		<h2>Product Management</h2>

		<table class="table table-hover" id="productList">
			<thead>
				<tr>

					<th>Product design</th>
					<th>Unit price</th>
					<th>Products Price</th>
					<th>Category</th>
					<th>Picture</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${products}" var="prod">
					<tr>
						
						<td>${prod.designProduct}</td>
						<td>${prod.unitPrice}</td>
						<td>${prod.category.libelCateg}</td>

						<td>
							<a href=#>Add to cart</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
