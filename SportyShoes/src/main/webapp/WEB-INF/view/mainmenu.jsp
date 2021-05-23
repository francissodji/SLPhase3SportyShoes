
<%@page import="java.util.List" %>
<%@page import ="com.ecommerce.model.Product" %>



<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>main memu</h1>

	<h1>List of all Classes</h1>

	<!-- ****************************** -->
	
	<table>
		<tr>
			<th>head 1</th>
			<th>head 2</th>
			<th>head 3</th>
			<th>head 4</th>
		</tr>
		
		<c:forEach items ="${productList}" var ="prod"/>
		
		<tr>
			<td><c:out value = "$.{prod.getIdProduct}"/></td>
			<td><c:out value = "$.{prod.getDesignProduct}"/></td>
			<td>
				
			</td>
		</tr>
	
	</table>

	<!-- ****************************** -->
	<div>
		<table border=1>
		
			<tr><th>Class Designation</th></tr>
			
			<% 
				List<Product> aListOfAllClass = (List<Product>)session.getAttribute("allListProd");
				
			
				for(Product aProduct : aListOfAllClass)
				{
			%>
					<tr>
						<td><%=aProduct.getDesignProduct()%></td>
					</tr>
			<%		
				}
			%>
		</table>
	</div>
	
</body>
</html>