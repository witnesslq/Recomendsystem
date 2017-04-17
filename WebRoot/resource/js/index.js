$(document).ready(function(){
	$("#content a:odd").css("color","red");
//	alert($("#content a:last").attr("href"));
	$("div .t").html(function(index,value) {
		return value + (index+1) + "号div"
	});
	
//	$("#content").bind({
//		'click': function(e) {
//			alert("click"+e.type);
//		},
//		'mouseover':function(){
//			alert("mouseover");
//		}
//	});
//	
//	$("#content").on("click",{user:"huxiaoyu",age:17},function(e) {
//		alert(e.data['user']);
//	})
//	
//	$("#content").delegate(".t",'click',function(){
//		$(this).clone().appendTo("#content");
//	});
	
	$("#content").bind('click',{user:"hu"},function(e) {
		//$(e.target).hide(500);
//		e.preventDefault();
		//alert(e.target);
	})
});
