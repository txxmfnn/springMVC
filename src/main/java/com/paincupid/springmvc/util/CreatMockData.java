package com.paincupid.springmvc.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.paincupid.springmvc.system.domain.SystemTree;
import com.paincupid.springmvc.system.domain.UserRole;
import com.paincupid.springmvc.test.domain.Person;

/**
 * ģ������
 * @author arthur.paincupid.lee
 * @since 2016.01.24
 *
 */
public class CreatMockData {
	/**
	 * person�����б����id������
	 * @param numberRow
	 * @return
	 */
	public static List<Person> createPersonDropDownList(int numberRow){
		List<Person> retlist = new ArrayList<Person>();
		for(int i=0; i<numberRow; i++){
			Person p = new Person(String.valueOf(i)+"p", GenerateChinaName.generateOneName());
			retlist.add(p);
		}
		return retlist;
	}
	
	/**
	 * mock�û���ɫ������ʾ�б�ǰ3��id��ͬ����������ͬ��
	 * @param numberRow
	 * @return
	 */
	public static List<UserRole> createUserRole(int numberRow, String mainId){
		List<UserRole> retlist = new ArrayList<UserRole>();
		String name = GenerateChinaName.generateOneName();
		retlist.add(new UserRole("01-"+ mainId, name));
		retlist.add(new UserRole("02-"+ mainId, name));
		retlist.add(new UserRole("03-"+ mainId, name));
		retlist.add(new UserRole("04-"+ mainId, "infosys"));
		retlist.add(new UserRole("05-"+ mainId, "infosys"));
		retlist.add(new UserRole("06-"+ mainId, "alibaba"));
		retlist.add(new UserRole("07-"+ mainId, "tata"));
		for(int i=20; i<(20+numberRow); i++){
			UserRole u = new UserRole();
			u.setId(String.valueOf(i)+ mainId);
			u.setName(GenerateChinaName.generateOneName()+"u");
			retlist.add(u);
		}
		return retlist;
		
	}
	public static List<Person> createPersonList(int numberRow, int currentPage){
		if(numberRow<=20){
			numberRow = 20;
		}
		List<Person> retlist = new ArrayList<Person>();
		for(int i=0; i<numberRow; i++){
			Person p = new Person();
			p.setId(String.valueOf(currentPage));
			p.setName(GenerateChinaName.generateOneName());
			p.setComment("��ע"+i);
			if(currentPage%2==0){
				p.setSex("Ů");
			}else{
				p.setSex("��");
			}
			p.setAge(createAge());
			p.setProv("�㽭");
			p.setCity("����");
			p.setTown("�ຼ��");
			p.setLocation("��һ��·����Ͱ�");
			p.setCompany("google");
			if(i<10){
				p.setTel("1861111000"+i);
			}else if(i>=10 && i<100){
				p.setTel("186111100"+i);
			}
			
			retlist.add(p);
		}
		
		return retlist;
	}
	public static List<Person> createPersonList(int numberRow){
		if(numberRow<=20){
			numberRow = 20;
		}
		List<Person> retlist = new ArrayList<Person>();
		for(int i=0; i<numberRow; i++){
			Person p = new Person();
			p.setId(String.valueOf(i));
			p.setName(GenerateChinaName.generateOneName());
			p.setComment("��ע"+i);
			if(i%3==0){
				p.setSex("Ů");
			}else{
				p.setSex("��");
			}
			p.setAge(createAge());
			p.setProv("�㽭");
			p.setCity("����");
			p.setTown("�ຼ��");
			p.setLocation("��һ��·����Ͱ�");
			p.setCompany("google");
			if(i<10){
				p.setTel("1861111000"+i);
			}else if(i>=10 && i<100){
				p.setTel("186111100"+i);
			}
			
			retlist.add(p);
		}
		
		return retlist;
	}
	private static int createAge(){
		Random rand = new Random();
		return rand.nextInt()+1;
	}
	public static List<SystemTree> mockSystemTreeWithOurUrl(){
		List<SystemTree> treelist = new ArrayList<SystemTree>();

		SystemTree tree = new SystemTree();
		tree.setId("1");
		tree.setPid("0");
		tree.setName("���в˵�");
		tree.setOpen(true);
		treelist.add(tree);

		tree = new SystemTree();
		tree.setId("101");
		tree.setPid("1");
		tree.setName("��򵥵��� --  ��׼ JSON ����");
		tree.setFile("person/list");
		treelist.add(tree);

		tree = new SystemTree();
		tree.setId("102");
		tree.setPid("1");
		tree.setName("json��ֵ");
		tree.setFile("json/list");
		treelist.add(tree);
		
		tree = new SystemTree();
		tree.setId("103");
		tree.setPid("1");
		tree.setName("jquery.form��java��������");
		tree.setUrl("jqueryFormPlugin/list");
		//tree.setFile("jqueryFormPlugin/list");
		treelist.add(tree);
		
		tree = new SystemTree();
		tree.setId("104");
		tree.setPid("1");
		tree.setName("jquery.form�÷�����ʽ����");
		tree.setFile("jqueryFormPluginSimple/list");
		//tree.setUrl("jqueryFormPluginSimple/list");
		treelist.add(tree);
		
		tree = new SystemTree();
		tree.setId("105");
		tree.setPid("1");
		tree.setName("�������е�Form���");
		tree.setFile("formWidget/view");
		treelist.add(tree);
		
		tree = new SystemTree();
		tree.setId("105");
		tree.setPid("1");
		tree.setName("����Ҫ����");
		tree.setFile("systemTree/wifeTreeInit");
		treelist.add(tree);
		
		return treelist;
	}
	public static List<SystemTree> mockSystemTree(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<SystemTree> treelist = new ArrayList<SystemTree>();

		SystemTree tree = new SystemTree();
		tree.setId("1");
		tree.setPid("0");
		tree.setName("���в˵�");
		tree.setOpen(true);
		treelist.add(tree);

		tree = new SystemTree();
		tree.setId("101");
		tree.setPid("1");
		tree.setName("��򵥵��� --  ��׼ JSON ����");
		tree.setFile("person/list");
		tree.setUrl("person/list");
		treelist.add(tree);

		tree = new SystemTree();
		tree.setId("102");
		tree.setPid("1");
		tree.setName("json��ֵ");
		tree.setFile("json/list");
		tree.setUrl("json/list");
		treelist.add(tree);
		
		tree = new SystemTree();
		tree.setId("103");
		tree.setPid("1");
		tree.setName("jquery.form��java��������");
		tree.setFile("jqueryFormPlugin/list");
		tree.setUrl("jqueryFormPlugin/list");
		treelist.add(tree);
		
		tree = new SystemTree();
		tree.setId("104");
		tree.setPid("1");
		tree.setName("jquery.form�÷�����ʽ����");
		tree.setFile("jqueryFormPluginSimple/list");
		tree.setUrl("jqueryFormPluginSimple/list");
		treelist.add(tree);
		
		return treelist;
	}
	public static void main(String[] args) {

	}

}
