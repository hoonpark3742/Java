// 다른 패키지의 클래스를 사용하려면 import를 패키지명 아래에 선언하고 가져온다.
// 선언규칙 : import 패키지명.클래스이름 또는 전체를 가져오려면 import 패키지명 *

package calculate;
import merge.Merge;


public class Calculate {
	public static void main(String[] args) {
		Merge m = new Merge(5, 8);
		m.getResult();
	}
}
