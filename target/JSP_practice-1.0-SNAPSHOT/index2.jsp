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

���� ��¥ : <%= nowday(date) %>
��<br>
���� ��¥ : <% out.println(nowday(date)); %>
��<br>

</body>
</html>
