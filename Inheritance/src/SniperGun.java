
public class SniperGun extends BasicGun {
	private int distance;
	SniperGun(int damage, int max_bullet, int basic_bullet, int distance) {
		super(damage, max_bullet, basic_bullet);
		this.distance = distance;
	}
	void SniperStat() {
		System.out.println("--�������� ����--");
		gunStat();
		System.out.println("�������� ��Ÿ�: "+distance+"km");
	}
	void SniperBang() {
		System.out.print("�������� ����: ");
		bangGun();
	}
}
