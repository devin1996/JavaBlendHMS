<%@page import="pojo.Admin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>HMS Admin</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

</head>
<body>


<jsp:include page="navBar.jsp" />

<div style="padding-left:16px">
  <% String adminName = (String)session.getAttribute("adminName");  %>
  
  <div class="jumbotron">
  
  <h1>Health Management System</h1>      
  <p>Welcome Administrator : <%=adminName%></p>
</div>
  
</div>
			<main>
				<!-- Welcome section -->
				<section class="tm-welcome">
					<div class="row">
						<div class="col-12">
							<h2 class="tm-section-header tm-header-floating">Our Best
								Services For You</h2>
						</div>
					</div>

					<div class="row tm-welcome-row">
						<article class="col-lg-6 tm-media">
							<img src="img/doc1.jpg" alt="Welcome image"
								class="img-fluid tm-media-img" />
							<div class="tm-media-body">
								<a href="#" class="tm-article-link"><h3
										class="tm-article-title text-uppercase">Worlds' best
										doctors</h3></a>
								<p>We provide you with the best of doctors as your health is
									our priority.</p>
							</div>
						</article>
						<article class="col-lg-6 tm-media">
							<img src="img/doc3.jpg" alt="Welcome image"
								class="img-fluid tm-media-img" />
							<div class="tm-media-body">
								<a href="#" class="tm-article-link"><h3
										class="tm-article-title text-uppercase">Best services</h3></a>
								<p>We ensure our patients' comfort while they're here.</p>
							</div>
						</article>
						<article class="col-lg-6 tm-media">
							<img src="img/doc5.jpg" alt="Welcome image"
								class="img-fluid tm-media-img" />
							<div class="tm-media-body">
								<a href="#" class="tm-article-link"><h3
										class="tm-article-title text-uppercase">Speciality Care</h3></a>
								<p>We offer a variety of special care services from
									prevention to surgery.</p>
							</div>
						</article>
						<article class="col-lg-6 tm-media">
							<img src="img/phar.jpg" alt="Welcome image"
								class="img-fluid tm-media-img" />
							<div class="tm-media-body">
								<a href="#" class="tm-article-link"><h3
										class="tm-article-title text-uppercase">Pharmacy</h3></a>
								<p>To make it convenient for you, we have our pharmacy where
									you can easily get all the medicine needed.</p>
							</div>
						</article>
					</div>
				</section>
			</main>

</body>
</html>