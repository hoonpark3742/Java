// �� ���� Ŭ������ ����� new�� ���� ��ü ���� ��, �� Ŭ�������� ���� �޼ҵ带 Ȱ���� �����ϱ� 

package AddMinus;

class AddMinusTest {
	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		
		Add adder = new Add(a, b);
		Minus minus = new Minus(a, b);
		
		System.out.println("ù��° ��: "+a+", �ι�° ��: "+b);
		System.out.println("�������: "+adder.getResult());
		System.out.println("�������: "+minus.getResult());
	}
}
