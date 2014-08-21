<%@ include file="/WEB-INF/jsp/include.jsp" %>

<html>
  <head><title><fmt:message key="title"/></title></head>
    <body>
      <h1><fmt:message key="heading"/></h1>
      <h3>Product Detail</h3>
      <form:form>
            <table>
                <tr>
                    <td><b>Product SKU</b></td>
                    <td><b>Product Name</b></td>
                    <td><b>Product Description</b></td>
                    <td><b>Product Color</b></td>
                    <td><b>Product Price</b></td>
                </tr>
                <tr>
                    <td><c:out value="${model.product.sku}"/></td>
                    <td><c:out value="${model.product.name}"/></td>
                    <td><c:out value="${model.product.description}"/></td>
                    <td><c:out value="${model.product.color}"/></td>
                    <td><c:out value="${model.product.price}"/></td>
                </tr>
            </table>
      </form:form>
      <br><a href="<c:url value="products"/>">Home</a>
    </body>
</html>