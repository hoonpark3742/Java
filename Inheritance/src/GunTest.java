// 상속 : 부모클래스의 변수와 특성을 물려받음과 동시에 자신의 고유한 변수와 특성도 가짐
// this는 자신이 선언한 변수와, 파라미터 변수의 이름이 같을 때, 파라미터로부터 구분짓기 위해 사용
// super는 부모클래스의 데이터를 물려받았음을 의미함
// 부모클래스의 메소드를 상속받아 사용할 때는 ~
// 1. 부모클래스의 메소드명과 자식클래스의 메소드명이 동일한 경우: 부모클래스의 메소드명 앞에 super. 을 붙여써야 함
// 2. 부모클래스의 메소드명과 자식클래스의 메소드명이 다른 경우: 그냥 부모클래스의 메소드명을 가져와 사용하면 됨
// 3. 부모클래스와 자식클래스의 메소드명이 동일한데, super. 을 안붙이고 사용하면, 
// --> 자식클래스의 메소드가 부모클래스의 메소드 위에 오버라이딩(한마디로 덮어쓰기)되어, 자식클래스의 메소드 결과가 출력되게 됨


public class GunTest {
	public static void main(String[] args) {
		MachineGun m = new MachineGun(10, 30, 20, 100); 
		SniperGun s = new SniperGun(80, 10, 0, 10);
		
		m.MachineStat();
		m.MachineBang();
		System.out.println("");
		s.SniperStat();
		s.SniperBang();
	}
}
