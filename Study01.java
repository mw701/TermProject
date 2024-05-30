package example;

import javax.swing.JOptionPane;

public class Study01 {
	
	public static void main(String[] args) {
		
		//몬스터 변수
		Slime s = null;
		
		//몬스터와 인간 객체 생성
		Slime s1 = new Slime("슬라임");
		Slime s2 = new Slime("골렘");
		Slime s3 = new Slime("드래곤");
		Human h = new Human("나");
		
		System.out.println("몬스터가 나타났다!\n");
		
		while(true) {
		
		//인풋박스
		String sTarget = JOptionPane.showInputDialog("어느 몬스터를 공격하겠습니까?\n 1은 " + s1.name + " 2는 " + s2.name + " 3은" + s3.name);
	
		//빈값이 입력되면 종료
		if(sTarget == null || sTarget.equals("")){
			System.exit(0);
		}
		
		//형변환
		int target = Integer.parseInt(sTarget);
		
		//입력된 숫자에 따라 대상 지정
		if (target == 1) {
			
			s = s1;
			
		} else if (target == 2) {
			
			s = s2;
			
		} else if (target == 3) {
			
			s = s3;
			
		} else {
			
			JOptionPane.showMessageDialog(null, "다시 입력하세요!");
		}
		
		//몬서터가 살아있을 때만 공격
		if(s.hp < 1) {
			
			System.out.println(s.name + "은 이미 죽어있다!\n");
			
		} else {
			h.attack(s);
			s.attack(h);
		}
		
		//몬스터가 모두 죽으면 게임 클리어
		if(s1.hp < 1 && s2.hp < 1 && s3.hp < 1) {
			
			JOptionPane.showMessageDialog(null, "Game Clear!!");
			System.exit(0);
		}
	}
}
}
