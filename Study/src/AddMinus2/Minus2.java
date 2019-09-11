// a와 b를 저장하고 있는 클래스를 매개변수로 받는 뺄셈 클래스 만듦.

package AddMinus2;

class Minus2 {
	Data data;
	Minus2(int x, int y){
		data = new Data(x, y);
	}
	int getResult() {
		return data.a-data.b;
	}

}
