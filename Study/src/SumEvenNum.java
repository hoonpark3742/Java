// �ݺ��� While : continue Ȱ���� ¦���� �� ���

public class SumEvenNum {
	public static void main(String[] args) {
		int total = 0;
		int a = 0;
		
		while(a<=100) {
			a++;
			if(a%2!=0) {
				continue;
			}
			total += a;
		}
		System.out.println("¦���� ��: "+total);
	}
}
