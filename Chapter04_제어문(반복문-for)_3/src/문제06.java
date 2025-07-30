import java.util.Scanner;

public class 문제06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int start;
		int end;
		for (;;) {
			System.out.print("시작 정수 입력:");
			start = scan.nextInt();
			System.out.print("끝 정수 입력:");
			end = scan.nextInt();
			if (start < end)
				break;
		}
		int gop = 1;
		for (int i = start; i <= end; i++) {
			gop *= i;
		}
		System.out.println("===== 결과 =====");
		System.out.println(start+"부터"+end+"까지의 곱:"+gop);
		
	}

}
