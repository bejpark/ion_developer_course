package ex01.scanner;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		//next() vs nextline() 
		//next는 space로 구분, nextline은 줄로 구분(공백인식함, 엔터로구분) 
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //객체생성, 메모리할당, 생성자함수 자동호출됨
		
		System.out.println("string input : ");
		String str = sc.next();
		String msg = sc.nextLine();
		
		System.out.println(str);
		System.out.println(msg); //스페이스 부터 받아져서 출력됨 
		sc.close();

	}

}