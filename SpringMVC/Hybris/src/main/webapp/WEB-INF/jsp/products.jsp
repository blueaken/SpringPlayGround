<%@ include file="/WEB-INF/jsp/include.jsp" %>

<html>
  <head><title><fmt:message key="title"/></title></head>
    <body>
      <h1><fmt:message key="heading"/></h1>
      <h3>Products</h3>
      <c:forEach items="${model.products}" var="prod">
        <a href="<c:url value="/productDetails?sku=${prod.sku}"/>">SKU:${prod.sku}</a><br>
        <c:out value="Product Name: ${prod.name}"/><br>
        <c:out value="Product Description: ${prod.description}"/><br>
        <br>
      </c:forEach>
    </body>
</html>

