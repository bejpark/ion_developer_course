package todayQuiz;

import java.util.Scanner;

public class Quiz_1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// 3개 정수 입력 받아서 큰 순서대로 출력하는 프로그램
		int x,y,z=0;
		System.out.println("숫자 세 개를 입력하세요.(차례대로 x,y,z)");
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		z = new Scanner(System.in).nextInt();
		
		if (x>=y) {
			if(x>=z)
				System.out.print(x+" >= ");
				if (y>=z)
					System.out.print(y+" >= "+z);
				else
					System.out.print(z+" >= "+y);
		}
		else if (y>=x) {
			if(y>=z)
				System.out.print(y+" >= ");
				if (x>=z)
					System.out.print(x+" >= "+z);
				else
					System.out.print(z+" >= "+x);
		}
		else {
			if(y>=z)
				System.out.print(y+" >= ");
				if (x>=z)
					System.out.print(x+" >= "+z);
				else
					System.out.print(z+" >= "+x);
		}


	}

}
