import java.util.Scanner;

public class P161_7 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			
			int s;
			
			System.out.println("------------------------");
			System.out.println("1:예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("------------------------");
			System.out.print("선택>\t");
			s= sc.nextInt();
			
			if( s == 1) {
				System.out.println("예금액>");
				balance += sc.nextInt();
			}else if (s ==2) {
				System.out.println("출금액>");
				balance -=  sc.nextInt();
			}else if (s == 3) {
				System.out.printf("잔고>%d",balance);
				System.out.println();
			}else if (s == 4) {
				break;
			}
			
		}
		System.out.println("프로그램 종료");
	}
}
