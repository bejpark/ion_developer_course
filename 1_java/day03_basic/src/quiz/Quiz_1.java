package quiz;

public class Quiz_1 {
	public static void main(String[] args) {
		int pay = 567890;
		int a = pay/10000;
		pay = pay%10000;
		int b = pay/1000;
		pay = pay%1000;
		int c = pay/100;
		pay = pay%100;
		int d = pay/10;
		
		System.out.println("만원 : " + a);
		System.out.println("천원 : " + b);
		System.out.println("백원 : " + c);
		System.out.println("십원 : " + d);
	}
	
}