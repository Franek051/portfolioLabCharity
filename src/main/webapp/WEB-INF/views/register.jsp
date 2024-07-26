<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="userHeader.jsp" %>

<section class="login-page">
    <h2>Załóż konto</h2>
    <form:form action="${pageContext.request.contextPath}/register" modelAttribute="user" method="post">
        <div class="form-group">
            <form:input path="email" placeholder="Email" class="form-control" />
        </div>
        <div class="form-group">
            <form:password path="password" placeholder="Hasło" class="form-control" />
        </div>

        <div class="form-group">
            <form:input path="name" placeholder="Imię" class="form-control" />
        </div>
        <div class="form-group form-group--buttons">
            <a href="<c:url value="/login"/>" class="btn btn--without-border">Zaloguj się</a>
            <button class="btn" type="submit">Załóż konto</button>
        </div>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form:form>
</section>

<%@include file="userFooter.jsp" %>
