<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<style>
.bck-grad{
/* 	background: radial-gradient(circle, rgba(158,34,195,1) 0%, rgba(125,45,253,1) 100%); */
	
background-color: #20bf55;
background-image :linear-gradient(315deg, #20bf55 0%, #01baef 74%);
}
.bn632-hover {
  width: 160px;
  font-size: 16px;
  font-weight: 600;
  color: #fff;
  cursor: pointer;
  margin: 20px;
  height: 55px;
  text-align:center;
  border: none;
  background-size: 300% 100%;
  border-radius: 50px;
  moz-transition: all .4s ease-in-out;
  -o-transition: all .4s ease-in-out;
  -webkit-transition: all .4s ease-in-out;
  transition: all .4s ease-in-out;
}

.bn632-hover:hover {
  background-position: 100% 0;
  moz-transition: all .4s ease-in-out;
  -o-transition: all .4s ease-in-out;
  -webkit-transition: all .4s ease-in-out;
  transition: all .4s ease-in-out;
}

.bn632-hover:focus {
  outline: none;
}

.bn632-hover.bn20 {
  background-image: linear-gradient(
    to right,
    #667eea,
    #764ba2,
    #6b8dd6,
    #8e37d7
  );
  box-shadow: 0 4px 15px 0 rgba(116, 79, 168, 0.75);
}
</style>
</head>
<body>

<div class="container bck-grad pt-3 ">

<a href="home"><img src="/images/home.png" style="width:2%;margin-left:90%;" /></a>
<a href="logout"><img src="/images/logout.png" style="width:2% ; margin-left:1%;" /></a>




<h1 class="text-center" style=" font-family:georgia;font-weight: bold; font-size: 50px; margin-top:4px;">${user.firmName }</h1>




<div style="margin-top:20px;">
<img src="/images/myProfile.png" style="width:25%; margin-left:10%;" />
<img src="/images/viewLedger.png" style="width:25%; margin-left:20%;" /><br>
<a href="profile"><button class="bn632-hover bn20" style="width:20%; margin-left:12%;	">My Profile</button></a>
<a href="ledger"><button class="bn632-hover bn20" style="width:20%; margin-left:25%;">View Ledger</button></a><br>







<img src="/images/addBills.png" style="width:25%; margin-left:10%;" />
<img src="/images/addReciepts.png" style="width:25%; margin-left:20%;" /><br>
<a href="addBill"><button class="bn632-hover bn20" style="width:20%; margin-left:12%;	">Add Bills</button></a>
<a href="addRec"><button class="bn632-hover bn20" style="width:20%; margin-left:25%;">Add Payments Received</button></a><br>







<img src="/images/addCustomers.png" style="width:25%; margin-left:10%;" />
<img src="/images/viewCustomers.png" style="width:25%; margin-left:20%;" /><br>
<a href="addCust"><button class="bn632-hover bn20" style="width:20%; margin-left:12%;	">Add New Customers</button></a>
<a href="viewCustomers"><button class="bn632-hover bn20" style="width:20%; margin-left:25%;">View Customers</button></a><br>

</div>

</div>
</body>
</html>