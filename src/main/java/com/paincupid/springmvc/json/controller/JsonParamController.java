package com.paincupid.springmvc.json.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.paincupid.springmvc.test.domain.Person;
import com.paincupid.springmvc.util.BaseJsonRst;
import com.paincupid.springmvc.util.CreatMockData;

@Controller
@RequestMapping("/jsonparam")
public class JsonParamController {
	private static final Logger log = LoggerFactory.getLogger(JsonParamController.class);
	
	/**
	 * ��ǰ̨�ķ���·��Ϊ�� http://localhost:8080/springmvc/jsonparam/list
	 * @param person
	 * @param model
	 * @return
	 */
	@RequestMapping("/list")
	public String listPerson(Person person, Model model) {
		
		return "json/jsonParam";
	}
	
	/**
	 * ������յ���һ��Java��
	 * @param person
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/getForm", method=RequestMethod.POST)
	public BaseJsonRst<List<Person>> getForm(Person person){
		log.info("pname: "+person.getName());
		BaseJsonRst<List<Person>> ret =  new BaseJsonRst<List<Person>>();
		List<Person> list = CreatMockData.createPersonList(10);
		ret.success(list);
		return ret;
	}
	
	/**
	 * ��ʾ���յĲ���Ҫÿ����д����������Ӧ��ò���ǻ������ͣ�����д���֤��
	 * @param pid2
	 * @param pname2
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/getNotForm", method=RequestMethod.POST)
	public BaseJsonRst<List<Person>> getNotForm(@RequestParam("pid2") String pid2, 
																				@RequestParam("pname2") String pname2){
		log.info("pname2: "+pname2);
		BaseJsonRst<List<Person>> ret =  new BaseJsonRst<List<Person>>();
		List<Person> list = CreatMockData.createPersonList(10);
		return ret.success(list);
	}
}