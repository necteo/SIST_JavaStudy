
public class 문제08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 3; i <= 4462; i++) {
			if (i%2 == 0)
				sum += i;
		}
		System.out.println("3이상 4462이하에서 짝수인 정수의 합:"+sum);
	}

}
