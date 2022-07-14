<jsp:useBean id="data" scope="request" type="servlet.LoginServlet"/>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1>${data}</h1>
    <br/>
    <p>index.jsp page is opened</p>
</body>
</html>