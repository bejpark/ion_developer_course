package ex03.Switch;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("도시를 입력하세요.(s, d, b, j)");
		char si = sc.nextLine().charAt(0); //문자열 중에서 첫글짜 하나만 추출 
		switch(si) {
		case 's':System.out.print("서울");break;
		case 'd':System.out.print("대구");break;
		case 'b':System.out.print("부산");break;
		case 'j':System.out.print("제주");break;
		default:
			System.out.println("s,d,b,j 중에서 입력해주세요.");
			System.exit(0);
		}//end switch
		System.out.println("를 선택 하셨습니다.\n");

	}

}
