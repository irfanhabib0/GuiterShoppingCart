<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <c:set var="req" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="panel pannel-default">


	<div class="panel-header">
		
		Product Form
	
	</div>
	
	
	<div class="panel-body">
			
		<form:form action="${req}/admin/insert" method="post" modelAttribute="pro">
		 <form:hidden path="id"/> 
		 
		<form:input path="name"/> 
			
			<hr/>		
			<form:input path="category"/>
			
			<hr/>
			
			<form:input path="supplier"/>
			
			<hr/>
				
			
			<form:input path="price"/>
			
			<hr/>
			
			
			
			<input type="submit" value="Save"/>
									
		</form:form>	
		
	</div>


</div>

<table class="table table-striped">

	<tr>
		<th>Productid</th>
		<th>ProductName</th>
		<th>Description</th>
		<th>ProductPrice</th>
		
	</tr>

	<c:forEach items="${products}" var="product">	
		<tr>
			<td>${product.Productid}</td>
			<td>${product.Productname}</td>
			<td>${product.ProductPrice}</td>
			<td>${product.Description}</td>
			<td>				
				<a href="${req}/admin/edit/${product.id}" class="btn btn-sm btn-primary">Edit</a>&#160;
				<a href="${req}/admin/delete/${product.id}" class="btn btn-sm btn-primary">Delete</a>			
			</td>		
	</c:forEach>



</table>


</body>
</html>