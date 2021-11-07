<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <script type="text/javascript">
  	$(document).ready(function(){
  		$("#id").on("keyup", function(){
  			location.href="/erp/emp/idcheck.do?id="+$("#id").val();
  		})
  	});
  </script>
</head>
<body>
	<div class="container">
	<br><br>
	<div class="container-fluid">
			<form role="form" class="form-horizontal"
				action="/erp/emp/insert.do" method="POST" 
				name="myform">
				<fieldset>
					<div id="legend">
						<legend>아래 양식을 작성해주세요.</legend>
					</div>
					<div class="form-group">
						<!-- 부서코드 -->
						<label class="control-label col-sm-2" for="orgcode">부서코드</label>
						<div class="col-sm-3">
							<input type="text" id="orgcode" name="deptno"
								placeholder="부서코드" class="form-control"
								 required>
						</div>
					</div>

					
					
					<div class="form-group">
						<!-- 성명-->
						<label class="control-label col-sm-2" for="orgname">성명</label>
						<div class="col-sm-3">
							<input type="text" id="orgname" name="name"
								placeholder="성명" class="form-control" minlength="2">

						</div>
					</div>
					<div class="form-group">
						<!-- 사번-->
						<label class="control-label col-sm-2" for="id">사번</label>
						<div class="col-sm-3">
							<input type="text" id="id" name="id"
								placeholder="사번" class="form-control" 
								minlength="4" required >
							
						</div>
						<span id="checkVal">${result}</span>
					</div>



				


					
					<div class="form-group">
						<!-- 패스워드-->
						<label class="control-label col-sm-2" for="pass">패스워드</label>
						<div class="col-sm-3">
							<input type="text" id="pass" name="pass"
								placeholder="패스워드" class="form-control" minlength="4" >

						</div>
					</div>
					<div class="form-group">
						<!-- 주소-->
						<label class="control-label col-sm-2" for="addr">주소</label>
						<div class="col-sm-3">
							<input type="text" id="addr" name="addr" 
							placeholder="주소"
								class="form-control" minlength="4" required>

						</div>
					</div>
					<!-- <div class="form-group">
						포인트
						<label class="control-label col-sm-2" for="point">포인트</label>
						<div class="col-sm-3">
							<input type="text" id="point" name="point" 
							placeholder="포인트"
								class="form-control" minlength="4" required>

						</div>
					</div> -->
					
					<div class="form-group">
						<!-- Button -->
						<div class="col-sm-3 col-sm-offset-2">
							<input type="submit" value="가입하기" class="btn btn-success"/>
						</div>
						<a href="/serverweb/member/search.do?action=LIST" >회원목록조회하기</a>
					</div>
				</fieldset>
			</form>
	</div>
	</div>
</body>
</html>