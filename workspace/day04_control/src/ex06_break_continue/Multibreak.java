package ex06_break_continue;

public class Multibreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;
		
		first:{
			second:{
				third:{
					int k = 100;
					System.out.println("before break");
					if(flag)break second;
					System.out.println("this wont execute");
				}
				System.out.println("th160");
			}//second end
			System.out.println("tthth");
		}//first emd
		System.out.println("의미없는 코드 ");

	}

}
