package example;

class Human {
	
	String name;
	int hp = 100;
	
	public Human(String n) {
		name = n;
	}
	
	public void attack(Slime s) {
		
		System.out.println("당신은 " + s.name + "을 공격했다!");
		s.hp = s.hp -30;
		
		if(s.hp < 1) {
			System.out.println(s.name + "은 죽었다!\n");
		} else {
			System.out.println("현재 " + s.name + "의 체력:" +s.hp);
		}
	}
	
}