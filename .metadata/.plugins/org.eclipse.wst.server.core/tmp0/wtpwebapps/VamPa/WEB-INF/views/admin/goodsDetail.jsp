<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Insert title here</title>
<link rel="stylesheet" href="../resources/css/admin/goodsDetail.css">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" />
	
<link rel="stylesheet" href="../resources/css/main1.css">
<link rel="stylesheet"
	href="../resources/css/bootstrap4.4.1/bootstrap.min.css">
<script src="../resources/js/main.js" defer></script>	
<script src="https://code.jquery.com/jquery-3.4.1.js"
	integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
	crossorigin="anonymous"></script>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="//code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
</head>
</head>
<body>

	<%@include file="../includes/admin/header.jsp"%>

	<div class="content_area">
		<div class="section__container2">
			<div class="admin_content_wrap">
				<div class="admin_content_subject">
					<span>상품 상세</span>
				</div>

				<div class="admin_content_main">

					<div class="form_section">
						<div class="form_section_title">
							<label>상품 이름</label>
						</div>
						<div class="form_section_content">
							<input name="bookName"
								value="<c:out value="${goodsInfo.bookName}"/>" disabled>
						</div>
					</div>
					<div class="form_section">
						<div class="form_section_title">
							<label>등록 날짜</label>
						</div>
						<div class="form_section_content">
							<input
								value="<fmt:formatDate value='${goodsInfo.regDate}' pattern='yyyy-MM-dd'/>"
								disabled>
						</div>
					</div>
					<div class="form_section">
						<div class="form_section_title">
							<label>최근 수정 날짜</label>
						</div>
						<div class="form_section_content">
							<input
								value="<fmt:formatDate value='${goodsInfo.updateDate}' pattern='yyyy-MM-dd'/>"
								disabled>
						</div>
					</div>
					<div class="form_section">
						<div class="form_section_title">
							<label>고객ID</label> <input name="bookId"
								value="<c:out value="${goodsInfo.bookId}"/>" disabled>
						</div>
						<div class="form_section_content">
							<input id="authorName_input" readonly="readonly"
								value="${goodsInfo.authorName }" disabled>

						</div>
					</div>


					<div class="form_section">
						<div class="form_section_title">
							<label>상품 카테고리</label>
						</div>
						<div class="form_section_content">
							<div class="cate_wrap">
								<span>대분류</span> <select class="cate1" disabled>
									<option value="none">선택</option>

								</select>
							</div>
							<div class="cate_wrap">
								<span>중분류</span> <select class="cate2" disabled>
									<option value="none">선택</option>

								</select>
							</div>
							<div class="cate_wrap">
								<span>소분류</span> <select class="cate3" name="cateCode" disabled>
									<option value="none">선택</option>

								</select>
							</div>
						</div>
					</div>
					<div class="form_section">
						<div class="form_section_title">
							<label>상품 가격</label>
						</div>
						<div class="form_section_content">
							<input name="bookPrice"
								value="<c:out value="${goodsInfo.bookPrice}"/>" disabled>
						</div>
					</div>

					<div class="form_section">
						<div class="form_section_title">
							<label>상품 재고</label>
						</div>
						<div class="form_section_content">
							<input name="bookStock"
								value="<c:out value="${goodsInfo.bookStock}"/>" disabled>
						</div>
					</div>





					<div class="btn_section">
						<button id="cancelBtn" class="btn btn-secondary btn-sm">상품 목록</button>
						<button id="modifyBtn" class="btn btn-secondary btn-sm">수정</button>
					</div>
				</div>


				<form id="moveForm" action="/admin/goodsManage" method="get">
					<input type="hidden" name="pageNum" value="${cri.pageNum}">
					<input type="hidden" name="amount" value="${cri.amount}"> <input
						type="hidden" name="keyword" value="${cri.keyword}">
				</form>

			</div>
		</div>
	</div>
	<%@include file="../includes/admin/footer.jsp"%>


	<script>
	
		$(document).ready(function(){
			
			
			
			
			
			
			
			
			/* 카테고리 */
			let cateList = JSON.parse('${cateList}');
			let cate1Array = new Array();
			let cate2Array = new Array();
			let cate3Array = new Array();
			let cate1Obj = new Object();
			let cate2Obj = new Object();
			let cate3Obj = new Object();
			
			let cateSelect1 = $(".cate1");		
			let cateSelect2 = $(".cate2");
			let cateSelect3 = $(".cate3");
			
			/* 카테고리 배열 초기화 메서드 */
			function makeCateArray(obj,array,cateList, tier){
				for(let i = 0; i < cateList.length; i++){
					if(cateList[i].tier === tier){
						obj = new Object();
						
						obj.cateName = cateList[i].cateName;
						obj.cateCode = cateList[i].cateCode;
						obj.cateParent = cateList[i].cateParent;
						
						array.push(obj);				
						
					}
				}
			}	
			
			/* 배열 초기화 */
			makeCateArray(cate1Obj,cate1Array,cateList,1);
			makeCateArray(cate2Obj,cate2Array,cateList,2);
			makeCateArray(cate3Obj,cate3Array,cateList,3);
			
			
			let targetCate2 = '';
			let targetCate3 = '${goodsInfo.cateCode}';
			
			for(let i = 0; i < cate3Array.length; i++){
				if(targetCate3 === cate3Array[i].cateCode){
					targetCate3 = cate3Array[i];
				}
			}// for			
			
			console.log('targerCate3:' + targetCate3);
			console.log('targerCate3.cateName:' + targetCate3.cateName);
			console.log('targerCate3.cateCode:' + targetCate3.cateCode);
			console.log('targerCate3.cateParent:' + targetCate3.cateParent);
		
			
			for(let i = 0; i < cate3Array.length; i++){
				if(targetCate3.cateParent === cate3Array[i].cateParent){
					cateSelect3.append("<option value='"+cate3Array[i].cateCode+"'>" + cate3Array[i].cateName + "</option>");
				}
			}				
			
			$(".cate3 option").each(function(i,obj){
				if(targetCate3.cateCode === obj.value){
					$(obj).attr("selected", "selected");
				}
			});			
			
			for(let i = 0; i < cate2Array.length; i++){
				if(targetCate3.cateParent === cate2Array[i].cateCode){
					targetCate2 = cate2Array[i];	
				}
			}// for		
			
			for(let i = 0; i < cate2Array.length; i++){
				if(targetCate2.cateParent === cate2Array[i].cateParent){
					cateSelect2.append("<option value='"+cate2Array[i].cateCode+"'>" + cate2Array[i].cateName + "</option>");
				}
			}		
			
			$(".cate2 option").each(function(i,obj){
				if(targetCate2.cateCode === obj.value){
					$(obj).attr("selected", "selected");
				}
			});				
			
			
			
			for(let i = 0; i < cate1Array.length; i++){
				cateSelect1.append("<option value='"+cate1Array[i].cateCode+"'>" + cate1Array[i].cateName + "</option>");
			}	
			
			$(".cate1 option").each(function(i,obj){
				if(targetCate2.cateParent === obj.value){
					$(obj).attr("selected", "selected");
				}
			});				
			
						
			
			
		}); // $(document).ready
	
		/* 목록 이동 버튼 */
		$("#cancelBtn").on("click", function(e){
			e.preventDefault();
			$("#moveForm").submit();	
		});	
		
		/* 수정 페이지 이동 */
		$("#modifyBtn").on("click", function(e){
			e.preventDefault();
			let addInput = '<input type="hidden" name="bookId" value="${goodsInfo.bookId}">';
			$("#moveForm").append(addInput);
			$("#moveForm").attr("action", "/admin/goodsModify");
			$("#moveForm").submit();
		});			
		
	</script>
</body>
</html>