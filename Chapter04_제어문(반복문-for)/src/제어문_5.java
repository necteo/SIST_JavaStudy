
public class 제어문_5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i < 6; i++) {
			int lotto = (int)(Math.random()*45)+1;
			System.err.print(lotto+" ");
			Thread.sleep(1000);
		}
	}

}
