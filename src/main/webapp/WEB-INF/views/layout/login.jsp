<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<head>
    <title>Đăng nhập quản trị</title>
    <meta charset="UTF-8">


    <link rel="stylesheet" type="text/css" href='<c:url value="/doan/admin/css/util.css"></c:url>'>
    <link rel="stylesheet" type="text/css" href="<c:url value="/doan/admin/css/main.css"></c:url>">
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">


    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
</head>

<body>
    <div class="limiter">
        <div class="container-login100">
            <div class="wrap-login100">
                <div class="login100-pic js-tilt" data-tilt>
                    <img src="<c:url value="/doan/admin/images/team.jpg"></c:url>" alt="IMG">
                </div>
                <!--=====TIÊU ĐỀ======-->
                <div class="login100-form validate-form">
                    <span class="login100-form-title">
                        <b>ĐĂNG NHẬP HỆ THỐNG POS</b>
                    </span>
                    <!--=====FORM INPUT TÀI KHOẢN VÀ PASSWORD======-->
                    <form:form action="dang--nhap" method="post" modelAttribute="user">
                        <div class="wrap-input100 validate-input">
                            <form:input class="input100" type="text" placeholder="Tài khoản quản trị" name="username"
                                id="username" path="name"/>
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <i class='bx bx-user'></i>
                            </span>
                        </div>
                        <div class="wrap-input100 validate-input">
                            <form:input autocomplete="off" class="input100" type="password" placeholder="Mật khẩu"
                                name="current-password" id="password-field" path="password"/>
                            <span toggle="#password-field" class="bx fa-fw bx-hide field-icon click-eye"></span>
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <i class='bx bx-key'></i>
                            </span>
                        </div>

                        <!--=====ĐĂNG NHẬP======-->
                        <div class="container-login100-form-btn">
                            <button type="submit" value="submit" class="btn_3">
										Đăng nhập</button>
                        </div>
                       
                        
                    </form:form>
                    <!--=====FOOTER======-->
                    <div class="text-center p-t-70 txt2">
                        Phần mềm quản lý bán hàng <i class="far fa-copyright" aria-hidden="true"></i>
                      
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--Javascript-->



    
</body>
