/*
 *  for => 시작점 , 끝점 , 증감식
 *  	   -----------------
 *  	   [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
 *  
 *  	   맛있고 맛있는 맛있니...
 *  	   맛있+
 *  	   ------------------- REGEXP_LIKE(ename, "[A-Z]")
 *  	   ename LIKE %A% OR
 *  	   ename LIKE %B% OR
 *  	   ...
 *  	   ename LIKE %Z%
 *  	   -------------------  LLM
 *  
 *    => 밑에 있는 문장 1개만 수행
 *    	 for()
 *    	  문장 ==> for
 *    	  문장
 *    
 *    	 for()
 *    	 {
 *    		
 *    	 }
 *    
 *    	 for(int i=1...)
 *    			-- for문 안에서만 사용이 가능
 */
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			if (i%3 == 0)
				continue;// i++ => 증가식으로 올라간다
			System.out.print(i+" ");
		}
		
		String[] arr = {"aaa", "bbb", "ccc", "ddd", "eee", "fff", "iii", "jjj", "ggg", "kkk"};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		
		System.out.println(arr[6]);
		System.out.println(arr[7]);
		System.out.println(arr[8]);
		System.out.println(arr[9]);
		
		for (String s : arr) {
			System.out.println(s);
		}
	}

}
