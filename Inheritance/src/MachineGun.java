
public class MachineGun extends BasicGun {
	private int velocity;
	MachineGun(int damage, int max_bullet, int basic_bullet, int velocity) {
		super(damage, max_bullet, basic_bullet);
		this.velocity=velocity;
	}
	void MachineStat() {
		System.out.println("--머신건 정보--");
		gunStat();
		System.out.println("머신건 연사속도: "+velocity+"m/s");
	}
	void MachineBang() {
		System.out.print("머신건 상태: ");
		bangGun();
	}
}
