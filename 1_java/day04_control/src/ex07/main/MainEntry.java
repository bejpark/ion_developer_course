package ex07.main;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length<1) {
			System.out.println("Using error: 데이터 입력 하세요. ");
			return;
		}
		
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		System.out.println("plus is"+n1+n2);
	}

}
