package ex01.di;

public class Mainentry {
	public static void main(String[] args) {
		//is-a, has-a
		//상속	포함관계
		//has-a 관계를 통해서 객체를 다루
		NewRecordView view = new NewRecordView();
		NewRecord record = new NewRecord(1,2,3,4);
		
		view.setRecord(record);
		view.print();
	}
}
