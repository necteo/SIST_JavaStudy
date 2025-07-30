
public class 문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		for (int i = 1; i <= 10; i++) {
			int val = (int)(Math.random()*100+1);
			System.out.print(val+" ");
			if (val%2 == 0)
				cnt++;
		}
		System.out.println("\n짝수의 개수:"+cnt);
	}

}
