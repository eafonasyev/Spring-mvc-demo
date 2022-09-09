<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
    <title>Student Registration Form</title>
</head>

<body>

<form:form action="processForm" modelAttribute="student">

    First name: <form:input path="firstName" />

    <br><br>

    Last name: <form:input path="lastName" />

    <br><br>
    Country:
    <form:select path="country">
        <form:options items="${student.countryOptions}"></form:options>
    </form:select>
    <br><br>
    favorite language

    JAVA <form:radiobutton path="favoriteLanguage" value="java"/>
    C# <form:radiobutton path="favoriteLanguage" value="c#"/>
    PITON <form:radiobutton path="favoriteLanguage" value="piton"/>
    <br><br>
    how many hours you want to work
    1 <form:checkbox path="countHours" value="1"/>
    2 <form:checkbox path="countHours" value="2"/>
    3 <form:checkbox path="countHours" value="3"/>
    4 <form:checkbox path="countHours" value="4"/>
    <br/><br>

    <input type="submit" value="Submit" />

</form:form>


</body>

</html>