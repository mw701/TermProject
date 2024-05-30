package example;

import javax.swing.JOptionPane;


public class Study02 {
 
    public static void main(String[] args) {
 
        // 빈 몬스터 변수
        Slime s = null;
 
        // 몬스터 객체 생성
        Slime s1 = new Slime("슬라임");
        Slime s2 = new Slime("골렘");
        Slime s3 = new Slime("드래곤");
        
        s = s1;
    
        System.out.println(s.name);
 
    }
 
}
