package Quiz02;

public class Bus implements Tran {
	String name = "Bus";

	@Override
	public void tranStart() {
		System.out.println(name+" 출발");
		// TODO Auto-generated method stub

	}
	
	@Override
	public void tranStop() {
		System.out.println(name+" 정지");
		// TODO Auto-generated method stub

	}

}
