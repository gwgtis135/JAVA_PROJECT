
public class P140 {

	public static void main(String[] args) {
		// 1. �ֻ��� ������: 1~6���� � ���ڰ� ������ ��.
		// 2. ���� ��ȣ�� �������, ȭ�鿡 ����غ���

		//*6�� ���ָ� 0.0 ~ 6.0�� ���� 
		//�ֻ����� 0���� ���� ������ +1�� ���� 
		//.0�� ������ �ȵǴѱ� Ÿ��ĳ����������� (int)
		int DiceNum = (int)(Math.random()*6)+1;
		// 1~6������ ������ (random) ������ ��������.
		String message; // ����� ���ڿ��� �����ϱ� ���� �뵵.

		// ���� message �� ���ڿ� ����
		if (DiceNum == 1) {
			
			message = "1�� ����";
		} 
		else if (DiceNum == 2) {
			message = "2�� ����";
		} 
		else if (DiceNum == 3) {
			message = "3�� ����";
		} 
		else if (DiceNum == 4) {
			message = "4�� ����";
		} 
		else if (DiceNum == 5) {
			message = "5�� ����";
		} 
		else {
			message = "6�� ����";
		}
		System.out.println(message);

	}
}
