// ����Ŭ������ ����Ŭ���� ������ getResult ����� �����ϴ� �޼ҵ� ����� ��� ���

package AddMinus2;

class AddMinus2 {
	public static void main(String[] args) {
		int a = 3;
		int b = 9;
		Add2 adder2 = new Add2(a, b);
		Minus2 minus2 = new Minus2(a, b);
		
		System.out.println("ù��° ��: "+a+", �ι�° ��: "+b);
		System.out.println("�������: "+adder2.getResult());
		System.out.println("�������: "+minus2.getResult());
	}
}
