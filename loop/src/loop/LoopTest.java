package loop;

public class LoopTest {

	public static void main(String[] args) {
		int i;
		String sum;
		for(sum = "안녕하세요" , i = 1; i <= 10; i++) {
		   sum += i;
			}
		
		System.out.println("안녕하세요1 부터 10까지의 결과 입니다. " + sum);

	}

}
