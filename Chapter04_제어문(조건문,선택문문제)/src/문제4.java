
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*100)+1; // 1~100
		int b = (int)(Math.random()*100)+1;
		int c = (int)(Math.random()*100)+1;
		System.out.println(a+","+b+","+c);
		
		System.out.printf("합계:%d\n", a+b+c);
		System.out.printf("평균:%.2f\n", (a+b+c) / 3.0);
		
		int max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		
		int min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
		// 다음에 사용 => 변수
		// 출력
	}

}
