<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib  prefix="s" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Receipt Summary</title>
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

<a href="user"><img src="/images/home.png" style="width:2%;margin-left:90%;" /></a>
<a href="logout"><img src="/images/logout.png" style="width:2% ; margin-left:1%;" /></a>


<h1 style=" font-family:georgia;font-weight: bold; font-size: 70px; margin-top:4px;">Receipt Summary</h1>

<div class="form-bck" >
<div style="width:100%;height:10%"></div>

<table class="table table-bordered mt-10" style="width:80%;margin-left:10%;border-color:black;">
<tr>
<td colspan="2">${user.firmName }</td>

</tr>
<tr>
<td>Receipt Number</td>
<td>${recId}</td>
</tr>
<tr>
<td>Customer Id</td>
<td>${rec.custId}  </td>
</tr>

<tr>
<td>Amount</td>
<td>${rec.amount}</td>
</tr>

<tr>
<td>Date</td>
<td>${rec.date}</td>
</tr>
</table>
<s:form method="get"  action="updtRec">
<button type="submit" class="btn btn-primary" style="width:20%; margin-top:20px;margin-bottom:5%;" >Update</button>
</s:form>
</div>
</div>
</body>
</html>