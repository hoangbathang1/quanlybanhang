	
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
							<h5>Thêm Sản phẩm</h5>
						</span>
					</div>
				</div>
				<div class="row">
				
				
					<form:form class="form-group col-md-6" action="them-product" modelAttribute="product" method="post">
					
									
										<label class="control-label">Tên sản phẩm</label> 
										<form:input type="text" class="form-control" id="name"
										name="name"  path="name" />	
										<label class="control-label">Giá</label> 
											<form:input type="text" class="form-control" id="price"
										name="price"  path="price" />	
										<label class="control-label">Số lượng</label> 	
											<form:input type="text" class="form-control" id="quantity"
										name="number"  path="quantity" />
										<label class="control-label">Mô tả</label> 	
											<form:input type="text" class="form-control" id="description"
										name="description"  path="description" />	
										<label class="control-label">Ảnh</label> 
											<form:input type="text" class="form-control" id="img_url"
										name="img_url"  path="imge_url" />	
										
										<label class="control-label">ID người mua</label> 
											<form:input type="number" class="form-control" id="category_id"
										name="category_id"  path="category_id" />			
					
										
								<button class="btn btn-save" type="submit" value="submit">thêm</button>
					</form:form>
					
									
					
				</div>
			
				
				<a class="btn btn-cancel" data-dismiss="modal" href="${pageContext.request.contextPath}/admin/home">Hủy bỏ</a> <BR>
			</div>
			<div class="modal-footer"></div>
		</div>
	</div>
	</main>
