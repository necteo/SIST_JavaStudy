/*
 *   1. 변수 => 프로그램에 필요한 한개의 데이터를 저장하는 메모리 공간
 *   						---------
 *      메모리는 주소(번지) => 주소에 대한 이름을 부여 사용
 *      211.249.220.24 => daum.net
 *      	|				 |
 *          ------------------
 *             | DNS
 *   2. 프로그램은 변수를 제어하는 것이다
 *   		   ---- 데이터
 *      데이터 관리
 *      --------
 *        한개 저장 => 같은 여러개 제어 => 다른 여러개 제어
 *          변수			 배열				클래스
 *        ---------------------------------------
 *        					 |
 *        		프로그램 종료시에 모든 데이터가 사라진다
 *        					 |
 *                       영구적인 저장
 *                       ----------
 *                       파일 => 보안에 취약
 *                       => RDBMS (관계형 데이터베이스)
 *                       		   오라클 / MySQL
 *                       => 대용량이 아니다 : NoSQL
 *                          => MongoDB , ElasticSearch
 *   3. 자바에서 지원하는 메모리 크기 (데이터형)
 *        bit = byte = word = record
 *        0,1   8bit   문자열   file / table
 *        
 *        bit가 많으면 저장되는 숫자의 크기가 크다
 *        ------------------------------- 64bit
 *        
 *           => 사용자 => 350
 *      정수형
 *        byte (1byte) => 8bit (-128~127)
 *         => 네트워크 전송 (채팅) , 파일 업로드 / 다운로드
 *        int (4byte) => 32bit (-21억 4천7백 ~ 21억 4천7백)
 *        	   	   (2147483647)
 *        	  일반 숫자 => 컴퓨터의 default
 *        long (8byte) => 64bit (-2^63 ~ 2^63-1)
 *        	  금융권 / 증권 ...
 *        ----------------------------------------
 *        	 int와 long 구분 => L(l)
 *        	 10L 10l
 *      실수형
 *        double : 8byte => 정밀도 => 15자리
 *          평균 / 신장
 *          => default
 *      문자형
 *        char : 2byte (0~65535)
 *        		 멀티바이트 (모든 문자를 숫자화) => Unicode
 *        		 하둡 / 달빅머신 / 클라우드 ...
 *        		  |		 |		 |
 *        					   구글 사장
 *        				만든 사람의 고향
 *        		 만든 사람의 아들의 장난감 이름
 *        
 *        		 => 문자만 저장 (한글)
 *      논리형
 *        boolean : 1byte (true/false)
 *        			제어문에서 주로 사용
 *      --------------------------------------------
 *       byte < char < int < long < double
 *       *** 데이터형은 언제든지 변경이 가능
 *           ----------------------> 형변환
 *      int = long
 *      double = int
 *      int = double
 *      
 */
/*
 * 	 국어점수 영어점수 수학점수 평균 총점 학점 저장
 */
public class 변수데이터형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(10.5);
		/*int kor=100;
		int eng=100;
		int math=100;
		double avg=100.0;
		int total=300;
		char score='A';*/
		int kor=100,eng=100,math=100,total=300;
		double avg=100.0;
		char score='A'; // "A+" "A-" "A0"
		// String score="A+";
		boolean 재평가=false;
	}

}
