package ex01.dataType;

public class MainEntry {
	public static void main(String[] args) {
		
		short sh = 100;
		int iNum = -32768;
		iNum = sh; //작은 -> 큰 일때 자동 형변환
//		sh = iNum; //큰 -> 작은 일때 안됨 
		System.out.println(sh);
		System.out.println(iNum);
		
		double d = 12.34;
		float f = 12.45f;
		System.out.println(100l); // Long형 인식 
		float a = (float) 12.222;
	}

}
