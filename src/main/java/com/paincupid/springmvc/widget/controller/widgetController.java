package com.paincupid.springmvc.widget.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.paincupid.springmvc.system.domain.UserRole;
import com.paincupid.springmvc.test.domain.Person;
import com.paincupid.springmvc.util.BaseJsonRst;
import com.paincupid.springmvc.util.CreatMockData;

/**
 * 
 * @author arthur.paincupid.lee
 * @since 2016.01.24
 *
 */
@Controller
@RequestMapping("/widget")
public class widgetController {
	private static final Logger log = LoggerFactory.getLogger(widgetController.class);
	
	/**
	 * ��ҳ���jqpagination
	 * ��ǰ̨�ķ���·��Ϊ�� http://localhost:8080/springmvc/widget/jqpagination/view
	 * @return
	 */
	@RequestMapping("/jqpagination/view")
	public String view() {
		return "widget/jqPagination";
	}
	
	/**
	 * ������յ���һ��Java��
	 * @param person
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/getForm", method=RequestMethod.POST)
	public BaseJsonRst<List<Person>> getForm(Person person, @RequestParam("currentPage") int currentPage){
		log.info("\r\nid: "+person.getId()+", name: "+person.getName()+", currentPage: "+currentPage);
		BaseJsonRst<List<Person>> ret =  new BaseJsonRst<List<Person>>();
		List<Person> list = CreatMockData.createPersonList(20,currentPage);
		ret.setResult(list);
		ret.setTotalCounts(250);
		ret.setCurrentPage(person.getCurrentPage());
		ret.setSuccess(true);
		return ret;
	}
	
	
}