import java.util.Scanner;

public class P147IF {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String grade = sc.nextLine();
		
		if(grade.equals("A")) {
			System.out.println("VVIP 혜택을 받으실 수 있습니다.");
			System.out.println("VIP 혜택을 받으실 수 있습니다.");
		}
		else if(grade.equals("B")) {
			System.out.println("VIP 혜택을 받으실 수 있습니다.");
		}
		else if(grade.equals("C")) {
			System.out.println("우수회원 혜택을 받으실 수 있습니다.");
			System.out.println("일반회원 혜택을 받으실 수 있습니다.");
		}
		else if(grade.equals("D")) {
			System.out.println("일반회원 혜택을 받으실 수 있습니다.");
		}
		else {
			System.out.println("혜택이 없습니다.");
		}
		System.out.println("감사합니다.");
	}

}
