<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>

</head>
<body>
    <form id="form1">
		 <input type = "text" name = "name"/></input><br/>
        <input type  = "text" name = "password"></input><br/>
        <button type="button" id="submitBtn" onclick="Submit();">提交</button>
        <button type="button" id="loginBtn" onclick="Login();">验证</button>
        
    </form>

</body>
<script type="text/javascript">

      function Submit(){

		$.ajax({
			url:'saveUser',
			data:$('#form1').serialize(),
			type:"post",
			success:function(data){
				alert('success');
			}
		});
	}
      function Login(){
    	  window.location.href="login";
      }
      
</script>

</html>