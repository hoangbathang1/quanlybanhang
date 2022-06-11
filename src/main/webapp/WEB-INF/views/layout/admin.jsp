<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<head>
<meta charset="UTF-8">
<title><decorator:title></decorator:title></title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/doan/admin/doc/css/main.css"></c:url>">
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">
        <!-- or -->
        <link rel="stylesheet" href="https://unpkg.com/boxicons@latest/css/boxicons.min.css">
      
        <!-- Font-icon css-->
        <link rel="stylesheet" type="text/css"
          href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
      
</head>
<body class="app sidebar-mini rtl">
	
		<%@ include file="/WEB-INF/views/layout/admin/header.jsp"%>
	
		<decorator:body></decorator:body>

		<%@ include file="/WEB-INF/views/layout/admin/footer.jsp"%>
		<decorator:getProperty property="page.script"></decorator:getProperty>
	



	
		

  <!--===============================================================================================-->
  <script src="<c:url value="/doan/admin/doc/js/popper.min.js "></c:url>"></script>

  <!--===============================================================================================-->
  <script src="<c:url value="/doan/admin/doc/js/bootstrap.min.js"></c:url>"></script>
  <!--===============================================================================================-->
  <script src="<c:url value="/doan/admin/doc/js/main.js"></c:url>"></script>
  <!--===============================================================================================-->
  <script src="<c:url value="/doan/admin/doc/js/plugins/pace.min.js"></c:url>"></script>
  <!--===============================================================================================-->
  <script type="text/javascript" src="<c:url value="/doan/admin/doc/js/plugins/chart.js"></c:url>"></script>
  
  
     <script src="<c:url value="/doan/admin/doc/js/jquery-3.2.1.min.js "></c:url>"></script>
    <script src="<c:url value="/doan/admin/doc/js/jquery-3.2.1.min.js"></c:url>"></script>

    
  



    <!-- Data table plugin-->
    <script type="text/javascript" src="<c:url value="/doan/admin/doc/js/plugins/jquery.dataTables.min.js"></c:url>"></script>
    <script type="text/javascript" src="<c:url value="/doan/admin/doc/js/plugins/dataTables.bootstrap.min.js"></c:url>"></script>
</body>
