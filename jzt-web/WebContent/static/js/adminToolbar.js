function dropmenu(obj) {  
	
	if($(obj).next().is(":hidden")){
		$(obj).next().show();    //如果元素为隐藏,则将它显现
	}else{
		$(obj).next().hide();     //如果元素为显现,则将其隐藏
	} 
} 

$(function(){
	if(document.body.clientWidth<980){
		$("#sidebar-left").height("auto");
	}else{
		$("#sidebar-left").height(document.body.scrollHeight);
	}
	
	$(window).resize(function(){
		if(document.body.clientWidth<980){
			$("#sidebar-left").height("auto");
		}else{
			$("#sidebar-left").height(document.body.scrollHeight);
		}
	});
	$(window).scroll(function(){
		if(document.body.clientWidth>980){
			if($(window).scrollTop()>800){
				$("#admin_content").css("marginTop","100px");
				$("#sidebar-left").css("position","fixed");
				$("#admin_content").css("marginLeft",$("#sidebar-left").width());
				return;
			}
		
			else{
				
				$("#sidebar-left").css("position","relative");
				$("#admin_content").css("marginLeft",0);
				$("#admin_content").css("marginTop",0);
			}
		}
		
	});
	var sidebar_nav_flag=false;
	$("#sidebar_nav").resize(function(){
		//console.log("fch");
		if(sidebar_nav_flag==false)
			$("#sidebar-left").height($("#sidebar_nav").height()+100);
		else sidebar_nav_flag=false;
	});
	$("#admin_content").resize(function(){
		//console.log("fch");
		$("#sidebar-left").height($("#admin_content").height());
		sidebar_nav_flag=true;
	});
});


(function($, h, c) { 
	var a = $([]), 
	e = $.resize = $.extend($.resize, {}), 
	i, 
	k = "setTimeout", 
	j = "resize", 
	d = j + "-special-event", 
	b = "delay", 
	f = "throttleWindow"; 
	e[b] = 250; 
	e[f] = true; 
	$.event.special[j] = { 
	setup: function() { 
	if (!e[f] && this[k]) { 
	return false; 
	} 
	var l = $(this); 
	a = a.add(l); 
	$.data(this, d, { 
	w: l.width(), 
	h: l.height() 
	}); 
	if (a.length === 1) { 
	g(); 
	} 
	}, 
	teardown: function() { 
	if (!e[f] && this[k]) { 
	return false; 
	} 
	var l = $(this); 
	a = a.not(l); 
	l.removeData(d); 
	if (!a.length) { 
	clearTimeout(i); 
	} 
	}, 
	add: function(l) { 
	if (!e[f] && this[k]) { 
	return false; 
	} 
	var n; 
	function m(s, o, p) { 
	var q = $(this), 
	r = $.data(this, d); 
	r.w = o !== c ? o: q.width(); 
	r.h = p !== c ? p: q.height(); 
	n.apply(this, arguments); 
	} 
	if ($.isFunction(l)) { 
	n = l; 
	return m; 
	} else { 
	n = l.handler; 
	l.handler = m; 
	} 
	} 
	}; 
	function g() { 
	i = h[k](function() { 
	a.each(function() { 
	var n = $(this), 
	m = n.width(), 
	l = n.height(), 
	o = $.data(this, d); 
	if (m !== o.w || l !== o.h) { 
	n.trigger(j, [o.w = m, o.h = l]); 
	} 
	}); 
	g(); 
	}, 
	e[b]); 
	} 
	})(jQuery, this); 