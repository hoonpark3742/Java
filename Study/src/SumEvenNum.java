// 반복문 While : continue 활용한 짝수의 합 계산

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
		System.out.println("짝수의 합: "+total);
	}
}
