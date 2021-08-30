package 연산자;

public class 단락_회로 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		
		boolean vaule = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);   // <- 논리 곱에서 앞 항의 결과 값이 거짓이므로 이 문장은 실행되지 않음
		System.out.println(vaule);
		System.out.println(num1);
		System.out.println(i);
		
		vaule = ((num1 = num1 + 10 ) > 10) || ((i = i +2) < 10);         // <- 논리 합에서 앞 항의 결과 값이 참이므로 이 문장은 실행되지 않음
		System.out.println(vaule);
		System.out.println(num1);
		System.out.println(i);
	}

}
