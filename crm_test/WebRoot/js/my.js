$(function(){
	$("#registName").blur(function(){

		var value = $("#registName").val();
	
		$.post("emp_check", { "registName": value+"" },
				   function(data){
				     $("#mess").text(data);
				   });
		});
	

});

