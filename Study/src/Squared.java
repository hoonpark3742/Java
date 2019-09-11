// 재귀메소드(재귀함수) : 자기 반복 메소드, 대표적으로 팩토리얼 계산이 있음
// 주의 할 점은 재귀메소드의 종료 조건이 분명해야 함(예를 들면, 아래 코드의 if문)
// Squared : 제곱이므로 자기 자신의 반복임 --> 재귀함수

public class Squared {
	public static void main(String[] args) {
		int n1=2, n2=4;
		System.out.println(n1+"의 "+n2+"승은 "+squared(n1,n2)+"입니다.");
	}

	public static int squared(int n1, int n2) {
		if(n2 == 0) {
			return 1;
		}
		else {
			return n1*squared(n1,n2-1);
		}
	}
}
