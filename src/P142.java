
public class P142 {
	public static void main(String[] args) {
		
	
	
	int DiceNum = (int)(Math.random()*6)+1;
	String message ="";

	switch (DiceNum) 
	{
	case 1: 
		message = "1�� ����";
		break;
		
	case 2: 
		message = "2�� ����";
		break;
	case 3:
		message = "3�� ����";
		break;
	case 4: 
		message = "4�� ����";
		break;
	case 5: 
		message = "5�� ����";
		break;
	case 6:
		message = "6�� ����";
	}
	System.out.println(message);
	}
}		


