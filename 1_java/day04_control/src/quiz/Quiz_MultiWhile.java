package quiz;

public class Quiz_MultiWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, j = 1;
		while(i<10) {
			System.out.println("----- "+i+"단 -----");
			while(j<10) {
				System.out.println(i+" X "+j+" = "+i*j);
				j++;
			}
			i++;
			j=1;
		}
	}

}
