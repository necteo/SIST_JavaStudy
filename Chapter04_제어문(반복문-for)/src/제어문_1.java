// 알파벳 출력 => ABCD~Z
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("A");
		System.out.print("B");
		System.out.print("C");
		System.out.print("D");
		System.out.print("E");
		System.out.print("F");
		System.out.print("G");
		System.out.print("H");
		System.out.print("I");
		System.out.print("J");
		System.out.print("K");
		System.out.print("L");
		System.out.print("M");
		System.out.print("N");
		System.out.print("O");
		System.out.print("P");
		System.out.print("Q");
		System.out.print("R");
		System.out.print("S");
		System.out.print("T");
		System.out.print("U");
		System.out.print("V");
		System.out.print("W");
		System.out.print("X");
		System.out.print("Y");
		System.out.println("Z");
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c);
		}
		System.out.println();
		for (char c = '가'; c <= '힣'; c++)
			System.out.print(c);
		System.out.println();
		for (int i = 1; i <= 10; i++)
			System.out.print(i);
		System.out.println();
		for (int i = 1; i <= 10; i+=2)
			System.out.print(i);
		System.out.println();
		for (int i = 2; i <= 10; i+=2)
			System.out.print(i);
		System.out.println();
		for (int i = 1; i <= 1;)
			System.out.print(i);
		// 알파벳 => 'A' , 'a' ...
		/*
		 * 			1   →  2	 |false면 종료
		 * 							←	  |----
		 * 	   for(시작값 ; 어디까지(조건문) ; 증가식) |
		 * 	   {			| true		  	   |
		 * 			  반복 수행문 3	 ---------------
		 * 	   }
		 * 	   
		 * 	   1 => 2 => 3 => 4
		 * 			2 => 3 => 4
		 * 			...
		 * 			...
		 * 			2번이 false면 종료
		 * 
		 * 	   int i=1   i<=5  i++
		 * 		 System.out.println(k)
		 * 
		 *     i=1 => i<=5 System.out.println(1) i++
		 *     i=2 => i<=5 System.out.println(2) i++
		 *     i=3 => i<=5 System.out.println(3) i++
		 *     i=4 => i<=5 System.out.println(4) i++
		 *     i=5 => i<=5 System.out.println(5) i++
		 *     i=6 => i<=5
		 *     		  ----- false => for종료
		 */
		//for(;;) // 무한루프 => 게임 , 서버 while(true)
		/*
		 *  반복문
		 *    for : 반복 횟수가 지정된 경우
		 *    		-------
		 *    while : 반복 횟수가 없는 경우
		 *    		  -------
		 *    ------------------------- 한번도 수행이 안되는 경우도 있다
		 *     ==> 선조건
		 *     while(조건)
		 *     {
		 *     }
		 *    do~while : 무조건 한번 이상 수행
		 *     ==> 후조건
		 *     do
		 *     {
		 *        반복문장
		 *     }while(조건)
		 *     
		 *     x	
		 */
	}

}
