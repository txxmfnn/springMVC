$(function() {
	var district = $("#district").flexselect();
	$("#provice").flexselect({
		callback : function() {
			$.ajax({
				url : "queryCity.htm",
				data : {
					"date" : new Date().getTime(),
					"grade" : $("#provice").val()
				},
				dataType : "json",
				success : function(result) {
					if (result.code != 200) {
						alert(result.data);
						return;
					}
					result = result.data;
					var resultStr = [];
					for (var i = 0; i < result.length; i++) {
						resultStr.push({
							name : result[i].name,
							value : result[i].id
						});
					}
					city.flexselect[0].cache = resultStr;
				}
			})
		}
	});
	var city = $("#city").flexselect({
		callback : function() {
			$.ajax({
				url : "queryCity.htm",
				data : {
					"date" : new Date().getTime(),
					"grade" : $("#city").val()
				},
				dataType : "json",
				success : function(result) {
					if (result.code != 200) {
						alert(result.data);
						return;
					}
					result = result.data;
					var resultStr = [];
					for (var i = 0; i < result.length; i++) {
						resultStr.push({
							name : result[i].name,
							value : result[i].id
						});
					}
					district.flexselect[0].cache = resultStr;
				}
			})
		}
	});

});