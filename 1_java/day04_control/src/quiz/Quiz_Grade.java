package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz_Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;

		while (flag) {
			int sum=0;
			double avg=0;				
			int a=0,b=0,c=0;
			String name=null;
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("이름을 입력하세요 : ");
				name = sc.next();
				while(true) {
					System.out.println("국어 점수를 입력해주세요 (0~100) : ");
					a = sc.nextInt();
					if(a<0||a>100)
						System.out.println("점수 범위가 잘못되었습니다.");
					else
						break;
				}
				while(true) {
					System.out.println("전산 점수를 입력해주세요 (0~100) : ");
					b = sc.nextInt();
					if(b<0||b>100)
						System.out.println("점수 범위가 잘못되었습니다.");
					else
						break;
				}
				while(true) {
					System.out.println("영어 점수를 입력해주세요 (0~100) : ");
					c = sc.nextInt();
					if(c<0||c>100)
						System.out.println("점수 범위가 잘못되었습니다.");
					else
						break;
				}
				sum = a+b+c;
				avg = (double)sum/3;
				
				char grade=' ';
				if(avg>=90)
					grade='A';
				else if(avg>=80)
					grade='B';
				else if(avg>=70)
					grade='C';
				else if(avg>=60)
					grade='D';
				else
					grade='F';
				
				System.out.println(name+" 님의 성적표 ***");
				System.out.println("국어 : "+a+", 전산 : "+b+", 영어 : "+c);
				System.out.println("총점 : "+sum+", 평균 : "+avg+", 학점 : "+grade);
				
				char cont = ' ';
				System.out.println("\n\n 성적처리 계속 진행 (y/n) : ");
				while(true) {
				cont=sc.next().charAt(0);
				if (cont=='n') {
					flag=false;
					break;
				}
				else if(cont=='y')
					break;
				else {
					System.out.println("y,n중에서 입력하세요.");
				}
					continue;
				}
			}catch(InputMismatchException e) {
				System.out.println("입력 형식이 잘못되었습니다.");
			}
		}//while flag
		System.out.println("** 성적처리 프로그램이 종료되었습니다. **");
	}

}
