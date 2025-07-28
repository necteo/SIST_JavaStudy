
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*100)+1;
		// 1~100 사이 정수
		System.out.println("num=" + num);
		
		if (num >= 50)
			System.out.println(num + "은(는) 50이상인 수");
		else
			System.out.println(num + "은(는) 50미만인 수");
	}

}
