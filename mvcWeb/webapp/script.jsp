<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<div id="result">쀼이이이잉이이ㅇㅇ</div>
	
	
	<hr/>
	<!-- input영역에다가 이벤트함수로 값을 넣기 위해서는 -->
	<input type="text" name="id" id="id">
	<hr/>
<!-- 	<img src="/img/shinsegae.png">
	<br/>
	<img src="/img/woody.png" width="400px"> -->
	<br/>
	<button id="btn">click</button>
	<select id="imgSel">
		<option>shinsegae.png</option>
		<option>woody.png</option>
	</select>
	
	<div>
		<img id="imgSrc">
	</div>
	
	<hr/>
	
	<div id="makeForm">
		<img src="./img/plus-button.png" id="imgBtn" width="20px">
		<input type="text">
	</div>
	<hr/>
	
	<label>제조사</label>
	<select class="maker">
		<option>benz</option>
		<option>audi</option>
		<option>bmw</option>
	</select>
	&nbsp;
	<label>모델</label>
	<select id="model">
		<option>선택하세요</option>
	</select>
	&nbsp;
	<label>색깔</label>
	<select id="color">
		<option>선택하세요</option>
	</select>
	
	<hr/>
	<label>선호하는 여행지를 선택하세요</label>
		<li><input type="checkbox" id="allchk"><label>전체선택/해제</label></li>
	<hr/>
	<div id="area">
		<li><input type="checkbox" id="box" value="a"><label>서울</label></li>
		<li><input type="checkbox" id="box" value="b"><label>동남아시아</label></li>
		<li><input type="checkbox" id="box" value="c"><label>동북아시아</label></li>
		<li><input type="checkbox" id="box" value="d"><label>유럽</label></li>
		<li><input type="checkbox" id="box" value="e"><label>미주</label></li>
	</div>
	
	
	
	<%--  --%> <!-- 이건 jsp 주석. 얘는 나중에 오픈해도 보이지 않음 -->
	<!-- script -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script type="text/javascript">
	/* 도큐먼트 객체는 html의 body를 가리킨다 */
		function display(ary){
			txt="";
			$.each(ary,function(idx, data){
				txt += "<option>"+data+"</option>";
			});
			$("#model").empty().append(txt);
			console.log("display");
			return ary;//리턴타입이 없지만 리턴을 할 수 있다.
		}
		function display2(ary){
			txt="";
			$.each(ary,function(idx, data){
				txt += "<option>"+data+"</option>";
			});
			$("#color").empty().append(txt);
			console.log("display2");
			return ary;//리턴타입이 없지만 리턴을 할 수 있다.
		}
	
	
	
		obj = {id:"jisonic", pwd:"jisonic"};//obj는 자바스크립트의 클래스가 되는거임
		
		ary=[
				{id:"jisonic",pwd:"jisonic"},
				{id:"yangpa",pwd:"yangpa"},
				{id:"river",pwd:"river"},
				{id:"egay",pwd:"egay"}
		];
		
		
		mapModel = {benz :['S500','E300','C200'],
					audi :['A8','A6','A4'],
					bmw  :['740d','520d','320d'] };
		
		mapColor = {benz :['white','black','gray'],
					audi :['blue','rgb','red'],
					bmw  :['yellow','green','pink'] };
		
		
		
		
		//페이지 로드 이벤트. 페이지를 시작하는 거 자체가 로드 이벤트이다.
		$(document).ready(function() {
			/* 
			//$("#id").val("jisonic"); //value를 세팅
			$("#id").prop("value","jisonic"); //prop함수로 태그의 속성을 정의할수도 있다.
			
			$("#btn").click(function() {
				//console.log(obj);
				//$("#result").text(obj.id+" "+obj.pwd);
				txt="";
				//$. <-이렇게 쓰겠다는 것은 제이쿼리의 함수를 그냥 쓰겠다는것임
				$.each(ary,function(idx,obj){
					//$("#result").html("<h1>"+obj.id+" "+obj.pwd+"</h1>"); 이거는 글짜가 바꿔치기됨
					//$("#result").append("<h1>"+obj.id+" "+obj.pwd+"</h1>"); 누적됨
					txt += "<H1>"+obj.id+" "+obj.pwd+"</H1>";
					
				});
				
				$("#result").html(txt);
				
				
			});
				 */
				$("#btn").click(function() {
					
				});
				
				$("#imgSel").change(function(){
					
					//window.alert($(this).val());
					
					$("#imgSrc").prop("src","./img/"+$(this).val());
					
				});
				//prototype의 객체지향언어기 때문에 function이 하나의 타입이 될 수 있다.
				$("#imgBtn").click(function(){
					$("#makeForm").append("<input type='text' id='',name='', value=''><br/>");
				});
				
				
				//one()<-이벤트를 딱 한번만 발생시키고 싶을때,on(),bind()
				//$(".maker").bind("change", )
				$(".maker").change(function(){
					makerValue = $(this).val();
					modelAry = mapModel[makerValue]; //modelAry가 넘어옴
					display(modelAry);
				});
				$(".maker").change(function(){
					makerValue = $(this).val();
					colorAry = mapColor[makerValue]; //modelAry가 넘어옴
					display2(colorAry);
				});
				
				
				

				//전체선택 체크박스
/*  				$("#allchk").click(function(){
				 if($("#allchk").prop("checked")) { 
					 $("#box").prop("checked",true);
					 }else{
						 $("#box").prop("checked",false);
					 }
				 });  */
 				
 				
 			 	$("#allchk").change(function(){
					if(this.checked){
						$("input[name='box']:checkbox").each(function(){
							$(this).prop("checked",true);
						});
					}else{
						$("input[name='box']:checkbox").each(function(){
							$(this).prop("checked",false);
						});
					}
				}); 
				
				/////체크박스 역바인딩
				
				$("input[name='box']:checkbox").click(function(){
					flag = true;
					
					$("input[name='box']:checkbox").each(function(){
						if(this.checked==false){
							flag = false;
							break;
						}
						
					});
					
					
					if(flag){
						$("#allchk").prop("checked", true);
					}else{
						$("#allchk").prop("checked", false);
					}
				});
				
				///////
				 

		});
	</script>
</body>
</html>