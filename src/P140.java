
public class P140 {

	public static void main(String[] args) {
		// 1. 주사위 굴리기: 1~6사이 어떤 숫자가 나올지 모름.
		// 2. 나온 번호가 몇번인지, 화면에 출력해보기

		//*6을 해주면 0.0 ~ 6.0이 나옴 
		//주사위는 0번이 없기 때문에 +1을 해줌 
		//.0이 나오면 안되닌까 타입캐스팅해줘야함 (int)
		int DiceNum = (int)(Math.random()*6)+1;
		// 1~6사이의 임의의 (random) 정수가 나오도록.
		String message; // 출력할 문자열을 저장하기 위한 용도.

		// 변수 message 에 문자열 저장
		if (DiceNum == 1) {
			
			message = "1번 나옴";
		} 
		else if (DiceNum == 2) {
			message = "2번 나옴";
		} 
		else if (DiceNum == 3) {
			message = "3번 나옴";
		} 
		else if (DiceNum == 4) {
			message = "4번 나옴";
		} 
		else if (DiceNum == 5) {
			message = "5번 나옴";
		} 
		else {
			message = "6번 나옴";
		}
		System.out.println(message);

	}
}
