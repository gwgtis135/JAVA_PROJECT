import java.util.Scanner;

public class P147IF {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String grade = sc.nextLine();
		
		if(grade.equals("A")) {
			System.out.println("VVIP ������ ������ �� �ֽ��ϴ�.");
			System.out.println("VIP ������ ������ �� �ֽ��ϴ�.");
		}
		else if(grade.equals("B")) {
			System.out.println("VIP ������ ������ �� �ֽ��ϴ�.");
		}
		else if(grade.equals("C")) {
			System.out.println("���ȸ�� ������ ������ �� �ֽ��ϴ�.");
			System.out.println("�Ϲ�ȸ�� ������ ������ �� �ֽ��ϴ�.");
		}
		else if(grade.equals("D")) {
			System.out.println("�Ϲ�ȸ�� ������ ������ �� �ֽ��ϴ�.");
		}
		else {
			System.out.println("������ �����ϴ�.");
		}
		System.out.println("�����մϴ�.");
	}

}
