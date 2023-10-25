<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>News List</title>
</head>
<body>
<h2>News List</h2>
<hr>
<table>

    <tr>
        <th>No.</th><th>제목</th><th>작성일자</th>
    </tr>
    <c:forEach var="news" items="${newsList}" varStatus="status">
        <tr>
            <td>[${status.count}]</td>
            <%-- getAid로 가져오지 않음, 대신 변수명은 동일해야 : ${news.aid} : 도 안씀, 글 순서대로.. --%>
            <td><a href="/news.nhn?action=getNews&aid=${news.aid}">${news.title}</a></td>
            <td>${news.date}</td>
        </tr>
    </c:forEach>
    <%-- <a href="/news.nhn?action=insert">추가하기</a> --%>
</table>
<hr>

<c:if test="${error != null}">
    <div>"error 발생 ${error}"</div>
</c:if>

<button type="button" data-bs-toggle="collapse" data-bs-target="#addForm"
        aria-expanded="false" aria-controls="addForm">뉴스 등록</button>

<div class="collapse" id="addForm">
    <form action="/news.nhn?action=addNews" enctype="multipart/form-data" method="post">
        <label for="title" class="form-label">제목</label>
        <input type="text" id="title" name="title" class="form-control">
        <label for="img" class="form-label">이미지</label>
        <input type="file" id="img" name="img" class="form-control">
        <label for="content" class="form-label">기사내용</label>
        <textarea name="content" id="content" cols="30" rows="10" class="form-control"></textarea>
        <button type="submit" class="btn btn-success mt-3">저장</button>
    </form>
</div>

</body>
</html>