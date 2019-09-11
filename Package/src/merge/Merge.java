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
		System.out.println("Ã¹¹øÂ° ¼ö: "+a+", µÎ¹øÂ° ¼ö: "+b);
		System.out.println("µ¡¼À°á°ú: "+new Add(a, b).getResult());
		System.out.println("–E¼À°á°ú: "+new Sub(a, b).getResult());
		System.out.println("°ö¼À°á°ú: "+new Mul(a, b).getResult());
		System.out.println("³ª´°¼À°á°ú: "+new Div(a, b).getResult());
	}
}
