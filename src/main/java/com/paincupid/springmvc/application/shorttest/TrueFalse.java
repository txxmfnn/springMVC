package com.paincupid.springmvc.application.shorttest;

public class TrueFalse {
	public static void trueOrFalse(){
		boolean t = true;
		boolean f = false;
		/**
		 * �루&�����ǣ�~������|�������^�� 
		 */
		System.out.println("t|f: "+(t|f));
		System.out.println("t&f: "+(t&f));
		
		System.out.println("t|t: "+(t|t));
		System.out.println("f&f: "+(f&f));
		
		System.out.println("t^t: "+(t^t));
		System.out.println("f^f: "+(f^f));
		//��Ҫ����ȡ����ǰ��Ӹ�̾�ž��У�
		System.out.println("t=!t: "+(t=!t));
		System.out.println("f=!f: "+(f=!f));
	}
	public static void main(String[] args) {
		TrueFalse.trueOrFalse();
	}

}
