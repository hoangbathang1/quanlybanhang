<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title><decorator:title></decorator:title></title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="manifest" href="site.webmanifest">
<link rel="shortcut icon" type="image/x-icon"
	href=" <c:url value="/doan/user/assets/img/favicon.ico"></c:url>">

<!-- CSS here -->
<link rel="stylesheet"
	href="<c:url value="/doan/user/assets/css/bootstrap.min.css"></c:url>">
<link rel="stylesheet"
	href="<c:url value="/doan/user/assets/css/owl.carousel.min.css"></c:url>">
<link rel="stylesheet"
	href=" <c:url value="/doan/user/assets/css/flaticon.css"></c:url>">
<link rel="stylesheet"
	href="<c:url value="/doan/user/assets/css/slicknav.css"></c:url> ">
<link rel="stylesheet"
	href=" <c:url value="/doan/user/assets/css/animate.min.css"></c:url>">
<link rel="stylesheet"
	href=" <c:url value="/doan/user/assets/css/magnific-popup.css"></c:url>">
<link rel="stylesheet"
	href=" <c:url value="/doan/user/assets/css/fontawesome-all.min.css"></c:url>">
<link rel="stylesheet"
	href=" <c:url value="/doan/user/assets/css/themify-icons.css"></c:url>">
<link rel="stylesheet"
	href=" <c:url value="/doan/user/assets/css/slick.css"></c:url>">
<link rel="stylesheet"
	href=" <c:url value="/doan/user/assets/css/nice-select.css"></c:url>">
<link rel="stylesheet"
	href=" <c:url value="/doan/user/assets/css/style.css"></c:url>">
</head>
<body>

	<%@ include file="/WEB-INF/views/layout/user/header.jsp"%>
	<decorator:body></decorator:body>
	<%@ include file="/WEB-INF/views/layout/user/footer.jsp"%>

	<script
		src="<c:url value="/doan/user/assets/js/vendor/modernizr-3.5.0.min.js"></c:url>"></script>
	<!-- Jquery, Popper, Bootstrap -->
	<script
		src="<c:url value="/doan/user/assets/js/vendor/jquery-1.12.4.min.js"></c:url>"></script>
	<script
		src="<c:url value="/doan/user/assets/js/popper.min.js"></c:url>"></script>
	<script
		src="<c:url value="/doan/user/assets/js/bootstrap.min.js"></c:url>"></script>
	<!-- Jquery Mobile Menu -->
	<script
		src="<c:url value="/doan/user/assets/js/jquery.slicknav.min.js"></c:url>"></script>

	<!-- Jquery Slick , Owl-Carousel Plugins -->
	<script
		src="<c:url value="/doan/user/assets/js/owl.carousel.min.js"></c:url>"></script>
	<script src="<c:url value="/doan/user/assets/js/slick.min.js"></c:url>"></script>

	<!-- One Page, Animated-HeadLin -->
	<script src="<c:url value="/doan/user/assets/js/wow.min.js"></c:url>"></script>
	<script
		src="<c:url value="/doan/user/assets/js/animated.headline.js"></c:url>"></script>
	<script
		src="<c:url value="/doan/user/assets/js/jquery.magnific-popup.js"></c:url>"></script>

	<!-- Scrollup, nice-select, sticky -->
	<script
		src="<c:url value="/doan/user/assets/js/jquery.scrollUp.min.js"></c:url>"></script>
	<script
		src="<c:url value="/doan/user/assets/js/jquery.nice-select.min.js"></c:url>"></script>
	<script
		src="<c:url value="/doan/user/assets/js/jquery.sticky.js"></c:url>"></script>

	<!-- contact js -->
	<script src="<c:url value="/doan/user/assets/js/contact.js"></c:url>"></script>
	<script
		src="<c:url value="/doan/user/assets/js/jquery.form.js"></c:url>"></script>
	<script
		src="<c:url value="/doan/user/assets/js/jquery.validate.min.js"></c:url>"></script>
	<script
		src="<c:url value="/doan/user/assets/js/mail-script.js"></c:url>"></script>
	<script
		src="<c:url value="/doan/user/assets/js/jquery.ajaxchimp.min.js"></c:url>"></script>

	<!-- Jquery Plugins, main Jquery -->
	<script src="<c:url value="/doan/user/assets/js/plugins.js"></c:url>"></script>
	<script src="<c:url value="/doan/user/assets/js/main.js"></c:url>"></script>
	<decorator:getProperty property="page.script"></decorator:getProperty>
</body>
</html>
