
public class P142 {
	public static void main(String[] args) {
		
	
	
	int DiceNum = (int)(Math.random()*6)+1;
	String message ="";

	switch (DiceNum) 
	{
	case 1: 
		message = "1¹ø ³ª¿È";
		break;
		
	case 2: 
		message = "2¹ø ³ª¿È";
		break;
	case 3:
		message = "3¹ø ³ª¿È";
		break;
	case 4: 
		message = "4¹ø ³ª¿È";
		break;
	case 5: 
		message = "5¹ø ³ª¿È";
		break;
	case 6:
		message = "6¹ø ³ª¿È";
	}
	System.out.println(message);
	}
}		


