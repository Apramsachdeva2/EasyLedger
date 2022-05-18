<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

}

h2{
font-family:Lucida Handwriting;
font-size:60px;
padding-top:px;

}
button {
 cursor: pointer;
 font-weight: 700;
 font-family: Helvetica,"sans-serif";
 transition: all .2s;
 padding: 10px 20px;
 border-radius: 100px;
 background: #cfef00;
 border: 1px solid transparent;
 display: flex;
 align-items: center;
 font-size: 15px;
}

button:hover {
 background: #a6c900;
}

button > svg {
 width: 34px;
 margin-left: 10px;
 transition: transform .3s ease-in-out;
}

button:hover svg {
 transform: translateX(5px);
}

button:active {
 transform: scale(0.95);
}
</style>
</head>
<body>



<div class="container bck-grad pt-3 text-center">



<h1 style=" font-family:georgia;font-weight: bold; font-size: 70px; margin-top:4px;">Easy Ledger Application</h1>
<br><br>




<img src="/images/img2.png" style="margin-top:0px; padding-top:0px; width:50%;"/>
<br><br><br>
<h2 >Account Keeping Made Easier Now!! </h2>


<!-- ********************************************************************** -->
<!-- Buton -->
<div style="margin-left:45%; margin-top:20px; padding-bottom:15px;"> 
<form method="get" action="login">
<button>
  <span>Get Started</span>
  <svg width="70" height="50" viewBox="0 0 74 74" fill="none" >
    <circle cx="37" cy="37" r="35.5" stroke="black" stroke-width="3"></circle>
    <path d="M25 35.5C24.1716 35.5 23.5 36.1716 23.5 37C23.5 37.8284 24.1716 38.5 25 38.5V35.5ZM49.0607 38.0607C49.6464 37.4749 49.6464 36.5251 49.0607 35.9393L39.5147 26.3934C38.9289 25.8076 37.9792 25.8076 37.3934 26.3934C36.8076 26.9792 36.8076 27.9289 37.3934 28.5147L45.8787 37L37.3934 45.4853C36.8076 46.0711 36.8076 47.0208 37.3934 47.6066C37.9792 48.1924 38.9289 48.1924 39.5147 47.6066L49.0607 38.0607ZM25 38.5L48 38.5V35.5L25 35.5V38.5Z" fill="black"></path>
  </svg>
</button>
</form>
</div>
<!-- ********************************************************************************** -->


<div class="card" style="width: 60%; margin-left:20%; margin-top:10px;">
<img src="/images/img3.png" class="card-img-top" alt="cutomersImg">
  <div class="card-body">
    <h3 class="card-title">Save Your Customers to maintain their accounts </h3>
    <p class="card-text"></p>
<!--     <a href="#" class="btn btn-primary">Go somewhere</a> -->
  </div>
</div>


<div class="card" style="width: 60%; margin-left:20%;pink;margin-top:10px;">
 <img src="/images/img4.jpg" class="card-img-top" alt="transactionsImg">
  <div class="card-body">
    <h3 class="card-title">Enter the Bill/Receipt for your customers</h3>
    <p class="card-text"></p>
<!--     <a href="#" class="btn btn-primary">Go somewhere</a> -->
  </div>
</div>


<div class="card" style="width: 60%; margin-left:20%;margin-top:10px;">
<img src="/images/img5.png" class="card-img-top" alt="InsightsImg"> 
  <div class="card-body">
    <h3 class="card-title">Valuable Consolidated Insights are just a few clicks away!!</h3>
    <p class="card-text"></p>
<!--     <a href="#" class="btn btn-primary">Go somewhere</a> -->
  </div>
</div>
</div>

</body>
</html>