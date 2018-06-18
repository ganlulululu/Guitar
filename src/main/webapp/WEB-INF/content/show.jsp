<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>查询结果</title>
    <link href="css/bootstrap.min.css" rel="stylesheet"/>
   <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<h2>以下是符合要求的乐器</h2>
<hr/>
<table style="width:100%" class="table table-hover">
<thead>
<td>吉他名字</td>
<td>吉他制造商</td>
<td>吉他弦数</td>
<td>吉他种类</td>
</thead>
<c:forEach items="${guitarList}" var="guitar">
<tr>
<td>${guitar.instrumentType}</td>
<td>${guitar.guitarSpec.builder}</td>
<td>${guitar.guitarSpec.style}</td>
<td>${guitar.guitarSpec.type}</td>
</tr>

</c:forEach>
</table>

	<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
