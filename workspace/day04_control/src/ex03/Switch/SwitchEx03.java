package ex03.Switch;

import java.util.Scanner;

public class SwitchEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("1,2,3 중에서 숫자 입력 요먕 = ");
		int point = sc.nextInt(); //문자열 중에서 첫글짜 하나만 추출 
		switch(point) {
			case 1:System.out.print("집");break;
			case 2:System.out.print("피아노");break;
			case 3:System.out.print("우산");break;
			default:
				System.out.println("범위에 없는 숫자입니다. 다시선택하세요.");
				System.exit(0);
		}//end switch
		System.out.println("상품에 당첨 되셨습니다..\n");

	}

}
