
public class BasicGun {
	private int damage;
    private int max_bullet;
    private int basic_bullet;
    BasicGun(int damage,int max_bullet,int basic_bullet){
        this.damage = damage;
        this.max_bullet = max_bullet;
        this.basic_bullet = basic_bullet;
    }
    public void gunStat(){
        System.out.println("�Ѿ� ������ : " + damage);
        System.out.println("�Ѿ� ��Ȳ : " + basic_bullet +" / " + max_bullet);
    }
    public void bangGun(){
        if(basic_bullet <=0)
            System.out.println("�Ѿ��� �����ϴ�.");
        else{
            System.out.println("�Ѿ� �߻�");
            basic_bullet--;
        }
    }
}
