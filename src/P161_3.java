
public class P161_3 {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		while(true) {
			
			x = (int)(Math.random()*6)+1;
			y = (int)(Math.random()*6)+1;
			if((x+y)==5) {
				break;
			}
			System.out.println("("+x+","+y+")");
		}
	}
}
