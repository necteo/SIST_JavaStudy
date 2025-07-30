
public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt3 = 0;
		int cnt5 = 0;
		for (int i = 1; i <= 10; i++) {
			int val = (int)(Math.random()*100)+1;
			System.out.print(val+" ");
			if (val%3 == 0)
				cnt3++;
			if (val%5 == 0)
				cnt5++;
			
			// 단일 조건문 => 2개 동시 수행
		}
		System.out.println("\n3의 배수의 개수:"+cnt3);
		System.out.println("5의 배수의 개수:"+cnt5);
	}

}
