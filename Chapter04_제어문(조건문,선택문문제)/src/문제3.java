import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("1~4 학년 입력:");
		int grade = scan.nextInt();		
		
		System.out.print("0~100사이의 정수 입력:");
		int score = scan.nextInt();

		if (score < 0 || score > 100) {
			System.out.println("잘못된 점수 입력입니다!!");
		} else {
			// if~else => 삼항연산자를 이용해서 처리
			System.out.println(
				(grade != 4 && score >= 60) || (grade == 4 && score >= 70) ? "합격" : "불합격"
			);
//			if (grade == 4) {
//				if (score >= 70)
//					System.out.println("합격");
//				else
//					System.out.println("불합격");
//			} else { // 1~3
//				if (score >= 60)
//					System.out.println("합격");
//				else
//					System.out.println("불합격");
//			}
		}
	}

}
