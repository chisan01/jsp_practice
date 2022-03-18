<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
         pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="EUC-KR">
    <title>practice2</title>
</head>
<body>
<%!
    Date date = new java.util.Date();

    public int nowday(Date d) {
        return d.getDate();
    }
%>

현재 날짜 : <%= nowday(date) %>
일<br>
오늘 날짜 : <% out.println(nowday(date)); %>
일<br>

</body>
</html>
