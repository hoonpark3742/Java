// 덧셈클래스와 뺄셈클래스 내부의 getResult 결과값 리턴하는 메소드 만들고 결과 출력

package AddMinus2;

class AddMinus2 {
	public static void main(String[] args) {
		int a = 3;
		int b = 9;
		Add2 adder2 = new Add2(a, b);
		Minus2 minus2 = new Minus2(a, b);
		
		System.out.println("첫번째 수: "+a+", 두번째 수: "+b);
		System.out.println("덧셈결과: "+adder2.getResult());
		System.out.println("뺄셈결과: "+minus2.getResult());
	}
}
