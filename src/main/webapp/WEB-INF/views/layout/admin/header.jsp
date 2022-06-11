<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<header class="app-header">
    <!-- Sidebar toggle button--><a class="app-sidebar__toggle" href="#" data-toggle="sidebar"
      aria-label="Hide Sidebar"></a>
    <!-- Navbar Right Menu-->
    <ul class="app-nav">


      <!-- User Menu-->
      <li><a class="app-nav__item" href='<c:url value="/admindangxuat"></c:url>'>Đăng xuất<i class='bx bx-log-out bx-rotate-180'></i> </a>

      </li>
    </ul>
  </header>
<div class="app-sidebar__overlay" data-toggle="sidebar"></div>
  <aside class="app-sidebar">
    <div class="app-sidebar__user"><img class="app-sidebar__user-avatar" src="/images/hay.jpg" width="50px"
        alt="User Image">
      <div>
        <p class="app-sidebar__user-name"><b>ADMIN</b></p>
        <p class="app-sidebar__user-designation">Chào mừng bạn trở lại</p>
      </div>
    </div>
    <hr>
    <ul class="app-menu">
      <li><a class="app-menu__item haha" href="${pageContext.request.contextPath}/admin/home"><i class='app-menu__icon bx bx-cart-alt'></i>
          <span class="app-menu__label">Trang chính</span></a></li>
    
      <li><a class="app-menu__item " href="${pageContext.request.contextPath}/admin/danhmuc"><i class='app-menu__icon bx bx-id-card'></i>
          <span class="app-menu__label">Quản lý Danh Mục</span></a></li>
          
      <li><a class="app-menu__item " href="${pageContext.request.contextPath}/admin/khachhang"><i class='app-menu__icon bx bx-user-voice'></i><span
            class="app-menu__label">Quản lý khách hàng</span></a></li>
      <li><a class="app-menu__item active" href="${pageContext.request.contextPath}/admin/product"><i
            class='app-menu__icon bx bx-purchase-tag-alt'></i><span class="app-menu__label">Quản lý sản phẩm</span></a>
      </li>
      <li><a class="app-menu__item" href="${pageContext.request.contextPath}/admin/donhang"><i class='app-menu__icon bx bx-task'></i><span
            class="app-menu__label">Quản lý đơn hàng</span></a></li>
    
      
      <li><a class="app-menu__item" href="${pageContext.request.contextPath}/admin/doanhthu"><i
            class='app-menu__icon bx bx-pie-chart-alt-2'></i><span class="app-menu__label">Báo cáo doanh thu</span></a>
      </li>
      
    
    </ul>
  </aside>
