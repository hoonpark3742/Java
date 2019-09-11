// 오버로딩: 같은 이름의 생성자를 파라미터, 처리동작, 리턴값을 달리하여 여러번 정의하는 것
// 왜 써? 오버로딩 기능이 없으면 파라미터의 개수가 다른 데이터가 들어올 때마다 매번 생성자 이름을 다르게 정의해야하기 때문!

public class NewStaffTest {
	public static void main(String[] args) {
		NewStaff a = new NewStaff("홍정아",26,"대졸","노원");
		NewStaff b = new NewStaff("박정훈",27,"의정부");
		
		a.Info();
		b.Info();
	}
}
