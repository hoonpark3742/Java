// 매개변수, return, 메소드


public class CircleArea {
	public static void main(String[] args) {
		double r=5;
		System.out.println("원의 반지름: "+r);
		System.out.println("원의 넓이: "+area(r));
	}

	public static double area(double r) {
		return r*r*3.14;
	}
}
