
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
		System.out.println("[신입사원 정보]");
		System.out.println("이름: "+name);
		System.out.println("나이:"+age);
		System.out.println("학력: "+edu);
		System.out.println("주소: "+add);
		System.out.println("");
	}
}
