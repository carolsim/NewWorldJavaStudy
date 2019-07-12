<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<!-- 구글차트 -->
	<div id="barchart_material" style="width: 900px; height: 500px;"></div>
	
	
	<!-- 비동기통신 -->
	<button id="ajaxBtn">AjaxBtn</button>
	<a href="">ajaxLink</a>
	
	
	<!-- script -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			/*
			console.log(${scriptObj});
			obj = ${scriptObj};
			console.log(obj.id);
			console.log(obj.pwd);
			*/
		});
		$("#ajaxBtn").click(function(){
			/*디폴트로 내려받는 타입을 json이라고 생각을 한다.*/
			$.ajax({
				url  : "./ajaxCtrl",//.do는 응답이기 때문에 이 이름으로 매핑되는 새 이름을 만드는거임
				type : "post",
				data : {ssn : "지소닉!>____<" },
				dataType : "json", //이걸 텍스트로 바꾸면 object로 팝업창이 뜨는게 아니라 text(문자열)형식으로 찍음. - 잘못된것. 
				success : function(obj){
					alert(obj);//내장객체로 window는 생략가능. 원래는 window.alert()
				}
				
			});//jQuery가 갖고있는 ajax함수
		});
	</script>
	<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['bar']});
      google.charts.setOnLoadCallback(drawChart);
	  /*여기서 우리가 하는건 ajax가 아님 ㅋㅋㅋ 걍 json형식의 객체를 내려받아서(request/response 형식) 차트로 만드는걸 연습하는것*/
      ary = ${scriptObj};//우리가 내려받은 데이터 배열
      dataAry = new Array();//1차원배열
      
      dataAry.push(['Year', 'Sales', 'Expenses', 'Profit']);
      $.each(ary,function(idx,data){
    	 dataAry.push([data.year, data.sales, data.expenses, data.profit]); 
      });
      
      function drawChart() {
        var data = google.visualization.arrayToDataTable(dataAry);

        var options = {
          chart: {
            title: 'Company Performance',
            subtitle: 'Sales, Expenses, and Profit: 2014-2017',
          },
          bars: 'horizontal' // Required for Material Bar Charts.
        };

        var chart = new google.charts.Bar(document.getElementById('barchart_material'));

        chart.draw(data, google.charts.Bar.convertOptions(options));
      }
    </script>
</body>
</html>