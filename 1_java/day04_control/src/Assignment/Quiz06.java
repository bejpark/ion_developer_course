package Assignment;

public class Quiz06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1 ~ 100까지 중에서 짝수만 출력하고 한 행에 10개씩 출력");
		
		for(int i=1;i<=100;i++) {
			if(i%2==0)
				System.out.print(" "+i+" ");
			if(i%20==0)
				System.out.println();
		}
	}

}
