<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Spring MVC Demo</title>
</head>

<div class="jumbotron">
  <div class="container">
	<h1>Name: ${name}</h1>
	<p>
		<c:if test="${not empty name}">
			Hello ${name}
		</c:if>

		<c:if test="${empty name}">
			Welcome Welcome!
		</c:if>
    </p>
  </div>
</div>

</body>
</html>