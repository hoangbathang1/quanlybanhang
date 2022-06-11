<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<meta charset="UTF-8">
<title>Insert title here</title>
<head>
<style>
.pagination {
	display: inline-block;
}

.pagination a {
	color: black;
	float: left;
	padding: 8px 16px;
	text-decoration: none;
}

.pagination a.active {
	background-color: #4CAF50;
	color: white;
	border-radius: 5px;
}

.pagination a:hover:not (.active ) {
	background-color: #ddd;
	border-radius: 5px;
}
</style>
</head>

<body>
	<main> <!-- Hero Area Start-->
	<div class="slider-area ">
		<div class="single-slider slider-height2 d-flex align-items-center">
			<div class="container">
				<div class="row">
					<div class="col-xl-12">
						<div class="hero-cap text-center">
							<h2>Watch Shop</h2>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Hero Area End--> <!--================Single Product Area =================-->
	<div class="product_image_area">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-lg-12">
					<
					<div style="margin-left: 500px;">
						<img
							src='<c:url value="/doan/user/assets/img/gallery/${product.imge_url}"></c:url>'
							class="img-fluid">
					</div>



				</div>
				<div class="col-lg-8">
					<div class="single_product_text text-center">
						<h3>${product.name }</h3>
						<p>${product.description }</p>
						<div class="card_area">
							<div class="product_count_area">
								<p>Quantity</p>
								<div class="product_count d-inline-block">
									<span class="product_count_item inumber-decrement"> <i
										class="ti-minus"></i></span> <input id="soluong-${product.id }"
										class="product_count_item input-number" type="text" value="1"
										min="0" max="100"> <span
										class="product_count_item number-increment"> <i
										class="ti-plus"></i></span>
								</div>
								<p>${product.price }</p>
							</div>
							<div class="add_to_cart">
								<button data-id="${product.id }" class="btn_3 add-cart">ADD
									TO CART</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--================End Single Product Area =================--> <!-- subscribe part here -->

	<!-- subscribe part end --> </main>
	<content tag="script"> <script>
	$(".add-cart").on("click",function(){
		var id = $(this).data("id");
		var soluong = $("#soluong-"+id).val();
		window.location = "${pageContext.request.contextPath}/addcart?id="+id +"&soluong="+soluong;
	});
	</script> </content>
</body>
