package ������;

public class ��Ʈ_�̵�_������ {

	public static void main(String[] args) {
		int num = 0B00000101;
		
		System.out.println(num << 2);    // �������� 2��Ʈ �̵� 00010100 (20)
		System.out.println(num >> 2);    // ���������� 2��Ʈ �̵� 00000001 (1)
		System.out.println(num >>> 2);   // ���������� 2��Ʈ �̵� 00000001 (1)
		
		System.out.println(num);
		
		num = num << 2;
		System.out.println(num);
	}

}
