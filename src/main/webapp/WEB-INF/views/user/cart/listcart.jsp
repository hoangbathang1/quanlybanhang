<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<main> <!-- Hero Area Start-->
	<div class="slider-area ">
		<div class="single-slider slider-height2 d-flex align-items-center">
			<div class="container">
				<div class="row">
					<div class="col-xl-12">
						<div class="hero-cap text-center">
							<h2>Cart List</h2>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--================Cart Area =================-->
	<section class="cart_area section_padding">
		<div class="container">
			<div class="cart_inner">
				<div class="table-responsive">
					<table class="table">
						<thead>
							<tr>
								<th scope="col">Product</th>
								<th scope="col">Price</th>
								<th scope="col">Quantity</th>
								<th scope="col">Total</th>
								<th scope="col">Update</th>
								<th scope="col">Delete</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="item" items="${Cart}" varStatus="loop">
								<tr>
									<td>
										<div class="media">
											<div class="d-flex">
												<img
													src='<c:url value="/doan/user/assets/img/gallery/${item.value.product.imge_url }"></c:url>' />
											</div>
											<div class="media-body">
												<p>${item.value.product.name}</p>
											</div>
										</div>
									</td>
									<td>
										<h5>${item.value.product.price }</h5>
									</td>
									<td>
										<div class="product_count">
											<span class="input-number-decrement"> <i
												class="ti-minus"></i></span> <input id="soluong-${item.key }"
												class="input-number" type="text"
												value="${item.value.soluong }" min="0" max="10"> <span
												class="input-number-increment"> <i class="ti-plus"></i></span>
										</div>
									</td>
									<td>
										<h5>${item.value.total }</h5>
									</td>
									<td><button data-id="${item.key}" class="btn_3 update "
											type="button">
											<span class="icon-edit">Update</span>
										</button></td>
									<td><a class="btn_3" type="button"
										href='<c:url value="/deletecart?id=${item.key}"/>'><span>Delete</span>
									</a></td>
								</tr>
							</c:forEach>



							<tr>
								<td></td>
								<td></td>
								<td>
									<h5>Subtotal</h5>
								</td>
								<td>
									<h5>${tongtien }</h5>
								</td>
							</tr>

						</tbody>
					</table>
					<div class="checkout_btn_inner float-right">
						<a class="btn_1" href="trang-chu">Tiep tuc mua hang</a> <a
							class="btn_1 checkout_btn_1" href="hoa-don">Hoa don</a> <a
							class="btn_1 checkout_btn_1" href="checkout">tien hanh
							checkout</a>
					</div>
				</div>
			</div>
	</section>
	<!--================End Cart Area =================--> </main>
	<content tag="script"> <script>
	$(".update").on("click",function(){
		var id = $(this).data("id");
		var soluong = $("#soluong-"+id).val();
		window.location = "${pageContext.request.contextPath}/editcart?id="+id +"&soluong="+soluong;
	});
	</script></content>





</body>

