<%--
  Created by IntelliJ IDEA.
  User: EAfonasyev
  Date: 25-Sep-22
  Time: 5:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2>CRM - Customer Relationship Manager</h2>
    </div>
</div>

<div id="container">

    <div id="content">
        <!-- put new button: Add Customer -->
        <input type="button" value="Add Customer"
               onclick="window.location.href='showFormForAdd'; return false;"
               class="add-button"
        />
        <!--  add our html table here -->
        <table>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
            </tr>

            <!-- loop over and print our customers -->
            <c:forEach var="tempCustomer" items="${customers}">
                <!-- construct an "update" link with customer id -->
                <c:url var="updateLink" value="/customer/showFormForUpdate">
                    <c:param name="customerId" value="${tempCustomer.id}" />
                </c:url>

            <!--delete
            <c:url var="deleteLink" value="/customer/delete">
                <c:param name="customerId" value="${tempCustomer.id}" />
            </c:url>

                <tr>
                    <td> ${tempCustomer.firstName} </td>
                    <td> ${tempCustomer.lastName} </td>
                    <td> ${tempCustomer.email} </td>
                    <td>
                        <!-- display the update link -->
                        <a href="${updateLink}">Update</a>

                        <!-- display the update link -->
                        <a href="${deleteLink}">Delete</a>
                    </td>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
