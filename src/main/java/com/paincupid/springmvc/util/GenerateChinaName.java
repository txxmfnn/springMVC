package com.paincupid.springmvc.util;

public class GenerateChinaName {

	public static String generateLastName(){
		String TotleLastName = "��Ǯ��������֣���������������������������ʩ�ſײ��ϻ���κ�ս���л������ˮ��������˸��ɷ���" +
				"��³Τ������ﻨ������Ԭ��ۺ��ʷ�Ʒ����Ѧ�׺����������ޱϺ�����������ʱ��Ƥ���뿵����Ԫ������ƽ�ƺ�����" +
				"��Ҧ��տ����ë�����ױ���갼Ʒ��ɴ�̸��é���ܼ�������ף������������ϯ����ǿ��·¦Σ��ͯ�չ�÷ʢ�ֵ�������" +
				"����Ĳ��﷮���������֧�¾̹�¬Ī�������Ѹɽ�Ӧ�������ڵ��������������ʯ�޼�ť�������ϻ���½���������" +
				"����κ�ӷ����ഢ���������ɾ��θ����ڽ��͹�����ɽ�ȳ������ȫۭ�����������������ﱩ�����������������ղ��" +
				"��Ҷ��˾��۬�輻��ӡ�ް׻���̨�Ӷ����̼���׿�����ɳ����������ܲ�˫��ݷ����̷�����̼������Ƚ��۪Ӻȴ�ɣ" +
				"���ţ��ͨ�����༽ۣ����ũ�±�ׯ�̲����ֳ�Ľ����ϰ�°���������������θ����߾Ӻⲽ�����������Ŀܹ�»��" +
				"��Ź�����εԽ��¡ʦ�������˹��������������Ǽ��Ŀ�����ɳؿ������ᳲ�������󽭺�����Ȩ�ָ��滸����ٹ˾" +
				"���Ϲ�ŷ���ĺ�������˶��������ʸ�ξ�ٹ����̨��ұ���������������̫����������������ԯ�������������Ľ" +
				"����������˾ͽ˾������˾���붽�ӳ�����ľ������������������ṫ���ذμй��׸����������ַ���۳Ϳ�նθɰ�" +
				"�ﶫ�����ź��ӹ麣����΢����˧�ÿ�������������������������Ĳ��٦�����Ϲ�ī�������갮��١�����Ը��ټ�����";
		int  randomNumber = 0;
		//���س����ټ���ǰʮ�������Ļ���
		if(Math.random()*100>10){
			randomNumber = (int)(Math.random()*10);
		}else{
			randomNumber = (int)(Math.random()*TotleLastName.length());
		}
		//System.out.println(bt[randomNumber]+" randomNumber:"+randomNumber+" surName.length():"+surName.length());
		String surName = TotleLastName.substring(randomNumber, randomNumber+1);
		//System.out.println(surName);
		return surName;
	}
	public static String generateFirstName(){
		String totleGName = "����,����,֮��,Ľ��,����,���,Ԫ��,����,����,��ɺ,����,����,��ɺ,����,ϧ��,�㺮,����,����,����,ҹ��,����,ˮ��,����,����,����,��ͮ,����,����,����,��ͮ,Ԫ˪,����,�Ϻ�,��ͮ,����,����,�ϴ�,�꺮,����,����,����,Ѱ��,����,��ɺ,Ľ��,����,Ѱ��,ӳ��,ѩ��,���,Ц˪,����,����,��ɺ,����,����,���,����,�ζ�,��˪,�̷�,����,����,����,����,����,����,�黱,ƽ��,���,���,����,����,����,�״�,����,����,�ΰ�,����,����,����,����,�û�,����,Ц��,����,����,ҹ��,����,����,��ѩ,�ַ�,��ޱ,����,Ѱ��,��ɽ,�Ӻ�,����,�ٲ�,����,����,����,��¶,����,ǧ��,�²�,����,����,����,���,��ɽ,ǧ��,����,��ܽ,��ɽ,����,����,ɽ��,����,����,����,����,����,����,��˪,����,����,��ͮ,�ຮ,����,����,Ѱ��,�ֵ�,����,��ɽ,֮��,��¶,����,��ѩ,����,����,����,����,�໱,����,����,ϧѩ,��,֮��,����,����,����,����,����,����,����,�ð�,Ԫ��,����,����,�ϴ�,����,����,����,����,���,����,����,����,����,����,�Ӱ�,�Ļ�,����,��Ƽ,����,��ɺ,��˿,���,����,��¶,����,����,����,����,����,����,�ﴺ,ѩ��,����,����,��˫,ƽ��,����,��֮,��ޱ,�̴�,����,����,����,����,����,����,��ܽ,��ͮ,����,���,����,����,����,��ɺ,����,����,����,ӳ��,����,��Ƽ,ϧ˪,����,����,���,ӭ��,Ԫ��,����,����,ǧ��,�躮,�ϰ�,����,����,���,����,��ɽ,��÷,����,��ͮ,�ȶ�,����,�䰲,ǧƼ,����,����,����,����,ʫ��,�ɷ�,����,����,����,����,Ц��,�亮,����,����,ˮ��,ӳ֮,����,����,ҹɽ,�ƻ�,��ͮ,С��,����,����,����,�,ӭ��,�ຮ,Ц��,����,����,ӳ��,����,��ɽ,�Ժ�,����,С��,����,��¶,ӳ��,����,�ķ�,����,���,ˮ��,����,Цɺ,��ɺ,����,Ľ��,���,�Ѷ�,С��,����,����,����,����,���,����,ҹ��,�ٺ�,�ʰ�,����,��ɽ,����,����,����,����,����,����,����,�÷�,����,ҹ��,�䰲,����,��ޱ,Ԫɺ,�ò�,����,Ԫ��,ӭ��,ˮ��,����,�Ȳ�,��֮,Ц��,֮ɽ,�,��˪,ƽ��,����,��˿,����,��Ƽ,����,��˿,�䰲,����,��ѩ,���,����,����,Ѱ��,����,��ޱ,����,����,����,�촺,����,�ϻ�,�ð�,����,��÷,ѩ��,�κ�,ӳ��,����,ӳ��,����,�÷�,����,ƽ��,����,�ٷ�,С˪,ѩƼ,��ѩ,ɽ��,��ѩ,����,��ޱ,����,����,�粨,����,����,����,����,����,�,����,�밲,ƽ��,�װ�,����,��ܽ,����,��ɽ,����,��ܽ,ӭ��,�,����,��ܽ,����,���,ǧ��,С��,����,����,ѩ��,����,Ԫ��,����,���,��˫,����,�ٺ�,��֮,����,��ͮ,��ޱ,�·�,�Ӱ�,�ͮ,֮��,����,��˿,��÷,�㲨,����,Ԫ��,����,�ɻ�,��¶,���,����,�¶�,�δ�,����,��˪,ˮ��,Ľ��,��˫,����,����,��ѩ,����,Ԫ��,����,˼��,����,����,����,����,����,���,����,����,����,����,С��,����,����,ǧ��,�㴺,Ѱ˫,����,��÷,����,˼��,����,����,�Ժ�,ӭ��,��ѩ,����,�Ե�,����,���,����,����,���,����,����,����,�λ�,����,����,�̺�,���,����,����,����,��ѩ,��˫,����,����,��˪,��ѩ,ѩ��,��˪,����,��ѩ,����,��˿,�ٴ�,����,����,ӭ��,����,����,��˫,����,ҹ��,����,����,�޷�,����,����,����,���,ǧ��,��¶,ʫ��,ɽ��,����,��¶,����,�׻�,��ɽ,����,���,����,��֮,����,����,����,����,����,����,��÷,����,����,����,����,����,ʫɺ,����,��֮,����,����,����,����,����,����,��˿,���,����,���,�Ϸ�,��ɽ,��ͮ,����,����,����,���,����,����,��֮,����,Ѱ��,����,ʫ˪,����,����,����,ʫ��,����,�ɰ�,Ľ÷,�ְ�,����,�ϰ�,����,��ѩ,����,����,����,����,����,�÷,����,����,��ɺ,��ͮ,����,֮��,�ƺ�,����,����,����,�η�,ҹ��,ǧ��,����,����,����,����,ϧ��,����,����,����,��÷,����,����,����,ҹ��,���,����,����,���,��ܽ,ҹ��,����,����,����,����,Ԫ��,����,����,����,����,�׷�,��Ƽ,ѩ��,���,����,����,����,��˫,����,����,ӭ��,����,����,��ɽ,�޺�,�ʷ�,����,����,�ﴺ,����,��÷,����,����,����,����,��ɺ,����,�޺�,�䵤,��ܽ,���,�ΰ�,��˿,ǧ��,����,����,����,����,�ɰ�,����,����,����,���,��ɺ,��ѩ,�Ű�,����,���,��¶,����,����,��ѩ,����,����,���,���,�ε�,����,����,��ѩ,�׷�,����,��÷,��¶,Ľ��,����,����,����,��˪,����,����,ҹ��,��˫,����,����,����,�Ĵ�,����,��֮,�κ�,����,�鲨,�ɴ�,����,�贺,ϧ��,����,����,����,����,��¶,ӭ��,���,����,Ѱ��,����,����,ӳ��,����,����,��ɺ,Ѱѩ,���,���,�ɷ�,�޵�,����,����,����,����,�ֶ�,ѩ��,����,��˫,��Ƽ,����,Ѱ��,����,����,����,���,��˿,����,����,��˿,˼��,ˮ��,��÷,�,ʫ˫,��˪,ҹ��,����,����,����,ƽͮ,��ޱ,��ɺ,����,�貨,�Ƶ�,����,֮˫,����,˼��,����,����,����,����,���,ϧ��,ҹ��,ˮ��,�뷲,�ﺣ,����,�÷�,���,����,˼ɽ,����,����,����,˼��,����,Ц��,����,֮��,Ԫ��,��ͮ,����,����,����,ƽ��,��Ƽ,����,����,ӭ��,����,˼��,�װ�,����,����,���,����,��֮,����,�ֺ�,����,����,����,ӳ��,����,����,����,ƽ¶,����,Ľ��,����,����,����,��ѩ,����,�ɺ�,�ɵ�,����,����,����,����,ʫ��,����,����,�黱,����,����,��ܽ,�ɽ,����,����,����,ӳ��,����,��˫,��ͮ,�̰�,����,Ц��,����,��˫,�β�,����,����,���,֮��,ƽ��,�ʶ�,����,����,����,����,����,ϧ��,Ѱ��,�մ�,����,����,����,�Ӳ�,����,����,ɽ��,��ɺ,֮��,��˫,����,�洺,����,��֮,Ц��,����,����,��÷,����,��¶,����,����,����,����,����,����,����,����,����,��˫,����,��ѩ,�ѻ�,�ô�,����,Ѱ��,����,����,�ź�,ϧ��,����,����,����,����,����,����,ɽܽ,Ц��,����,Ц��,����,���,����,����,����,���,ӳ��,����,����,����,����,����,��ѩ,����,�װ�,��ޱ,ʫ��,����,����,֮��,����,�ʴ�,�ĺ�,����,ʫ��,��÷,����,����,����,����,����,ЦƼ,����,��¶,Ѱ��,���,ƽ��,ˮͮ,��ͮ,����,����,����,����,��˿,����,��Ƽ,ϧ��,ʫ��,Ѱ��,ʫ˫,Ѱ��,�µ�,����,ϧ��,�ȷ�,ɽ��,��˿,��÷,����,��˿,����,����,����,��ɽ,��˿,��÷,����,����,����,��֮,����,�Զ�,�̴�,����,����,ѩ��,����,����,����,ǧ��,���,����,����,����,����,��÷,����,ѩ��,�ֶ�,��˿,����,����,����,ϧ��,����,����,���,���,ƽ��,����,����,��ɺ,����,����,����,����,��˿,����,�㷲,����,�鷲,����,����,��ͮ,��˪,ҹ��,����,��ܽ,���,����,����,��֮,��ܽ,����,��ɺ,����,����,ӭ��,����,����,��ܽ,����,����,����,��ɽ,����,�ɴ�,����,����,��ޱ,����,����,����,����,����,����,����,���,�Ĵ�,��÷,�緲,����,����,ǧ��,��¶,����,��˪,��˪,����,ʫ��,���,����,����,ɽ��,����,����,����,����,����,ˮ��,����,����,���,��ܽ,����,����,ɽ÷,����,����,����,����,����,����,����,��֮,����,ˮ��,����,����,ϧ��,�̴�,��ѩ,����,����,����,ǧ��,����,�ɲ�,Ԫ��,˼��,ƽ��,Ц��,ѩ��,����,����,����,�̵�,�ɺ�,ƽ��,����,�ƺ�,����,Ѱ��,�Ĳ�,����,����,����,����,��˿,����,ǧɽ,�갲,ˮ��,����,����,�׷�,����,�¶�,����,�Ĳ�,����,����,Ԫ��,ӳ��,��ޱ,С��,ӳ��,����,����,Ц��,����,Ц��,ӭ��,Ԫ��,����,����,粲�,С֮,��¶,ҹѩ,����,����,����,��÷,����,��ɺ,ɽͮ,����,����,����,����,����,����,ӳ��,����,ӳ��,����,����,����,�η�,����,����,Ԫ��,����,�麮,��ޱ,�׷�,�ò�,����,����,ҹ��,����,����,����,����,����,�Ѱ�,ʫ��,ѩ��,��֮,С��,����,��ͮ,����,ϧ��,ӭͮ,���,��ɽ,����,ѩ��,ʫɺ,����,����,����,��÷,Ц��,����,����,����,����,�綬,����,����,����,����,����,����,����,����,��ɽ,����,����,����,����,����,����,��ɽ,����,����,ɽ��,����,��˫,��˿,˼��,����,��÷,��˪,����,ӭ˿,ӭ÷,��˫,ɽ��,ҹ÷,����,����,����,ƽ��,����,����,����,Ѱ÷,��֮,��֮,����,����,����,����,����,����,����,��ޱ,˼��,����,����,��ɽ,��ɽ,����,����,���,����,����,����,����,��ͮ,�滱,�ֻ�,Ԫ��,��ɺ,��֮,�׻�,����,�״�,����,�ʺ�,����,����,����,˼��,��֮,��˫,����,����,����,ϧƼ,��֮,��˿,����,СƼ,�ö�,ǧ��,����,����,����,����,����,ϧɺ,��ޱ,����,ϧ��,����,����,����,����,ӳ��,����,����,��ɽ,�ķ�,����,���,����,����,��ɺ,��ѩ,����,����,Ѱ��,����,����,����,����,����,ϧ��,����,�Ȼ�,����,����,ˮ��,�ö�,����,����,����,��˫,���,��ޱ,����,��ɺ,��¶,����,����,��˿,С��,���,����,����,����,˼��,�ɷ�,Ľɽ,����,ǧ��,����,����,����,����,ӳ��,����,ƽ��,����,����,����,�¶,�ٶ�,����,����,����,����,��¶,����,����,����,����,����,����,����,�ȴ�,��˫,����,����,˼��,��ɽ,����,����,�鰲,���,����,����,����,����,����,���,��ܽ,�ﺣ,��ɺ,����,С��,ӭ��,ˮ֮,����,����,����,����,����,Ԫ��,����,����,����,����,Ԫ��,����,����,����,����,����,Ԫͮ,��ɽ,����,����,��֮,����,�ﺮ,Ľ��,����,����,����,����,����,��ѩ,����,�λ�,��÷,���,����,ӳ��,����,����,����,����,ҹ��,ѩ��,�ӵ�,����,���,����,�׺�,���,����,����,�䰲,����,Ѱ��,ѩɺ,�κ�,ӭ��,����,����,��ͮ,����,�ɷ�,����,����,����,�ô�,ɽ��,�Ʋ�,ѩ��,����,����,Ľ��,����,��÷,���,����,���,����,����,��֮,����,����,����,�հ�,����,��˫,����,����,����,����,Ԫ��,����,����,����,����,����,����,����,ƽ��,����,����,����,����,����,��÷,˼��,���,ӳ��,�ö�,����,���,����,��ޱ,����,����,����,�Ȼ�,����,�Ժ�,����,С��,����,��¶,ӳ��,����,�ķ�,����,���,ˮ��,����,Цɺ,��ɺ,����,Ľ��,���,�Ѷ�,С��,����,����,����,����,���,����,ҹ��,�ٺ�,�ʰ�,����,��ɽ,����,����,����,����,����,����,����,�÷�,����,ҹ��,�䰲,����,��ޱ,Ԫɺ,�ò�,����,Ԫ��,ӭ��,ˮ��,����,�Ȳ�,��֮,Ц��,֮ɽ,�,��˪,ƽ��,����,��˿,����,��Ƽ,����,��˿,�䰲,����,��ѩ,���,����,����,Ѱ��,����,��ޱ,����,����,����,�촺,����,�ϻ�,�ð�,����,��÷,ѩ��,�κ�,ӳ��,����,ӳ��,����,�÷�,����,ƽ��,����,�ٷ�,С˪,ѩƼ,��ѩ,ɽ��,��ѩ,����,��ޱ,����,����,�粨,����,����,����,����,����,�,����,�밲,ƽ��,�װ�,����,��ܽ,����,��ɽ,����,��ܽ,ӭ��,�,����,��ܽ,����,���,ǧ��,С��,����,����,ѩ��,����,Ԫ��,����,���,��˫,����,�ٺ�,��֮,����,��ͮ,��ޱ,�·�,�Ӱ�,�ͮ,֮��,����,��˿,��÷,�㲨,����,Ԫ��,����,�ɻ�,��¶,���,����,�¶�,�δ�,����,��˪,ˮ��,Ľ��,��˫,����,����,��ѩ,����,Ԫ��,����,˼��,����,����,����,����,����,���,����,����,����,����,С��,����,����,ǧ��,�㴺,Ѱ˫,����,��÷,����,˼��,����,����,�Ժ�,ӭ��,��ѩ,����,�Ե�,����,���,����,����,���,����,����,����,�λ�,����,����,�̺�,���,����,����,����,��ѩ,��˫,����,����,��˪,��ѩ,ѩ��,��˪,����,��ѩ,����,��˿,�ٴ�,����,����,ӭ��,����,����,��˫,����,ҹ��,����,����,�޷�,����,����,����,���,ǧ��,��¶,ʫ��,ɽ��,����,��¶,����,�׻�,��ɽ,����,���,����,��֮,����,����,����,����,����,����,��÷,����,����,����,����,����,ʫɺ,����,��֮,����,����,����,����,����,����,��˿,���,����,���,�Ϸ�,��ɽ,��ͮ,����,����,����,���,����,����,��֮,����,Ѱ��,����,ʫ˪,����,����,����,ʫ��,����,�ɰ�,Ľ÷,�ְ�,����,�ϰ�,����,��ѩ,����,����,����,����,����,�÷,����,����,����,֮��,����,�ʴ�,�ĺ�,����,ʫ��,��÷,����,����,����,����,����,ЦƼ,����,��¶,Ѱ��,���,ƽ��,ˮͮ,��ͮ,����,����,����,����,��˿,����,��Ƽ,ϧ��,ʫ��,Ѱ��,ʫ˫,Ѱ��,�µ�,����,ϧ��,�ȷ�,ɽ��,��˿,��÷,����,��˿,����,����,����,��ɽ,��˿,��÷,����,����,����,��֮,����,�Զ�,�̴�,����,����,ѩ��,����,����,����,ǧ��,���,����,����,����,����,��÷,����,ѩ��,�ֶ�,��˿,����,����,����,ϧ��,����,����,���,���,ƽ��,����,����,��ɺ,����,����,����,����,��˿,����,�㷲,����,�鷲,����,����,��ͮ,��˪,ҹ��,����,��ܽ,���,����,����,��֮,��ܽ,����,��ɺ,����,����,ӭ��,����,����,��ܽ,����,����,����,��ɽ,����,�ɴ�,����,����,��ޱ,����,����,����,����,����,����,����,���,�Ĵ�,��÷,�緲,����,����,ǧ��,��¶,����,��˪,��˪,����,ʫ��,���,����,����,ɽ��,����,����,����,����,����,ˮ��,����,����,���,��ܽ,����,����,ɽ÷,����,����,����,����,����,����,����,��֮,����,ˮ��,����,����,ϧ��,�̴�,��ѩ,����,����,����,ǧ��,����,�ɲ�,Ԫ��,˼��,ƽ��,Ц��,ѩ��,����,����,����,�̵�,�ɺ�,ƽ��,����,�ƺ�,����,Ѱ��,�Ĳ�,����,����,����,����,��˿,����,ǧɽ,�갲,ˮ��,����,����,�׷�,����,�¶�,����,�Ĳ�,����,����,Ԫ��,ӳ��,��ޱ,С��,ӳ��,����,����,Ц��,����,Ц��,ӭ��,Ԫ��,����,����,粲�,С֮,��¶,ҹѩ,����,����,����,��÷,����,��ɺ,ɽͮ,����,����,����,����,����,����,ӳ��,����,ӳ��,����,����,����,�η�,����,����,Ԫ��,����,�麮,��ޱ,�׷�,�ò�,����,����,ҹ��,����,����,����,����,����,�Ѱ�,ʫ��,ѩ��,��֮,С��,����,��ͮ,����,ϧ��,ӭͮ,���,��ɽ,����,ѩ��,ʫɺ,����,����,����,��÷,Ц��,����,����,����,����,�綬,����,����,����,����,����,����,����,����,��ɽ,����,����,����,����,����,����,��ɽ,����,����,ɽ��,����,��˫,��˿,˼��,����,��÷,��˪,����,ӭ˿,ӭ÷,��˫,ɽ��,ҹ÷,����,����,����,ƽ��,����,����,����,����,����,����,��ޱ,˼��,����,����,��ɽ,��ɽ,����,����,���,����,����,����,����,��ͮ,�滱,�ֻ�,Ԫ��,��ɺ,��֮,�׻�,����,�״�,����,�ʺ�,����,����,����,˼��,��֮,��˫,����,����,����,ϧƼ,��֮,��˿,����,СƼ,�ö�,ǧ��,����,����,����,����,����,ϧɺ,��ޱ,����,ϧ��,����,����,����,����,ӳ��,����,����,��ɽ,�ķ�,����,���,����,����,��ɺ,��ѩ,����,����,Ѱ��,����,����,����,����,����,ϧ��,����,�Ȼ�,����,����,ˮ��,�ö�,����,����,����,��˫,���,��ޱ,����,��ɺ,��¶,����,����,��˿,С��,���,����,����,����,˼��,�ɷ�,Ľɽ,����,ǧ��,����,����,����,����,ӳ��,����,ƽ��,����,����,����,�¶,�ٶ�,����,����,����,����,��¶,����,����,����,����,����,����,����,�ȴ�,��˫,����,����,˼��,��ɽ,����,����,�鰲,���,����,����,����,����,����,���,��ܽ,�ﺣ,��ɺ,����,С��,ӭ��,ˮ֮,����,����,����,����,����,Ԫ��,����,����,����,����,Ԫ��,����,����,����,����,����,Ԫͮ,��ɽ,����,����,��֮,����,�ﺮ,Ľ��,����,����,����,����,����,��ѩ,����,�λ�,��÷,���,����,ӳ��,����,����,����,����,ҹ��,ѩ��,�ӵ�,����,���,����,�׺�,���,����,����,�䰲,����,Ѱ��,ѩɺ,�κ�,ӭ��,����,����,��ͮ,����,�ɷ�,����,����,����,�ô�,ɽ��,�Ʋ�,ѩ��,����,����,Ľ��,����,��÷,���,����,���,����,����,��֮,����,����,����,�հ�,����,��˫,����,����,����,����,Ԫ��,����,����,����,����,����,����,����,ƽ��,����,����,����,����,����,��÷,˼��,���,ӳ��,�ö�,����,���,����,��ޱ,����,����,����,�Ȼ�,����,��ɺ,��ͮ,����,֮��,�ƺ�,����,����,����,�η�,ҹ��,ǧ��,����,����,����,����,ϧ��,����,����,����,��÷,����,����,����,ҹ��,���,����,����,���,��ܽ,ҹ��,����,����,����,����,Ԫ��,����,����,����,����,�׷�,��Ƽ,ѩ��,���,����,����,����,��˫,����,����,ӭ��,����,����,��ɽ,�޺�,�ʷ�,����,����,�ﴺ,����,��÷,����,����,����,����,��ɺ,����,�޺�,�䵤,��ܽ,���,�ΰ�,��˿,ǧ��,����,����,����,����,�ɰ�,����,����,����,���,��ɺ,��ѩ,�Ű�,����,���,��¶,����,����,��ѩ,����,����,���,���,�ε�,����,����,��ѩ,�׷�,����,��÷,��¶,Ľ��,����,����,����,��˪,����,����,ҹ��,��˫,����,����,����,�Ĵ�,����,��֮,�κ�,����,�鲨,�ɴ�,����,�贺,ϧ��,����,����,����,����,��¶,ӭ��,���,����,Ѱ��,����,����,ӳ��,����,����,��ɺ,Ѱѩ,���,���,�ɷ�,�޵�,����,����,����,����,�ֶ�,ѩ��,����,��˫,��Ƽ,����,Ѱ��,����,����,����,���,��˿,����,����,��˿,˼��,ˮ��,��÷,�,ʫ˫,��˪,ҹ��,����,����,����,ƽͮ,��ޱ,��ɺ,����,�貨,�Ƶ�,����,֮˫,����,˼��,����,����,����,����,���,ϧ��,ҹ��,ˮ��,�뷲,�ﺣ,����,�÷�,���,����,˼ɽ,����,����,����,˼��,����,Ц��,����,֮��,Ԫ��,��ͮ,����,����,����,ƽ��,��Ƽ,����,����,ӭ��,����,˼��,�װ�,����,����,���,����,��֮,����,�ֺ�,����,����,����,ӳ��,����,����,����,ƽ¶,����,Ľ��,����,����,����,��ѩ,����,�ɺ�,�ɵ�,����,����,����,����,ʫ��,����,����,�黱,����,����,��ܽ,�ɽ,����,����,����,ӳ��,����,��˫,��ͮ,�̰�,����,Ц��,����,��˫,�β�,����,����,���,֮��,ƽ��,�ʶ�,����,����,����,����,����,ϧ��,Ѱ��,�մ�,����,����,����,�Ӳ�,����,����,ɽ��,��ɺ,֮��,��˫,����,�洺,����,��֮,Ц��,����,����,��÷,����,��¶,����,����,����,����,����,����,����,����,����,��˫,����,��ѩ,�ѻ�,�ô�,����,Ѱ��,����,����,�ź�,ϧ��,����,����,����,����,����,����,ɽܽ,Ц��,����,Ц��,����,���,����,����,����,���,ӳ��,����,����,����,����,����,��ѩ,����,�װ�,��ޱ,ʫ��,��������,����,֮��,Ľ��,����,���,Ԫ��,����,����,��ɺ,����,����,��ɺ,����,ϧ��,�㺮,����,����,����,ҹ��,����,ˮ��,����,����,����,��ͮ,����,����,����,��ͮ,Ԫ˪,����,�Ϻ�,��ͮ,����,����,�ϴ�,�꺮,����,����,����,Ѱ��,����,��ɺ,Ľ��,����,Ѱ��,ӳ��,ѩ��,���,Ц˪,����,����,��ɺ,����,����,���,����,�ζ�,��˪,�̷�,����,����,����,����,����,����,�黱,ƽ��,���,���,����,����,����,�״�,����,����,�ΰ�,����,����,����,����,�û�,����,Ц��,����,����,ҹ��,����,����,��ѩ,�ַ�,��ޱ,����,Ѱ��,��ɽ,�Ӻ�,����,�ٲ�,����,����,����,��¶,����,ǧ��,�²�,����,����,����,���,��ɽ,ǧ��,����,��ܽ,��ɽ,����,����,ɽ��,����,����,����,����,����,����,��˪,����,����,��ͮ,�ຮ,����,����,Ѱ��,�ֵ�,����,��ɽ,֮��,��¶,����,��ѩ,����,����,����,����,�໱,����,����,ϧѩ,��,֮��,����,����,����,����,����,����,����,�ð�,Ԫ��,����,����,�ϴ�,����,����,����,����,���,����,����,����,����,����,�Ӱ�,�Ļ�,����,��Ƽ,����,��ɺ,��˿,���,����,��¶,����,����,����,����,����,����,�ﴺ,ѩ��,����,����,��˫,ƽ��,����,��֮,��ޱ,�̴�,����,����,����,����,����,����,��ܽ,��ͮ,����,���,����,����,����,��ɺ,����,����,����,ӳ��,����,��Ƽ,ϧ˪,����,����,���,ӭ��,Ԫ��,����,����,ǧ��,�躮,�ϰ�,����,����,���,����,��ɽ,��÷,����,��ͮ,�ȶ�,����,�䰲,ǧƼ,����,����,����,����,ʫ��,�ɷ�,����,����,����,����,Ц��,�亮,����,����,ˮ��,ӳ֮,����,����,ҹɽ,�ƻ�,��ͮ,С��,����,����,����,�,ӭ��,�ຮ,Ц��,����,����,ӳ��,����,��ɽ";
		String totleBName = "����,����,����,����,����,����,����,����,����,��ƽ,��Ȼ,��˳,����,����,����,����,����,��־,��Ȼ,����,����,����,��ʵ,���,���,����,���,��ε,����,����,����,����,����,���,����,����,����,����,����,����,����,����,��ʵ,����,����,��ѧ,����,����,����,����,��ԣ,��Զ,�Ž�,����,����,��Ӣ,����,�ſ�,�ɺ�,�ɺ�,�ɻ�,�ɼ�,����,����,����,��˫,����,����,��ҵ,����,����,����,�а�,����,�е�,�ж�,�и�,�л�,�н�,��ƽ,����,����,����,����,����,��ҵ,����,����,����,����,����,��־,�±�,�º�,�º�,�»�,�»�,�»�,����,����,����,��ˮ,��ܰ,����,��ҵ,����,��ӹ,����,����,��Ԫ,����,����,����,�ɰ�,�ɰ�,���,�ɳ�,�ɳ�,�ɳ�,�ɳ�,�ɹ�,�ɺ�,�ɺ�,����,�ɺ�,�ɻ�,�ɽ�,����,���,����,����,����,����,����,����,����,��Ӣ,����,����,����,����,��Ծ,����,����,�绪,��ï,����,�պ�,�ս�,�ս�,����,�߰�,���,�߳�,�߳�,�߳�,�ߴ�,���,�߷�,�߷�,�ߍo,�߷�,�߸�,�߸�,�ߺ�,�ߺ�,�߽�,�߽�,�߾�,����,����,����,�ߕF,����,��ˬ,����,����,����,����,����,����,����,����,��ܲ,��ԭ,��Զ,����,��׿,���,�⻪,���,���,����,����,����,����,����,����,��ҫ,����,��Զ,����,����,��Դ,����,����,����,����,����,����,����,����,����,����,����,����,����,����,����,��ӳ,����,����,����,����,����,����,����,��ī,��ѧ,����,嫫h,����,嫺�,�Į,껲�,��,껿�,�Ǭ,��,�Ȼ,�Ȼ,���,���,�Ӣ,�Ʋ�,�Ʋ�,�Ƴ�,�ƴ�,���,�Ƶ�,�Ƹ�,�ƹ�,�ƛ�,���,�ƺ�,�ƿ�,�ƿ�,����,����,����,����,����,����,��Ȼ,���,����,��˼,����,���,�Ͱ�,�Ͱ�,���,����,�ͳ�,�ͷ�,�͸�,�͹�,��ƽ,��Ǣ,���,��˳,��˶,����,��̩,���,��ͨ,��ͬ,����,����,����,����,����,��ԣ,��ԥ,����,����,����,����,��־,����,�벩,���,�뷽,���,���,���,�뻯,���,����,����,����,����,��ʢ,��ͼ,��ΰ,����,����,����,����,��ҵ,����,����,����,��ܲ,����,��׳,�겮,�격,���,�곩,���,���,���,�긻,���,�꿣,����,���,����,����,��ï,����,����,����,��ʤ,��ʢ,��ˬ,��˶,��ΰ,����,����,����,����,��Զ,��׳,�豦,�貨,�販,���,���,�賩,���,���,���,���,���,�踣,���,����,����,����,����,����,����,����,����,����,����,��ѩ,����,��Զ,����,����,����,����,����,��־,��׿,����,����,����,����,����,����,����,���,����,����,��ï,����,����,����,����,�δ�,�ε�,�θ�,����,��ï,��ľ,��Ľ,����,����,��ƽ,����,����,����,����,��ʤ,��ʯ,��ʵ,����,����,����,����,����,���,����,��ѫ,����,����,��ܲ,��ӱ,����,����,����,����,����,����,����,����,��־,����,���,���,���,���,���,����,����,����,����,����,����,����,����,����,��ľ,����,��ͬ,����,��ҵ,����,��Ԫ,����,����,����,����,����,��,����,����,��ب,����,����,����,��γ,����,��ҵ,����,����,����,����,����,����,����,����,����,��ɽ,��ʤ,����,����,��ͬ,����,����,���,����,����,����,����,����,����,����,����,����,����,����,����,����,����,����,����,����,����,����,����,��ï,����,����,����,����,���,����,����,��ˬ,����,����,����,����,����,����,����,����,��Ӣ,����,����,����,��Զ,����,����,����,����,����,��ͬ,����,����,����,����,����,����,����,����,����,����,����,����,����,����,����,����,����,����,����,����,����,����,����,����,����,����,����,����,��ƽ,��ʤ,��ʢ,��ʱ,����,��˳,��̩,��ԣ,�ְ�,�ְ�,�ֳ�,�ֳ�,�ֺ�,�ּ�,�ֿ�,����,����,��ɽ,����,��ʥ,��ˮ,����,��ͯ,����,����,����,����,����,����,��ӽ,����,����,����,��տ,����,����,��־,���,����,����,��ǿ,����,����,��ѧ,����,����,����,����,����,����,��Ⱥ,����,����,����,����,����,����,����,����,����,����,����,����,����,��ƽ,����,��Ⱥ,��ȫ,ï��,ï��,ï��,ï��,ïʵ,ïѧ,ïѫ,ï��,����,����,����,��,��ѧ,����,����,����,����,����,����,����,����,����,����,����,����,��Զ,����,����,��֪,��־,����,����,����,����,����,����,����,����,����,��Խ,����,����,����,����,����,����,����,����,����,���d,����,����,����,����,����,����,姴�,����,���,��,�ֺ�,����,����,����,��ʤ,��ˮ,��˼,����,��ΰ,����,����,��ϣ,����,����,��־,����,����,��Ȼ,����,����,���,����,����,���,���,��,���,��,����,����,��˼,����,����,����,����,����,��־,����,�,�,�,�,�,�,�,�,�,�,���,�ʶ,�˼,�ܻ�,�ܾ�,����,��Ԫ,����,ʥ��,���,˼��,˼��,˼Դ,˼Զ,˼��,˹��,˹��,̩��,̩��,̩��,̩��,̩��,̩��,̩ƽ,̩��,̩Ȼ,���,���,�츳,���,���,�칤,�캲,���,�컪,�콾,���,��»,��·,����,���,����,����,����,��Ԫ,����,����,����,ͬ��,ͬ��,ͬ��,ͬ��,ͬ��,ͬ��,Ρ��,ΡȻ,Ρ��,ΰ��,ΰ��,ΰ��,ΰ��,ΰï,ΰ��,ΰ��,ΰ��,ΰ��,ΰ��,ΰ��,ΰ־,����,��ï,����,��Τ,����,���,�İ�,�Ĳ�,�ĳ�,�ĵ�,�Ķ�,�ĸ�,�Ĺ�,�ĺ�,�ĺ�,�Ļ�,�Ŀ�,����,����,����,����,��ɽ,��ʯ,����,����,����,����,����,��ҫ,�ı�,�ı�,�ı�,��,���,����,����,����,����,����,���,����,����,����,��ˮ,��˼,��Զ,����,����,����,��Ȼ,����,����,����,����,�º�,����,�¾�,����,����,��֪,�ź�,�ź�,��Ÿ,��Ȼ,����,�˰�,�˰�,�˲�,�˳�,�˵�,�˷�,�˹�,�˻�,��ƽ,����,����,��˼,����,����,��Ϊ,����,����,����,��ѧ,����,��ҵ,����,�ǲ�,�ǳ�,�ǳ�,�ǹ�,�Ǻ�,�Ǻ�,�Ǻ�,�ǻ�,����,�ǻ�,�ǽ�,�ǽ�,����,��γ,����,����,����,��Ԩ,����,�޳�,�޵�,�޽�,�޽�,�޽�,����,����,����,��ƽ,����,��Ȼ,��Ϊ,��ΰ,����,����,����,��Զ,����,����,����,��Ң,����,ѧ��,ѧ��,ѧ��,ѧ��,ѧ��,ѧ��,ѧ��,ѧ��,ѩ��,ѩ��,ѩ��,����,�ų�,�Ŵ�,�Ż�,�Ž�,�ŬB,����,��ܲ,��־,�ױ�,���,���k,����,����,����,����,����,����,����,����,����,��ƽ,����,����,����,��˷,����,����,����,����,����,����,����,����,����,����,����,����,�Ǻ�,�ǻ�,����,����,��Ȼ,��˸,��ΰ,����,����,����,��Ȼ,����,����,�ݴ�,�˴�,����,����,��Ȼ,����,����,��Զ,����,����,����,��ͮ,ܲ��,Ӣ�,Ӣ��,Ӣ��,Ӣ��,Ӣ��,Ӣ��,Ӣ��,Ӣ��,Ӣ��,Ӣ��,Ӣ��,Ӣ��,Ӣ�,Ӣ��,Ӣ��,Ӣ��,Ӣ��,Ӣ��,Ӣѫ,Ӣ��,Ӣҫ,Ӣ��,Ӣ��,Ӣ��,Ӣ��,Ӣ��,Ӣ׿,Ӣ��,Ӣ��,����,����,����,����,����,����,����,����,����,����,����,����,��˼,����,����,����,����,��Ԫ,����,ӽ��,ӽ��,ӽ˼,ӽ־,����,�¾�,�½�,����,����,���,�,���,����,����,�겮,�껪,��ʯ,����,����,����,���,���,����,��Ȫ,��ɽ,��ʯ,����,����,����,����,����,����,����,����,Ԫ��,Ԫ��,Ԫ��,Ԫ��,Ԫ��,Ԫ��,Ԫ��,Ԫ��,Ԫ��,Ԫ��,Ԫ��,Ԫ��,Ԫ��,Ԫ��,Ԫ��,Ԫ˼,Ԫγ,Ԫ��,Ԫѫ,Ԫ��,Ԫ��,Ԫ��,Զ��,Է��,Է��,Խ��,�̺�,�̺�,�̽�,չ��,���,��ï,��ʥ,����,��,���,����,����,����,����,����,��ƽ,����,����,����,����,����,����,����,����,��ҵ,����,����,��־,־��,־��,־��,־��,־��,־ǿ,־��,־ר,־��,־��,־ѧ,־ҵ,־��,־��,־��,��Զ,����,����,����,����,��־,��Ԩ,�Ӱ�,�ӽ�,����,����,��Ĭ,��ī,��ƽ,����,��ʯ,��ʵ,����,���,�Ӱ�,����,���,����,��ǿ,����,����,����,����,����,����";
		int sex = (int)(Math.random()*100);
		String[] firstName = null;
		if((sex/2)==0){
			//generate girlFirstName
			firstName = totleGName.split(",");
		}else{
			//generate boyFirstName
			firstName = totleBName.split(",");
		}
		int temp = (int)(Math.random()*(firstName.length));
		return firstName[temp];
	}
	public static String generateManyNames(int i){
		StringBuffer manyNames=new StringBuffer("");;
		if(i>1){
			for(int j=0;j<i;j++){
				//System.out.println(generateLastName()+generateFirstName());
				manyNames.append(generateLastName()+generateFirstName()).append("\n");
			}
		}
		String names = (manyNames.toString()).substring(0,manyNames.length());
		return names;
	}
	public static String generateOneName(){
		return generateLastName()+generateFirstName();
	}
	public static void main(String[] args) {
		GenerateChinaName g = new GenerateChinaName();
		String fullName = g.generateLastName()+g.generateFirstName();
		//System.out.println("fullName: "+fullName);
		String manyNames = g.generateManyNames(150);
		System.out.println(manyNames);
	}
	
	
}
