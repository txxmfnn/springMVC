package com.paincupid.springmvc.application.concurrent;
/*package com.paincupid.springmvc;

import java.util.Hashtable;

import org.antlr.stringtemplate.StringTemplate;

public class StringTemplateTest {
	public static void main(String[] args){
		StringTemplate hello = new StringTemplate("SELECT $column;separator=\",\"$ FROM $table$;");
        hello.setAttribute("column", "name");
        hello.setAttribute("column", "email");
        hello.setAttribute("column", "sex");
        hello.setAttribute("table", "User");

      //��ֵ�����滻
      StringTemplate hello = new StringTemplate("��������滻����:$KeyList.Name$, ����:$KeyList.Age$ ");
      Hashtable ht = new Hashtable();
      ht.put ("Name", "111");
      ht.put("Age", "qw");



      //ͬʱ��ʾ�������
      //StringTemplate hello = new StringTemplate("�������$[Temp1,Temp2,Temp3]$");
      //StringTemplate hello = new StringTemplate("�������$[Temp1,Temp2,Temp3];separator=\",\"$");
      //hello.setAttribute("Temp1", "����1");
      //hello.setAttribute("Temp2", "����2");
      //hello.setAttribute("Temp3", "����3");
      //ģ�����
      //StringTemplateGroup sg = newStringTemplateGroup("GroupTest");
      //sg.defineTemplate("Box","�л����񹲺͹��л����񹲺͹�,�л����񹲺͹�");
      //StringTemplate hello = sg.defineTemplate("List","�������ҵ���Boxģ������:\n$Box()$");

      //������ģ�崫����
      //StringTemplateGroup sg = newStringTemplateGroup("GroupTest");
      //sg.defineTemplate("BoxA", "�Ҳ�����()");
      //sg.defineTemplate("Box", "�л����񹲺͹�,�л�ȫ��Title: $Title$ !!");
      //StringTemplate hello = sg.defineTemplate("List","�������ҵ���Boxģ������:\n$Box(Title=\"����ֵ\")$");//������ֵ
      //StringTemplate hello = sg.defineTemplate("List","�������ҵ���Boxģ������:\n$Box(Title={$Titles$})$");//������
      //StringTemplate hello = sg.defineTemplate("List","�������ҵ���Boxģ������:\n$Box(Title=BoxA())$");//��ģ��
      //hello.setAttribute("Titles", "�������ֵ");



      //ֵģ��
      StringTemplateGroup sg = newStringTemplateGroup("GroupTest");
      sg.defineTemplate("Box", "�л����񹲺͹�,,,,");
      StringTemplate hello = new StringTemplate(sg,"����ֵģ��:$Mys:Box();separator=\"==\"$------s");
      hello.setAttribute("Mys", "�й�");
      hello.setAttribute("Mys", "�й�");



      //ѭ����ʾ
      //StringTemplate hello = newStringTemplate("<table>$Item:{<tr><td>$it$Ҫѭ����ʾ������</td></tr>}$</table>");
      //for (int i = 0; i < 10; i++)
      //{
      //   hello.setAttribute("Item", i);
      //}

   System.out.println(hello.toString());
	}
}

*/