	
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<main class="app-content">
	<div class="modal-dialog modal-dialog-centered" role="document">
		<div class="modal-content">

			<div class="modal-body">
				<div class="row">
					<div class="form-group  col-md-12">
						<span class="thong-tin-thanh-toan">
							<h5>Thêm danh mục</h5>
						</span>
					</div>
				</div>
				<div class="row">
				
					<form:form class="form-group col-md-6" action="sua-danhmuc" modelAttribute="danhmuc" method="post">
						<label class="control-label">Tên danh mục</label> 
							<form:input type="number" class="form-control" id="id"
										name="id"  path="id" />
						<form:input type="text" class="form-control" id="name"
										name="name" value="" placeholder="tên danh mục" path="name" />
										
								<button class="btn btn-save" type="submit" value="submit">Sửa</button>
					</form:form>
					
									
					
				</div>
			
				
				<a class="btn btn-cancel" data-dismiss="modal" href="${pageContext.request.contextPath}/admin/home">Hủy bỏ</a> <BR>
			</div>
			<div class="modal-footer"></div>
		</div>
	</div>
	</main>
