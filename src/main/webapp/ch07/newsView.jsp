<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>뉴스 상세 보기</title>
</head>
<body>
<h2>Product 상세정보</h2>
<div>
    <ul>
        <li>id : ${news.id}</li>
        <li>title : ${news.title}</li>
        <li>image : ${news.img}</li>
        <li>date : ${news.date}</li>
        <li>content : ${news.content}</li>
    </ul>
</div>
<a href="javascript:history.back()"><< Back</a>
</body>
</html>
