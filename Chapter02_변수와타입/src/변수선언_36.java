/*
 * 	 1. 개념 / 정의 => 변수 / 연산자 / 제어문 / 배열 / 
 * 					 메소드 / 클래스 / 객체 / 캡슐화 / 다형성 / 
 * 					 추상클래스 / 인터페이스 / 내부클래스 / 예외처리
 * 					 -----------------------------------
 * 					  11장 : 기초문법
 * 					  라이브러리 활용
 *   				  응용 => 조립
 *   				   => 쓰레드 / 네트워크
 *   				   => 데이터베이스 프로그램
 *     메모리
 *     ----- 자바
 *       ----------------
 *        Method 영역
 *           ------ ------
 *           		 static : 정적변수
 *           			| 초기화(X) / 초기화(O)
 *           메소드
 *           ------ ------
 *       ----------------
 *        Heap : 프로그래머가 사용하는 공간 => class 저장 / 배열
 *        		 => 사용자 정의
 *       ----------------
 *        Stack : 메모리 관리
 *       		  => 지역변수 / 매개변수
 *       ----------------
 *       
 *       ----------------
 *        메모리주소	값
 *       ----------------
 *         0x100   사용중
 *       ----------------
 *         0x104    저장 => 표시 => 별칭 => 변수
 *       ----------------
 *         0x108
 *       ----------------
 *       변수 = 데이터가 한개 저장된 메모리 주소의 이름
 *       --- 한개의 데이터만 저장이 가능
 *       
 *   2. 분류
 *   3. 선언방식
 *   4. 예시
 *   5. 주의사항
 *   
 *   ==> 데이터 관리
 *       --------- 변수 / 클래스 / 배열
 *       		   -----------------
 *       				  | => RAM
 *   변수 : 하나의 값을 저장하는 메모리 주소에 붙여진 이름
 *   --- 읽기 / 쓰기 (수정)
 *   1. 정적 타입 언어
 *      => 메모리 크기를 자바에서 지정 => 기본형
 *         -------- 메모리 사용의 최적화
 *         			오류방지
 *         			가독성 향상
 *         String / int / double / boolean
 *         let / var
 *         let a=10
 *         a='aaa'
 *         
 *         => 저장 크기
 *            1byte 2byte 4byte 8byte
 *              byte => bit가 8개
 *              		--- 0, 1만 저장하는 공간
 *            1byte
 *            				 
 *            -------------------
 *             0 1 1 1 1 1 1 1
 *            -------------------
 *            -- 부호 비트 (0 => 양수 , 1 => 음수)
 *         분류
 *          정수
 *           -----------------
 *            byte => -128~127
 *              => 네트워크 전송 / 파일 업로드 다운로드
 *           -----------------
 *            short => -32768~32767
 *              => C언어 호환
 *           -----------------
 *            int => -21억4천 ~ 21억4천
 *              => 가장 많이 사용되는 정수
 *              => 컴퓨터의 default
 *           -----------------
 *            long => -2^63 ~ 2^63-1
 *              => 1(L)
 *              => 금융권 / 증권 ...
 *                 빅데이터 / AI
 *           -----------------
 *          실수 => 정밀도
 *            ------------------
 *             4byte (7자리) => float
 *               f(F)
 *            ------------------
 *             ***8byte (15자리) => double => default
 *               d(D) 생략이 가능
 *               
 *               키 , 몸무게 , 평균 ... , 확률 , 예측 
 *            ------------------
 *          문자 : char => 2byte
 *                => 0~65535 => Unicode
 *          논리 : 1byte => true/false만 저장이 가능
 *          	  boolean
 *          	  ------- 조건문 / 반복문
 *          
 *         -----------------------------------
 *         		1byte	2byte	4byte	8byte
 *         -----------------------------------
 *         						  * 	  *	
 *         정수	 byte	 short	 int	 long
 *         					모든 숫자는 int
 *         -----------------------------------
 *         								  *
 *         실수					 float	double
 *         						모든 실수는 double
 *         -----------------------------------
 *         				  *
 *         문자			 char
 *         -----------------------------------
 *         		   *
 *         논리	 boolean
 *         -----------------------------------
 *         
 *         float f=10.8;
 *           4		 8
 *         int i='A'
 *         
 *         double d=1000
 *           8        4
 *           
 *         int a=10.5f
 *          4      4
 *          
 *         byte < short < int < long < float < double
 *         		  char
 *         
 *        변수 선언
 *        크기지정 변수명;
 *        ------ int / double / char
 *         정수 : int / double
 *         문자 : char
 *         논리 : boolean
 *         배열 => byte
 *         
 *         byte b1=100
 *         byte b2=90
 *         b1+b2 => int
 *         -------------
 *            
 *   2. 동적 타입 언어
 *      => 메모리 크기를 프로그래머가 지정 => 참조형 (배열, 클래스)
 *      
 *   => 변수 정의 36page
 *   => 지역변수 : 스택 공간 => 메모리에 의해 관리
 *   	=> 자동 메모리 해제 37page
 *   => 38page
 *      변수명 만들기 (식별자)
 *      ** 같은 공간에서 같은 이름의 변수는 사용할 수 없다
 *      식별자
 *      1) 알파벳 / 한글 사용이 가능
 *         주의점 : 알파벳 사용시 대소문자 구분
 *         		  예) int a , int A
 *      2) 숫자 사용이 가능
 *         주의점 : 앞에 사용은 불가능
 *         		  예) a12b , 12ab(X)
 *      3) 특수문자 사용이 가능 ( _ , $ )
 *      				   ----
 *      				   단어 2개 , 임시 변수
 *      				   file_name file_size
 *      				   _temp
 *      4) 키워드는 사용할 수 없다
 *         ----- 자바에서 이미 사용하는 단어
 *         int , byte ...
 *         int int
 *         => 색상이 빨간색
 *      5) 공백을 사용할 수 없다
 *         int file name
 *             ---------
 *             file_name
 *             fileName
 *      ----------------------------
 *      ** 변수는 의미를 부여
 *         (글자수에는 제한이 없다)
 *         3~7글자가 적당
 *         
 *         국어점수 영어점수 수학점수
 *            a	    b     c
 *           kor   eng   math
 *      ** 변수는 소문자로 시작한다
 *      변수 선언 형식
 *      데이터형 변수명;
 *      -----
 *       정수/실수/문자/논리
 *       
 *      => 선언 => 필요시에 변경이 가능
 *         값 저장
 *         국어점수 저장
 *         int kor; => 4byte메모리 공간을 만들어라
 *         			   메모리의 이름은 kor로 설정
 *         kor=80; => 메모리 공간에 80을 저장
 *         	   -- 초기값
 *         => 불만 :
 *            => 변경 : kor=85;
 *      => 선언과 동시에 값 저장
 *         int kor=80;
 *                 --- 1
 *             ---
 *               2
 *               
 *         ** 변수 => 반드시 초기값을 지정한다
 *         -------------------------------
 *         kor이라는 메모리 공간에 80을 저장한다
 *         80을 메모리 공간인 kor에 저장한다
 *         -------------------------------
 *         char c='A';
 *         
 *         char c=65;
 *         		  --- int (4byte)
 *          | 2byte
 *          
 *         A => 65 , a => 97
 *         
 *         int a='a' => a = 97
 *         char a=97 => 'a'
 *         double d=10 d=10.0
 *         
 *         
 *         변수 = 값
 *         |	 |
 *         -------
 *         		변수의 크기보다 작거나 같다
 *         변경 => 다른 값
 *         ------------
 *         char = int ==> char
 *         int = char ==> int
 *         double = char ==> double
 *         double = int ==> double
 *         
 *         int = double 
 *         int a=10.5 (X)
 */
