<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查找</title>
    <link href="css/bootstrap.min.css" rel="stylesheet"/>
   <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<h2>按条件查询吉他</h2>
<hr/>
<form action="show" class="form">

    <div class="form-group">
    <lable>Builder：</lable>
    <input type="text" name="builder"  >
    </div>
     <div class="form-group">
    <lable>Style：</lable>
    <input type="text" name="style">
    </div>
    <div class="form-group">
    <lable>Type：</lable>
    <input type="text" name="type" >
    </div>
    <input type="submit" value="Submit"  class="btn btn-default">
</form>
   <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
