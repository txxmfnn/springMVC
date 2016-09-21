package com.paincupid.springmvc.json.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.ibatis.builder.ParameterExpression;
import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.paincupid.springmvc.log.OpLogger;
import com.paincupid.springmvc.log.OpLogger.OpType;
import com.paincupid.springmvc.test.domain.Person;
import com.paincupid.springmvc.util.BaseJsonRst;
import com.paincupid.springmvc.util.CreatMockData;

@Controller
@RequestMapping("/jqueryFormPluginSimple")
public class JqueryFormPluginSimpleController {
	private static final Logger log = LoggerFactory.getLogger(JqueryFormPluginSimpleController.class);
	
	/**
	 * ��ǰ̨�ķ���·��Ϊ�� http://localhost:8080/springmvc/jqueryFormPluginSimple/list
	 * @param person
	 * @param model
	 * @return
	 */
	@RequestMapping("/list")
	@OpLogger(id = "18611112222", type=OpType.SEARCH)
	public String listPerson() {
		
		return "json/jqueryFormPluginSimple";
	}
	
	/**
	 * ������յ���һ��Java��
	 * @param person
	 * @return
	 */
	@ResponseBody
	@OpLogger(id = "18633334444", type=OpType.SEARCH)
	@RequestMapping(value="/getForm", method=RequestMethod.POST)
	public BaseJsonRst<List<Person>> getForm(Person person, @RequestParam("currentPage") int currentPage){
		log.info("\r\nid: "+person.getId()+", name: "+person.getName()+", currentPage: "+currentPage);
		BaseJsonRst<List<Person>> ret =  new BaseJsonRst<List<Person>>();
		List<Person> list = CreatMockData.createPersonList(20,currentPage);
		ret.setResult(list);
		ret.setTotalCounts(250);
		ret.setCurrentPage(person.getCurrentPage());
		ret.setSuccess(true);
		
		/**
		 * ����׳��쳣���տ��Ա���־���񵽣��������try catch�Ļ����Ͳ��õ���public void doAfter(JoinPoint joinPoint, Exception e) ������
		 */
		//throw Exception("error happen!");
		
		return ret;
	}
	
	private Exception Exception(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args){
		int a = (int)Math.ceil(1.002);
		System.out.println(a);
	}
}