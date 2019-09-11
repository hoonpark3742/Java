package merge;
import add.Add;
import sub.Sub;
import mul.Mul;
import div.Div;

public class Merge {
	private int a;
	private int b;
	
	public Merge(int x, int y) {
		a=x;
		b=y;
	}
	public void getResult() {
		System.out.println("ù��° ��: "+a+", �ι�° ��: "+b);
		System.out.println("�������: "+new Add(a, b).getResult());
		System.out.println("�E�����: "+new Sub(a, b).getResult());
		System.out.println("�������: "+new Mul(a, b).getResult());
		System.out.println("���������: "+new Div(a, b).getResult());
	}
}
