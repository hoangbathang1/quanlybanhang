<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<head>
<style>
.center {
	text-align: center;
}

.pagination {
	display: inline-block;
}

.pagination a {
	color: black;
	float: left;
	padding: 8px 16px;
	text-decoration: none;
	transition: background-color .3s;
	border: 1px solid #ddd;
	margin: 0 4px;
}

.pagination a.active {
	background-color: #4CAF50;
	color: white;
	border: 1px solid #4CAF50;
}

.pagination a:hover:not (.active ) {
	background-color: #ddd;
}
</style>
</head>

<body>
	<!--? Preloader Start -->
	<div id="preloader-active">
		<div
			class="preloader d-flex align-items-center justify-content-center">
			<div class="preloader-inner position-relative">
				<div class="preloader-circle"></div>
				<div class="preloader-img pere-text">
					<img
						src=" <c:url value="/doan/user/assets/"></c:url>assets/img/logo/logo.png"
						alt="">
				</div>
			</div>
		</div>
	</div>
	<!-- Preloader Start -->
	<header>
		<!-- Header Start -->
		<div class="header-area">
			<div class="main-header header-sticky">
				<div class="container-fluid">
					<div class="menu-wrapper">
						<!-- Logo -->
						<div class="logo">
							<a href="index.html"><img
								src=" <c:url value="/doan/user/assets/img/logo/logo.png"></c:url>"
								alt=""></a>
						</div>
						<!-- Main-menu -->
						<div class="main-menu d-none d-lg-block">
							<nav>
                                
								<ul id="navigation">
									<li><a href="#">Danh mục</a>
										<ul class="submenu">
										
											<c:forEach var="item" items="${category}">
												<li><a
													href='<c:url value="/category/?id=${item.id}&page=1"></c:url>'>${item.name}</a></li>
											</c:forEach>

										</ul></li>
									<c:forEach var="item" items="${Menus}">
										<li><a href='<c:url value="/${item.url}"></c:url>'>${item.name}</a></li>
									</c:forEach>
								</ul>
							</nav>
						</div>
						<!-- Header Right -->
						<div class="header-right">
							<ul>
								<li>
									<div class="nav-search search-switch">
										<span class="flaticon-search"></span>
									</div>
								</li>
								<c:if test="${not empty account }">
									<li><a href="login.html"><span class="flaticon-user"></span></a></li>
									<li><a href='<c:url value="/dang-xuat"></c:url>'><span>Đăng
												Xuất</span></a></li>

								</c:if>
								<c:if test="${empty account }">
									<li><a href='<c:url value="/dang-nhap"></c:url>'><span>Đăng
												nhập</span></a></li>
								</c:if>
								<li><a href='<c:url value="/dang-ky"></c:url>'><span>Đăng
											Ký</span></a></li>


								<li>${soluong}<a href='<c:url value="/gio-hang"></c:url>'><span
										class="flaticon-shopping-cart">${tongtien}</span></a></li>
							</ul>
						</div>
					</div>
					<!-- Mobile Menu -->
					<div class="col-12">
						<div class="mobile_menu d-block d-lg-none"></div>
					</div>
				</div>
			</div>
		</div>
		<!-- Header End -->
	</header>

</body>
