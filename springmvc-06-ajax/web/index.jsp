<%--
  Created by IntelliJ IDEA.
  User: 15029
  Date: 2021/7/5
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.6.0.js"></script>
    <script>
      function a(){
        $.post({
          url:"${pageContext.request.contextPath}/a1",
          data:{"name":$("#username").val()},
          success:function (data,status){
            console.log(data);
            console.log(status);
          }
        })
      }
    </script>



  </head>
  <body>
  用户名： <input type="text" id="username" onblur="a()">
  </body>
</html>
