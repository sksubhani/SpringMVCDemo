<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Employee Details</title>
 
<spring:url value="/resources/core/css/hello.css" var="coreCss" />
<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
</head>
 
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
	<div class="navbar-header">
		<a class="navbar-brand" href="#">Employee Details</a>
	</div>
  </div>
</nav>
 
<div class="jumbotron">
  <div class="container">
	<h2>Employee Details</h2>
	<p>
		<c:if test="${not empty employee}">
			<table border='2'>
				<tr>
					<td>Employee ID</td>
					<td>${employee.employeeId}</td>
				</tr>
				<tr>
					<td>Employee Name</td>
					<td>${employee.employeeName}</td>
				</tr>
			</table>
		</c:if>
 
		<c:if test="${empty employee}">
			Not Received employee details.
		</c:if>
    </p>
    <p>
		<a class="btn btn-primary btn-lg" href="#" role="button">Refresh</a>
	</p>
	</div>
</div>
 
<spring:url value="/resources/core/css/hello.js" var="coreJs" />
<spring:url value="/resources/core/css/bootstrap.min.js" var="bootstrapJs" />
 
<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
 
</body>
</html>