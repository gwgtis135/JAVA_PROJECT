public class CastingEx {
	public static void main(String[] args) {
		//�������� ����(Data Type)�� �ٸ� �����鰣�� ������ ���� 
		//�� ��ȯ (Type conbersion, Type casting)�� �Ͼ.
		// ����ȯ�� �ڵ� or �������� ����
		
		//1 ���� ������ Ÿ�� --> ū ������ Ÿ��
		byte AA = 55; 
		int BB;
		BB = AA;
		System.out.println( BB );
		//2. ū ������ Ÿ�� --> ���� ������ Ÿ��  
		AA = (byte)BB;
		System.out.println( AA );
	}
}