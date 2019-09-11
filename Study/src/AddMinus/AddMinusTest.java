// 두 개의 클래스를 만들어 new를 통해 객체 생성 후, 각 클래스에서 만든 메소드를 활용해 구현하기 

package AddMinus;

class AddMinusTest {
	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		
		Add adder = new Add(a, b);
		Minus minus = new Minus(a, b);
		
		System.out.println("첫번째 수: "+a+", 두번째 수: "+b);
		System.out.println("덧셈결과: "+adder.getResult());
		System.out.println("뺄셈결과: "+minus.getResult());
	}
}
