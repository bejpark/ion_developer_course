package ex02.constructor;

public class MainEntry {

	/*
	 * @param args 메인은 아무값도 넘겨 받지 않습니다.
	 * @param x 곱을 구하는 것에 첫번째 정수형 변수
	 * @param y 곱을 구하는 것에 첫번째 정수형 변수
	 * @param gob 변수는 x와y의 두 정수의 곱을 저장하는 변수
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,gob=1;
		char ch='A';
		String msg;
		
		x=5;y=10;
		msg="th1 기수님들 화이팅!";
		gob=gob(x,y);
		
		System.out.println(ch);
		System.out.println(msg);
		System.out.println(x+" * "+y+" = "+gob);


	}

	public static int gob(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

}