public class 변수선언_36 {
	byte b1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수선언_36 a=new 변수선언_36();
		//System.out.println(a);
		System.out.println(100);
		System.out.println(1);
		System.out.println(30);
		System.out.println(70);
		System.out.println(189);
		System.out.println(3000);
		System.out.println(89);
		System.out.println(66);
		System.out.println(88);
		System.out.println(100+1+30+70+189+3000+89+66+88);
		
		System.out.println(~~10);
		System.out.println(10000000000L);
		System.out.println(10.5f);
		System.out.println((int)'A');
		
		byte $b1=100;
		byte _b2=90;
		int b3=$b1+_b2;
		int adadlaksjlsjalfjslfjsljfasjfass=10;
		System.out.println(adadlaksjlsjalfjslfjsljfasjfass);
		int kor=100;
		System.out.println(kor);
		char c='A';
		c='B';
		c='C';
		c='D';
		c='E';
		char c1=65;
		System.out.println(c);
		System.out.println(c1);
		int a=65;
		int a1='A';
		System.out.println(a);
		System.out.println(a1);
		double d=100;
		System.out.println(d);
		
		// boolean => true/false
		boolean b=true;
		System.out.println(b);
		
		// 변경 b=> false
		b=false;
		System.out.println(b);
		
		// 상수 => 모든 문자가 대문자
		final int ABC=100;
		System.out.println(Integer.MAX_VALUE);
		
		// 자동 형변환
		int ii=(int)10.5;
		// 강제 형변환 => 소수점을 지워라 => 10
		System.out.println((int)'B');
		
		// up casting / down casting
	}

}
