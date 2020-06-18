package te0618;

public class Sf extends ForeignMovie {
	Sf(){
		System.out.println("순번 테스트 입니다.(Sf)");
	}
	public static void main(String[] args) {
		Sf s = new Sf();
		s.name = "Movie의 name";
		s.name1 = "ForeignMovie의 name1";
		
		System.out.println(s.name);
		System.out.println(s.name1);
	}
}
