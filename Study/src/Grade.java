// ���ǹ� if : ��������

public class Grade {
	public static void main(String[] args) {
		int a=-1;
		char b = 0;
		
		if(a>90 && a<=100) {
			b = 'A';
		}
		else if(a>=80) {
			b = 'B';
		}
		else if(a>=70) {
			b = 'C';
		}
		else if(a>=60) {
			b = 'D';
		}
		else if(a>=50) {
			b = 'E';
		}
		else if(0<=a&&a<50) {
			b = 'F';
		}
		
		
		System.out.println("���� : "+a);
		if(0<=a && a<=100) {
		System.out.println("����� ������ "+b+"�Դϴ�.");
		}
		else {
			System.out.println("�߸��� �����Դϴ�.");
		}
		
	}
}
