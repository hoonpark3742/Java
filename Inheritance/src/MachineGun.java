
public class MachineGun extends BasicGun {
	private int velocity;
	MachineGun(int damage, int max_bullet, int basic_bullet, int velocity) {
		super(damage, max_bullet, basic_bullet);
		this.velocity=velocity;
	}
	void MachineStat() {
		System.out.println("--�ӽŰ� ����--");
		gunStat();
		System.out.println("�ӽŰ� ����ӵ�: "+velocity+"m/s");
	}
	void MachineBang() {
		System.out.print("�ӽŰ� ����: ");
		bangGun();
	}
}
