package quiz;

import java.util.Scanner;

public class Quiz07 {
//max() 두 정수 입력받아 큰수 리턴 함수 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("두 정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		max(sc.nextInt(),sc.nextInt());
	}
	
	public static void max(int x,int y) {
		if(x>=y)
			System.out.println("max val between "+x+" and "+y+" is : " +x);
		else
			System.out.println("max val between "+x+" and "+y+" is : " +y);
	}

}
