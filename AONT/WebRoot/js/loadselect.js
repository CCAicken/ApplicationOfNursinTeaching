/**
 * ajax调用方法
 * @param {Object} reqType 请求的类型（get，post）
 * @param {Object} reqURL 要请求的路径
 * @param {Object} reqPara 要传递的参数列表，如{ op: 1, key: 2 }
 * @return {Object} returndata 查询结果
 */
function callAJAX(reqType, reqURL, reqPara) {
	var returndata = '';
	$.ajax({
		type: reqType,
		url: reqURL,
		datatype: 'json',
		async: false,//不做异步刷新，解决执行顺讯问题
		data: reqPara,
		success: function(data) {
			returndata = data;
		},
		error: function() {
			returndata = '';
		}
	});
	return returndata;
}

/**
 * 下拉框加载
 * @param type tea grade 
 * @param {Object} selectId 要加载到的select控件的id属性名称
 * @param {Object} form layui表单依赖参数form.render("select")，重新渲染
 */
function loadSelect(type,selectId, form){
	var reqType = 'post';
	var reqURL = '';
	if(type=="tea"){
		reqURL = 'user/gettea';
	}if(type=="grade"){
		reqURL = 'basicinfo/getgrade';
	}
	var reqPara = {};
	var stageData = callAJAX(reqType, reqURL, reqPara);  
	if(stageData != '' && stageData != undefined) { 
		if(stageData.code == 0) {
			$('#' + selectId).html(""); //获取id为selectId指定的控件内容
			if(type=="tea"){
				var str = "<option value=''>请选择教师</option>";
			}if(type=="grade"){
				var str = "<option value=''>请选择年级</option>";
			} 
			
			for(var i = 0; i < stageData.data.length; i++) {
				 if(type=="tea"){
					str += '<option value=' + stageData.data[i]['teaId'] + '>' + stageData.data[i]['teaName'] + '</option>';
				}if(type=="grade"){
					str += '<option value=' + stageData.data[i]['gradeId'] + '>' + stageData.data[i]['gradeName'] + '</option>';
					
				}
			}
			$('#' + selectId).append(str);
			form.render("select");
		} else {
			//layer.msg("未获取到阶段信息！");
			layer.msg('未获取信息', function(){});
		}
	} else {
		//layer.msg("阶段信息获取失败！");
		layer.msg('未获取信息', function(){});
	}
}


/**
 * 教师下拉框默认值
 * @param {Object} selectId 要加载到的select控件的id属性名称
 * @param {Object} form layui表单依赖参数form.render("select")，重新渲染
 */
function loadTeaSelected(selectId,teaId, form){
	var reqType = 'post';
	var reqURL = 'user/gettea'; 
	var reqPara = {};
	var stageData = callAJAX(reqType, reqURL, reqPara);  
	if(stageData != '' && stageData != undefined) { 
		if(stageData.code == 0) {
			$('#' + selectId).html(""); //获取id为selectId指定的控件内容
			var str = "<option value=''>请选择教师</option>";
			for(var i = 0; i < stageData.data.length; i++) {
				if(teaId==stageData.data[i]['teaId'])
				{
						str += '<option value=' + stageData.data[i]['teaId'] + " selected='selected'"+'>' + stageData.data[i]['teaName'] + '</option>';
				}else{
						str += '<option value=' + stageData.data[i]['teaId'] + '>' + stageData.data[i]['teaName'] + '</option>';
				}	
			}
			$('#' + selectId).append(str);
			form.render("select");
		} else {
			//layer.msg("未获取到阶段信息！");
			layer.msg('未获取到教师信息', function(){});
		}
	} else {
		//layer.msg("阶段信息获取失败！");
		layer.msg('未获取到教师信息', function(){});
	}
}


/**
 * 年级下拉框默认值
 * @param {Object} selectId 要加载到的select控件的id属性名称
 * @param {Object} form layui表单依赖参数form.render("select")，重新渲染
 */
function loadGradeSelected(selectId,gradeId, form){
	var reqType = 'post';
	var reqURL = 'basicinfo/getgrade'; 
	var reqPara = {};
	var stageData = callAJAX(reqType, reqURL, reqPara);  
	if(stageData != '' && stageData != undefined) {
		if(stageData.code == 0) {
			$('#' + selectId).html(""); //获取id为selectId指定的控件内容
			var str = "<option value=''>请选择年级</option>";
			for(var i = 0; i < stageData.data.length; i++) {
				if(gradeId==stageData.data[i]['gradeId'])
				{
						str += '<option value=' + stageData.data[i]['gradeId'] + " selected='selected'"+'>' + stageData.data[i]['gradeName'] + '</option>';
				}else{
						str += '<option value=' + stageData.data[i]['gradeId'] + '>' + stageData.data[i]['gradeName'] + '</option>';
				}	
			}
			$('#' + selectId).append(str);
			form.render("select");
		} else {
			//layer.msg("未获取到阶段信息！");
			layer.msg('未获取到信息', function(){});
		}
	} else {
		//layer.msg("阶段信息获取失败！");
		layer.msg('未获取到信息', function(){});
	}
}




