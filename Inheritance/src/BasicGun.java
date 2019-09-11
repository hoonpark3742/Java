
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
        System.out.println("총알 데미지 : " + damage);
        System.out.println("총알 현황 : " + basic_bullet +" / " + max_bullet);
    }
    public void bangGun(){
        if(basic_bullet <=0)
            System.out.println("총알이 없습니다.");
        else{
            System.out.println("총알 발사");
            basic_bullet--;
        }
    }
}
