
public class NewStaff {
	String name;
	int age;
	String edu;
	String add;
	
	NewStaff(String name, int age, String edu, String add) {
		this.name=name;
		this.age=age;
		this.edu=edu;
		this.add=add;
	}
	
	NewStaff(String name, int age, String add) {
		this.name=name;
		this.age=age;
		this.edu="null";
		this.add=add;
	}
	public void Info() {
		System.out.println("[���Ի�� ����]");
		System.out.println("�̸�: "+name);
		System.out.println("����:"+age);
		System.out.println("�з�: "+edu);
		System.out.println("�ּ�: "+add);
		System.out.println("");
	}
}
