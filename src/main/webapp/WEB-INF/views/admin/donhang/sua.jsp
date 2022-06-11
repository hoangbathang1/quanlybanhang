	
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
							<h5>Sửa Hóa Đơn</h5>
						</span>
					</div>
				</div>
				<div class="row">
				
				
					<form:form class="form-group col-md-6" action="sua-hoadon" modelAttribute="donhang" method="post">
						<label class="control-label">Mã đơn hàng</label> 
							<form:input type="number" class="form-control" id="id"
										name="id"  path="id" />
									
										<label class="control-label">trạng thái</label> 
										<form:input type="text" class="form-control" id="status"
										name="status"  path="status" />	
										<label class="control-label">Giá</label> 
											<form:input type="text" class="form-control" id="price"
										name="price"  path="price" />	
										<label class="control-label">Địa chỉ</label> 	
											<form:input type="text" class="form-control" id="address"
										name="address"  path="address" />
										<label class="control-label">Email</label> 	
											<form:input type="email" class="form-control" id="email"
										name="email"  path="email" />	
										<label class="control-label">Điện thoại</label> 
											<form:input type="text" class="form-control" id="phone"
										name="phone"  path="phone" />	
										<label class="control-label">Họ tên</label> 
											<form:input type="text" class="form-control" id="fullname"
										name="fullname"  path="fullname" />	
										<label class="control-label">ID người mua</label> 
											<form:input type="text" class="form-control" id="user_id"
										name="user_id"  path="user_id" />			
					
										
								<button class="btn btn-save" type="submit" value="submit">Sửa</button>
					</form:form>
					
									
					
				</div>
			
				
				<a class="btn btn-cancel" data-dismiss="modal" href="${pageContext.request.contextPath}/admin/home">Hủy bỏ</a> <BR>
			</div>
			<div class="modal-footer"></div>
		</div>
	</div>
	</main>
