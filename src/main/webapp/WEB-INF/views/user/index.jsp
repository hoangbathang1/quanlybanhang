<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<section class="new-product-area section-padding30">
		<div class="container">
			<!-- Section tittle -->
			<div class="row">
				<div class="col-xl-12">
					<div class="section-tittle mb-70">
						<h2>Sản phẩm mới ${lismany.size() } </h2>
					</div>
				</div>
			</div>
			<div class="row">
			<c:forEach  items="${listnew}" var="item">
			<div class="col-xl-4 col-lg-4 col-md-6 col-sm-6">
					<div class="single-new-pro mb-30 text-center">
						<div class="product-img">
							<img src="<c:url value="/doan/user/assets/img/gallery/${item.imge_url}"></c:url>">
							
						</div>
						
						<div class="product-caption">
							<h3>
								<a href='<c:url value="/product/${item.id}"></c:url>'>${item.name}</a>
							</h3>
							<span>${item.price}</span>
						</div>
					</div>
				</div>
			</c:forEach>
				
				
				
			</div>
		</div>
	</section>
	<div class="popular-items section-padding30">
		<div class="container">
			<!-- Section tittle -->
			<div class="row justify-content-center">
				<div class="col-xl-7 col-lg-8 col-md-10">
					<div class="section-tittle mb-70 text-center">
						<h2>Sản phẩm nhiều người mua </h2>
					</div>
				</div>
			</div>
			<div class="row">
				<c:forEach items="${listmany}" var="item">
				<div class="col-xl-4 col-lg-4 col-md-6 col-sm-6">
					<div class="single-popular-items mb-50 text-center">
						<div class="popular-img">
							<img src="<c:url value="/doan/user/assets/img/gallery/${item.imge_url}"></c:url>" alt="">
							<div class="img-cap">
								<span><a
													href='<c:url value="/addcart?id=${item.id}&soluong=1"></c:url>'>Add
														Cart</a></span>
							</div>
							<div class="favorit-items">
								<span class="flaticon-heart"></span>
							</div>
						</div>
						<div class="popular-caption">
							<h3>
								<a href='<c:url value="/product/${item.id}"></c:url>'>${item.name }</a>
							</h3>
							<span>${item.price }</span>
						</div>
					</div>
				</div>
				
				</c:forEach>
				
				
				
				
				
			</div>
			<!-- Button -->
			<div class="row justify-content-center">
				<div class="room-btn pt-70">
					<a href='<c:url value="/category/?id=2&page=1"></c:url>' class="btn view-btn1">View More
						Products</a>
				</div>
			</div>
		</div>
	</div>

	<div class="shop-method-area">
		<div class="container">
			<div class="method-wrapper">
				<div class="row d-flex justify-content-between">
					<div class="col-xl-4 col-lg-4 col-md-6">
						<div class="single-method mb-40">
							<i class="ti-package"></i>
							<h6>Free Shipping Method</h6>
							<p>aorem ixpsacdolor sit ameasecur adipisicing elitsf edasd.</p>
						</div>
					</div>
					<div class="col-xl-4 col-lg-4 col-md-6">
						<div class="single-method mb-40">
							<i class="ti-unlock"></i>
							<h6>Secure Payment System</h6>
							<p>aorem ixpsacdolor sit ameasecur adipisicing elitsf edasd.</p>
						</div>
					</div>
					<div class="col-xl-4 col-lg-4 col-md-6">
						<div class="single-method mb-40">
							<i class="ti-reload"></i>
							<h6>Secure Payment System</h6>
							<p>aorem ixpsacdolor sit ameasecur adipisicing elitsf edasd.</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>