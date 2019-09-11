// 생성자, 메소드 선언(만들기)
// 생성자 = 클래스의 이름과 동일한 메소드, 리턴값(반환)이 없음

package AddMinus;

class Minus {
	int a;
	int b;
	Minus(int x, int y) {
		a = x;
		b = y;
	}
	public int getResult() {
		return a-b;
	}
}

