package ex06.method;

import java.util.Scanner;

public class MainEntry {

	public static void name(String string) {
		// TODO Auto-generated method stub
		System.out.println("당신은 "+string+"이시군요 .");

	}
	
	public static void plus(int x,int y, String msg) {
		int sum = x+y;
		System.out.println(x+"+"+y+"="+sum);
		System.out.println("msg");
		
	}
	
	public static int max() {
		System.out.println("x,y= ");
		int x=new Scanner(System.in).nextInt();
		int y=new Scanner(System.in).nextInt();
		if(x>y) return x;
		else return y;

	}
	
	public static String name(int x,String n) {
//		System.out.println("x = " +x);
//		return n;
		String str = x+n;
		return str;
	}
	
	
	public static void main(String[] args) {
		System.out.println(name(3,"start"));
		name(3,"start");
//		int su = max();
//		System.out.println("max ="+su);
//		System.out.println(max());
		name("doyeon");
		System.out.println("main start");
		line();
		name("park");
		System.out.println("main end");
		name("aa");
	}
	
	public static void line() {
		System.out.println("----------------");
	}

}
