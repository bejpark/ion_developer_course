package todayQuiz;

import java.util.Scanner;

public class Quiz_3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//이름, 국어, 영어, 전산 점수 입력받아서 총점,평균 출력
		String name = "";
		int a,b,c=0;
		System.out.println("이름을 입력하세요 : ");
		name = new Scanner(System.in).next();
		System.out.println("국어 점수를 입력하세요 : ");
		a = new Scanner(System.in).nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		b = new Scanner(System.in).nextInt();
		System.out.println("전산 점수를 입력하세요 : ");
		c = new Scanner(System.in).nextInt();
		
		int total = a+b+c;
		float average = total/3;
		
		System.out.println(name+"님의 성적표 *****");
		System.out.println("국어 : "+a+", 영어 : "+b+", 전산 : "+c);
		System.out.println("총점 : "+total+", 평균 : "+average);

	}

}
