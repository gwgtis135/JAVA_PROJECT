public class Variblescope {

	public static void main(String[] args) {
		int v1 = 15;
		
		
		// ���� , v1�� ������ 10���� ũ�� 
		int v2 = 0;
		if(v1 >10) {
			
			v2  = (v1 - 10);
			// v1���� 10�� ����. --> �� ��� ���ο� v2�� ����.
		}
		//���� v1, v2�� ������ ���ϰ�, �ű⿡ 5�� �డ�� ���ؼ� 
		// --> ����� ���ο� ���� v3�� �����ϼ���
		
		int v3 = v1 + v2+5;
		
		
		
		//���� v3�� ���빰 ǥ�����
		System.out.println(v3);
	}
}