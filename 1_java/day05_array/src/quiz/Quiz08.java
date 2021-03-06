package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz08 {
// 입력함수 INPUT
// 총점 함수 total
// 평균 함수 average
// 학점 grade
// 출력 함수 Output
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("입력할 학생 수 : ");
		int n = new Scanner(System.in).nextInt();
		int[][] student = new int[n][3];
		String[] name = new String[n];
		input(student,name);
		
		int[] sum = total(student);
		float[] avg = average(sum);
		char[] grade = grade(avg);
		output(student,sum,avg,grade,name);
	}
	
	
	public static void input(int[][] student, String[] name) { 
		for(int i =1;i<=student.length;i++) {
			int a=0,b=0,c=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("***학생 "+i+" 의 정보 입력***");
			try {
				System.out.println("이름을 입력하세요 : ");
				name[i-1] = sc.next();
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
				
				student[i-1][0]=a;
				student[i-1][1]=b;
				student[i-1][2]=c;
			
			}catch(InputMismatchException e) {
				System.out.println("입력 형식이 잘못되었습니다.");
			}
		}
	}
	
	public static int[] total(int[][] student) {
		int[] sum = new int[student.length];
	
		for(int i =0;i<sum.length;i++) 
			sum[i] = student[i][0]+student[i][1]+student[i][2];
		
		return sum;
	}
	
	public static float[] average(int[] sum) {
		float[] avg = new float[sum.length];
		
		for(int i =0;i<avg.length;i++)
			avg[i] = (float)sum[i]/3;
		
		return avg;
	}
	public static char[] grade( float[] average) {
		char[] grade = new char[average.length];
		for(int i =0;i<grade.length;i++) {	
			float avg = average[i];
			if(avg>=90)
				grade[i]='A';
			else if(avg>=80)
				grade[i]='B';
			else if(avg>=70)
				grade[i]='C';
			else if(avg>=60)
				grade[i]='D';
			else
				grade[i]='F';
		}
		return grade;

	}
	public static void output(int[][] student, int[] sum, float[] avg, char[] grade, String[] name) {
		for(int i =1;i<=student.length;i++) {			
			System.out.println("학생 "+i+", "+name[i-1]+" 님의 성적표 ***");
			System.out.println("국어 : "+student[i-1][0]+", 전산 : "+student[i-1][1]+", 영어 : "+student[i-1][2]);
			System.out.println("총점 : "+sum[i-1]+", 평균 : "+avg[i-1]+", 학점 : "+grade[i-1]);
			System.out.println("********************\n");
		}
	}

	

}
