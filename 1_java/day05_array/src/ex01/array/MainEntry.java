package ex01.array;

public class MainEntry {
	public static void main(String[] args) {
		//1
		char[] ch;
		ch = new char[4];
		//2
		char[] ch2 = new char[4];
		ch[0]='j';
		ch[1]='a';
		ch[2]='v';
		ch[3]='a';
		//3
		char[] ch3 = {'j','a','v','a'};
		
		System.out.println("배열의 길이 : "+ch2.length);
		System.out.println("ch2[2]="+ch2[2]);
	}

}
