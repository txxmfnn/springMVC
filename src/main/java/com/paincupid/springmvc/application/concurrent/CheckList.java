package com.paincupid.springmvc.application.concurrent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CheckList {

	public static void main(String[] args) {
		// ģ�����ݼ�
		List<String> alist = new ArrayList<String>();
		alist.add("a");
		alist.add("aaa");
		alist.add("a");
		alist.add("bb");
		alist.add("a");
		alist.add("aaa");
		alist.add("aaa");
		alist.add("a");
		alist.add("bb");
		alist.add("bb");
		alist.add("aaa");
		alist.add("bb");
		alist.add("a");
		alist.add("aaa");
		same(alist);
	}

	public static void same(List<String> list) {
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < list.size(); i++) {
			String key = list.get(i);
			String old = map.get(key);
			if (old != null) {
				map.put(key, old + "," + (i + 1));
			} else {
				map.put(key, "" + (i + 1));
			}
		}
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			if (value.indexOf(",") != -1) {
				System.out.println(key + " �ظ�,�У� " + value);
			}
		}

	}

	/**
	 * �����ظ�����
	 *
	 * @param alist
	 *            ����������
	 */
	public static void check(List<String> alist) {
		// ��¼�ظ�����
		List<String> cflist = new ArrayList<String>();
		// ����һ��list
		List<String> blist = alist;
		for (int i = 0; i < alist.size(); i++) {
			boolean b = false;
			String mk = "��" + (i + 1) + "�����ݺ͵�";
			for (int j = 0; j < blist.size(); j++) {
				// ���ͱ���Ƚ�
				if (j != i) {
					// �ҵ���ͬ��ֵ
					if (alist.get(i).equals(blist.get(j))) {
						// �������ظ�����
						if (!cflist.isEmpty()) {
							boolean bo = true;
							// �����ظ����ݼ�
							for (int k = 0; k < cflist.size(); k++) {
								// ȡ����k�е��ظ�����
								String[] cf = cflist.get(k).toString()
										.split("-");
								// ȡ����k�еĵڶ����������������ݵ�����+1��
								int s = Integer.parseInt(cf[1].toString());
								// �Ƚϵ�ǰ˳����ظ��е�˳������������Ϊfalse
								if (s == (i + 1)) {
									bo = false;
								}
							}
							// �ж��Ƿ���ӵ��ظ����ݼ��У�true��ʾ�ظ����ݼ����治���ڸ����ݣ�false��֮��
							if (bo) {
								cflist.add((i + 1) + "-" + (j + 1));
								if (b) {
									mk += ",";
								}
								mk += (j + 1);
								// ��¼�ظ�����ʱ�޸�b��ֵ����ʾ�͵�i�к͵�j�д����ظ�����
								b = true;
							}
						} else {
							// ��¼�ظ������ݣ���ʽΪ2-3����һ������Ϊԭ�ظ����ݵ�����+1���ڶ���Ϊ�������ݵ�����+1��
							cflist.add((i + 1) + "-" + (j + 1));
							mk += (j + 1);
							b = true;
						}
					}
				}
			}
			mk += "�������ظ�,�ظ�ֵ��" + alist.get(i);
			if (b) {
				System.out.println(mk);
			}
		}
	}
}
