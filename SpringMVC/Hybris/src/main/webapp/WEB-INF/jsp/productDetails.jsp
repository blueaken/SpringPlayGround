<%@ include file="/WEB-INF/jsp/include.jsp" %>

<html>
  <head><title><fmt:message key="title"/></title></head>
    <body>
      <h1><fmt:message key="heading"/></h1>
      <h3>Product Detail</h3>
      <c:out value="Product SKU: ${model.product.sku}"/><br>
      <c:out value="Product Name: ${model.product.name}"/><br>
      <c:out value="Product Description: ${model.product.description}"/><br>
      <c:out value="Product Color: ${model.product.color}"/><br>
      <c:out value="Product Price: ${model.product.price}"/><br>
      <br><a href="<c:url value="products"/>">Home</a>
    </body>
</html>