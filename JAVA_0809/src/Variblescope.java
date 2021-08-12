public class Variblescope {

	public static void main(String[] args) {
		int v1 = 15;
		
		
		// 만약 , v1의 내용이 10보다 크면 
		int v2 = 0;
		if(v1 >10) {
			
			v2  = (v1 - 10);
			// v1에서 10을 빼라. --> 그 결과 새로운 v2에 저장.
		}
		//변수 v1, v2의 내용을 더하고, 거기에 5를 축가로 더해서 
		// --> 결과물 새로운 변수 v3에 저장하세요
		
		int v3 = v1 + v2+5;
		
		
		
		//변수 v3의 내용물 표준출력
		System.out.println(v3);
	}
}