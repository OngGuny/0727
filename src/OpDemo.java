
public class OpDemo {
	public static void main(String[] args) {
		// 최우선연산자 . [] () []은 배열에서 쓴다. int index 했던거 나중에배움
		int age = 26;
//		age = age + 1;
//		age = age + 1;
//		age = age + 1; // 1년 지날 때 마다 1살씩 더먹음. 이걸 좀 줄여보자 --> age++
//		age++; // 자기 자신에게 1을 더해라 
//		age--;  //자기 자신에게서 1빼라. 증감 연산자들 
					//얘네 두개는 특별하게도 앞이 나 뒤에 붙일 수 있는데 다머지는 						

		System.out.println("age= "+age);		
//		System.out.println("age= "+ ++age); // 선 증가, 후 출력  
		System.out.println("age= "+age++); // 출력 선, 후 증가 
		System.out.println("age= "+age);
 		
	//++-
	//-++ 앞뒤 상관없는데 나중에 참조할 떄 문제가 됨 
	
		
		//보수연산자 /
		int su = 345678;
		String result = Integer.toBinaryString(su);
		System.out.println("result="+ result );
		int su1 =~su;
		result = Integer.toBinaryString(su1); // ㄲㅈ자서못함 
				System.out.println();  				//~ 보수연산자 2진수를 0을1로 1을 0으로  보은 컴퓨터가 대신 해줘서 ㄱㅊ
		 
		
	
				boolean flag = 4>6;
				System.out.println("flag = "+flag);
				System.out.println("flag = "+!flag); 
				
				Student jimin = new Student(); 	//new 인스턴스 화  하는것.
				
				// 형 변환. Cast(사이즈가 바뀌는거)  ? Convert?  (성 질의변화, 기체가 고체로;))
				//1. Cast up, Promoion, 자동 형변환, Implulicit conversion
				
				double result3 = 5 + 3.14 ; //실수하나끼면 무조건 실수로 
				
				//2. Cast down, Demotion Explicit Conversion
				int result1= (int)(5+3.14);
				
				
				long result2 = (int) (5+3.14);
				
	}
}
