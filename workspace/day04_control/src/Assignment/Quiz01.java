package Assignment;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		System.out.print("1 + ");
		for(int i=1;i<5;i++) {
			System.out.print("(");
			System.out.print("1");
			num++;
			for(int j=2;j<=i+1;j++) {
				num+=j;
				System.out.print(" + "+j);
			}
			if(i!=4)
				System.out.print(") + ");
			else
				System.out.print(") = "+num);
		}

	}

}
