package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEntry {

	//성적처리 프로그램//7명의 데이터 3과목 입력받아 총점/평균/학점까지 구하는 프로그램 (배열로 처리)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num_student = 7;
		int[][] student = new int[num_student][3];
		String[] name = new String[num_student];

		for(int i =1;i<=student.length;i++) {
			int a=0,b=0,c=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("***학생 "+i+" 의 정보 입력***");
			try {
				System.out.println("이름을 입력하세요 : ");
				name[i] = sc.next();
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
				
				student[i][0]=a;
				student[i][1]=b;
				student[i][2]=c;
			
			}catch(InputMismatchException e) {
				System.out.println("입력 형식이 잘못되었습니다.");
			}
		}//for end
		for(int i =1;i<=student.length;i++) {			
			double avg=0;				
			int sum = student[i][0]+student[i][1]+student[i][2];
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
			System.out.println("학생 "+i+", "+name[i]+" 님의 성적표 ***");
			System.out.println("국어 : "+student[i][0]+", 전산 : "+student[i][1]+", 영어 : "+student[i][2]);
			System.out.println("총점 : "+sum+", 평균 : "+avg+", 학점 : "+grade);
		}//for end
			
	}

}
