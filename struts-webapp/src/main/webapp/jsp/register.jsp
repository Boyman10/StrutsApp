<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>${application.name} - Regsitration form</title>
    <!-- Bootstrap -->
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
          crossorigin="anonymous" />
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
          crossorigin="anonymous" />
     <link rel="stylesheet" href="/static/css/styles.css" />
    <s:head />
</head>
<body>



<%@ include file="_include/header.jsp" %>

<h2>Registration form</h2>

https://struts.apache.org/getting-started/coding-actions.html
    <s:form action="register">
      <s:textfield name="userBean.username" label="Username" />
      <s:textfield name="userBean.email" label="Email" />
      <s:password name="userBean.password"  label ="Password"/>  

      <s:submit/>
    </s:form>

<%@ include file="_include/footer.jsp" %>

</body>
</html>