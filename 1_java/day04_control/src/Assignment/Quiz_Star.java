package Assignment;

public class Quiz_Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*** star 1 ***");
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++)
				System.out.print("*");
			System.out.println("");
		}
		
		
		System.out.println("\n*** star 2 ***");
		for(int i=0;i<5;i++) {
			for(int j=5;j>i;j--)
				System.out.print("*");
			System.out.println("");
		}
		
		
		System.out.println("\n*** star 3 ***");
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++)
				System.out.print(" ");
			for(int k=5;k>i;k--)
				System.out.print("*");
			System.out.println("");
		}
		
		
		System.out.println("\n*** star 5 ***");
		for(int i=0;i<5;i++) {
			//4,3,2,1,0
			for(int j=0;j<=4;j++) //1~4
				if ((4-i)<j)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.print("*");
			for(int j=4;j>0;j--) //6~9
				if ((4-i)<j)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println("");
		}

	}

}
