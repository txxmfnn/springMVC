(function($){
	"use strict";
	
	
	$.page.defaultOptions = {
			current_page: 1,
			link_String : '',
			max_page : null,
			page_string : 'Page {current_page} of {max_page}',
			paged: function(){}
	};
	
	$.fn.page = function(){
		var self = this,
		$self = $(self),
		args = Array.prototype.slice.call(arguments),
		result = false;
		
		
		
	};
	
})(jQuery);