
/**
 *  vip05的登录页面中用于实现异步请求的ajax脚本
 */
	function AjaxLogin(){
		$.ajax(
			{
			//使用ajax向服务器发起请求
			  //接口请求的四大方法，url、http方法、请求体、请求头
				
				url:"./Login",
				type:"post",
				dataType:"json",
				data:$("#formData").serialize(),
				success:function(result){
					//alert("接口请求调用成功!" + result["msg"]);
					$("#msg")[0].innerText="接口返回信息是：" + result["msg"];
				},
				error:function(result){
					alert("接口调用失败，请检查");
				}
			
			}	
		)
		
}