import java.util.Scanner;

public class P161_7 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			
			int s;
			
			System.out.println("------------------------");
			System.out.println("1:���� | 2.��� | 3.�ܰ� | 4.���� ");
			System.out.println("------------------------");
			System.out.print("����>\t");
			s= sc.nextInt();
			
			if( s == 1) {
				System.out.println("���ݾ�>");
				balance += sc.nextInt();
			}else if (s ==2) {
				System.out.println("��ݾ�>");
				balance -=  sc.nextInt();
			}else if (s == 3) {
				System.out.printf("�ܰ�>%d",balance);
				System.out.println();
			}else if (s == 4) {
				break;
			}
			
		}
		System.out.println("���α׷� ����");
	}
}
