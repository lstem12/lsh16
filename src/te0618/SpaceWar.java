package te0618;

public class SpaceWar extends Sf {
	
	int money = 100000;
	SpaceWar(){
		System.out.println("순번 테스트 입니다.(SpaceWar)");
	}
	public static void main(String[] args) {
		//SpaceWar w = new SpaceWar();
		//w.name = "이상화";
		
		Movie m = new SpaceWar();
		SpaceWar sp = (SpaceWar)m;
		
		System.out.println(sp.name);
		System.out.println("자식의 돈은" + sp.money);
		
		//new SpaceWar();
		//System.out.println(w.name);
	}
}
