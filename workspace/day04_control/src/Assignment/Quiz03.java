package Assignment;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum = 0;
		for(int i=1;i<10;i++) {
			System.out.print(i+"/"+(i+1));
			sum += (float) i/(i+1); 
			if (i==9)
				System.out.print(" = "+sum);
			else
				System.out.print(" + ");
		}
	}

}
