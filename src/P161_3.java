
public class P161_3 {

	public static void main(String[] args) {

		int x;
		int y;
		int sum;
/////////////do while
//		do {
//			x = (int) (Math.random() * 6) + 1;
//			y = (int) (Math.random() * 6) + 1;
//			sum = x + y;
//			System.out.printf("(%d,%d)", x, y);
//
//		} while (sum != 5);

	
////////////////////////내가 한 방법 		
//		for(int f = 0;f<1;) { 
//			x = (int) (Math.random() * 6) + 1;
//			y = (int) (Math.random() * 6) + 1;
//			sum = x + y;
//			if(sum==5) {
//				f=1;
//				}
//			System.out.printf("(%d,%d)\n",x,y);
//		}
		
/////////////////////////쌤이 한 방법 
		for ( int Sum = 0 ; Sum != 5;  )
	      {
	         int Dice1 = (int) (Math.random() * 6) + 1;
	         int Dice2 = (int) (Math.random() * 6) + 1;
	         
	         System.out.println("(" + Dice1 + "," + Dice2 + ")" );
	         
	         Sum = Dice1 + Dice2;
	        if(Sum!=5) {
	        	System.out.println("다음 기회에 ");
	        }
	        	
	      }
		System.out.println(" 5가 나왔습니다. 수고하셨습니다.");
	}

}
