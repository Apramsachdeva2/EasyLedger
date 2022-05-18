<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Easy Ledger Application</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<style>
.bck-grad{
/* 	background: radial-gradient(circle, rgba(158,34,195,1) 0%, rgba(125,45,253,1) 100%); */
	
background-color: #20bf55;
background-image :linear-gradient(315deg, #20bf55 0%, #01baef 74%);
 height: 100vh; 
}

.form-bck{
width:60%;
height:75%;
margin-left:20%;

background: radial-gradient(circle, rgba(195,34,183,1) 0%, rgba(253,45,105,1) 100%);	
}
</style>
</head>
<body>




<div class="container bck-grad pt-3 text-center">
<h1 style=" font-family:georgia;font-weight: bold; font-size: 70px; margin-top:4px;">Login</h1>




<div class="form-bck" >


<img src="/images/img6.png" style="width:30%; margin-top:10px;" />


<form method="post" action="validate">
  <div class="mb-3" >
    <label class="form-label" style="margin-top:10%;font-family:monaco;font-size:30px;">Username</label>
    <input type="text" class="form-control" style="width:50%;margin-left:25%" name="userName">
    
  </div>
  <div class="mb-3">
    <label class="form-label" style="font-family:monaco;font-size:30px;">Password</label>
    <input type="password" class="form-control" style="width:50%;margin-left:25%" name="password">
  </div>

  <button type="submit" class="btn btn-primary" style="width:20%; margin-top:20px;">Submit</button>
  <br>
  <label class="form-label" style="font-family:monaco;font-size:30px;">${validate_msg }</label>
</form>



</div>

</div>
</body>
</html>