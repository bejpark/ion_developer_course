package todayQuiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz_2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//이름, 국어, 영어, 전산 점수 입력받아서 총점,평균 출력
		String cal = "";
		int a,b,c=0;
		try {
			System.out.println("연산자를 입력하세요 : ");
			cal = new Scanner(System.in).next();
			System.out.println("첫 번째 정수 : ");
			a = new Scanner(System.in).nextInt();
			System.out.println("두 번째 정수 : ");
			b = new Scanner(System.in).nextInt();
			if (cal.equals("+"))
				c = a+b;
			else if (cal.equals("-"))
				c = a-b;
			else if (cal.equals("*"))
				c = a*b;
			else if (cal.equals("/"))
				c = a/b;
			System.out.println("결과 : "+c);
		}catch(InputMismatchException e) {
			System.out.println("입력 형식이 잘못되었습니다.");
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException : 0으로 나눌 수 없습니다");
		}

	}

}
