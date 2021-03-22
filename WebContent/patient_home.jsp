<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HMS</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">

<!-- <title>New Vision HTML CSS Template</title>-->

<link href="https://fonts.googleapis.com/css?family=Open+Sans:400,800"
	rel="stylesheet" />
<!-- https://fonts.google.com/specimen/Open+Sans?selection.family=Open+Sans -->
<link href="css/all.min.css" rel="stylesheet" />
<!-- https://fontawesome.com/ -->
<link href="slick/slick.css" rel="stylesheet" />
<!-- https://kenwheeler.github.io/slick/ -->
<link href="slick/slick-theme.css" rel="stylesheet" />
<link href="css/bootstrap.min.css" rel="stylesheet" />
<!-- https://getbootstrap.com -->
<link href="css/templatemo-new-vision.css" rel="stylesheet" />
</head>
<body>
	<jsp:include page="navBarPatiernt.jsp" />
	<!-- Page Header -->
	<div class="container-fluid">
		<div class="tm-site-header">
			<div class="row">
				<div class="col-12 tm-site-header-col">
					<div class="tm-site-header-left">
						<!-- <i class="far fa-2x fa-eye tm-site-icon"></i>-->
						<h1 class="tm-site-name">Hospital Management System</h1>
						<%
							String adminName = (String) session.getAttribute("patName");
						%>
						
						<h3>Welcome : <%=adminName%></h3>
					</div>
					<div class="tm-site-header-right tm-menu-container-outer"></div>
				</div>
			</div>
		</div>



		<div style="padding-left: 16px">

			<div class="row">
				<div class="col-12">
					<div class="tm-main-bg"></div>
				</div>
			</div>

			<!-- Main -->
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
		</div>
		<script src="js/jquery-3.4.1.min.js"></script>
		<script src="slick/slick.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/templatemo-script.js"></script>
</body>
</html>