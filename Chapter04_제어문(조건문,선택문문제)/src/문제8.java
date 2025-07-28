import java.util.Scanner;

public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 영어 수학 점수 입력(90 90 90):");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		int avg = (kor + eng + math) / 3;
		char score = switch (avg / 10) {
			case 10,9 -> 'A';
			case 8 -> 'B';
			case 7 -> 'C';
			case 6 -> 'D';
			default -> 'F';
		};
		
		System.out.println("학점:"+score);
	}

}
