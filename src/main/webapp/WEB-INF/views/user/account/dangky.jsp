<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<head>
<meta charset="UTF-8">
<title>Đăng ký</title>
</head>
<body>
	<main> <!-- Hero Area Start-->
	<div class="slider-area ">
		<div class="single-slider slider-height2 d-flex align-items-center">
			<div class="container">
				<div class="row">
					<div class="col-xl-12">
						<div class="hero-cap text-center">
							<h2>Đăng ký</h2>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Hero Area End--> <!--================login_part Area =================-->
	<section class="login_part section_padding ">
		<div class="container">
			<div class="row align-items-center">

				<div class="col-lg-6 col-md-6">
					<div class="login_part_form">
						<div class="login_part_form_iner">
							<h3>
								Welcome <br>
							</h3>
							<form:form class="row contact_form" action="dang-ky"
								method="post" modelAttribute="user" novalidate="novalidate">
								<div class="col-md-12 form-group p_star">
									<form:input type="text" class="form-control" id="name"
										name="name" value="" placeholder="Username" path="username" />
								</div>
								<div class="col-md-12 form-group p_star">
									<form:input type="password" class="form-control" id="password"
										name="password" value="" placeholder="Password"
										path="password" />
								</div>

								<div class="col-md-12 form-group p_star">
									<form:input type="text" class="form-control" id="first"
										name="name" placeholder="fullname" path="fullname" />

								</div>


								<div class="col-md-12 form-group p_star">
									<form:input type="text" class="form-control" id="number"
										name="number" placeholder="phone number" path="phone" />

								</div>
								<div class="col-md-12 form-group p_star">
									<form:input type="text" class="form-control" id="email"
										name="compemailany" placeholder="Email Address" path="email" />

								</div>

								<div class="col-md-12 form-group p_star">
									<form:input type="text" class="form-control" id="add1"
										name="add1" placeholder="Address line" path="address" />

								</div>
								<button type="submit" value="submit" class="btn_3">
									Đăng ký</button>
								<a class="lost_pass" href="#">forget password?</a>

							</form:form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================login_part end =================--> </main>
</body>
