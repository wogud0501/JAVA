package ������;

public class �ܶ�_ȸ�� {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		
		boolean vaule = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);   // <- �� ������ �� ���� ��� ���� �����̹Ƿ� �� ������ ������� ����
		System.out.println(vaule);
		System.out.println(num1);
		System.out.println(i);
		
		vaule = ((num1 = num1 + 10 ) > 10) || ((i = i +2) < 10);         // <- �� �տ��� �� ���� ��� ���� ���̹Ƿ� �� ������ ������� ����
		System.out.println(vaule);
		System.out.println(num1);
		System.out.println(i);
	}

}
