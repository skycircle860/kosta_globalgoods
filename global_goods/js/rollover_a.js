//롤오버 효과
	$(document).ready(function(){
		$('.goodsDiv').hover(
			function(){
				$(this).css('background-color', '#eeeeee');
				$(this).css('width', '202');
				$(this).css('height', '282');
				$(this).css('border', '5px #000000 solid');		
			},
			function(){
				$(this).css('background-color', '#ffffff');
				$(this).css('width', '210');
				$(this).css('height', '290');
				$(this).css('border', '1px #eeeeee solid');	
		});
		$(".addcart_bt").hover(function(){
			$(this).css('background-color', '#eeeeee');
			$(this).css('color', '#4c8706');
		},
		function(){
			$(this).css('background-color', '#ffffff');
			$(this).css('color', '#666666');
		});
	});