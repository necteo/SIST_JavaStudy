import java.util.Scanner;
// import를 생략이 가능 => java.lang.* => 자동 인식
public class 문제5 extends Object {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = scan.nextInt();
		int sum = 0;
		for  (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1~"+num+"까지의 합:"+sum);
		
		// 메소드 종료 => return
	}
}
