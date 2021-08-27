package Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("두 수 입력 받아 나눗셈 : ");
		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			float result = (float) a/b;
			System.out.println("결과 : "+result);
			
		}
		catch(InputMismatchException e) {
			System.out.println("입력 형식이 잘못되었습니다. 정수 형태로 입력하세요.");
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException : 0으로 나눌 수 없습니다");
		}
	}

}
