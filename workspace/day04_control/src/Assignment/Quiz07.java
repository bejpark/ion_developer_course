package Assignment;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = ' ';
		char b = ' ';
		while(true) {
			System.out.println("알파벳을 입력하세요 ('!'입력 시 종료) : ");

			
			Scanner sc = new Scanner(System.in);
			a = sc.next().charAt(0);
			if(a == '!') {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			int asci=(int)a;
			if((65<=asci) && (asci<=90)){
				b=(char)(asci+32);
			}else if((97<=asci) && (asci<=122)) {
				b=(char)(asci-32);
			}else {
				System.out.println("알파벳이 아닙니다. 다시 입력하세요.");
				continue;
			}
			System.out.println("변환된 알파벳 : "+a+" -> "+b);
		}
	}

}
