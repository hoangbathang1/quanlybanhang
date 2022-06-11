<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<head>
<title>Category</title>
</head>
<body>
	<section class="popular-items latest-padding">
		<div class="container">
			<div class="row product-btn justify-content-between mb-40">
				<div class="properties__button">
					<!--Nav Button  -->
					<%-- 	<nav>
						<div class="nav nav-tabs" id="nav-tab" role="tablist">
							<a class="nav-item nav-link active" id="nav-home-tab"
								data-toggle="tab" href='<c:url value="#nav-home"></c:url>' role="tab"
								aria-controls="nav-home" aria-selected="true">Mới nhất</a>
							<a class="nav-item nav-link" id="nav-profile-tab"
								data-toggle="tab" href="<c:url value="#nav-profile"></c:url>" role="tab"
								aria-controls="nav-profile" aria-selected="false">Giá từ thấp đến cao</a> <a class="nav-item nav-link" id="nav-contact-tab"
								data-toggle="tab" href="<c:url value="#nav-contact"></c:url>" role="tab"
								aria-controls="nav-contact" aria-selected="false"> Phổ biến </a>
						</div>
					</nav> --%>
					<!--End Nav Button  -->
				</div>
				<!-- Grid and List view -->
				<div class="grid-list-view"></div>
				<!-- Select items -->

			</div>
			<!-- Nav Card -->
			<div class="tab-content">
				<!-- card one -->
				<div class="tab-pane fade show active" id="nav-home" role="tabpanel"
					aria-labelledby="nav-home-tab">
					<div class="row">
						<c:forEach var="item" items="${listproduct}" varStatus="product">
							<c:if
								test="${(product.index+1 >=paginate.start) &&(product.index+1<=paginate.end)}">
								<div class="col-xl-4 col-lg-4 col-md-6 col-sm-6">
									<div class="single-popular-items mb-50 text-center">
										<div class="popular-img">

											<a href='<c:url value ="/product/${item.id}"></c:url>'><img
												src='<c:url value="/doan/user/assets/img/gallery/${item.imge_url}"></c:url>'></a>
											<div class="img-cap">
												<span> <a
													href='<c:url value="/addcart?id=${item.id}&soluong=1"></c:url>'>Add
														Cart</a>
												</span>
											</div>
											<div class="favorit-items">
												<span class="flaticon-heart"></span>
											</div>
										</div>
										<div class="popular-caption">
											<h3>
												<a href='<c:url value ="product/${item.id}"></c:url>'>${item.name}</a>
											</h3>
											<span>${item.price}</span>
										</div>
									</div>
								</div>
							</c:if>


						</c:forEach>

					</div>
				</div>
				<div class="center">
					<div class="pagination">
						<a href="#">&laquo;</a>
						<c:forEach begin="1" end="${paginate.tongso}" var="item"
							varStatus="loop">
							<a
								href='<c:url value="/category/?id=${id }&page=${item}"></c:url>'>${item}</a>
						</c:forEach>
						<a href="#">&raquo;</a>

					</div>
				</div>
				<!-- Card two -->

			</div>
			<!-- Card three -->

		</div>
		</div>
		<!-- End Nav Card -->
		</div>
	</section>

</body>
