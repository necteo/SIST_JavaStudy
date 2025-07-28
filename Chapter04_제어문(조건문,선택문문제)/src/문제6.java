
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int change = (int)(Math.random()*2);//0,1
		char c = ' ';
		if (change == 0)
			c = (char)((Math.random()*26)+65); // 대문자
		else
			c = (char)((Math.random()*26)+97); // 소문자
		
		if (c >= 'A' && c <= 'Z')
			System.out.println(c+"은(는) 대문자");
		else
			System.out.println(c+"은(는) 소문자");
	}

}
