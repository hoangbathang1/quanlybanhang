
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<head>
<meta charset="UTF-8">
<title>Check-out</title>
</head>
<body>
	<main> <!-- Hero Area Start-->
	<div class="slider-area ">
		<div class="single-slider slider-height2 d-flex align-items-center">
			<div class="container">
				<div class="row">
					<div class="col-xl-12">
						<div class="hero-cap text-center">
							<h2>Checkout</h2>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--================Checkout Area =================-->
	<section class="checkout_area section_padding">
		<div class="container">
			<div class="returning_customer">


				<c:if test="${empty account}">
					<form:form class="row contact_form" action="xuly-dang-nhap"
						method="post" novalidate="novalidate" modelAttribute="user">
						<div class="col-md-6 form-group p_star">
							<form:input type="text" class="form-control"
								placeholder="username" id="name" name="name" value=""
								path="username" />

						</div>
						<div class="col-md-6 form-group p_star">
							<form:input type="password" class="form-control" id="password"
								name="password" value="" placeholder="password" path="password" />

						</div>
						<div class="col-md-12 form-group">
							<p>${status }</p>
							<button type="submit" value="submit" class="btn_3">log
								in</button>
							<div class="creat_account">
								<input type="checkbox" id="f-option" name="selector" /> <label
									for="f-option">Remember me</label>
							</div>
							<a class="lost_pass" href="#">Lost your password?</a>
						</div>
					</form:form>
				</c:if>
			</div>
			<c:if test="${not empty account && not empty Cart }">
				<div class="billing_details">
					<div class="row">
						<div class="col-lg-8">
							<h3>Billing Details</h3>
							<form:form class="row contact_form" action="checkout"
								method="post" modelAttribute="bill" novalidate="novalidate">
								<div class="col-md-12 form-group p_star">
									<label>họ tên</label>
									<form:input type="text" class="form-control" id="first"
										name="name" placeholder="fullname" path="fullname" />

								</div>


								<div class="col-md-12 form-group p_star">
									<label>số điện thoại</label>
									<form:input type="text" class="form-control" id="number"
										name="number" placeholder="phone number" path="phone" />

								</div>
								<div class="col-md-12 form-group p_star">
									<label>email</label>
									<form:input type="text" class="form-control" id="email"
										name="compemailany" placeholder="Email Address" path="email" />

								</div>

								<div class="col-md-12 form-group p_star">
									<label>địa chỉ</label>
									<form:input type="text" class="form-control" id="add1"
										name="address" placeholder="Address line" path="address" />


								</div>




								<button type="submit" class="btn_3">Đặt Hàng</button>
							</form:form>
							
							
							
														<form:form class="row contact_form" action="checkout1"
								method="post" modelAttribute="bill1" novalidate="novalidate">
								<div class="col-md-12 form-group p_star">
									<label>họ tên</label>
									<form:input type="text" class="form-control" id="first"
										name="name" placeholder="fullname" path="fullname" />

								</div>


								<div class="col-md-12 form-group p_star">
									<label>số điện thoại</label>
									<form:input type="text" class="form-control" id="number"
										name="number" placeholder="phone number" path="phone" />

								</div>
								<div class="col-md-12 form-group p_star">
									<label>email</label>
									<form:input type="text" class="form-control" id="email"
										name="compemailany" placeholder="Email Address" path="email" />

								</div>

								<div class="col-md-12 form-group p_star">
									<label>địa chỉ</label>
									<form:input type="text" class="form-control" id="add1"
										name="address" placeholder="Address line" path="address" />


								</div>




								<button type="submit" class="btn_3">Đặt Hàng</button>
							</form:form>
						</div>
						<div class="col-lg-4">
							<div class="order_box">
								<h2>Your Order</h2>
								<ul class="list">
									<li><a href="#">Product <span>Total</span>
									</a></li>
									<c:forEach var="item" items="${Cart}">
										<li><a
											href='<c:url value="/product/${item.key}"></c:url>'>${item.value.product.name}
												<span class="middle">${item.value.soluong }</span> <span
												class="last">${item.value.total }</span>
										</a></li>
									</c:forEach>



								</ul>
								<ul class="list list_2">
									<li><a href="#">Subtotal <span>${tongtien}</span>
									</a></li>
									<li><a href="#">Shipping <span>Flat rate:
												$50.00</span>
									</a></li>
									<li><a href="#">Total <span>${tongtien +50 }</span>
									</a></li>
								</ul>




							</div>
						</div>
					</div>
				</div>
			</c:if>

		</div>
	</section>
	<!--================End Checkout Area =================--> </main>
</body>
