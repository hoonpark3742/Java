
public class SniperGun extends BasicGun {
	private int distance;
	SniperGun(int damage, int max_bullet, int basic_bullet, int distance) {
		super(damage, max_bullet, basic_bullet);
		this.distance = distance;
	}
	void SniperStat() {
		System.out.println("--스나이퍼 상태--");
		gunStat();
		System.out.println("스나이퍼 사거리: "+distance+"km");
	}
	void SniperBang() {
		System.out.print("스나이퍼 상태: ");
		bangGun();
	}
}
