package quiz;

public class Quiz_Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1부터 100중에서 3의 배수의 개수와 합을 구하세요.
		int num = 0, sum = 0;
		
		for (int i=3;i<=100;i=i+3) {
			num++;
			sum=sum+i;
		}
		System.out.println("3의 배수의 개수 : "+num+" 개");
		System.out.println("3의 배수의 합 : "+sum);
	}
}
