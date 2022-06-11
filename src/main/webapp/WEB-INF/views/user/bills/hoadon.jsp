<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<head>
<meta charset="UTF-8">
<title>Hoa Don</title>
</head>
<body>
	<h1>${status }</h1>
	<main> <!-- Hero Area Start-->
	<div class="slider-area ">
		<div class="single-slider slider-height2 d-flex align-items-center">
			<div class="container">
				<div class="row">
					<div class="col-xl-12">
						<div class="hero-cap text-center">
							<h2>Hoa Don</h2>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--================Cart Area =================--> <c:if
		test="${listbill.size()>0 }">
		<section class="cart_area section_padding">
			<div class="container">
				<div class="cart_inner">
					<div class="table-responsive">
						<table class="table">
							<thead>
								<tr>
									<th scope="col">Ma HD</th>
									<th scope="col">Ngay mua</th>
									<th scope="col">Ho ten</th>
									<th scope="col">So dien thoai</th>
									<th scope="col">Email</th>
									<th scope="col">Dia chi</th>
									<th scope="col">Gia</th>
									<th scope="col">Trang thai</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="item" items="${listbill}">
									<tr>
										<td>
											<div class="media">
												<div class="media-body">
													<p>${item.id}</p>
												</div>
											</div>
										</td>
										<td>
											<h5>${item.create_date }</h5>
										</td>
										<td>
											<h5>${item.fullname }</h5>
										</td>
										<td>
											<h5>${item.phone }</h5>
										</td>
										<td><h5>${item.email}</h5></td>
										<td><h5>${item.address }</h5></td>
										<td><h5>${item.price }</h5></td>
										<td><h5>${item.status }</h5></td>

									</tr>
								</c:forEach>





							</tbody>
						</table>

					</div>
				</div>
		</section>

	</c:if> <c:if test="${empty listbill }">
		<p>Moi ban dang nhap</p>
	</c:if> <!--================End Cart Area =================--> </main>
</body>
