// ��͸޼ҵ�(����Լ�) : �ڱ� �ݺ� �޼ҵ�, ��ǥ������ ���丮�� ����� ����
// ���� �� ���� ��͸޼ҵ��� ���� ������ �и��ؾ� ��(���� ���, �Ʒ� �ڵ��� if��)
// Squared : �����̹Ƿ� �ڱ� �ڽ��� �ݺ��� --> ����Լ�

public class Squared {
	public static void main(String[] args) {
		int n1=2, n2=4;
		System.out.println(n1+"�� "+n2+"���� "+squared(n1,n2)+"�Դϴ�.");
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
