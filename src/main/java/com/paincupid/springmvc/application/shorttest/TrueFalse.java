package com.paincupid.springmvc.application.shorttest;

public class TrueFalse {
	public static void trueOrFalse(){
		boolean t = true;
		boolean f = false;
		/**
		 * 与（&）、非（~）、或（|）、异或（^） 
		 */
		System.out.println("t|f: "+(t|f));
		System.out.println("t&f: "+(t&f));
		
		System.out.println("t|t: "+(t|t));
		System.out.println("f&f: "+(f&f));
		
		System.out.println("t^t: "+(t^t));
		System.out.println("f^f: "+(f^f));
		//若要布尔取反，前面加个叹号就行！
		System.out.println("t=!t: "+(t=!t));
		System.out.println("f=!f: "+(f=!f));
	}
	public static void main(String[] args) {
		TrueFalse.trueOrFalse();
	}

}
