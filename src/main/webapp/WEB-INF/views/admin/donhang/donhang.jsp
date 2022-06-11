
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<main class="app-content">
	<div class="app-title">
		<ul class="app-breadcrumb breadcrumb side">
			<li class="breadcrumb-item active"><a href="#"><b>Danh
						sách Đơn hàng</b></a></li>
		</ul>
		<div id="clock"></div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<div class="tile">
				<div class="tile-body">
					<div class="row element-button">
						<div class="col-sm-2">

							<a class="btn btn-add btn-sm" href="form-add-san-pham.html"
								title="Thêm"><i class="fas fa-plus"></i> Tạo Đơn hàng</a>
						</div>
						

						
					

						
					</div>
					<table class="table table-hover table-bordered" id="sampleTable">
						<thead>
							<tr>
								
								<th>Mã Đơn hàng</th>
								<th>Ngày đặt hàng</th>
								<th>Trạng thái</th>
								<th>Giá</th>
								<th>Địa chỉ</th>
								<th>Phone</th>
								<th>Email</th>
								<th>Fullname</th>
								<th>ID khách đặt</th>
								<th>Chức Năng</th>
							</tr>
						</thead>
						<tbody>





							<c:forEach var="item" items="${donhang }">
							
							<tr>
								
								<td>${item.id }</td>
								<td>${item.create_date}</td>
								<td>${item.status}</td>
								<td>${item.price }</td>
								<td>${item.address }</td>
								<td>${item.email }</td>
								<td>${item.phone }</td>
								<td>${item.fullname }</td>
								<td>${item.user_id }</td>
								<td><a class="btn btn-primary btn-sm trash" href="${pageContext.request.contextPath}/admin/donhang/xoa/${item.id }"><i class="fas fa-trash-alt"></i></a>
										 <a class="btn btn-primary btn-sm edit" href="${pageContext.request.contextPath}/admin/donhang/sua/${item.id }"><i class="fas fa-edit"></i></a>
									</td>
							</tr>
							</c:forEach>









						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		function openModal() {
			$('#show-emp').modal('show');
		}
	</script>
</main>

<!--
  MODAL
-->
<div class="modal fade" id="ModalUP" tabindex="-1" role="dialog"
	aria-hidden="true" data-backdrop="static" data-keyboard="false">
	<div class="modal-dialog modal-dialog-centered" role="document">
		<div class="modal-content">

			<div class="modal-body">
				<div class="row">
					<div class="form-group  col-md-12">
						<span class="thong-tin-thanh-toan">
							<h5>Chỉnh sửa thông tin sản phẩm cơ bản</h5>
						</span>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md-6">
						<label class="control-label">Mã sản phẩm </label> <input
							class="form-control" type="number" value="71309005">
					</div>
					<div class="form-group col-md-6">
						<label class="control-label">Tên sản phẩm</label> <input
							class="form-control" type="text" required
							value="Bàn ăn gỗ Theresa">
					</div>
					<div class="form-group  col-md-6">
						<label class="control-label">Số lượng</label> <input
							class="form-control" type="number" required value="20">
					</div>
					<div class="form-group col-md-6 ">
						<label for="exampleSelect1" class="control-label">Tình
							trạng sản phẩm</label> <select class="form-control" id="exampleSelect1">
							<option>Còn hàng</option>
							<option>Hết hàng</option>
							<option>Đang nhập hàng</option>
						</select>
					</div>
					<div class="form-group col-md-6">
						<label class="control-label">Giá bán</label> <input
							class="form-control" type="text" value="5.600.000">
					</div>
					<div class="form-group col-md-6">
						<label for="exampleSelect1" class="control-label">Danh mục</label>
						<select class="form-control" id="exampleSelect1">
							<option>Bàn ăn</option>
							<option>Bàn thông minh</option>
							<option>Tủ</option>
							<option>Ghế gỗ</option>
							<option>Ghế sắt</option>
							<option>Giường người lớn</option>
							<option>Giường trẻ em</option>
							<option>Bàn trang điểm</option>
							<option>Giá đỡ</option>
						</select>
					</div>
				</div>
				<BR> <a href="#"
					style="float: right; font-weight: 600; color: #ea0000;">Chỉnh
					sửa sản phẩm nâng cao</a> <BR> <BR>
				<button class="btn btn-save" type="button">Lưu lại</button>
				<a class="btn btn-cancel" data-dismiss="modal" href="#">Hủy bỏ</a> <BR>
			</div>
			<div class="modal-footer"></div>
		</div>
	</div>
</div>