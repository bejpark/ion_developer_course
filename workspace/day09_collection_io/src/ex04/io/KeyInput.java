package ex04.io;

import java.io.IOException;

public class KeyInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int su1=0, su2=0;
		System.out.println("데이터 입력 끝은 ctrl z");
		while((su1 = System.in.read())!=-1) {
			System.out.println((char)su1+"\t");
		}

	}

}
