<%@ include file="/WEB-INF/jsp/include.jsp" %>

<html>
  <head>
    <title>
        <fmt:message key="title"/>
    </title>
    <style>
        .error {
            color: #ff0000;
        }

        .errorblock {
            color: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
  </head>
   <body>
      <h1><fmt:message key="heading"/></h1>
      <h3>Products</h3>
      <form:form method="POST" commandName="productsForm">
      <form:errors path="*" cssClass="errorblock" element="div" />
      <table>
          <tr>
            <td><b>Product SKU</b></td>
            <td><b>Product Name</b></td>
            <td><b>Product Description</b></td>
          </tr>
          <c:forEach items="${model.products}" var="prod">
          <tr>
            <td>
                <a href="<c:url value="/productDetails?sku=${prod.sku}"/>">SKU:${prod.sku}</a><br>
            </td>
            <td>
                <c:out value="${prod.name}"/><br>
            </td>
            <td>
                <c:out value="${prod.description}"/><br>
            </td>
          </tr>
          </c:forEach>
      </table>
      </form:form>
   </body>
</html>

