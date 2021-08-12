public class CastingEx {
	public static void main(String[] args) {
		//데이터의 형태(Data Type)가 다른 변수들간의 데이터 복사 
		//형 변환 (Type conbersion, Type casting)이 일어남.
		// 형변환은 자동 or 수동으로 수행
		
		//1 작은 데이터 타입 --> 큰 데이터 타입
		byte AA = 55; 
		int BB;
		BB = AA;
		System.out.println( BB );
		//2. 큰 데이터 타입 --> 작은 데이터 타입  
		AA = (byte)BB;
		System.out.println( AA );
	}
}