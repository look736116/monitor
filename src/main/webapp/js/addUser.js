$(function(){
	
	$('#userName').blur(function(){
		var userName = $('#userName').val();
		var userPassword = $('#userPassword').val();
		alert(userName + ":" + userPassword);
	
	$.ajax({
        url : path + '/user/checkUserName',
        dataType : "json",
        data : {
            "userName" : userName,
            "userPassword" : userPassword
        },
        async : true,
        cache : false,
        type : "post",
        success : function(user) {
        	alert("999999");
            alert(user.userName);            
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {			
			//TODO
        	alert("2222");
		}

    })
    
    alert(999);
	});	
});